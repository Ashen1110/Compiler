grammar myCompiler;

options {
   language = Java;
}

@header {
    import java.util.HashMap;
    import java.util.ArrayList;
}

@members {
    boolean TRACEON = false;
    public enum Type{
       INT, ERR, CONST_INT;
    }

    class tVar {
	   int   varIndex; // temporary variable's index. Ex: t1, t2, ..., etc.
	   int   iValue;   // value of constant integer. Ex: 123.
	   float fValue;   // value of constant floating point. Ex: 2.314.
	};

    class Info {
       Type theType;  // type information.
       tVar theVar;
	   
	   Info() {
          theType = Type.ERR;
		  theVar = new tVar();
	   }
    };

	
    HashMap<String, Info> symtab = new HashMap<String, Info>();

    // labelCount is used to represent temporary label.
    // The first index is 0.
    int labelCount = 0;
	
    // varCount is used to represent temporary variables.
    // The first index is 0.
    int varCount = 0;
    
    int printf_parametersCount=0;
    
    int condCount = 0;

    // Record all assembly instructions.
    List<String> TextCode = new ArrayList<String>();
	List<String> PrintfCode = new ArrayList<String>();

    void prologue(){
       TextCode.add("; === prologue ====");
       TextCode.add("declare dso_local i32 @printf(i8*, ...) #1\n");
       
	   TextCode.add("define dso_local i32 @main() #0");
	   TextCode.add("{");
    }

    void epilogue(){
       /* handle epilogue */
       TextCode.add("\n; === epilogue ===");
       TextCode.add("}");
       
       TextCode.add("attributes #0 = { noinline nounwind optnone uwtable \"correctly-rounded-divide-sqrt-fp-math\"=\"false\" \"disable-tail-calls\"=\"false\" \"frame-pointer\"=\"all\" \"less-precise-fpmad\"=\"false\" \"min-legal-vector-width\"=\"0\" \"no-infs-fp-math\"=\"false\" \"no-jump-tables\"=\"false\" \"no-nans-fp-math\"=\"false\" \"no-signed-zeros-fp-math\"=\"false\" \"no-trapping-math\"=\"false\" \"stack-protector-buffer-size\"=\"8\" \"target-cpu\"=\"x86-64\" \"target-features\"=\"+cx8,+fxsr,+mmx,+sse,+sse2,+x87\" \"unsafe-fp-math\"=\"false\" \"use-soft-float\"=\"false\" }");
       TextCode.add("attributes #1 = { \"correctly-rounded-divide-sqrt-fp-math\"=\"false\" \"disable-tail-calls\"=\"false\" \"frame-pointer\"=\"all\" \"less-precise-fpmad\"=\"false\" \"no-infs-fp-math\"=\"false\" \"no-nans-fp-math\"=\"false\" \"no-signed-zeros-fp-math\"=\"false\" \"no-trapping-math\"=\"false\" \"stack-protector-buffer-size\"=\"8\" \"target-cpu\"=\"x86-64\" \"target-features\"=\"+cx8,+fxsr,+mmx,+sse,+sse2,+x87\" \"unsafe-fp-math\"=\"false\" \"use-soft-float\"=\"false\"}");
    }
    
    /* Generate a new label */
    String newLabel(String label_name){
       labelCount ++;
       if(label_name == "") return (new String("L")) + Integer.toString(labelCount);
       else return label_name+ "_L" + Integer.toString(labelCount);
    } 
    
    /* Generate a new printf parameter */
    String newprint(){
    	printf_parametersCount++;
    	return (new String("str")) + Integer.toString(printf_parametersCount);
    }
    
    String newcond(){
       condCount ++;
       return (new String("cond")) + Integer.toString(labelCount);
    } 
    
    public List<String> getTextCode(){
       return TextCode;
    }
    public List<String> getPrintfCode(){
       return PrintfCode;
    }
}

program: 
INT MAIN '(' ')'{ prologue();}
'{'
	declarations
	statements
	returning?
'}'
{
	   if (TRACEON) System.out.println("INT MAIN () {declarations statements}");
       epilogue();
}
;

returning:
	RETURN + '0;'{
		TextCode.add("ret i32 0");
	}
;

