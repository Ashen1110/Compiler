// $ANTLR 3.5.2 myCompiler.g 2022-06-18 18:35:44

    import java.util.HashMap;
    import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myCompilerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ELSE", "EscapeSequence", 
		"FLOAT", "FOR", "Floating_point_constant", "IF", "INT", "Identifier", 
		"Integer_constant", "LINE_COMMAND", "MAIN", "PRINTF", "RETURN", "RelationOP", 
		"STRING_LITERAL", "VOID", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'/'", "'0;'", "';'", "'='", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ELSE=6;
	public static final int EscapeSequence=7;
	public static final int FLOAT=8;
	public static final int FOR=9;
	public static final int Floating_point_constant=10;
	public static final int IF=11;
	public static final int INT=12;
	public static final int Identifier=13;
	public static final int Integer_constant=14;
	public static final int LINE_COMMAND=15;
	public static final int MAIN=16;
	public static final int PRINTF=17;
	public static final int RETURN=18;
	public static final int RelationOP=19;
	public static final int STRING_LITERAL=20;
	public static final int VOID=21;
	public static final int WS=22;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCompilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myCompilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myCompiler.g"; }


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



	// $ANTLR start "program"
	// myCompiler.g:96:1: program : INT MAIN '(' ')' '{' declarations statements ( returning )? '}' ;
	public final void program() throws RecognitionException {
		try {
			// myCompiler.g:96:8: ( INT MAIN '(' ')' '{' declarations statements ( returning )? '}' )
			// myCompiler.g:97:1: INT MAIN '(' ')' '{' declarations statements ( returning )? '}'
			{
			match(input,INT,FOLLOW_INT_in_program37); if (state.failed) return;
			match(input,MAIN,FOLLOW_MAIN_in_program39); if (state.failed) return;
			match(input,23,FOLLOW_23_in_program41); if (state.failed) return;
			match(input,24,FOLLOW_24_in_program43); if (state.failed) return;
			if ( state.backtracking==0 ) { prologue();}
			match(input,33,FOLLOW_33_in_program46); if (state.failed) return;
			pushFollow(FOLLOW_declarations_in_program49);
			declarations();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_statements_in_program52);
			statements();
			state._fsp--;
			if (state.failed) return;
			// myCompiler.g:101:2: ( returning )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==RETURN) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// myCompiler.g:101:2: returning
					{
					pushFollow(FOLLOW_returning_in_program55);
					returning();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,34,FOLLOW_34_in_program58); if (state.failed) return;
			if ( state.backtracking==0 ) {
				   if (TRACEON) System.out.println("INT MAIN () {declarations statements}");
			       epilogue();
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "returning"
	// myCompiler.g:109:1: returning : ( RETURN )+ '0;' ;
	public final void returning() throws RecognitionException {
		try {
			// myCompiler.g:109:10: ( ( RETURN )+ '0;' )
			// myCompiler.g:110:2: ( RETURN )+ '0;'
			{
			// myCompiler.g:110:2: ( RETURN )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==RETURN) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myCompiler.g:110:2: RETURN
					{
					match(input,RETURN,FOLLOW_RETURN_in_returning69); if (state.failed) return;
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match(input,30,FOLLOW_30_in_returning73); if (state.failed) return;
			if ( state.backtracking==0 ) {
					TextCode.add("ret i32 0");
				}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "returning"



	// $ANTLR start "declarations"
	// myCompiler.g:115:1: declarations : ( type Identifier ';' declarations |);
	public final void declarations() throws RecognitionException {
		Token Identifier1=null;
		Type type2 =null;

		try {
			// myCompiler.g:115:13: ( type Identifier ';' declarations |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==INT) ) {
				alt3=1;
			}
			else if ( (LA3_0==IF||LA3_0==Identifier||(LA3_0 >= PRINTF && LA3_0 <= RETURN)||LA3_0==34) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// myCompiler.g:116:1: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations83);
					type2=type();
					state._fsp--;
					if (state.failed) return;
					Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations85); if (state.failed) return;
					match(input,31,FOLLOW_31_in_declarations87); if (state.failed) return;
					pushFollow(FOLLOW_declarations_in_declarations89);
					declarations();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					       if (TRACEON) System.out.println("declarations: type Identifier : declarations");

					       if (symtab.containsKey((Identifier1!=null?Identifier1.getText():null))) {
					              // variable re-declared.
					              System.out.println("Type Error: " + Identifier1.getLine() + ": Redeclared identifier.");
					              System.exit(0);
					       }
					                 
					       /* Add ID and its info into the symbol table. */
						   Info the_entry = new Info();
						   the_entry.theType = type2;
						   the_entry.theVar.varIndex = varCount;
						   varCount ++;
						   symtab.put((Identifier1!=null?Identifier1.getText():null), the_entry);

							// issue the instruction.
							// Ex: %a = alloca i32, align 4

							if (type2 == Type.INT) { 
							  TextCode.add("%t" + the_entry.theVar.varIndex + " = alloca i32, align 4");
							}
					}
					}
					break;
				case 2 :
					// myCompiler.g:141:1: 
					{
					if ( state.backtracking==0 ) {
					       if (TRACEON)
					          System.out.println("declarations: ");
					}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declarations"



	// $ANTLR start "type"
	// myCompiler.g:148:1: type returns [Type attr_type] : INT ;
	public final Type type() throws RecognitionException {
		Type attr_type = null;


		try {
			// myCompiler.g:148:30: ( INT )
			// myCompiler.g:149:2: INT
			{
			match(input,INT,FOLLOW_INT_in_type111); if (state.failed) return attr_type;
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: INT"); attr_type =Type.INT; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// myCompiler.g:153:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myCompiler.g:153:11: ( statement statements |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==IF||LA4_0==Identifier||LA4_0==PRINTF) ) {
				alt4=1;
			}
			else if ( (LA4_0==RETURN||LA4_0==34) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// myCompiler.g:154:2: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements123);
					statement();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statements_in_statements125);
					statements();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:156:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statements"



	// $ANTLR start "statement"
	// myCompiler.g:159:1: statement : ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | printf | printf_parameters );
	public final void statement() throws RecognitionException {
		String assign_stmt3 =null;

		try {
			// myCompiler.g:159:10: ( assign_stmt ';' | if_stmt | func_no_return_stmt ';' | printf | printf_parameters )
			int alt5=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA5_1 = input.LA(2);
				if ( (LA5_1==32) ) {
					alt5=1;
				}
				else if ( (LA5_1==23) ) {
					alt5=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt5=2;
				}
				break;
			case PRINTF:
				{
				int LA5_3 = input.LA(2);
				if ( (LA5_3==23) ) {
					int LA5_6 = input.LA(3);
					if ( (LA5_6==STRING_LITERAL) ) {
						int LA5_7 = input.LA(4);
						if ( (LA5_7==24) ) {
							alt5=4;
						}
						else if ( (LA5_7==27) ) {
							alt5=5;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// myCompiler.g:160:2: assign_stmt ';'
					{
					pushFollow(FOLLOW_assign_stmt_in_statement139);
					assign_stmt3=assign_stmt();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) { TextCode.add(assign_stmt3); }
					match(input,31,FOLLOW_31_in_statement142); if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:161:7: if_stmt
					{
					pushFollow(FOLLOW_if_stmt_in_statement150);
					if_stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myCompiler.g:162:4: func_no_return_stmt ';'
					{
					pushFollow(FOLLOW_func_no_return_stmt_in_statement155);
					func_no_return_stmt();
					state._fsp--;
					if (state.failed) return;
					match(input,31,FOLLOW_31_in_statement157); if (state.failed) return;
					}
					break;
				case 4 :
					// myCompiler.g:163:4: printf
					{
					pushFollow(FOLLOW_printf_in_statement162);
					printf();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// myCompiler.g:164:4: printf_parameters
					{
					pushFollow(FOLLOW_printf_parameters_in_statement167);
					printf_parameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "printf_parameters"
	// myCompiler.g:167:1: printf_parameters : 'printf' '(' STRING_LITERAL ( ',' a= arith_expression )+ ')' ';' ;
	public final void printf_parameters() throws RecognitionException {
		Token STRING_LITERAL4=null;
		Info a =null;

		String str=""; int len=0; String str_len=""; String par=""; String parameters="";
		try {
			// myCompiler.g:168:90: ( 'printf' '(' STRING_LITERAL ( ',' a= arith_expression )+ ')' ';' )
			// myCompiler.g:169:1: 'printf' '(' STRING_LITERAL ( ',' a= arith_expression )+ ')' ';'
			{
			if ( state.backtracking==0 ) {par = newprint();}
			match(input,PRINTF,FOLLOW_PRINTF_in_printf_parameters182); if (state.failed) return;
			match(input,23,FOLLOW_23_in_printf_parameters183); if (state.failed) return;
			STRING_LITERAL4=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_printf_parameters185); if (state.failed) return;
			if ( state.backtracking==0 ) {	
					str = (STRING_LITERAL4!=null?STRING_LITERAL4.getText():null);
					str = str.replaceAll("\"", "");
					len = str.length();
					str = str.replaceAll("\\\\n", "\\\\0A");
					str = str + "\\";
					str = str + "00";
					
					str_len = Integer.toString(len);
					PrintfCode.add("@"+par + " = private unnamed_addr constant [" + str_len + " x i8] c \"" + str + "\", align 1");
					
				}
			// myCompiler.g:183:3: ( ',' a= arith_expression )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==27) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myCompiler.g:183:3: ',' a= arith_expression
					{
					match(input,27,FOLLOW_27_in_printf_parameters192); if (state.failed) return;
					pushFollow(FOLLOW_arith_expression_in_printf_parameters198);
					a=arith_expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
							parameters = parameters + ", i32 %t" + a.theVar.varIndex;
							
						}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			if ( state.backtracking==0 ) {
				Info the_entry = new Info();
				the_entry.theType = Type.INT;
				the_entry.theVar.varIndex = varCount;
				varCount ++;
				TextCode.add("%t" + the_entry.theVar.varIndex + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([" + str_len + " x i8], [" + str_len + " x i8]* @" + par + ", i64 0, i64 0)"+ parameters+')');
			}
			match(input,24,FOLLOW_24_in_printf_parameters209); if (state.failed) return;
			match(input,31,FOLLOW_31_in_printf_parameters210); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printf_parameters"



	// $ANTLR start "printf"
	// myCompiler.g:200:1: printf : 'printf' '(' STRING_LITERAL ')' ';' ;
	public final void printf() throws RecognitionException {
		Token STRING_LITERAL5=null;

		String str=""; int len=0; String str_len=""; String par="";
		try {
			// myCompiler.g:201:68: ( 'printf' '(' STRING_LITERAL ')' ';' )
			// myCompiler.g:202:1: 'printf' '(' STRING_LITERAL ')' ';'
			{
			if ( state.backtracking==0 ) {par = newprint();}
			match(input,PRINTF,FOLLOW_PRINTF_in_printf225); if (state.failed) return;
			match(input,23,FOLLOW_23_in_printf226); if (state.failed) return;
			STRING_LITERAL5=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_printf228); if (state.failed) return;
			if ( state.backtracking==0 ) {	
					str = (STRING_LITERAL5!=null?STRING_LITERAL5.getText():null);
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
					TextCode.add("%t" + the_entry.theVar.varIndex + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([" + str_len + " x i8], [" + str_len + " x i8]* @" + par + ", i64 0, i64 0))");
					
				}
			match(input,24,FOLLOW_24_in_printf233); if (state.failed) return;
			match(input,31,FOLLOW_31_in_printf234); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printf"



	// $ANTLR start "if_stmt"
	// myCompiler.g:224:1: if_stmt : IF '(' cond_expression[elseLabel] ')' block_stmt ( ( ELSE )=> ELSE block_stmt )? ;
	public final void if_stmt() throws RecognitionException {
		 String if_thenLabel=""; String elseLabel=""; String endLabel=""; String cond_num="";
		try {
			// myCompiler.g:225:93: ( IF '(' cond_expression[elseLabel] ')' block_stmt ( ( ELSE )=> ELSE block_stmt )? )
			// myCompiler.g:226:2: IF '(' cond_expression[elseLabel] ')' block_stmt ( ( ELSE )=> ELSE block_stmt )?
			{
			if ( state.backtracking==0 ) {
					if_thenLabel=newLabel("if_thenLabel"); elseLabel=newLabel("elseLabel");
					cond_num = newcond();
				}
			match(input,IF,FOLLOW_IF_in_if_stmt255); if (state.failed) return;
			match(input,23,FOLLOW_23_in_if_stmt257); if (state.failed) return;
			pushFollow(FOLLOW_cond_expression_in_if_stmt259);
			cond_expression(elseLabel);
			state._fsp--;
			if (state.failed) return;
			match(input,24,FOLLOW_24_in_if_stmt262); if (state.failed) return;
			if ( state.backtracking==0 ) { 
			    		TextCode.add("br i1 %" + cond_num + ", label %"+ if_thenLabel +", label %"+ elseLabel);
			    		TextCode.add(if_thenLabel+":");
			    	}
			pushFollow(FOLLOW_block_stmt_in_if_stmt276);
			block_stmt();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			    	endLabel = newLabel("Lend");
					TextCode.add("br label %"+endLabel);
			    }
			// myCompiler.g:240:5: ( ( ELSE )=> ELSE block_stmt )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ELSE) ) {
				int LA7_1 = input.LA(2);
				if ( (synpred1_myCompiler()) ) {
					alt7=1;
				}
			}
			switch (alt7) {
				case 1 :
					// myCompiler.g:240:6: ( ELSE )=> ELSE block_stmt
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_stmt295); if (state.failed) return;
					if ( state.backtracking==0 ) {TextCode.add(elseLabel+":");}
					pushFollow(FOLLOW_block_stmt_in_if_stmt299);
					block_stmt();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					    	TextCode.add("br label %"+endLabel);
					    	TextCode.add(endLabel+":");
							TextCode.add(" ");
					    }
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_stmt"



	// $ANTLR start "block_stmt"
	// myCompiler.g:249:1: block_stmt : ( '{' statements '}' | statement );
	public final void block_stmt() throws RecognitionException {
		try {
			// myCompiler.g:249:11: ( '{' statements '}' | statement )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==33) ) {
				alt8=1;
			}
			else if ( (LA8_0==IF||LA8_0==Identifier||LA8_0==PRINTF) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// myCompiler.g:250:2: '{' statements '}'
					{
					match(input,33,FOLLOW_33_in_block_stmt327); if (state.failed) return;
					pushFollow(FOLLOW_statements_in_block_stmt329);
					statements();
					state._fsp--;
					if (state.failed) return;
					match(input,34,FOLLOW_34_in_block_stmt331); if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:250:22: statement
					{
					pushFollow(FOLLOW_statement_in_block_stmt334);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block_stmt"



	// $ANTLR start "assign_stmt"
	// myCompiler.g:254:1: assign_stmt returns [String code] : Identifier '=' arith_expression ;
	public final String assign_stmt() throws RecognitionException {
		String code = null;


		Token Identifier7=null;
		Info arith_expression6 =null;

		try {
			// myCompiler.g:255:22: ( Identifier '=' arith_expression )
			// myCompiler.g:256:2: Identifier '=' arith_expression
			{
			Identifier7=(Token)match(input,Identifier,FOLLOW_Identifier_in_assign_stmt349); if (state.failed) return code;
			match(input,32,FOLLOW_32_in_assign_stmt351); if (state.failed) return code;
			pushFollow(FOLLOW_arith_expression_in_assign_stmt353);
			arith_expression6=arith_expression();
			state._fsp--;
			if (state.failed) return code;
			if ( state.backtracking==0 ) {
					Info theRHS = arith_expression6;
					Info theLHS = symtab.get((Identifier7!=null?Identifier7.getText():null));
			        
			        if((theLHS.theType== Type.INT) && (theRHS.theType==Type.INT)){
			        	code = "store i32 %t" + theRHS.theVar.varIndex + ", i32* %t" + theLHS.theVar.varIndex + ", align 4";
			        	
			        }
			        else if((theLHS.theType==Type.INT) && (theRHS.theType==Type.CONST_INT)){
			        	code = "store i32 " + theRHS.theVar.iValue + ", i32* %t" + theLHS.theVar.varIndex + ", align 4";
			        }
				}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "assign_stmt"



	// $ANTLR start "func_no_return_stmt"
	// myCompiler.g:273:1: func_no_return_stmt : Identifier '(' argument ')' ;
	public final void func_no_return_stmt() throws RecognitionException {
		try {
			// myCompiler.g:273:20: ( Identifier '(' argument ')' )
			// myCompiler.g:274:2: Identifier '(' argument ')'
			{
			match(input,Identifier,FOLLOW_Identifier_in_func_no_return_stmt373); if (state.failed) return;
			match(input,23,FOLLOW_23_in_func_no_return_stmt375); if (state.failed) return;
			pushFollow(FOLLOW_argument_in_func_no_return_stmt377);
			argument();
			state._fsp--;
			if (state.failed) return;
			match(input,24,FOLLOW_24_in_func_no_return_stmt379); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "func_no_return_stmt"



	// $ANTLR start "argument"
	// myCompiler.g:278:1: argument : arg ( ',' arg )* ;
	public final void argument() throws RecognitionException {
		try {
			// myCompiler.g:278:9: ( arg ( ',' arg )* )
			// myCompiler.g:279:2: arg ( ',' arg )*
			{
			pushFollow(FOLLOW_arg_in_argument390);
			arg();
			state._fsp--;
			if (state.failed) return;
			// myCompiler.g:279:6: ( ',' arg )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==27) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myCompiler.g:279:7: ',' arg
					{
					match(input,27,FOLLOW_27_in_argument393); if (state.failed) return;
					pushFollow(FOLLOW_arg_in_argument395);
					arg();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "argument"



	// $ANTLR start "arg"
	// myCompiler.g:282:1: arg : ( arith_expression | STRING_LITERAL );
	public final void arg() throws RecognitionException {
		try {
			// myCompiler.g:282:4: ( arith_expression | STRING_LITERAL )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= Identifier && LA10_0 <= Integer_constant)||LA10_0==23||LA10_0==28) ) {
				alt10=1;
			}
			else if ( (LA10_0==STRING_LITERAL) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// myCompiler.g:283:2: arith_expression
					{
					pushFollow(FOLLOW_arith_expression_in_arg407);
					arith_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myCompiler.g:284:4: STRING_LITERAL
					{
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_arg412); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arg"



	// $ANTLR start "cond_expression"
	// myCompiler.g:287:1: cond_expression[String label] returns [boolean truth] : a= arith_expression (op= RelationOP b= arith_expression )* ;
	public final boolean cond_expression(String label) throws RecognitionException {
		boolean truth = false;


		Token op=null;
		Info a =null;
		Info b =null;

		try {
			// myCompiler.g:288:39: (a= arith_expression (op= RelationOP b= arith_expression )* )
			// myCompiler.g:289:3: a= arith_expression (op= RelationOP b= arith_expression )*
			{
			pushFollow(FOLLOW_arith_expression_in_cond_expression435);
			a=arith_expression();
			state._fsp--;
			if (state.failed) return truth;
			if ( state.backtracking==0 ) {
				if(a.theType.ordinal() != 0) truth = true;
				else truth = false;
			}
			// myCompiler.g:294:3: (op= RelationOP b= arith_expression )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==RelationOP) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// myCompiler.g:294:3: op= RelationOP b= arith_expression
					{
					op=(Token)match(input,RelationOP,FOLLOW_RelationOP_in_cond_expression443); if (state.failed) return truth;
					pushFollow(FOLLOW_arith_expression_in_cond_expression449);
					b=arith_expression();
					state._fsp--;
					if (state.failed) return truth;
					if ( state.backtracking==0 ) {
							String cond_num = newcond();
							switch((op!=null?op.getText():null)){
								case ">":
									if(a.theType == Type.INT){
										if(b.theType == Type.INT) TextCode.add("%"+ cond_num +" = icmp sgt i32 %t" + a.theVar.varIndex + ", %t" + b.theVar.varIndex);
										else if(b.theType == Type.CONST_INT) TextCode.add("%"+ cond_num +" = icmp sgt i32 %t" + a.theVar.varIndex + ", " + b.theVar.iValue);
									}
									else if(a.theType == Type.CONST_INT){
										if(b.theType == Type.INT) TextCode.add("%"+ cond_num +" = icmp sgt i32 " + a.theVar.iValue + ", %t" + b.theVar.varIndex);
										else if(b.theType == Type.CONST_INT) TextCode.add("%"+ cond_num +" = icmp sgt i32 %t" + a.theVar.iValue + ", " + b.theVar.iValue);
									}
									break;
									
								case ">=":
									if(a.theType == Type.INT){
										if(b.theType == Type.INT) TextCode.add("%"+ cond_num +" = icmp sge i32 %t" + a.theVar.varIndex + ", %t" + b.theVar.varIndex);
										else if(b.theType == Type.CONST_INT) TextCode.add("%"+ cond_num +" = icmp sge i32 %t" + a.theVar.varIndex + ", " + b.theVar.iValue);
									}
									else if(a.theType == Type.CONST_INT){
										if(b.theType == Type.INT) TextCode.add("%"+ cond_num +" = icmp sge i32 " + a.theVar.iValue + ", %t" + b.theVar.varIndex);
										else if(b.theType == Type.CONST_INT) TextCode.add("%"+ cond_num +" = icmp sge i32 %t" + a.theVar.iValue + ", " + b.theVar.iValue);
									}
									break;
								case "<":
									if(a.theType == Type.INT){
										if(b.theType == Type.INT) TextCode.add("%"+ cond_num +" = icmp slt i32 %t" + a.theVar.varIndex + ", %t" + b.theVar.varIndex);
										else if(b.theType == Type.CONST_INT) TextCode.add("%"+ cond_num +" = icmp slt i32 %t" + a.theVar.varIndex + ", " + b.theVar.iValue);
									}
									else if(a.theType == Type.CONST_INT){
										if(b.theType == Type.INT) TextCode.add("%"+ cond_num +" = icmp slt i32 " + a.theVar.iValue + ", %t" + b.theVar.varIndex);
										else if(b.theType == Type.CONST_INT) TextCode.add("%"+ cond_num +" = icmp slt i32 %t" + a.theVar.iValue + ", " + b.theVar.iValue);
									}
									break;
								case "<=":
									if(a.theType == Type.INT){
										if(b.theType == Type.INT) TextCode.add("%"+ cond_num +" = icmp sle i32 %t" + a.theVar.varIndex + ", %t" + b.theVar.varIndex);
										else if(b.theType == Type.CONST_INT) TextCode.add("%"+ cond_num +" = icmp sle i32 %t" + a.theVar.varIndex + ", " + b.theVar.iValue);
									}
									else if(a.theType == Type.CONST_INT){
										if(b.theType == Type.INT) TextCode.add("%"+ cond_num +" = icmp sle i32 " + a.theVar.iValue + ", %t" + b.theVar.varIndex);
										else if(b.theType == Type.CONST_INT) TextCode.add("%"+ cond_num +" = icmp sle i32 %t" + a.theVar.iValue + ", " + b.theVar.iValue);
									}
									break;
								case "!=":
									if(a.theType == Type.INT){
										if(b.theType == Type.INT) TextCode.add("%"+ cond_num +" = icmp ne i32 %t" + a.theVar.varIndex + ", %t" + b.theVar.varIndex);
										else if(b.theType == Type.CONST_INT) TextCode.add("%"+ cond_num +" = icmp ne i32 %t" + a.theVar.varIndex + ", " + b.theVar.iValue);
									}
									else if(a.theType == Type.CONST_INT){
										if(b.theType == Type.INT) TextCode.add("%"+ cond_num +" = icmp ne i32 " + a.theVar.iValue + ", %t" + b.theVar.varIndex);
										else if(b.theType == Type.CONST_INT) TextCode.add("%"+ cond_num +" = icmp ne i32 %t" + a.theVar.iValue + ", " + b.theVar.iValue);
									}
									break;
								case "==":
									if(a.theType == Type.INT){
										if(b.theType == Type.INT) TextCode.add("%"+ cond_num +" = icmp eq i32 %t" + a.theVar.varIndex + ", %t" + b.theVar.varIndex);
										else if(b.theType == Type.CONST_INT) TextCode.add("%"+ cond_num +" = icmp eq i32 %t" + a.theVar.varIndex + ", " + b.theVar.iValue);
									}
									else if(a.theType == Type.CONST_INT){
										if(b.theType == Type.INT) TextCode.add("%"+ cond_num +" = icmp eq i32 " + a.theVar.iValue + ", %t" + b.theVar.varIndex);
										else if(b.theType == Type.CONST_INT) TextCode.add("%cond" +" = icmp eq i32 %t" + a.theVar.iValue + ", " + b.theVar.iValue);
									}
									break;
							}
						}
					}
					break;

				default :
					break loop11;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return truth;
	}
	// $ANTLR end "cond_expression"



	// $ANTLR start "arith_expression"
	// myCompiler.g:363:1: arith_expression returns [Info theInfo] : a= multExpr ( '+' b= multExpr | '-' c= multExpr )* ;
	public final Info arith_expression() throws RecognitionException {
		Info theInfo = null;


		Info a =null;
		Info b =null;
		Info c =null;

		theInfo = new Info();
		try {
			// myCompiler.g:364:30: (a= multExpr ( '+' b= multExpr | '-' c= multExpr )* )
			// myCompiler.g:365:2: a= multExpr ( '+' b= multExpr | '-' c= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression480);
			a=multExpr();
			state._fsp--;
			if (state.failed) return theInfo;
			if ( state.backtracking==0 ) { theInfo =a; }
			// myCompiler.g:366:3: ( '+' b= multExpr | '-' c= multExpr )*
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==26) ) {
					alt12=1;
				}
				else if ( (LA12_0==28) ) {
					alt12=2;
				}

				switch (alt12) {
				case 1 :
					// myCompiler.g:366:5: '+' b= multExpr
					{
					match(input,26,FOLLOW_26_in_arith_expression488); if (state.failed) return theInfo;
					pushFollow(FOLLOW_multExpr_in_arith_expression492);
					b=multExpr();
					state._fsp--;
					if (state.failed) return theInfo;
					if ( state.backtracking==0 ) {  // code generation.					   
							   if (a.theType == Type.INT) {
							   		if(b.theType == Type.INT){
							   			TextCode.add("%t" + varCount + " = add nsw i32 %t" + theInfo.theVar.varIndex + ", %t" + b.theVar.varIndex);
							   		}
							   		else if(b.theType == Type.CONST_INT){
							   			TextCode.add("%t" + varCount + " = add nsw i32 %t" + theInfo.theVar.varIndex + ", " + b.theVar.iValue);
							   		}
							       
							    }
							    else if(a.theType == Type.CONST_INT){
							    	if(b.theType == Type.INT){
							   			TextCode.add("%t" + varCount + " = add nsw i32 " + a.theVar.iValue + ", %t" + b.theVar.varIndex);
							   		}
							   		else if(b.theType == Type.CONST_INT){
							   			TextCode.add("%t" + varCount + " = add nsw i32 " + a.theVar.iValue + ", " + b.theVar.iValue);
							   		}
							    }
							    // Update arith_expression's theInfo.
					   			theInfo.theType = Type.INT;
					   			theInfo.theVar.varIndex = varCount;
					   			varCount ++; 
							   
							}
					}
					break;
				case 2 :
					// myCompiler.g:391:5: '-' c= multExpr
					{
					match(input,28,FOLLOW_28_in_arith_expression502); if (state.failed) return theInfo;
					pushFollow(FOLLOW_multExpr_in_arith_expression508);
					c=multExpr();
					state._fsp--;
					if (state.failed) return theInfo;
					if ( state.backtracking==0 ) {
						 		if (a.theType == Type.INT) {
							   		if(c.theType == Type.INT){
							   			TextCode.add("%t" + varCount + " = sub nsw i32 %t" + theInfo.theVar.varIndex + ", %t" + c.theVar.varIndex);
							   		}
							   		else if(c.theType == Type.CONST_INT){
							   			TextCode.add("%t" + varCount + " = sub nsw i32 %t" + a.theVar.varIndex + ", " + c.theVar.iValue);
							   		}
							       
							    }
							    else if(a.theType == Type.CONST_INT){
							    	if(c.theType == Type.INT){
							   			TextCode.add("%t" + varCount + " = sub nsw i32 " + a.theVar.iValue + ", %t" + c.theVar.varIndex);
							   		}
							   		else if(c.theType == Type.CONST_INT){
							   			TextCode.add("%t" + varCount + " = sub nsw i32 " + theInfo.theVar.iValue + ", " + c.theVar.iValue);
							   		}
							    }
							    // Update arith_expression's theInfo.
					   			theInfo.theType = Type.INT;
					   			theInfo.theVar.varIndex = varCount;
					   			varCount ++; 
						 	}
					}
					break;

				default :
					break loop12;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return theInfo;
	}
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// myCompiler.g:418:1: multExpr returns [Info theInfo] : a= signExpr ( '*' b= signExpr | '/' c= signExpr )* ;
	public final Info multExpr() throws RecognitionException {
		Info theInfo = null;


		Info a =null;
		Info b =null;
		Info c =null;

		theInfo = new Info();
		try {
			// myCompiler.g:419:30: (a= signExpr ( '*' b= signExpr | '/' c= signExpr )* )
			// myCompiler.g:420:2: a= signExpr ( '*' b= signExpr | '/' c= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr538);
			a=signExpr();
			state._fsp--;
			if (state.failed) return theInfo;
			if ( state.backtracking==0 ) { theInfo =a; }
			// myCompiler.g:421:2: ( '*' b= signExpr | '/' c= signExpr )*
			loop13:
			while (true) {
				int alt13=3;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==25) ) {
					alt13=1;
				}
				else if ( (LA13_0==29) ) {
					alt13=2;
				}

				switch (alt13) {
				case 1 :
					// myCompiler.g:421:4: '*' b= signExpr
					{
					match(input,25,FOLLOW_25_in_multExpr545); if (state.failed) return theInfo;
					pushFollow(FOLLOW_signExpr_in_multExpr551);
					b=signExpr();
					state._fsp--;
					if (state.failed) return theInfo;
					if ( state.backtracking==0 ) {
								if (a.theType == Type.INT) {
							   		if(b.theType == Type.INT){
							   			TextCode.add("%t" + varCount + " = mul nsw i32 %t" + theInfo.theVar.varIndex + ", %t" + b.theVar.varIndex);
							   		}
							   		else if(b.theType == Type.CONST_INT){
							   			TextCode.add("%t" + varCount + " = mul nsw i32 %t" + theInfo.theVar.varIndex + ", " + b.theVar.iValue);
							   		}
							       
							    }
							    else if(a.theType == Type.CONST_INT){
							    	if(b.theType == Type.INT){
							   			TextCode.add("%t" + varCount + " = mul nsw i32 " + theInfo.theVar.iValue + ", %t" + b.theVar.varIndex);
							   		}
							   		else if(b.theType == Type.CONST_INT){
							   			TextCode.add("%t" + varCount + " = mul nsw i32 " + theInfo.theVar.iValue + ", " + b.theVar.iValue);
							   		}
							    }
							    // Update arith_expression's theInfo.
					   			theInfo.theType = Type.INT;
					   			theInfo.theVar.varIndex = varCount;
					   			varCount ++; 
							}
					}
					break;
				case 2 :
					// myCompiler.g:445:9: '/' c= signExpr
					{
					match(input,29,FOLLOW_29_in_multExpr565); if (state.failed) return theInfo;
					pushFollow(FOLLOW_signExpr_in_multExpr571);
					c=signExpr();
					state._fsp--;
					if (state.failed) return theInfo;
					if ( state.backtracking==0 ) {
					      		if (a.theType == Type.INT) {
							   		if(c.theType == Type.INT){
							   			TextCode.add("%t" + varCount + " = sdiv nsw i32 %t" + theInfo.theVar.varIndex + ", %t" + c.theVar.varIndex);
							   		}
							   		else if(c.theType == Type.CONST_INT){
							   			TextCode.add("%t" + varCount + " = sdiv nsw i32 %t" + theInfo.theVar.varIndex + ", " + c.theVar.iValue);
							   		}
							       
							    }
							    else if(a.theType == Type.CONST_INT){
							    	if(c.theType == Type.INT){
							   			TextCode.add("%t" + varCount + " = sdiv nsw i32 " + theInfo.theVar.iValue + ", %t" + c.theVar.varIndex);
							   		}
							   		else if(c.theType == Type.CONST_INT){
							   			TextCode.add("%t" + varCount + " = sdiv nsw i32 " + theInfo.theVar.iValue + ", " + c.theVar.iValue);
							   		}
							    }
							    // Update arith_expression's theInfo.
					   			theInfo.theType = Type.INT;
					   			theInfo.theVar.varIndex = varCount;
					   			varCount ++; 
					      
					      }
					}
					break;

				default :
					break loop13;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return theInfo;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myCompiler.g:473:1: signExpr returns [Info theInfo] : a= primaryExpr ;
	public final Info signExpr() throws RecognitionException {
		Info theInfo = null;


		Info a =null;

		theInfo = new Info();
		try {
			// myCompiler.g:474:30: (a= primaryExpr )
			// myCompiler.g:475:2: a= primaryExpr
			{
			pushFollow(FOLLOW_primaryExpr_in_signExpr606);
			a=primaryExpr();
			state._fsp--;
			if (state.failed) return theInfo;
			if ( state.backtracking==0 ) { theInfo =a; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return theInfo;
	}
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myCompiler.g:478:1: primaryExpr returns [Info theInfo] : ( Integer_constant | Identifier | '-' Identifier | '(' a= arith_expression ')' );
	public final Info primaryExpr() throws RecognitionException {
		Info theInfo = null;


		Token Integer_constant8=null;
		Token Identifier9=null;
		Token Identifier10=null;
		Info a =null;

		theInfo = new Info();
		try {
			// myCompiler.g:479:30: ( Integer_constant | Identifier | '-' Identifier | '(' a= arith_expression ')' )
			int alt14=4;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt14=1;
				}
				break;
			case Identifier:
				{
				alt14=2;
				}
				break;
			case 28:
				{
				alt14=3;
				}
				break;
			case 23:
				{
				alt14=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return theInfo;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// myCompiler.g:480:2: Integer_constant
					{
					Integer_constant8=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr632); if (state.failed) return theInfo;
					if ( state.backtracking==0 ) {
							theInfo.theType = Type.CONST_INT;
							theInfo.theVar.iValue = Integer.parseInt((Integer_constant8!=null?Integer_constant8.getText():null));
							//TextCode.add(" ldc " + (Integer_constant8!=null?Integer_constant8.getText():null));
						}
					}
					break;
				case 2 :
					// myCompiler.g:487:7: Identifier
					{
					Identifier9=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr648); if (state.failed) return theInfo;
					if ( state.backtracking==0 ) {
					        // get type information from symtab.
					        Type the_type = symtab.get((Identifier9!=null?Identifier9.getText():null)).theType;
							theInfo.theType = the_type;

					        // get variable index from symtab.
					        int vIndex = symtab.get((Identifier9!=null?Identifier9.getText():null)).theVar.varIndex;
							
					        switch (the_type) {
							    case INT: 
							             // get a new temporary variable and
										 // load the variable into the temporary variable.
							             
										 // Ex: %tx = load i32, i32* %ty.
										 TextCode.add("%t" + varCount + "=load i32, i32* %t" + vIndex + ", align 4");
									     
										 // Now, Identifier's value is at the temporary variable %t[varCount].
										 // Therefore, update it.
										 theInfo.theVar.varIndex = varCount;
										 varCount ++;
							             break;
					        }
					      }
					}
					break;
				case 3 :
					// myCompiler.g:511:6: '-' Identifier
					{
					match(input,28,FOLLOW_28_in_primaryExpr660); if (state.failed) return theInfo;
					Identifier10=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr662); if (state.failed) return theInfo;
					if ( state.backtracking==0 ) {
					   		Type the_type = symtab.get((Identifier10!=null?Identifier10.getText():null)).theType;
							theInfo.theType = the_type;
							
					        // get variable index from symtab.
					        int vIndex = symtab.get((Identifier10!=null?Identifier10.getText():null)).theVar.varIndex;
					        
					        switch (the_type) {
							    case INT: 
						             // get a new temporary variable and
									 // load the variable into the temporary variable.
						             
									 // Ex: %tx = load i32, i32* %ty.
									 TextCode.add("%t" + varCount + "=load i32, i32* %t" + vIndex + ", align 4");
								     
									 // Now, Identifier's value is at the temporary variable %t[varCount].
									 // Therefore, update it.
									 theInfo.theVar.varIndex = varCount;
									 varCount ++;
						             break;
					        }
					        
					   		TextCode.add("%t" + varCount + " = sub nsw i32 0, " + "%t" +  theInfo.theVar.varIndex);
					   		theInfo.theVar.varIndex = varCount;
							varCount ++;
					   }
					}
					break;
				case 4 :
					// myCompiler.g:539:6: '(' a= arith_expression ')'
					{
					match(input,23,FOLLOW_23_in_primaryExpr675); if (state.failed) return theInfo;
					pushFollow(FOLLOW_arith_expression_in_primaryExpr681);
					a=arith_expression();
					state._fsp--;
					if (state.failed) return theInfo;
					match(input,24,FOLLOW_24_in_primaryExpr683); if (state.failed) return theInfo;
					if ( state.backtracking==0 ) {
					   		theInfo = a;
					   }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return theInfo;
	}
	// $ANTLR end "primaryExpr"

	// $ANTLR start synpred1_myCompiler
	public final void synpred1_myCompiler_fragment() throws RecognitionException {
		// myCompiler.g:240:6: ( ELSE )
		// myCompiler.g:240:7: ELSE
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred1_myCompiler290); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_myCompiler

	// Delegated rules

	public final boolean synpred1_myCompiler() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_myCompiler_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_INT_in_program37 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MAIN_in_program39 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_program41 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_program43 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_program46 = new BitSet(new long[]{0x0000000400063800L});
	public static final BitSet FOLLOW_declarations_in_program49 = new BitSet(new long[]{0x0000000400062800L});
	public static final BitSet FOLLOW_statements_in_program52 = new BitSet(new long[]{0x0000000400040000L});
	public static final BitSet FOLLOW_returning_in_program55 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_program58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returning69 = new BitSet(new long[]{0x0000000040040000L});
	public static final BitSet FOLLOW_30_in_returning73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations83 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_declarations85 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_declarations87 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_declarations_in_declarations89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements123 = new BitSet(new long[]{0x0000000000022800L});
	public static final BitSet FOLLOW_statements_in_statements125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_stmt_in_statement139 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_statement142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_statement150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_no_return_stmt_in_statement155 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_statement157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printf_in_statement162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printf_parameters_in_statement167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_printf_parameters182 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_printf_parameters183 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_printf_parameters185 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_printf_parameters192 = new BitSet(new long[]{0x0000000010806000L});
	public static final BitSet FOLLOW_arith_expression_in_printf_parameters198 = new BitSet(new long[]{0x0000000009000000L});
	public static final BitSet FOLLOW_24_in_printf_parameters209 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_printf_parameters210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_printf225 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_printf226 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_printf228 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_printf233 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_printf234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_stmt255 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_if_stmt257 = new BitSet(new long[]{0x0000000010806000L});
	public static final BitSet FOLLOW_cond_expression_in_if_stmt259 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_if_stmt262 = new BitSet(new long[]{0x0000000200022800L});
	public static final BitSet FOLLOW_block_stmt_in_if_stmt276 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_ELSE_in_if_stmt295 = new BitSet(new long[]{0x0000000200022800L});
	public static final BitSet FOLLOW_block_stmt_in_if_stmt299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_block_stmt327 = new BitSet(new long[]{0x0000000400022800L});
	public static final BitSet FOLLOW_statements_in_block_stmt329 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_block_stmt331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block_stmt334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assign_stmt349 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_assign_stmt351 = new BitSet(new long[]{0x0000000010806000L});
	public static final BitSet FOLLOW_arith_expression_in_assign_stmt353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_func_no_return_stmt373 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_func_no_return_stmt375 = new BitSet(new long[]{0x0000000010906000L});
	public static final BitSet FOLLOW_argument_in_func_no_return_stmt377 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_func_no_return_stmt379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arg_in_argument390 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_argument393 = new BitSet(new long[]{0x0000000010906000L});
	public static final BitSet FOLLOW_arg_in_argument395 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_arith_expression_in_arg407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_arg412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression435 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_RelationOP_in_cond_expression443 = new BitSet(new long[]{0x0000000010806000L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression449 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression480 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_26_in_arith_expression488 = new BitSet(new long[]{0x0000000010806000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression492 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_28_in_arith_expression502 = new BitSet(new long[]{0x0000000010806000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression508 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr538 = new BitSet(new long[]{0x0000000022000002L});
	public static final BitSet FOLLOW_25_in_multExpr545 = new BitSet(new long[]{0x0000000010806000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr551 = new BitSet(new long[]{0x0000000022000002L});
	public static final BitSet FOLLOW_29_in_multExpr565 = new BitSet(new long[]{0x0000000010806000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr571 = new BitSet(new long[]{0x0000000022000002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_primaryExpr660 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_primaryExpr675 = new BitSet(new long[]{0x0000000010806000L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr681 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_primaryExpr683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred1_myCompiler290 = new BitSet(new long[]{0x0000000000000002L});
}
