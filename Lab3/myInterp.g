grammar myInterp;

options {
   language = Java;
   backtrack=true;
}

@header {
    import java.util.Scanner;
    import java.util.HashMap;
    import java.util.Set;
}

@members {
    boolean TRACEON = true;
    HashMap memory = new HashMap();
}

program:
	VOID MAIN '(' ')' '{' statements[1] '}'
        {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");}
    | INT MAIN '(' ')' '{' statements[1] '}'
    	{if (TRACEON) System.out.println("INT MAIN () {declarations statements}");}
    ;


type: FLOAT { if (TRACEON) System.out.println("type: FLOAT"); }
	| INT {if (TRACEON) System.out.println("type: INT"); }
	| DOUBLE {if (TRACEON) System.out.println("type: DOUBLE");}
	| CHAR {if (TRACEON) System.out.println("type: CHAR");}
	| SHORT {if (TRACEON) System.out.println("type: SHORT");}
	| LONG {if (TRACEON) System.out.println("type: LONG");}
	| SIGNED {if (TRACEON) System.out.println("type: SIGNED");}
	| UNSIGNED {if (TRACEON) System.out.println("type: UNSIGNED");}
	| BOOLEAN {if (TRACEON) System.out.println("type: BOOLEAN");}
	| STRING {if (TRACEON) System.out.println("type: STRING");}
	| VOID {if (TRACEON) System.out.println("type: VOID");}
	;

statements[int flag]:
	statement[$flag] statements[$flag]
	|
;

//statement
statement [int flag0]: 
	declarations_statement
	| assignment_statement[$flag0] ';'
	| if_statement[$flag0]
	| printf_func [$flag0] ';'
	| scanf_func [$flag0] ';'
	| jump_statement
	;
declarations_statement:
	type Identifier (',' Identifier)*';'
    	{ if(TRACEON) System.out.println("declarations: type Identifier : declarations"); }
;

if_statement [int flag_if]: 
	IF '(' a = cond_expression[$flag_if] ')' block_stmt[$a.flag] ((ELSE) => ELSE block_stmt[($a.flag==0?1:0)])?
;

block_stmt [int flag_blk]:
	'{' statements[$flag_blk] '}'
	| statement[$flag_blk]
;

assignment_statement [int flag] returns [int value]: 
	(type)? Identifier (op = AssignmentOP) (a = arith_expression[$flag]){
		if($flag == 1){
			Integer v=(Integer)memory.get($Identifier.text);
			if(v == null) v = 0;
			switch($op.text){
				case "=":
					v = $a.value;
					System.out.println("Assignment statement");
					break;
				case "+=":
					v += $a.value;
					break;
				case "-=":
					v -= $a.value;
					break;
				case "*=":
					v *= $a.value;
					break;
				case "/=":
					v /= $a.value;
					break;
				case "\%=":
					v \%= $a.value;
					break;				
			}
			memory.put($Identifier.text, v);
			$value = v;
		}
	}
;
		   
cond_expression [int flag1] returns [int flag]: 
	(a = arith_expression[$flag1] | a = assignment_statement[$flag1]) (op = RelationOP) 
	(b = arith_expression[$flag1] | b = assignment_statement[$flag1]){
		if($flag1 == 1){
			switch($op.text){
				case ">":
					$flag = (a>b) ?1 : 0;
					break;
				case ">=":
					$flag = (a>=b)?1:0;
					break;
				case "<":
					$flag = (a<b)?1:0;
					break;
				case "<=":
					$flag = (a<=b)?1:0;
					break;
				case "!=":
					$flag = (a!=b)?1:0;
					break;
				case "==":
					$flag = (a ==b)?1:0;
					break;
			}
		}
	}
;
	

arith_expression [int flag] returns [int value]:
	a=multExpr[$flag] {if($flag == 1) $value = $a.value; }( 
		'+' b=multExpr[$flag]{ $value = $value + $b.value;}
        	| '-' c = multExpr[$flag]{ $value = $value - $c.value;}
	)*
;

multExpr [int flag] returns [int value]:
	a= signExpr[$flag] {if($flag == 1) $value = $a.value;}(
		'*' b = signExpr[$flag] {$value = $value * $b.value;}
		| '/' c = signExpr[$flag] {$value = $value / $c.value;}
		| '\%' d = signExpr[$flag] { $value = $value \% $d.value;}
	)*
;

signExpr [int flag] returns [int value]:
        a = primaryExpr[$flag] { if($flag == 1) { $value = $a.value; }} 
        | '-' primaryExpr[$flag] {if($flag == 1) {$value = -1*$a.value;}}
;

primaryExpr [int flag] returns [int value]:
	Integer_constant{
		if ($flag ==1) {$value = Integer.parseInt($Integer_constant.text); }
	}
	| Identifier{
		if($flag == 1){
			Integer v = (Integer) memory.get($Identifier.text);
			if(v != null) $value = v;
			else System.err.println("Undefined variable: " + $Identifier.text);
		}
	}
	| '(' a=arith_expression[$flag] ')'{ if ($flag == 1) $value = $a.value;}
;

printf_func [int flag]:
	PRINTF '(' a = STRINGS b = (',' (Identifier | Integer_constant))* ')'{
		if($flag==1){
			if(b == null){
				String s = $a.text.replace("\\n", "\n").replace("\"", "");
				System.out.print(s);
			}
			else{
				Integer v = (Integer) memory.get($b.text);
				if(v == null) v = Integer.parseInt($b.text);
				String s = $a.text.replace("\\n", "\n").replace("\"", "").replace("\%d", Integer.toString(v));
				System.out.print(s);
			}
		}
	};
	
scanf_func [int flag]:
	SCANF '(' a = STRINGS (',' b = ('&'? Identifier)) ')'{
		if($flag == 1){
			Scanner scanner = new Scanner(System.in);
			switch($a.text.replace("\"", "")){
				case "\%d":
					Integer v = scanner.nextInt();
					memory.put($b.text, v);
					break;
			}
		}
	}
;
	
jump_statement: 
	';'
	| CONTINUE ';' 
		{if (TRACEON) System.out.println("jump_statement: continue");}
	| BREAK ';' 
		{if (TRACEON) System.out.println("jump_statement: break");}
	| RETURN ';' 
		{if (TRACEON) System.out.println("jump_statement: return;");}
	| RETURN arith_expression[1] ';'
		{if (TRACEON) System.out.println("jump_statement: return;");}
	;

/* description of the tokens */

//type
INT: 'int';
CHAR: 'char';
VOID: 'void';
FLOAT: 'float';
DOUBLE: 'double';
SIGNED: 'signed';
UNSIGNED: 'unsigned';
BOOLEAN: 'bool';
STRING: 'string';
LONG: 'long';
SHORT: 'short';

//storage
AUTO: 'auto';
STATIC: 'static';
EXTERN: 'extern';
REGISTER: 'register';

//keywords
MAIN: 'main';
SIZEOF: 'sizeof';
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
WHILE: 'while';
DO: 'do';
FOR: 'for';
CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';
PRINTF: 'printf';
SCANF: 'scanf';

RelationOP: '>' |'>=' | '<' | '<=' | '==' | '!=';

AssignmentOP: '=' | '*=' | '/=' | '%=' | '+=' | '-=';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

STRINGS: '"' (options{greedy = false;}: .)* '"';

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};

COMMENT:'/*' .* '*/' {$channel=HIDDEN;};

LINE_COMMAND 
    : '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