declarations: 
type Identifier ';' declarations
{
       if (TRACEON) System.out.println("declarations: type Identifier : declarations");

       if (symtab.containsKey($Identifier.text)) {
              // variable re-declared.
              System.out.println("Type Error: " + $Identifier.getLine() + ": Redeclared identifier.");
              System.exit(0);
       }
                 
       /* Add ID and its info into the symbol table. */
	   Info the_entry = new Info();
	   the_entry.theType = $type.attr_type;
	   the_entry.theVar.varIndex = varCount;
	   varCount ++;
	   symtab.put($Identifier.text, the_entry);

		// issue the instruction.
		// Ex: \%a = alloca i32, align 4

		if ($type.attr_type == Type.INT) { 
		  TextCode.add("\%t" + the_entry.theVar.varIndex + " = alloca i32, align 4");
		}
}
| 
{
       if (TRACEON)
          System.out.println("declarations: ");
}
;


type returns [Type attr_type]: 
	INT { if (TRACEON) System.out.println("type: INT"); $attr_type=Type.INT; }
;


statements:
	statement statements
	|
;


statement: 
	assign_stmt { TextCode.add($assign_stmt.code); }';'
    | if_stmt
	| func_no_return_stmt ';'
	| printf
	| printf_parameters
;

printf_parameters
@init {String str=""; int len=0; String str_len=""; String par=""; String parameters="";}:
{par = newprint();}
'printf''(' STRING_LITERAL
	{	
		str = $STRING_LITERAL.text;
		str = str.replaceAll("\"", "");
		len = str.length();
		str = str.replaceAll("\\\\n", "\\\\0A");
		str = str + "\\";
		str = str + "00";
		
		str_len = Integer.toString(len);
		PrintfCode.add("@"+par + " = private unnamed_addr constant [" + str_len + " x i8] c \"" + str + "\", align 1");
		
	}
( ',' a = arith_expression
	{
		parameters = parameters + ", i32 \%t" + $a.theInfo.theVar.varIndex;
		
	}

)+
{
	Info the_entry = new Info();
	the_entry.theType = Type.INT;
	the_entry.theVar.varIndex = varCount;
	varCount ++;
	TextCode.add("\%t" + the_entry.theVar.varIndex + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([" + str_len + " x i8], [" + str_len + " x i8]* @" + par + ", i64 0, i64 0)"+ parameters+')');
}
')'';'
;

printf
@init {String str=""; int len=0; String str_len=""; String par="";}:
{par = newprint();}
'printf''(' STRING_LITERAL
	{	
		str = $STRING_LITERAL.text;
		str = str.replaceAll("\"", "");
		len = str.length();
		str = str.replaceAll("\\\\n", "\\\\0A");
		str = str + "\\";
		str = str + "00";
		
		str_len = Integer.toString(len);
		PrintfCode.add("@"+par + " = private unnamed_addr constant [" + str_len + " x i8] c \"" + str + "\", align 1");
		Info the_entry = new Info();
		the_entry.theType = Type.INT;
		the_entry.theVar.varIndex = varCount;
		varCount ++;
		TextCode.add("\%t" + the_entry.theVar.varIndex + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([" + str_len + " x i8], [" + str_len + " x i8]* @" + par + ", i64 0, i64 0))");
		
	}
')'';'
 ;
 
if_stmt
@init{ String if_thenLabel=""; String elseLabel=""; String endLabel=""; String cond_num="";}:
	{
		if_thenLabel=newLabel("if_thenLabel"); elseLabel=newLabel("elseLabel");
		cond_num = newcond();
	}
    IF '(' cond_expression[elseLabel] ')' 
    	{ 
    		TextCode.add("br i1 \%" + cond_num + ", label \%"+ if_thenLabel +", label \%"+ elseLabel);
    		TextCode.add(if_thenLabel+":");
    	}
    block_stmt
    {
    	endLabel = newLabel("Lend");
		TextCode.add("br label \%"+endLabel);
    }
    ((ELSE) => ELSE {TextCode.add(elseLabel+":");} block_stmt{
    	TextCode.add("br label \%"+endLabel);
    	TextCode.add(endLabel+":");
		TextCode.add(" ");
    }
    )?
    
;
				  
block_stmt:
	'{' statements '}'| statement
;


assign_stmt
returns [String code]: 
	Identifier '=' arith_expression
	{
		Info theRHS = $arith_expression.theInfo;
		Info theLHS = symtab.get($Identifier.text);
        
        if((theLHS.theType== Type.INT) && (theRHS.theType==Type.INT)){
        	code = "store i32 \%t" + theRHS.theVar.varIndex + ", i32* \%t" + theLHS.theVar.varIndex + ", align 4";
        	
        }
        else if((theLHS.theType==Type.INT) && (theRHS.theType==Type.CONST_INT)){
        	code = "store i32 " + theRHS.theVar.iValue + ", i32* \%t" + theLHS.theVar.varIndex + ", align 4";
        }
	}

;

		   
func_no_return_stmt: 
	Identifier '(' argument ')'
;


argument: 
	arg (',' arg)*
;

arg: 
	arith_expression
	| STRING_LITERAL
;
		   
cond_expression
[String label] returns [boolean truth]:
a = arith_expression
{
	if($a.theInfo.theType.ordinal() != 0) truth = true;
	else truth = false;
}
( op=RelationOP b = arith_expression{
		String cond_num = newcond();
		switch($op.text){
			case ">":
				if($a.theInfo.theType == Type.INT){
					if($b.theInfo.theType == Type.INT) TextCode.add("\%"+ cond_num +" = icmp sgt i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
					else if($b.theInfo.theType == Type.CONST_INT) TextCode.add("\%"+ cond_num +" = icmp sgt i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
				}
				else if($a.theInfo.theType == Type.CONST_INT){
					if($b.theInfo.theType == Type.INT) TextCode.add("\%"+ cond_num +" = icmp sgt i32 " + $a.theInfo.theVar.iValue + ", \%t" + $b.theInfo.theVar.varIndex);
					else if($b.theInfo.theType == Type.CONST_INT) TextCode.add("\%"+ cond_num +" = icmp sgt i32 \%t" + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
				}
				break;
				
			case ">=":
				if($a.theInfo.theType == Type.INT){
					if($b.theInfo.theType == Type.INT) TextCode.add("\%"+ cond_num +" = icmp sge i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
					else if($b.theInfo.theType == Type.CONST_INT) TextCode.add("\%"+ cond_num +" = icmp sge i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
				}
				else if($a.theInfo.theType == Type.CONST_INT){
					if($b.theInfo.theType == Type.INT) TextCode.add("\%"+ cond_num +" = icmp sge i32 " + $a.theInfo.theVar.iValue + ", \%t" + $b.theInfo.theVar.varIndex);
					else if($b.theInfo.theType == Type.CONST_INT) TextCode.add("\%"+ cond_num +" = icmp sge i32 \%t" + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
				}
				break;
			case "<":
				if($a.theInfo.theType == Type.INT){
					if($b.theInfo.theType == Type.INT) TextCode.add("\%"+ cond_num +" = icmp slt i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
					else if($b.theInfo.theType == Type.CONST_INT) TextCode.add("\%"+ cond_num +" = icmp slt i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
				}
				else if($a.theInfo.theType == Type.CONST_INT){
					if($b.theInfo.theType == Type.INT) TextCode.add("\%"+ cond_num +" = icmp slt i32 " + $a.theInfo.theVar.iValue + ", \%t" + $b.theInfo.theVar.varIndex);
					else if($b.theInfo.theType == Type.CONST_INT) TextCode.add("\%"+ cond_num +" = icmp slt i32 \%t" + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
				}
				break;
			case "<=":
				if($a.theInfo.theType == Type.INT){
					if($b.theInfo.theType == Type.INT) TextCode.add("\%"+ cond_num +" = icmp sle i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
					else if($b.theInfo.theType == Type.CONST_INT) TextCode.add("\%"+ cond_num +" = icmp sle i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
				}
				else if($a.theInfo.theType == Type.CONST_INT){
					if($b.theInfo.theType == Type.INT) TextCode.add("\%"+ cond_num +" = icmp sle i32 " + $a.theInfo.theVar.iValue + ", \%t" + $b.theInfo.theVar.varIndex);
					else if($b.theInfo.theType == Type.CONST_INT) TextCode.add("\%"+ cond_num +" = icmp sle i32 \%t" + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
				}
				break;
			case "!=":
				if($a.theInfo.theType == Type.INT){
					if($b.theInfo.theType == Type.INT) TextCode.add("\%"+ cond_num +" = icmp ne i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
					else if($b.theInfo.theType == Type.CONST_INT) TextCode.add("\%"+ cond_num +" = icmp ne i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
				}
				else if($a.theInfo.theType == Type.CONST_INT){
					if($b.theInfo.theType == Type.INT) TextCode.add("\%"+ cond_num +" = icmp ne i32 " + $a.theInfo.theVar.iValue + ", \%t" + $b.theInfo.theVar.varIndex);
					else if($b.theInfo.theType == Type.CONST_INT) TextCode.add("\%"+ cond_num +" = icmp ne i32 \%t" + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
				}
				break;
			case "==":
				if($a.theInfo.theType == Type.INT){
					if($b.theInfo.theType == Type.INT) TextCode.add("\%"+ cond_num +" = icmp eq i32 \%t" + $a.theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
					else if($b.theInfo.theType == Type.CONST_INT) TextCode.add("\%"+ cond_num +" = icmp eq i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
				}
				else if($a.theInfo.theType == Type.CONST_INT){
					if($b.theInfo.theType == Type.INT) TextCode.add("\%"+ cond_num +" = icmp eq i32 " + $a.theInfo.theVar.iValue + ", \%t" + $b.theInfo.theVar.varIndex);
					else if($b.theInfo.theType == Type.CONST_INT) TextCode.add("\%cond" +" = icmp eq i32 \%t" + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
				}
				break;
		}
	}
)*
;
			   
arith_expression returns [Info theInfo]
@init {theInfo = new Info();}: 
	a=multExpr { $theInfo=$a.theInfo; }
	 ( '+' b=multExpr
		{  // code generation.					   
		   if ($a.theInfo.theType == Type.INT) {
		   		if($b.theInfo.theType == Type.INT){
		   			TextCode.add("\%t" + varCount + " = add nsw i32 \%t" + $theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
		   		}
		   		else if($b.theInfo.theType == Type.CONST_INT){
		   			TextCode.add("\%t" + varCount + " = add nsw i32 \%t" + $theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
		   		}
		       
		    }
		    else if($a.theInfo.theType == Type.CONST_INT){
		    	if($b.theInfo.theType == Type.INT){
		   			TextCode.add("\%t" + varCount + " = add nsw i32 " + $a.theInfo.theVar.iValue + ", \%t" + $b.theInfo.theVar.varIndex);
		   		}
		   		else if($b.theInfo.theType == Type.CONST_INT){
		   			TextCode.add("\%t" + varCount + " = add nsw i32 " + $a.theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
		   		}
		    }
		    // Update arith_expression's theInfo.
   			$theInfo.theType = Type.INT;
   			$theInfo.theVar.varIndex = varCount;
   			varCount ++; 
		   
		}
	 | '-' c = multExpr
	 	{
	 		if ($a.theInfo.theType == Type.INT) {
		   		if($c.theInfo.theType == Type.INT){
		   			TextCode.add("\%t" + varCount + " = sub nsw i32 \%t" + $theInfo.theVar.varIndex + ", \%t" + $c.theInfo.theVar.varIndex);
		   		}
		   		else if($c.theInfo.theType == Type.CONST_INT){
		   			TextCode.add("\%t" + varCount + " = sub nsw i32 \%t" + $a.theInfo.theVar.varIndex + ", " + $c.theInfo.theVar.iValue);
		   		}
		       
		    }
		    else if($a.theInfo.theType == Type.CONST_INT){
		    	if($c.theInfo.theType == Type.INT){
		   			TextCode.add("\%t" + varCount + " = sub nsw i32 " + $a.theInfo.theVar.iValue + ", \%t" + $c.theInfo.theVar.varIndex);
		   		}
		   		else if($c.theInfo.theType == Type.CONST_INT){
		   			TextCode.add("\%t" + varCount + " = sub nsw i32 " + $theInfo.theVar.iValue + ", " + $c.theInfo.theVar.iValue);
		   		}
		    }
		    // Update arith_expression's theInfo.
   			$theInfo.theType = Type.INT;
   			$theInfo.theVar.varIndex = varCount;
   			varCount ++; 
	 	}
	)*
;

multExpr returns [Info theInfo]
@init {theInfo = new Info();}: 
	a=signExpr { $theInfo=$a.theInfo; }
	( '*' b = signExpr
		{
			if ($a.theInfo.theType == Type.INT) {
		   		if($b.theInfo.theType == Type.INT){
		   			TextCode.add("\%t" + varCount + " = mul nsw i32 \%t" + $theInfo.theVar.varIndex + ", \%t" + $b.theInfo.theVar.varIndex);
		   		}
		   		else if($b.theInfo.theType == Type.CONST_INT){
		   			TextCode.add("\%t" + varCount + " = mul nsw i32 \%t" + $theInfo.theVar.varIndex + ", " + $b.theInfo.theVar.iValue);
		   		}
		       
		    }
		    else if($a.theInfo.theType == Type.CONST_INT){
		    	if($b.theInfo.theType == Type.INT){
		   			TextCode.add("\%t" + varCount + " = mul nsw i32 " + $theInfo.theVar.iValue + ", \%t" + $b.theInfo.theVar.varIndex);
		   		}
		   		else if($b.theInfo.theType == Type.CONST_INT){
		   			TextCode.add("\%t" + varCount + " = mul nsw i32 " + $theInfo.theVar.iValue + ", " + $b.theInfo.theVar.iValue);
		   		}
		    }
		    // Update arith_expression's theInfo.
   			$theInfo.theType = Type.INT;
   			$theInfo.theVar.varIndex = varCount;
   			varCount ++; 
		}
      | '/' c = signExpr
      	{
      		if ($a.theInfo.theType == Type.INT) {
		   		if($c.theInfo.theType == Type.INT){
		   			TextCode.add("\%t" + varCount + " = sdiv nsw i32 \%t" + $theInfo.theVar.varIndex + ", \%t" + $c.theInfo.theVar.varIndex);
		   		}
		   		else if($c.theInfo.theType == Type.CONST_INT){
		   			TextCode.add("\%t" + varCount + " = sdiv nsw i32 \%t" + $theInfo.theVar.varIndex + ", " + $c.theInfo.theVar.iValue);
		   		}
		       
		    }
		    else if($a.theInfo.theType == Type.CONST_INT){
		    	if($c.theInfo.theType == Type.INT){
		   			TextCode.add("\%t" + varCount + " = sdiv nsw i32 " + $theInfo.theVar.iValue + ", \%t" + $c.theInfo.theVar.varIndex);
		   		}
		   		else if($c.theInfo.theType == Type.CONST_INT){
		   			TextCode.add("\%t" + varCount + " = sdiv nsw i32 " + $theInfo.theVar.iValue + ", " + $c.theInfo.theVar.iValue);
		   		}
		    }
		    // Update arith_expression's theInfo.
   			$theInfo.theType = Type.INT;
   			$theInfo.theVar.varIndex = varCount;
   			varCount ++; 
      
      }
 	)*
;

signExpr returns [Info theInfo]
@init {theInfo = new Info();}: 
	a=primaryExpr { $theInfo=$a.theInfo; } 
;
		  
primaryExpr returns [Info theInfo]
@init {theInfo = new Info();}: 
	Integer_constant
	{
		$theInfo.theType = Type.CONST_INT;
		$theInfo.theVar.iValue = Integer.parseInt($Integer_constant.text);
		//TextCode.add(" ldc " + $Integer_constant.text);
	}
    
    | Identifier
	  {
        // get type information from symtab.
        Type the_type = symtab.get($Identifier.text).theType;
		$theInfo.theType = the_type;

        // get variable index from symtab.
        int vIndex = symtab.get($Identifier.text).theVar.varIndex;
		
        switch (the_type) {
		    case INT: 
		             // get a new temporary variable and
					 // load the variable into the temporary variable.
		             
					 // Ex: \%tx = load i32, i32* \%ty.
					 TextCode.add("\%t" + varCount + "=load i32, i32* \%t" + vIndex + ", align 4");
				     
					 // Now, Identifier's value is at the temporary variable \%t[varCount].
					 // Therefore, update it.
					 $theInfo.theVar.varIndex = varCount;
					 varCount ++;
		             break;
        }
      }
   | '-' Identifier
   {
   		Type the_type = symtab.get($Identifier.text).theType;
		$theInfo.theType = the_type;
		
        // get variable index from symtab.
        int vIndex = symtab.get($Identifier.text).theVar.varIndex;
        
        switch (the_type) {
		    case INT: 
	             // get a new temporary variable and
				 // load the variable into the temporary variable.
	             
				 // Ex: \%tx = load i32, i32* \%ty.
				 TextCode.add("\%t" + varCount + "=load i32, i32* \%t" + vIndex + ", align 4");
			     
				 // Now, Identifier's value is at the temporary variable \%t[varCount].
				 // Therefore, update it.
				 $theInfo.theVar.varIndex = varCount;
				 varCount ++;
	             break;
        }
        
   		TextCode.add("\%t" + varCount + " = sub nsw i32 0, " + "\%t" +  $theInfo.theVar.varIndex);
   		$theInfo.theVar.varIndex = varCount;
		varCount ++;
   }

   | '(' a = arith_expression ')'
   {
   		$theInfo= $a.theInfo;
   }
   
;

		   
/* description of the tokens */
FLOAT:'float';
INT:'int';
CHAR: 'char';

MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';
PRINTF: 'printf';
RETURN: 'return';
RelationOP: '>' |'>=' | '<' | '<=' | '==' | '!=';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;

Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

WS:( ' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};
LINE_COMMAND 
    : '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;
