// $ANTLR 3.5.2 myparser.g 2022-04-17 21:54:18

    import java.util.Set;
	import java.util.HashSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myparserParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUTO", "BOOLEAN", "BREAK", "CASE", 
		"CHAR", "COMMENT", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "EXTERN", 
		"FLOAT", "FOR", "Floating_point_constant", "IF", "INT", "Identifier", 
		"Integer_constant", "LINE_COMMAND", "LONG", "MAIN", "PRINTF", "REGISTER", 
		"RETURN", "SCANF", "SHORT", "SIGNED", "SIZEOF", "STATIC", "STRING", "STRINGS", 
		"SWITCH", "UNSIGNED", "VOID", "WHILE", "WS", "'!'", "'!='", "'%'", "'%='", 
		"'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", 
		"','", "'-'", "'--'", "'-='", "'->'", "'.'", "'/'", "'/='", "':'", "';'", 
		"'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", 
		"'>>='", "'?'", "'['", "']'", "'^'", "'^='", "'{'", "'|'", "'|='", "'||'", 
		"'}'", "'~'"
	};
	public static final int EOF=-1;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int AUTO=4;
	public static final int BOOLEAN=5;
	public static final int BREAK=6;
	public static final int CASE=7;
	public static final int CHAR=8;
	public static final int COMMENT=9;
	public static final int CONTINUE=10;
	public static final int DEFAULT=11;
	public static final int DO=12;
	public static final int DOUBLE=13;
	public static final int ELSE=14;
	public static final int EXTERN=15;
	public static final int FLOAT=16;
	public static final int FOR=17;
	public static final int Floating_point_constant=18;
	public static final int IF=19;
	public static final int INT=20;
	public static final int Identifier=21;
	public static final int Integer_constant=22;
	public static final int LINE_COMMAND=23;
	public static final int LONG=24;
	public static final int MAIN=25;
	public static final int PRINTF=26;
	public static final int REGISTER=27;
	public static final int RETURN=28;
	public static final int SCANF=29;
	public static final int SHORT=30;
	public static final int SIGNED=31;
	public static final int SIZEOF=32;
	public static final int STATIC=33;
	public static final int STRING=34;
	public static final int STRINGS=35;
	public static final int SWITCH=36;
	public static final int UNSIGNED=37;
	public static final int VOID=38;
	public static final int WHILE=39;
	public static final int WS=40;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myparserParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myparserParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myparserParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myparser.g"; }


	    boolean TRACEON = true;



	// $ANTLR start "program"
	// myparser.g:17:1: program : ( VOID MAIN '(' ')' '{' statements '}' | INT MAIN '(' ')' '{' statements '}' );
	public final void program() throws RecognitionException {
		try {
			// myparser.g:17:8: ( VOID MAIN '(' ')' '{' statements '}' | INT MAIN '(' ')' '{' statements '}' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==VOID) ) {
				alt1=1;
			}
			else if ( (LA1_0==INT) ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// myparser.g:18:2: VOID MAIN '(' ')' '{' statements '}'
					{
					match(input,VOID,FOLLOW_VOID_in_program45); if (state.failed) return;
					match(input,MAIN,FOLLOW_MAIN_in_program47); if (state.failed) return;
					match(input,48,FOLLOW_48_in_program49); if (state.failed) return;
					match(input,49,FOLLOW_49_in_program51); if (state.failed) return;
					match(input,80,FOLLOW_80_in_program53); if (state.failed) return;
					pushFollow(FOLLOW_statements_in_program55);
					statements();
					state._fsp--;
					if (state.failed) return;
					match(input,84,FOLLOW_84_in_program57); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");}
					}
					break;
				case 2 :
					// myparser.g:20:7: INT MAIN '(' ')' '{' statements '}'
					{
					match(input,INT,FOLLOW_INT_in_program75); if (state.failed) return;
					match(input,MAIN,FOLLOW_MAIN_in_program77); if (state.failed) return;
					match(input,48,FOLLOW_48_in_program79); if (state.failed) return;
					match(input,49,FOLLOW_49_in_program81); if (state.failed) return;
					match(input,80,FOLLOW_80_in_program83); if (state.failed) return;
					pushFollow(FOLLOW_statements_in_program85);
					statements();
					state._fsp--;
					if (state.failed) return;
					match(input,84,FOLLOW_84_in_program87); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("INT MAIN () {declarations statements}");}
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
	// $ANTLR end "program"



	// $ANTLR start "type"
	// myparser.g:25:1: type : ( FLOAT | INT | DOUBLE | CHAR | SHORT | LONG | SIGNED | UNSIGNED | BOOLEAN | STRING | VOID );
	public final void type() throws RecognitionException {
		try {
			// myparser.g:25:5: ( FLOAT | INT | DOUBLE | CHAR | SHORT | LONG | SIGNED | UNSIGNED | BOOLEAN | STRING | VOID )
			int alt2=11;
			switch ( input.LA(1) ) {
			case FLOAT:
				{
				alt2=1;
				}
				break;
			case INT:
				{
				alt2=2;
				}
				break;
			case DOUBLE:
				{
				alt2=3;
				}
				break;
			case CHAR:
				{
				alt2=4;
				}
				break;
			case SHORT:
				{
				alt2=5;
				}
				break;
			case LONG:
				{
				alt2=6;
				}
				break;
			case SIGNED:
				{
				alt2=7;
				}
				break;
			case UNSIGNED:
				{
				alt2=8;
				}
				break;
			case BOOLEAN:
				{
				alt2=9;
				}
				break;
			case STRING:
				{
				alt2=10;
				}
				break;
			case VOID:
				{
				alt2=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// myparser.g:25:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type107); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: FLOAT"); }
					}
					break;
				case 2 :
					// myparser.g:26:4: INT
					{
					match(input,INT,FOLLOW_INT_in_type114); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: INT"); }
					}
					break;
				case 3 :
					// myparser.g:27:4: DOUBLE
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_type121); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: DOUBLE");}
					}
					break;
				case 4 :
					// myparser.g:28:4: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type128); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: CHAR");}
					}
					break;
				case 5 :
					// myparser.g:29:4: SHORT
					{
					match(input,SHORT,FOLLOW_SHORT_in_type135); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: SHORT");}
					}
					break;
				case 6 :
					// myparser.g:30:4: LONG
					{
					match(input,LONG,FOLLOW_LONG_in_type142); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: LONG");}
					}
					break;
				case 7 :
					// myparser.g:31:4: SIGNED
					{
					match(input,SIGNED,FOLLOW_SIGNED_in_type149); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: SIGNED");}
					}
					break;
				case 8 :
					// myparser.g:32:4: UNSIGNED
					{
					match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type156); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: UNSIGNED");}
					}
					break;
				case 9 :
					// myparser.g:33:4: BOOLEAN
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type163); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: BOOLEAN");}
					}
					break;
				case 10 :
					// myparser.g:34:4: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_type170); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: STRING");}
					}
					break;
				case 11 :
					// myparser.g:35:4: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_type177); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: VOID");}
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
	// $ANTLR end "type"



	// $ANTLR start "storage_class_specifier"
	// myparser.g:38:1: storage_class_specifier : ( EXTERN | STATIC | AUTO | REGISTER );
	public final void storage_class_specifier() throws RecognitionException {
		try {
			// myparser.g:38:24: ( EXTERN | STATIC | AUTO | REGISTER )
			int alt3=4;
			switch ( input.LA(1) ) {
			case EXTERN:
				{
				alt3=1;
				}
				break;
			case STATIC:
				{
				alt3=2;
				}
				break;
			case AUTO:
				{
				alt3=3;
				}
				break;
			case REGISTER:
				{
				alt3=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// myparser.g:39:2: EXTERN
					{
					match(input,EXTERN,FOLLOW_EXTERN_in_storage_class_specifier191); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("storage: EXTERN");}
					}
					break;
				case 2 :
					// myparser.g:40:4: STATIC
					{
					match(input,STATIC,FOLLOW_STATIC_in_storage_class_specifier198); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("storage: STATIC");}
					}
					break;
				case 3 :
					// myparser.g:41:4: AUTO
					{
					match(input,AUTO,FOLLOW_AUTO_in_storage_class_specifier205); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("storage: AUTO");}
					}
					break;
				case 4 :
					// myparser.g:42:4: REGISTER
					{
					match(input,REGISTER,FOLLOW_REGISTER_in_storage_class_specifier212); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("storage: REGISTER");}
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
	// $ANTLR end "storage_class_specifier"



	// $ANTLR start "statements"
	// myparser.g:46:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myparser.g:46:11: ( statement statements |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= BOOLEAN && LA4_0 <= CHAR)||(LA4_0 >= CONTINUE && LA4_0 <= DOUBLE)||(LA4_0 >= FLOAT && LA4_0 <= Integer_constant)||LA4_0==LONG||LA4_0==PRINTF||(LA4_0 >= RETURN && LA4_0 <= SIZEOF)||LA4_0==STRING||(LA4_0 >= SWITCH && LA4_0 <= WHILE)||LA4_0==41||LA4_0==46||LA4_0==48||LA4_0==50||(LA4_0 >= 52 && LA4_0 <= 53)||(LA4_0 >= 56 && LA4_0 <= 57)||LA4_0==64||LA4_0==85) ) {
				alt4=1;
			}
			else if ( (LA4_0==EOF||LA4_0==84) ) {
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
					// myparser.g:46:12: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements224);
					statement();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statements_in_statements226);
					statements();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:47:4: 
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



	// $ANTLR start "argument_expression_list"
	// myparser.g:51:1: argument_expression_list : assignment_expression ( ',' assignment_expression )* ;
	public final void argument_expression_list() throws RecognitionException {
		try {
			// myparser.g:51:25: ( assignment_expression ( ',' assignment_expression )* )
			// myparser.g:52:2: assignment_expression ( ',' assignment_expression )*
			{
			pushFollow(FOLLOW_assignment_expression_in_argument_expression_list243);
			assignment_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:52:24: ( ',' assignment_expression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==55) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myparser.g:52:25: ',' assignment_expression
					{
					match(input,55,FOLLOW_55_in_argument_expression_list246); if (state.failed) return;
					pushFollow(FOLLOW_assignment_expression_in_argument_expression_list248);
					assignment_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop5;
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
	// $ANTLR end "argument_expression_list"



	// $ANTLR start "arith_expression"
	// myparser.g:55:1: arith_expression : multExpr ( '+' multExpr | '-' multExpr )* ;
	public final void arith_expression() throws RecognitionException {
		try {
			// myparser.g:55:17: ( multExpr ( '+' multExpr | '-' multExpr )* )
			// myparser.g:56:2: multExpr ( '+' multExpr | '-' multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression261);
			multExpr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:56:10: ( '+' multExpr | '-' multExpr )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==52) ) {
					alt6=1;
				}
				else if ( (LA6_0==56) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// myparser.g:56:12: '+' multExpr
					{
					match(input,52,FOLLOW_52_in_arith_expression264); if (state.failed) return;
					pushFollow(FOLLOW_multExpr_in_arith_expression266);
					multExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:56:27: '-' multExpr
					{
					match(input,56,FOLLOW_56_in_arith_expression270); if (state.failed) return;
					pushFollow(FOLLOW_multExpr_in_arith_expression272);
					multExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop6;
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
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// myparser.g:59:1: multExpr : signExpr ( '*' signExpr | '/' signExpr | '%' signExpr )* ;
	public final void multExpr() throws RecognitionException {
		try {
			// myparser.g:59:9: ( signExpr ( '*' signExpr | '/' signExpr | '%' signExpr )* )
			// myparser.g:60:2: signExpr ( '*' signExpr | '/' signExpr | '%' signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr285);
			signExpr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:60:10: ( '*' signExpr | '/' signExpr | '%' signExpr )*
			loop7:
			while (true) {
				int alt7=4;
				switch ( input.LA(1) ) {
				case 50:
					{
					alt7=1;
					}
					break;
				case 61:
					{
					alt7=2;
					}
					break;
				case 43:
					{
					alt7=3;
					}
					break;
				}
				switch (alt7) {
				case 1 :
					// myparser.g:60:12: '*' signExpr
					{
					match(input,50,FOLLOW_50_in_multExpr288); if (state.failed) return;
					pushFollow(FOLLOW_signExpr_in_multExpr290);
					signExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:60:27: '/' signExpr
					{
					match(input,61,FOLLOW_61_in_multExpr294); if (state.failed) return;
					pushFollow(FOLLOW_signExpr_in_multExpr296);
					signExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myparser.g:60:42: '%' signExpr
					{
					match(input,43,FOLLOW_43_in_multExpr300); if (state.failed) return;
					pushFollow(FOLLOW_signExpr_in_multExpr302);
					signExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop7;
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
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myparser.g:62:1: signExpr : ( '(' type ')' signExpr | unary_expression );
	public final void signExpr() throws RecognitionException {
		try {
			// myparser.g:62:9: ( '(' type ')' signExpr | unary_expression )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==48) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==BOOLEAN||LA8_1==CHAR||LA8_1==DOUBLE||LA8_1==FLOAT||LA8_1==INT||LA8_1==LONG||(LA8_1 >= SHORT && LA8_1 <= SIGNED)||LA8_1==STRING||(LA8_1 >= UNSIGNED && LA8_1 <= VOID)) ) {
					alt8=1;
				}
				else if ( (LA8_1==Floating_point_constant||(LA8_1 >= Identifier && LA8_1 <= Integer_constant)||LA8_1==SIZEOF||LA8_1==41||LA8_1==46||LA8_1==48||LA8_1==50||(LA8_1 >= 52 && LA8_1 <= 53)||(LA8_1 >= 56 && LA8_1 <= 57)||LA8_1==85) ) {
					alt8=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA8_0==Floating_point_constant||(LA8_0 >= Identifier && LA8_0 <= Integer_constant)||LA8_0==SIZEOF||LA8_0==41||LA8_0==46||LA8_0==50||(LA8_0 >= 52 && LA8_0 <= 53)||(LA8_0 >= 56 && LA8_0 <= 57)||LA8_0==85) ) {
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
					// myparser.g:63:5: '(' type ')' signExpr
					{
					match(input,48,FOLLOW_48_in_signExpr316); if (state.failed) return;
					pushFollow(FOLLOW_type_in_signExpr317);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_signExpr318); if (state.failed) return;
					pushFollow(FOLLOW_signExpr_in_signExpr320);
					signExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:64:7: unary_expression
					{
					pushFollow(FOLLOW_unary_expression_in_signExpr328);
					unary_expression();
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
	// $ANTLR end "signExpr"



	// $ANTLR start "expression"
	// myparser.g:67:1: expression : assignment_expression ( ',' assignment_expression )* ;
	public final void expression() throws RecognitionException {
		try {
			// myparser.g:68:2: ( assignment_expression ( ',' assignment_expression )* )
			// myparser.g:68:4: assignment_expression ( ',' assignment_expression )*
			{
			pushFollow(FOLLOW_assignment_expression_in_expression342);
			assignment_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:68:26: ( ',' assignment_expression )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==55) ) {
					int LA9_4 = input.LA(2);
					if ( (synpred23_myparser()) ) {
						alt9=1;
					}

				}

				switch (alt9) {
				case 1 :
					// myparser.g:68:27: ',' assignment_expression
					{
					match(input,55,FOLLOW_55_in_expression345); if (state.failed) return;
					pushFollow(FOLLOW_assignment_expression_in_expression347);
					assignment_expression();
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
	// $ANTLR end "expression"



	// $ANTLR start "assignment_expression"
	// myparser.g:71:1: assignment_expression : ( lvalue ( options {backtrack=true; } : assignment_expression ) | conditional_expression );
	public final void assignment_expression() throws RecognitionException {
		try {
			// myparser.g:72:2: ( lvalue ( options {backtrack=true; } : assignment_expression ) | conditional_expression )
			int alt10=2;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				int LA10_1 = input.LA(2);
				if ( (synpred24_myparser()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case Floating_point_constant:
				{
				int LA10_2 = input.LA(2);
				if ( (synpred24_myparser()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case Identifier:
				{
				int LA10_3 = input.LA(2);
				if ( (synpred24_myparser()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case 48:
				{
				int LA10_4 = input.LA(2);
				if ( (synpred24_myparser()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case 53:
				{
				int LA10_5 = input.LA(2);
				if ( (synpred24_myparser()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case 57:
				{
				int LA10_6 = input.LA(2);
				if ( (synpred24_myparser()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case 41:
			case 46:
			case 50:
			case 52:
			case 56:
			case 85:
				{
				int LA10_7 = input.LA(2);
				if ( (synpred24_myparser()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case SIZEOF:
				{
				int LA10_8 = input.LA(2);
				if ( (synpred24_myparser()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// myparser.g:72:4: lvalue ( options {backtrack=true; } : assignment_expression )
					{
					pushFollow(FOLLOW_lvalue_in_assignment_expression360);
					lvalue();
					state._fsp--;
					if (state.failed) return;
					// myparser.g:72:11: ( options {backtrack=true; } : assignment_expression )
					// myparser.g:72:38: assignment_expression
					{
					pushFollow(FOLLOW_assignment_expression_in_assignment_expression371);
					assignment_expression();
					state._fsp--;
					if (state.failed) return;
					}

					}
					break;
				case 2 :
					// myparser.g:73:4: conditional_expression
					{
					pushFollow(FOLLOW_conditional_expression_in_assignment_expression377);
					conditional_expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("assignment_expression: conditions");}
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
	// $ANTLR end "assignment_expression"



	// $ANTLR start "lvalue"
	// myparser.g:77:1: lvalue : unary_expression assignment_operator ;
	public final void lvalue() throws RecognitionException {
		try {
			// myparser.g:78:2: ( unary_expression assignment_operator )
			// myparser.g:78:4: unary_expression assignment_operator
			{
			pushFollow(FOLLOW_unary_expression_in_lvalue392);
			unary_expression();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_assignment_operator_in_lvalue394);
			assignment_operator();
			state._fsp--;
			if (state.failed) return;
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
	// $ANTLR end "lvalue"



	// $ANTLR start "unary_expression"
	// myparser.g:81:1: unary_expression : ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator signExpr | SIZEOF unary_expression | SIZEOF '(' type ')' );
	public final void unary_expression() throws RecognitionException {
		try {
			// myparser.g:81:17: ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator signExpr | SIZEOF unary_expression | SIZEOF '(' type ')' )
			int alt11=6;
			switch ( input.LA(1) ) {
			case Floating_point_constant:
			case Identifier:
			case Integer_constant:
			case 48:
				{
				alt11=1;
				}
				break;
			case 53:
				{
				alt11=2;
				}
				break;
			case 57:
				{
				alt11=3;
				}
				break;
			case 41:
			case 46:
			case 50:
			case 52:
			case 56:
			case 85:
				{
				alt11=4;
				}
				break;
			case SIZEOF:
				{
				int LA11_5 = input.LA(2);
				if ( (LA11_5==48) ) {
					int LA11_6 = input.LA(3);
					if ( (LA11_6==BOOLEAN||LA11_6==CHAR||LA11_6==DOUBLE||LA11_6==FLOAT||LA11_6==INT||LA11_6==LONG||(LA11_6 >= SHORT && LA11_6 <= SIGNED)||LA11_6==STRING||(LA11_6 >= UNSIGNED && LA11_6 <= VOID)) ) {
						alt11=6;
					}
					else if ( (LA11_6==Floating_point_constant||(LA11_6 >= Identifier && LA11_6 <= Integer_constant)||LA11_6==SIZEOF||LA11_6==41||LA11_6==46||LA11_6==48||LA11_6==50||(LA11_6 >= 52 && LA11_6 <= 53)||(LA11_6 >= 56 && LA11_6 <= 57)||LA11_6==85) ) {
						alt11=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA11_5==Floating_point_constant||(LA11_5 >= Identifier && LA11_5 <= Integer_constant)||LA11_5==SIZEOF||LA11_5==41||LA11_5==46||LA11_5==50||(LA11_5 >= 52 && LA11_5 <= 53)||(LA11_5 >= 56 && LA11_5 <= 57)||LA11_5==85) ) {
					alt11=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 5, input);
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
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// myparser.g:82:2: postfix_expression
					{
					pushFollow(FOLLOW_postfix_expression_in_unary_expression405);
					postfix_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:83:4: '++' unary_expression
					{
					match(input,53,FOLLOW_53_in_unary_expression410); if (state.failed) return;
					pushFollow(FOLLOW_unary_expression_in_unary_expression412);
					unary_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myparser.g:84:4: '--' unary_expression
					{
					match(input,57,FOLLOW_57_in_unary_expression417); if (state.failed) return;
					pushFollow(FOLLOW_unary_expression_in_unary_expression419);
					unary_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// myparser.g:85:4: unary_operator signExpr
					{
					pushFollow(FOLLOW_unary_operator_in_unary_expression424);
					unary_operator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_signExpr_in_unary_expression426);
					signExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// myparser.g:86:4: SIZEOF unary_expression
					{
					match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression431); if (state.failed) return;
					pushFollow(FOLLOW_unary_expression_in_unary_expression433);
					unary_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// myparser.g:87:4: SIZEOF '(' type ')'
					{
					match(input,SIZEOF,FOLLOW_SIZEOF_in_unary_expression438); if (state.failed) return;
					match(input,48,FOLLOW_48_in_unary_expression440); if (state.failed) return;
					pushFollow(FOLLOW_type_in_unary_expression442);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_unary_expression444); if (state.failed) return;
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
	// $ANTLR end "unary_expression"



	// $ANTLR start "postfix_expression"
	// myparser.g:90:1: postfix_expression : primaryExpr ( '[' arith_expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' Identifier | '->' Identifier | '++' | '--' )* ;
	public final void postfix_expression() throws RecognitionException {
		try {
			// myparser.g:90:19: ( primaryExpr ( '[' arith_expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' Identifier | '->' Identifier | '++' | '--' )* )
			// myparser.g:91:2: primaryExpr ( '[' arith_expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' Identifier | '->' Identifier | '++' | '--' )*
			{
			pushFollow(FOLLOW_primaryExpr_in_postfix_expression458);
			primaryExpr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:91:13: ( '[' arith_expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' Identifier | '->' Identifier | '++' | '--' )*
			loop12:
			while (true) {
				int alt12=8;
				switch ( input.LA(1) ) {
				case 76:
					{
					alt12=1;
					}
					break;
				case 48:
					{
					int LA12_3 = input.LA(2);
					if ( (LA12_3==49) ) {
						alt12=2;
					}
					else if ( (LA12_3==Floating_point_constant||(LA12_3 >= Identifier && LA12_3 <= Integer_constant)||LA12_3==SIZEOF||LA12_3==41||LA12_3==46||LA12_3==48||LA12_3==50||(LA12_3 >= 52 && LA12_3 <= 53)||(LA12_3 >= 56 && LA12_3 <= 57)||LA12_3==85) ) {
						alt12=3;
					}

					}
					break;
				case 60:
					{
					alt12=4;
					}
					break;
				case 59:
					{
					alt12=5;
					}
					break;
				case 53:
					{
					alt12=6;
					}
					break;
				case 57:
					{
					alt12=7;
					}
					break;
				}
				switch (alt12) {
				case 1 :
					// myparser.g:91:14: '[' arith_expression ']'
					{
					match(input,76,FOLLOW_76_in_postfix_expression460); if (state.failed) return;
					pushFollow(FOLLOW_arith_expression_in_postfix_expression461);
					arith_expression();
					state._fsp--;
					if (state.failed) return;
					match(input,77,FOLLOW_77_in_postfix_expression462); if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:92:4: '(' ')'
					{
					match(input,48,FOLLOW_48_in_postfix_expression467); if (state.failed) return;
					match(input,49,FOLLOW_49_in_postfix_expression469); if (state.failed) return;
					}
					break;
				case 3 :
					// myparser.g:93:4: '(' argument_expression_list ')'
					{
					match(input,48,FOLLOW_48_in_postfix_expression474); if (state.failed) return;
					pushFollow(FOLLOW_argument_expression_list_in_postfix_expression476);
					argument_expression_list();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_postfix_expression478); if (state.failed) return;
					}
					break;
				case 4 :
					// myparser.g:94:4: '.' Identifier
					{
					match(input,60,FOLLOW_60_in_postfix_expression483); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_postfix_expression484); if (state.failed) return;
					}
					break;
				case 5 :
					// myparser.g:95:4: '->' Identifier
					{
					match(input,59,FOLLOW_59_in_postfix_expression489); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_postfix_expression491); if (state.failed) return;
					}
					break;
				case 6 :
					// myparser.g:96:4: '++'
					{
					match(input,53,FOLLOW_53_in_postfix_expression496); if (state.failed) return;
					}
					break;
				case 7 :
					// myparser.g:97:4: '--'
					{
					match(input,57,FOLLOW_57_in_postfix_expression501); if (state.failed) return;
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
	}
	// $ANTLR end "postfix_expression"



	// $ANTLR start "unary_operator"
	// myparser.g:100:1: unary_operator : ( '&' | '*' | '+' | '-' | '~' | '!' );
	public final void unary_operator() throws RecognitionException {
		try {
			// myparser.g:101:2: ( '&' | '*' | '+' | '-' | '~' | '!' )
			// myparser.g:
			{
			if ( input.LA(1)==41||input.LA(1)==46||input.LA(1)==50||input.LA(1)==52||input.LA(1)==56||input.LA(1)==85 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "unary_operator"



	// $ANTLR start "primaryExpr"
	// myparser.g:110:1: primaryExpr : ( Integer_constant | Floating_point_constant | Identifier | '(' expression ')' );
	public final void primaryExpr() throws RecognitionException {
		try {
			// myparser.g:110:12: ( Integer_constant | Floating_point_constant | Identifier | '(' expression ')' )
			int alt13=4;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt13=1;
				}
				break;
			case Floating_point_constant:
				{
				alt13=2;
				}
				break;
			case Identifier:
				{
				alt13=3;
				}
				break;
			case 48:
				{
				alt13=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// myparser.g:111:2: Integer_constant
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr553); if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:112:7: Floating_point_constant
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr561); if (state.failed) return;
					}
					break;
				case 3 :
					// myparser.g:113:4: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_primaryExpr566); if (state.failed) return;
					}
					break;
				case 4 :
					// myparser.g:114:4: '(' expression ')'
					{
					match(input,48,FOLLOW_48_in_primaryExpr571); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_primaryExpr573);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_primaryExpr575); if (state.failed) return;
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
	// $ANTLR end "primaryExpr"



	// $ANTLR start "assignment_operator"
	// myparser.g:116:1: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
	public final void assignment_operator() throws RecognitionException {
		try {
			// myparser.g:117:2: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
			// myparser.g:
			{
			if ( input.LA(1)==44||input.LA(1)==47||input.LA(1)==51||input.LA(1)==54||input.LA(1)==58||input.LA(1)==62||input.LA(1)==67||input.LA(1)==69||input.LA(1)==74||input.LA(1)==79||input.LA(1)==82 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "assignment_operator"



	// $ANTLR start "conditional_expression"
	// myparser.g:130:1: conditional_expression : logical_or_expression ( '?' expression ':' conditional_expression )? ;
	public final void conditional_expression() throws RecognitionException {
		try {
			// myparser.g:131:2: ( logical_or_expression ( '?' expression ':' conditional_expression )? )
			// myparser.g:131:4: logical_or_expression ( '?' expression ':' conditional_expression )?
			{
			pushFollow(FOLLOW_logical_or_expression_in_conditional_expression645);
			logical_or_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:131:26: ( '?' expression ':' conditional_expression )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==75) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// myparser.g:131:27: '?' expression ':' conditional_expression
					{
					match(input,75,FOLLOW_75_in_conditional_expression648); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_conditional_expression650);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,63,FOLLOW_63_in_conditional_expression652); if (state.failed) return;
					pushFollow(FOLLOW_conditional_expression_in_conditional_expression654);
					conditional_expression();
					state._fsp--;
					if (state.failed) return;
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
	// $ANTLR end "conditional_expression"



	// $ANTLR start "logical_or_expression"
	// myparser.g:134:1: logical_or_expression : logical_and_expression ( '||' logical_and_expression )* ;
	public final void logical_or_expression() throws RecognitionException {
		try {
			// myparser.g:135:2: ( logical_and_expression ( '||' logical_and_expression )* )
			// myparser.g:135:4: logical_and_expression ( '||' logical_and_expression )*
			{
			pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression668);
			logical_and_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:135:27: ( '||' logical_and_expression )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==83) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// myparser.g:135:28: '||' logical_and_expression
					{
					match(input,83,FOLLOW_83_in_logical_or_expression671); if (state.failed) return;
					pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression673);
					logical_and_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop15;
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
	// $ANTLR end "logical_or_expression"



	// $ANTLR start "logical_and_expression"
	// myparser.g:138:1: logical_and_expression : inclusive_or_expression ( '&&' inclusive_or_expression )* ;
	public final void logical_and_expression() throws RecognitionException {
		try {
			// myparser.g:139:2: ( inclusive_or_expression ( '&&' inclusive_or_expression )* )
			// myparser.g:139:4: inclusive_or_expression ( '&&' inclusive_or_expression )*
			{
			pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression686);
			inclusive_or_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:139:28: ( '&&' inclusive_or_expression )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==45) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// myparser.g:139:29: '&&' inclusive_or_expression
					{
					match(input,45,FOLLOW_45_in_logical_and_expression689); if (state.failed) return;
					pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression691);
					inclusive_or_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop16;
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
	// $ANTLR end "logical_and_expression"



	// $ANTLR start "inclusive_or_expression"
	// myparser.g:142:1: inclusive_or_expression : exclusive_or_expression ( '|' exclusive_or_expression )* ;
	public final void inclusive_or_expression() throws RecognitionException {
		try {
			// myparser.g:143:2: ( exclusive_or_expression ( '|' exclusive_or_expression )* )
			// myparser.g:143:4: exclusive_or_expression ( '|' exclusive_or_expression )*
			{
			pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression704);
			exclusive_or_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:143:28: ( '|' exclusive_or_expression )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==81) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// myparser.g:143:29: '|' exclusive_or_expression
					{
					match(input,81,FOLLOW_81_in_inclusive_or_expression707); if (state.failed) return;
					pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression709);
					exclusive_or_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop17;
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
	// $ANTLR end "inclusive_or_expression"



	// $ANTLR start "exclusive_or_expression"
	// myparser.g:146:1: exclusive_or_expression : and_expression ( '^' and_expression )* ;
	public final void exclusive_or_expression() throws RecognitionException {
		try {
			// myparser.g:147:2: ( and_expression ( '^' and_expression )* )
			// myparser.g:147:4: and_expression ( '^' and_expression )*
			{
			pushFollow(FOLLOW_and_expression_in_exclusive_or_expression722);
			and_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:147:19: ( '^' and_expression )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==78) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// myparser.g:147:20: '^' and_expression
					{
					match(input,78,FOLLOW_78_in_exclusive_or_expression725); if (state.failed) return;
					pushFollow(FOLLOW_and_expression_in_exclusive_or_expression727);
					and_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop18;
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
	// $ANTLR end "exclusive_or_expression"



	// $ANTLR start "and_expression"
	// myparser.g:150:1: and_expression : equality_expression ( '&' equality_expression )* ;
	public final void and_expression() throws RecognitionException {
		try {
			// myparser.g:151:2: ( equality_expression ( '&' equality_expression )* )
			// myparser.g:151:4: equality_expression ( '&' equality_expression )*
			{
			pushFollow(FOLLOW_equality_expression_in_and_expression740);
			equality_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:151:24: ( '&' equality_expression )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==46) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// myparser.g:151:25: '&' equality_expression
					{
					match(input,46,FOLLOW_46_in_and_expression743); if (state.failed) return;
					pushFollow(FOLLOW_equality_expression_in_and_expression745);
					equality_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop19;
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
	// $ANTLR end "and_expression"



	// $ANTLR start "equality_expression"
	// myparser.g:153:1: equality_expression : relational_expression ( ( '==' | '!=' ) relational_expression )* ;
	public final void equality_expression() throws RecognitionException {
		try {
			// myparser.g:154:2: ( relational_expression ( ( '==' | '!=' ) relational_expression )* )
			// myparser.g:154:4: relational_expression ( ( '==' | '!=' ) relational_expression )*
			{
			pushFollow(FOLLOW_relational_expression_in_equality_expression757);
			relational_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:154:26: ( ( '==' | '!=' ) relational_expression )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==42||LA20_0==70) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// myparser.g:154:27: ( '==' | '!=' ) relational_expression
					{
					if ( input.LA(1)==42||input.LA(1)==70 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relational_expression_in_equality_expression766);
					relational_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop20;
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
	// $ANTLR end "equality_expression"



	// $ANTLR start "relational_expression"
	// myparser.g:157:1: relational_expression : shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* ;
	public final void relational_expression() throws RecognitionException {
		try {
			// myparser.g:158:2: ( shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* )
			// myparser.g:158:4: shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
			{
			pushFollow(FOLLOW_shift_expression_in_relational_expression779);
			shift_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:158:21: ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==65||LA21_0==68||(LA21_0 >= 71 && LA21_0 <= 72)) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// myparser.g:158:22: ( '<' | '>' | '<=' | '>=' ) shift_expression
					{
					if ( input.LA(1)==65||input.LA(1)==68||(input.LA(1) >= 71 && input.LA(1) <= 72) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_shift_expression_in_relational_expression792);
					shift_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop21;
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
	// $ANTLR end "relational_expression"



	// $ANTLR start "shift_expression"
	// myparser.g:161:1: shift_expression : arith_expression ( ( '<<' | '>>' ) arith_expression )* ;
	public final void shift_expression() throws RecognitionException {
		try {
			// myparser.g:162:2: ( arith_expression ( ( '<<' | '>>' ) arith_expression )* )
			// myparser.g:162:4: arith_expression ( ( '<<' | '>>' ) arith_expression )*
			{
			pushFollow(FOLLOW_arith_expression_in_shift_expression805);
			arith_expression();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:162:21: ( ( '<<' | '>>' ) arith_expression )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==66||LA22_0==73) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// myparser.g:162:22: ( '<<' | '>>' ) arith_expression
					{
					if ( input.LA(1)==66||input.LA(1)==73 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_arith_expression_in_shift_expression814);
					arith_expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
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
	// $ANTLR end "shift_expression"



	// $ANTLR start "statement"
	// myparser.g:167:1: statement : ( type Identifier ';' | ( type )* Identifier '=' arith_expression ';' | expression_statement | if_then_statement | switch_statement | labeled_statement | iteration_statement | jump_statement | printf_statement | scanf_statement );
	public final void statement() throws RecognitionException {
		try {
			// myparser.g:167:10: ( type Identifier ';' | ( type )* Identifier '=' arith_expression ';' | expression_statement | if_then_statement | switch_statement | labeled_statement | iteration_statement | jump_statement | printf_statement | scanf_statement )
			int alt24=10;
			switch ( input.LA(1) ) {
			case FLOAT:
				{
				int LA24_1 = input.LA(2);
				if ( (synpred69_myparser()) ) {
					alt24=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt24=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT:
				{
				int LA24_2 = input.LA(2);
				if ( (synpred69_myparser()) ) {
					alt24=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt24=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE:
				{
				int LA24_3 = input.LA(2);
				if ( (synpred69_myparser()) ) {
					alt24=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt24=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA24_4 = input.LA(2);
				if ( (synpred69_myparser()) ) {
					alt24=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt24=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SHORT:
				{
				int LA24_5 = input.LA(2);
				if ( (synpred69_myparser()) ) {
					alt24=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt24=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONG:
				{
				int LA24_6 = input.LA(2);
				if ( (synpred69_myparser()) ) {
					alt24=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt24=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SIGNED:
				{
				int LA24_7 = input.LA(2);
				if ( (synpred69_myparser()) ) {
					alt24=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt24=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UNSIGNED:
				{
				int LA24_8 = input.LA(2);
				if ( (synpred69_myparser()) ) {
					alt24=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt24=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
				{
				int LA24_9 = input.LA(2);
				if ( (synpred69_myparser()) ) {
					alt24=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt24=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRING:
				{
				int LA24_10 = input.LA(2);
				if ( (synpred69_myparser()) ) {
					alt24=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt24=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOID:
				{
				int LA24_11 = input.LA(2);
				if ( (synpred69_myparser()) ) {
					alt24=1;
				}
				else if ( (synpred71_myparser()) ) {
					alt24=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				int LA24_12 = input.LA(2);
				if ( (synpred71_myparser()) ) {
					alt24=2;
				}
				else if ( (synpred72_myparser()) ) {
					alt24=3;
				}
				else if ( (synpred75_myparser()) ) {
					alt24=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 64:
				{
				int LA24_13 = input.LA(2);
				if ( (synpred72_myparser()) ) {
					alt24=3;
				}
				else if ( (synpred77_myparser()) ) {
					alt24=8;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Floating_point_constant:
			case Integer_constant:
			case SIZEOF:
			case 41:
			case 46:
			case 48:
			case 50:
			case 52:
			case 53:
			case 56:
			case 57:
			case 85:
				{
				alt24=3;
				}
				break;
			case IF:
				{
				alt24=4;
				}
				break;
			case SWITCH:
				{
				alt24=5;
				}
				break;
			case CASE:
			case DEFAULT:
				{
				alt24=6;
				}
				break;
			case DO:
			case FOR:
			case WHILE:
				{
				alt24=7;
				}
				break;
			case BREAK:
			case CONTINUE:
			case RETURN:
				{
				alt24=8;
				}
				break;
			case PRINTF:
				{
				alt24=9;
				}
				break;
			case SCANF:
				{
				alt24=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// myparser.g:168:2: type Identifier ';'
					{
					pushFollow(FOLLOW_type_in_statement829);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_statement831); if (state.failed) return;
					match(input,64,FOLLOW_64_in_statement833); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("declarations: type Identifier : declarations"); }
					}
					break;
				case 2 :
					// myparser.g:170:4: ( type )* Identifier '=' arith_expression ';'
					{
					// myparser.g:170:4: ( type )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==BOOLEAN||LA23_0==CHAR||LA23_0==DOUBLE||LA23_0==FLOAT||LA23_0==INT||LA23_0==LONG||(LA23_0 >= SHORT && LA23_0 <= SIGNED)||LA23_0==STRING||(LA23_0 >= UNSIGNED && LA23_0 <= VOID)) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// myparser.g:170:4: type
							{
							pushFollow(FOLLOW_type_in_statement845);
							type();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop23;
						}
					}

					match(input,Identifier,FOLLOW_Identifier_in_statement848); if (state.failed) return;
					match(input,69,FOLLOW_69_in_statement850); if (state.failed) return;
					pushFollow(FOLLOW_arith_expression_in_statement852);
					arith_expression();
					state._fsp--;
					if (state.failed) return;
					match(input,64,FOLLOW_64_in_statement854); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statement: assignment");}
					}
					break;
				case 3 :
					// myparser.g:172:4: expression_statement
					{
					pushFollow(FOLLOW_expression_statement_in_statement864);
					expression_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// myparser.g:173:4: if_then_statement
					{
					pushFollow(FOLLOW_if_then_statement_in_statement869);
					if_then_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// myparser.g:174:4: switch_statement
					{
					pushFollow(FOLLOW_switch_statement_in_statement874);
					switch_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// myparser.g:175:4: labeled_statement
					{
					pushFollow(FOLLOW_labeled_statement_in_statement879);
					labeled_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// myparser.g:176:4: iteration_statement
					{
					pushFollow(FOLLOW_iteration_statement_in_statement884);
					iteration_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// myparser.g:177:4: jump_statement
					{
					pushFollow(FOLLOW_jump_statement_in_statement889);
					jump_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// myparser.g:178:4: printf_statement
					{
					pushFollow(FOLLOW_printf_statement_in_statement894);
					printf_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// myparser.g:179:4: scanf_statement
					{
					pushFollow(FOLLOW_scanf_statement_in_statement899);
					scanf_statement();
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



	// $ANTLR start "expression_statement"
	// myparser.g:182:1: expression_statement : ( ';' | expression ';' );
	public final void expression_statement() throws RecognitionException {
		try {
			// myparser.g:182:21: ( ';' | expression ';' )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==64) ) {
				alt25=1;
			}
			else if ( (LA25_0==Floating_point_constant||(LA25_0 >= Identifier && LA25_0 <= Integer_constant)||LA25_0==SIZEOF||LA25_0==41||LA25_0==46||LA25_0==48||LA25_0==50||(LA25_0 >= 52 && LA25_0 <= 53)||(LA25_0 >= 56 && LA25_0 <= 57)||LA25_0==85) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// myparser.g:183:2: ';'
					{
					match(input,64,FOLLOW_64_in_expression_statement910); if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:184:4: expression ';'
					{
					pushFollow(FOLLOW_expression_in_expression_statement915);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,64,FOLLOW_64_in_expression_statement917); if (state.failed) return;
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
	// $ANTLR end "expression_statement"



	// $ANTLR start "if_then_statement"
	// myparser.g:187:1: if_then_statement : IF '(' expression ')' selection_statement ;
	public final void if_then_statement() throws RecognitionException {
		try {
			// myparser.g:187:18: ( IF '(' expression ')' selection_statement )
			// myparser.g:188:2: IF '(' expression ')' selection_statement
			{
			match(input,IF,FOLLOW_IF_in_if_then_statement928); if (state.failed) return;
			match(input,48,FOLLOW_48_in_if_then_statement930); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_if_then_statement931);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,49,FOLLOW_49_in_if_then_statement932); if (state.failed) return;
			pushFollow(FOLLOW_selection_statement_in_if_then_statement934);
			selection_statement();
			state._fsp--;
			if (state.failed) return;
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
	// $ANTLR end "if_then_statement"



	// $ANTLR start "selection_statement"
	// myparser.g:191:1: selection_statement : then_statement ( else_statement )? ;
	public final void selection_statement() throws RecognitionException {
		try {
			// myparser.g:191:20: ( then_statement ( else_statement )? )
			// myparser.g:192:2: then_statement ( else_statement )?
			{
			pushFollow(FOLLOW_then_statement_in_selection_statement944);
			then_statement();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:192:17: ( else_statement )?
			int alt26=2;
			switch ( input.LA(1) ) {
				case ELSE:
					{
					int LA26_1 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case FLOAT:
					{
					int LA26_2 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case INT:
					{
					int LA26_3 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case DOUBLE:
					{
					int LA26_4 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case CHAR:
					{
					int LA26_5 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case SHORT:
					{
					int LA26_6 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case LONG:
					{
					int LA26_7 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case SIGNED:
					{
					int LA26_8 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case UNSIGNED:
					{
					int LA26_9 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case BOOLEAN:
					{
					int LA26_10 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case STRING:
					{
					int LA26_11 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case VOID:
					{
					int LA26_12 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case Identifier:
					{
					int LA26_13 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case 64:
					{
					int LA26_14 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case Integer_constant:
					{
					int LA26_15 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case Floating_point_constant:
					{
					int LA26_16 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case 48:
					{
					int LA26_17 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case 53:
					{
					int LA26_18 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case 57:
					{
					int LA26_19 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case 41:
				case 46:
				case 50:
				case 52:
				case 56:
				case 85:
					{
					int LA26_20 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case SIZEOF:
					{
					int LA26_21 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case IF:
					{
					int LA26_22 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case SWITCH:
					{
					int LA26_23 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case CASE:
					{
					int LA26_24 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case DEFAULT:
					{
					int LA26_25 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case WHILE:
					{
					int LA26_26 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case DO:
					{
					int LA26_27 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case FOR:
					{
					int LA26_28 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case CONTINUE:
					{
					int LA26_29 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case BREAK:
					{
					int LA26_30 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case RETURN:
					{
					int LA26_31 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case PRINTF:
					{
					int LA26_32 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case SCANF:
					{
					int LA26_33 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case 84:
					{
					int LA26_34 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
				case EOF:
					{
					int LA26_35 = input.LA(2);
					if ( (synpred80_myparser()) ) {
						alt26=1;
					}
					}
					break;
			}
			switch (alt26) {
				case 1 :
					// myparser.g:192:18: else_statement
					{
					pushFollow(FOLLOW_else_statement_in_selection_statement947);
					else_statement();
					state._fsp--;
					if (state.failed) return;
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
	// $ANTLR end "selection_statement"



	// $ANTLR start "else_statement"
	// myparser.g:195:1: else_statement : ( ELSE iteration_then_statement | ELSE if_then_statement |);
	public final void else_statement() throws RecognitionException {
		try {
			// myparser.g:195:15: ( ELSE iteration_then_statement | ELSE if_then_statement |)
			int alt27=3;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==ELSE) ) {
				int LA27_1 = input.LA(2);
				if ( (synpred81_myparser()) ) {
					alt27=1;
				}
				else if ( (synpred82_myparser()) ) {
					alt27=2;
				}
				else if ( (true) ) {
					alt27=3;
				}

			}
			else if ( (LA27_0==EOF||(LA27_0 >= BOOLEAN && LA27_0 <= CHAR)||(LA27_0 >= CONTINUE && LA27_0 <= DOUBLE)||(LA27_0 >= FLOAT && LA27_0 <= Integer_constant)||LA27_0==LONG||LA27_0==PRINTF||(LA27_0 >= RETURN && LA27_0 <= SIZEOF)||LA27_0==STRING||(LA27_0 >= SWITCH && LA27_0 <= WHILE)||LA27_0==41||LA27_0==46||LA27_0==48||LA27_0==50||(LA27_0 >= 52 && LA27_0 <= 53)||(LA27_0 >= 56 && LA27_0 <= 57)||LA27_0==64||(LA27_0 >= 84 && LA27_0 <= 85)) ) {
				alt27=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// myparser.g:196:2: ELSE iteration_then_statement
					{
					match(input,ELSE,FOLLOW_ELSE_in_else_statement959); if (state.failed) return;
					pushFollow(FOLLOW_iteration_then_statement_in_else_statement961);
					iteration_then_statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statement: if_then_else_statements");}
					}
					break;
				case 2 :
					// myparser.g:198:4: ELSE if_then_statement
					{
					match(input,ELSE,FOLLOW_ELSE_in_else_statement970); if (state.failed) return;
					pushFollow(FOLLOW_if_then_statement_in_else_statement972);
					if_then_statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statement: if_then_else_statements");}
					}
					break;
				case 3 :
					// myparser.g:201:2: 
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
	// $ANTLR end "else_statement"



	// $ANTLR start "then_statement"
	// myparser.g:203:1: then_statement : ( statement | '{' statements '}' );
	public final void then_statement() throws RecognitionException {
		try {
			// myparser.g:203:15: ( statement | '{' statements '}' )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( ((LA28_0 >= BOOLEAN && LA28_0 <= CHAR)||(LA28_0 >= CONTINUE && LA28_0 <= DOUBLE)||(LA28_0 >= FLOAT && LA28_0 <= Integer_constant)||LA28_0==LONG||LA28_0==PRINTF||(LA28_0 >= RETURN && LA28_0 <= SIZEOF)||LA28_0==STRING||(LA28_0 >= SWITCH && LA28_0 <= WHILE)||LA28_0==41||LA28_0==46||LA28_0==48||LA28_0==50||(LA28_0 >= 52 && LA28_0 <= 53)||(LA28_0 >= 56 && LA28_0 <= 57)||LA28_0==64||LA28_0==85) ) {
				alt28=1;
			}
			else if ( (LA28_0==80) ) {
				alt28=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// myparser.g:204:2: statement
					{
					pushFollow(FOLLOW_statement_in_then_statement990);
					statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statement: if_then_statements");}
					}
					break;
				case 2 :
					// myparser.g:206:4: '{' statements '}'
					{
					match(input,80,FOLLOW_80_in_then_statement1000); if (state.failed) return;
					pushFollow(FOLLOW_statements_in_then_statement1001);
					statements();
					state._fsp--;
					if (state.failed) return;
					match(input,84,FOLLOW_84_in_then_statement1002); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statement: if_then_statements");}
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
	// $ANTLR end "then_statement"



	// $ANTLR start "switch_statement"
	// myparser.g:210:1: switch_statement : SWITCH '(' expression ')' iteration_then_statement ;
	public final void switch_statement() throws RecognitionException {
		try {
			// myparser.g:210:17: ( SWITCH '(' expression ')' iteration_then_statement )
			// myparser.g:211:2: SWITCH '(' expression ')' iteration_then_statement
			{
			match(input,SWITCH,FOLLOW_SWITCH_in_switch_statement1017); if (state.failed) return;
			match(input,48,FOLLOW_48_in_switch_statement1019); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_switch_statement1021);
			expression();
			state._fsp--;
			if (state.failed) return;
			match(input,49,FOLLOW_49_in_switch_statement1023); if (state.failed) return;
			pushFollow(FOLLOW_iteration_then_statement_in_switch_statement1025);
			iteration_then_statement();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("statement: switch");}
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
	// $ANTLR end "switch_statement"



	// $ANTLR start "labeled_statement"
	// myparser.g:215:1: labeled_statement : ( Identifier ':' statement | CASE conditional_expression ':' statement | DEFAULT ':' statement );
	public final void labeled_statement() throws RecognitionException {
		try {
			// myparser.g:215:18: ( Identifier ':' statement | CASE conditional_expression ':' statement | DEFAULT ':' statement )
			int alt29=3;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt29=1;
				}
				break;
			case CASE:
				{
				alt29=2;
				}
				break;
			case DEFAULT:
				{
				alt29=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// myparser.g:216:2: Identifier ':' statement
					{
					match(input,Identifier,FOLLOW_Identifier_in_labeled_statement1041); if (state.failed) return;
					match(input,63,FOLLOW_63_in_labeled_statement1043); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_labeled_statement1045);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:217:4: CASE conditional_expression ':' statement
					{
					match(input,CASE,FOLLOW_CASE_in_labeled_statement1050); if (state.failed) return;
					pushFollow(FOLLOW_conditional_expression_in_labeled_statement1052);
					conditional_expression();
					state._fsp--;
					if (state.failed) return;
					match(input,63,FOLLOW_63_in_labeled_statement1054); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_labeled_statement1056);
					statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("labeled: case");}
					}
					break;
				case 3 :
					// myparser.g:219:4: DEFAULT ':' statement
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_labeled_statement1065); if (state.failed) return;
					match(input,63,FOLLOW_63_in_labeled_statement1067); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_labeled_statement1069);
					statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("labeled: default");}
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
	// $ANTLR end "labeled_statement"



	// $ANTLR start "iteration_statement"
	// myparser.g:223:1: iteration_statement : ( WHILE '(' expression ')' iteration_then_statement | DO iteration_then_statement WHILE '(' expression ')' ';' | FOR '(' expression_statement expression_statement ( expression )? ')' iteration_then_statement );
	public final void iteration_statement() throws RecognitionException {
		try {
			// myparser.g:223:20: ( WHILE '(' expression ')' iteration_then_statement | DO iteration_then_statement WHILE '(' expression ')' ';' | FOR '(' expression_statement expression_statement ( expression )? ')' iteration_then_statement )
			int alt31=3;
			switch ( input.LA(1) ) {
			case WHILE:
				{
				alt31=1;
				}
				break;
			case DO:
				{
				alt31=2;
				}
				break;
			case FOR:
				{
				alt31=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// myparser.g:224:2: WHILE '(' expression ')' iteration_then_statement
					{
					match(input,WHILE,FOLLOW_WHILE_in_iteration_statement1084); if (state.failed) return;
					match(input,48,FOLLOW_48_in_iteration_statement1086); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_iteration_statement1088);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_iteration_statement1090); if (state.failed) return;
					pushFollow(FOLLOW_iteration_then_statement_in_iteration_statement1092);
					iteration_then_statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("iteration_statement: while");}
					}
					break;
				case 2 :
					// myparser.g:226:4: DO iteration_then_statement WHILE '(' expression ')' ';'
					{
					match(input,DO,FOLLOW_DO_in_iteration_statement1101); if (state.failed) return;
					pushFollow(FOLLOW_iteration_then_statement_in_iteration_statement1103);
					iteration_then_statement();
					state._fsp--;
					if (state.failed) return;
					match(input,WHILE,FOLLOW_WHILE_in_iteration_statement1105); if (state.failed) return;
					match(input,48,FOLLOW_48_in_iteration_statement1107); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_iteration_statement1109);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,49,FOLLOW_49_in_iteration_statement1111); if (state.failed) return;
					match(input,64,FOLLOW_64_in_iteration_statement1113); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("iteration_statement: do_while");}
					}
					break;
				case 3 :
					// myparser.g:228:4: FOR '(' expression_statement expression_statement ( expression )? ')' iteration_then_statement
					{
					match(input,FOR,FOLLOW_FOR_in_iteration_statement1122); if (state.failed) return;
					match(input,48,FOLLOW_48_in_iteration_statement1124); if (state.failed) return;
					pushFollow(FOLLOW_expression_statement_in_iteration_statement1126);
					expression_statement();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expression_statement_in_iteration_statement1128);
					expression_statement();
					state._fsp--;
					if (state.failed) return;
					// myparser.g:228:54: ( expression )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==Floating_point_constant||(LA30_0 >= Identifier && LA30_0 <= Integer_constant)||LA30_0==SIZEOF||LA30_0==41||LA30_0==46||LA30_0==48||LA30_0==50||(LA30_0 >= 52 && LA30_0 <= 53)||(LA30_0 >= 56 && LA30_0 <= 57)||LA30_0==85) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// myparser.g:228:54: expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement1130);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,49,FOLLOW_49_in_iteration_statement1133); if (state.failed) return;
					pushFollow(FOLLOW_iteration_then_statement_in_iteration_statement1135);
					iteration_then_statement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("iteration_statement: for");}
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
	// $ANTLR end "iteration_statement"



	// $ANTLR start "iteration_then_statement"
	// myparser.g:232:1: iteration_then_statement : ( statement | '{' statements '}' );
	public final void iteration_then_statement() throws RecognitionException {
		try {
			// myparser.g:232:25: ( statement | '{' statements '}' )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( ((LA32_0 >= BOOLEAN && LA32_0 <= CHAR)||(LA32_0 >= CONTINUE && LA32_0 <= DOUBLE)||(LA32_0 >= FLOAT && LA32_0 <= Integer_constant)||LA32_0==LONG||LA32_0==PRINTF||(LA32_0 >= RETURN && LA32_0 <= SIZEOF)||LA32_0==STRING||(LA32_0 >= SWITCH && LA32_0 <= WHILE)||LA32_0==41||LA32_0==46||LA32_0==48||LA32_0==50||(LA32_0 >= 52 && LA32_0 <= 53)||(LA32_0 >= 56 && LA32_0 <= 57)||LA32_0==64||LA32_0==85) ) {
				alt32=1;
			}
			else if ( (LA32_0==80) ) {
				alt32=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// myparser.g:233:2: statement
					{
					pushFollow(FOLLOW_statement_in_iteration_then_statement1149);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:234:4: '{' statements '}'
					{
					match(input,80,FOLLOW_80_in_iteration_then_statement1154); if (state.failed) return;
					pushFollow(FOLLOW_statements_in_iteration_then_statement1155);
					statements();
					state._fsp--;
					if (state.failed) return;
					match(input,84,FOLLOW_84_in_iteration_then_statement1156); if (state.failed) return;
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
	// $ANTLR end "iteration_then_statement"



	// $ANTLR start "jump_statement"
	// myparser.g:237:1: jump_statement : ( ';' | CONTINUE ';' | BREAK ';' | RETURN ';' | RETURN expression ';' );
	public final void jump_statement() throws RecognitionException {
		try {
			// myparser.g:237:15: ( ';' | CONTINUE ';' | BREAK ';' | RETURN ';' | RETURN expression ';' )
			int alt33=5;
			switch ( input.LA(1) ) {
			case 64:
				{
				alt33=1;
				}
				break;
			case CONTINUE:
				{
				alt33=2;
				}
				break;
			case BREAK:
				{
				alt33=3;
				}
				break;
			case RETURN:
				{
				int LA33_4 = input.LA(2);
				if ( (LA33_4==64) ) {
					alt33=4;
				}
				else if ( (LA33_4==Floating_point_constant||(LA33_4 >= Identifier && LA33_4 <= Integer_constant)||LA33_4==SIZEOF||LA33_4==41||LA33_4==46||LA33_4==48||LA33_4==50||(LA33_4 >= 52 && LA33_4 <= 53)||(LA33_4 >= 56 && LA33_4 <= 57)||LA33_4==85) ) {
					alt33=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 4, input);
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
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// myparser.g:238:2: ';'
					{
					match(input,64,FOLLOW_64_in_jump_statement1167); if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:239:4: CONTINUE ';'
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement1172); if (state.failed) return;
					match(input,64,FOLLOW_64_in_jump_statement1174); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("jump_statement: continue");}
					}
					break;
				case 3 :
					// myparser.g:241:4: BREAK ';'
					{
					match(input,BREAK,FOLLOW_BREAK_in_jump_statement1184); if (state.failed) return;
					match(input,64,FOLLOW_64_in_jump_statement1186); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("jump_statement: break");}
					}
					break;
				case 4 :
					// myparser.g:243:4: RETURN ';'
					{
					match(input,RETURN,FOLLOW_RETURN_in_jump_statement1196); if (state.failed) return;
					match(input,64,FOLLOW_64_in_jump_statement1198); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("jump_statement: return;");}
					}
					break;
				case 5 :
					// myparser.g:245:4: RETURN expression ';'
					{
					match(input,RETURN,FOLLOW_RETURN_in_jump_statement1208); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_jump_statement1210);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,64,FOLLOW_64_in_jump_statement1212); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("jump_statement: return expression;");}
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
	// $ANTLR end "jump_statement"



	// $ANTLR start "printf_statement"
	// myparser.g:250:1: printf_statement : PRINTF '(' printf_parameters ')' ';' ;
	public final void printf_statement() throws RecognitionException {
		try {
			// myparser.g:250:17: ( PRINTF '(' printf_parameters ')' ';' )
			// myparser.g:251:2: PRINTF '(' printf_parameters ')' ';'
			{
			match(input,PRINTF,FOLLOW_PRINTF_in_printf_statement1227); if (state.failed) return;
			match(input,48,FOLLOW_48_in_printf_statement1229); if (state.failed) return;
			pushFollow(FOLLOW_printf_parameters_in_printf_statement1230);
			printf_parameters();
			state._fsp--;
			if (state.failed) return;
			match(input,49,FOLLOW_49_in_printf_statement1231); if (state.failed) return;
			match(input,64,FOLLOW_64_in_printf_statement1232); if (state.failed) return;
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
	// $ANTLR end "printf_statement"



	// $ANTLR start "printf_parameters"
	// myparser.g:253:1: printf_parameters : ( STRINGS ( printf_func )* |);
	public final void printf_parameters() throws RecognitionException {
		try {
			// myparser.g:253:18: ( STRINGS ( printf_func )* |)
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==STRINGS) ) {
				alt35=1;
			}
			else if ( (LA35_0==49) ) {
				alt35=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// myparser.g:254:2: STRINGS ( printf_func )*
					{
					match(input,STRINGS,FOLLOW_STRINGS_in_printf_parameters1242); if (state.failed) return;
					// myparser.g:254:10: ( printf_func )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==55) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// myparser.g:254:10: printf_func
							{
							pushFollow(FOLLOW_printf_func_in_printf_parameters1244);
							printf_func();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop34;
						}
					}

					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("PRINTF: strings");}
					}
					break;
				case 2 :
					// myparser.g:257:2: 
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
	// $ANTLR end "printf_parameters"



	// $ANTLR start "printf_func"
	// myparser.g:258:1: printf_func : ',' '&' primaryExpr ;
	public final void printf_func() throws RecognitionException {
		try {
			// myparser.g:258:12: ( ',' '&' primaryExpr )
			// myparser.g:259:2: ',' '&' primaryExpr
			{
			match(input,55,FOLLOW_55_in_printf_func1261); if (state.failed) return;
			match(input,46,FOLLOW_46_in_printf_func1262); if (state.failed) return;
			pushFollow(FOLLOW_primaryExpr_in_printf_func1263);
			primaryExpr();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("PRINTF: parameters");}
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
	// $ANTLR end "printf_func"



	// $ANTLR start "scanf_statement"
	// myparser.g:263:1: scanf_statement : SCANF '(' scanf_parameters ')' ';' ;
	public final void scanf_statement() throws RecognitionException {
		try {
			// myparser.g:263:16: ( SCANF '(' scanf_parameters ')' ';' )
			// myparser.g:264:2: SCANF '(' scanf_parameters ')' ';'
			{
			match(input,SCANF,FOLLOW_SCANF_in_scanf_statement1278); if (state.failed) return;
			match(input,48,FOLLOW_48_in_scanf_statement1279); if (state.failed) return;
			pushFollow(FOLLOW_scanf_parameters_in_scanf_statement1280);
			scanf_parameters();
			state._fsp--;
			if (state.failed) return;
			match(input,49,FOLLOW_49_in_scanf_statement1281); if (state.failed) return;
			match(input,64,FOLLOW_64_in_scanf_statement1282); if (state.failed) return;
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
	// $ANTLR end "scanf_statement"



	// $ANTLR start "scanf_parameters"
	// myparser.g:267:1: scanf_parameters : ( STRINGS ( scanf_func )* |);
	public final void scanf_parameters() throws RecognitionException {
		try {
			// myparser.g:267:17: ( STRINGS ( scanf_func )* |)
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==STRINGS) ) {
				alt37=1;
			}
			else if ( (LA37_0==49) ) {
				alt37=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// myparser.g:268:2: STRINGS ( scanf_func )*
					{
					match(input,STRINGS,FOLLOW_STRINGS_in_scanf_parameters1293); if (state.failed) return;
					// myparser.g:268:10: ( scanf_func )*
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==55) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// myparser.g:268:10: scanf_func
							{
							pushFollow(FOLLOW_scanf_func_in_scanf_parameters1295);
							scanf_func();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop36;
						}
					}

					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("SCANF: strings");}
					}
					break;
				case 2 :
					// myparser.g:271:2: 
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
	// $ANTLR end "scanf_parameters"



	// $ANTLR start "scanf_func"
	// myparser.g:273:1: scanf_func : ',' expression ;
	public final void scanf_func() throws RecognitionException {
		try {
			// myparser.g:273:11: ( ',' expression )
			// myparser.g:274:2: ',' expression
			{
			match(input,55,FOLLOW_55_in_scanf_func1313); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_scanf_func1314);
			expression();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("SCANF: parameters");}
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
	// $ANTLR end "scanf_func"

	// $ANTLR start synpred23_myparser
	public final void synpred23_myparser_fragment() throws RecognitionException {
		// myparser.g:68:27: ( ',' assignment_expression )
		// myparser.g:68:27: ',' assignment_expression
		{
		match(input,55,FOLLOW_55_in_synpred23_myparser345); if (state.failed) return;
		pushFollow(FOLLOW_assignment_expression_in_synpred23_myparser347);
		assignment_expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred23_myparser

	// $ANTLR start synpred24_myparser
	public final void synpred24_myparser_fragment() throws RecognitionException {
		// myparser.g:72:4: ( lvalue ( options {backtrack=true; } : assignment_expression ) )
		// myparser.g:72:4: lvalue ( options {backtrack=true; } : assignment_expression )
		{
		pushFollow(FOLLOW_lvalue_in_synpred24_myparser360);
		lvalue();
		state._fsp--;
		if (state.failed) return;
		// myparser.g:72:11: ( options {backtrack=true; } : assignment_expression )
		// myparser.g:72:38: assignment_expression
		{
		pushFollow(FOLLOW_assignment_expression_in_synpred24_myparser371);
		assignment_expression();
		state._fsp--;
		if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred24_myparser

	// $ANTLR start synpred69_myparser
	public final void synpred69_myparser_fragment() throws RecognitionException {
		// myparser.g:168:2: ( type Identifier ';' )
		// myparser.g:168:2: type Identifier ';'
		{
		pushFollow(FOLLOW_type_in_synpred69_myparser829);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,Identifier,FOLLOW_Identifier_in_synpred69_myparser831); if (state.failed) return;
		match(input,64,FOLLOW_64_in_synpred69_myparser833); if (state.failed) return;
		}

	}
	// $ANTLR end synpred69_myparser

	// $ANTLR start synpred71_myparser
	public final void synpred71_myparser_fragment() throws RecognitionException {
		// myparser.g:170:4: ( ( type )* Identifier '=' arith_expression ';' )
		// myparser.g:170:4: ( type )* Identifier '=' arith_expression ';'
		{
		// myparser.g:170:4: ( type )*
		loop38:
		while (true) {
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==BOOLEAN||LA38_0==CHAR||LA38_0==DOUBLE||LA38_0==FLOAT||LA38_0==INT||LA38_0==LONG||(LA38_0 >= SHORT && LA38_0 <= SIGNED)||LA38_0==STRING||(LA38_0 >= UNSIGNED && LA38_0 <= VOID)) ) {
				alt38=1;
			}

			switch (alt38) {
			case 1 :
				// myparser.g:170:4: type
				{
				pushFollow(FOLLOW_type_in_synpred71_myparser845);
				type();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop38;
			}
		}

		match(input,Identifier,FOLLOW_Identifier_in_synpred71_myparser848); if (state.failed) return;
		match(input,69,FOLLOW_69_in_synpred71_myparser850); if (state.failed) return;
		pushFollow(FOLLOW_arith_expression_in_synpred71_myparser852);
		arith_expression();
		state._fsp--;
		if (state.failed) return;
		match(input,64,FOLLOW_64_in_synpred71_myparser854); if (state.failed) return;
		}

	}
	// $ANTLR end synpred71_myparser

	// $ANTLR start synpred72_myparser
	public final void synpred72_myparser_fragment() throws RecognitionException {
		// myparser.g:172:4: ( expression_statement )
		// myparser.g:172:4: expression_statement
		{
		pushFollow(FOLLOW_expression_statement_in_synpred72_myparser864);
		expression_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred72_myparser

	// $ANTLR start synpred75_myparser
	public final void synpred75_myparser_fragment() throws RecognitionException {
		// myparser.g:175:4: ( labeled_statement )
		// myparser.g:175:4: labeled_statement
		{
		pushFollow(FOLLOW_labeled_statement_in_synpred75_myparser879);
		labeled_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred75_myparser

	// $ANTLR start synpred77_myparser
	public final void synpred77_myparser_fragment() throws RecognitionException {
		// myparser.g:177:4: ( jump_statement )
		// myparser.g:177:4: jump_statement
		{
		pushFollow(FOLLOW_jump_statement_in_synpred77_myparser889);
		jump_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred77_myparser

	// $ANTLR start synpred80_myparser
	public final void synpred80_myparser_fragment() throws RecognitionException {
		// myparser.g:192:18: ( else_statement )
		// myparser.g:192:18: else_statement
		{
		pushFollow(FOLLOW_else_statement_in_synpred80_myparser947);
		else_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred80_myparser

	// $ANTLR start synpred81_myparser
	public final void synpred81_myparser_fragment() throws RecognitionException {
		// myparser.g:196:2: ( ELSE iteration_then_statement )
		// myparser.g:196:2: ELSE iteration_then_statement
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred81_myparser959); if (state.failed) return;
		pushFollow(FOLLOW_iteration_then_statement_in_synpred81_myparser961);
		iteration_then_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred81_myparser

	// $ANTLR start synpred82_myparser
	public final void synpred82_myparser_fragment() throws RecognitionException {
		// myparser.g:198:4: ( ELSE if_then_statement )
		// myparser.g:198:4: ELSE if_then_statement
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred82_myparser970); if (state.failed) return;
		pushFollow(FOLLOW_if_then_statement_in_synpred82_myparser972);
		if_then_statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred82_myparser

	// Delegated rules

	public final boolean synpred75_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred75_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred72_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred72_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred77_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred77_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred81_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred81_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred69_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred69_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred71_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred82_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred82_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred80_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred80_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_VOID_in_program45 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_MAIN_in_program47 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_program49 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_program51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_program53 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000300001L});
	public static final BitSet FOLLOW_statements_in_program55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_program57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_program75 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_MAIN_in_program77 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_program79 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_program81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_program83 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000300001L});
	public static final BitSet FOLLOW_statements_in_program85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_program87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_type121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_in_type135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_type142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIGNED_in_type149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNSIGNED_in_type156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_type170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_type177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTERN_in_storage_class_specifier191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_storage_class_specifier198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTO_in_storage_class_specifier205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTER_in_storage_class_specifier212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements224 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000200001L});
	public static final BitSet FOLLOW_statements_in_statements226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list243 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_argument_expression_list246 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list248 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression261 = new BitSet(new long[]{0x0110000000000002L});
	public static final BitSet FOLLOW_52_in_arith_expression264 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression266 = new BitSet(new long[]{0x0110000000000002L});
	public static final BitSet FOLLOW_56_in_arith_expression270 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression272 = new BitSet(new long[]{0x0110000000000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr285 = new BitSet(new long[]{0x2004080000000002L});
	public static final BitSet FOLLOW_50_in_multExpr288 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr290 = new BitSet(new long[]{0x2004080000000002L});
	public static final BitSet FOLLOW_61_in_multExpr294 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr296 = new BitSet(new long[]{0x2004080000000002L});
	public static final BitSet FOLLOW_43_in_multExpr300 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr302 = new BitSet(new long[]{0x2004080000000002L});
	public static final BitSet FOLLOW_48_in_signExpr316 = new BitSet(new long[]{0x00000064C1112120L});
	public static final BitSet FOLLOW_type_in_signExpr317 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_signExpr318 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_signExpr_in_signExpr320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_signExpr328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_expression342 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_expression345 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_assignment_expression_in_expression347 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_lvalue_in_assignment_expression360 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_assignment_expression_in_assignment_expression371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_expression_in_assignment_expression377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_lvalue392 = new BitSet(new long[]{0x4448900000000000L,0x0000000000048428L});
	public static final BitSet FOLLOW_assignment_operator_in_lvalue394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_unary_expression410 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_unary_expression417 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_operator_in_unary_expression424 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_signExpr_in_unary_expression426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_unary_expression431 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_unary_expression438 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_unary_expression440 = new BitSet(new long[]{0x00000064C1112120L});
	public static final BitSet FOLLOW_type_in_unary_expression442 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_unary_expression444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpr_in_postfix_expression458 = new BitSet(new long[]{0x1A21000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_postfix_expression460 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_arith_expression_in_postfix_expression461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_postfix_expression462 = new BitSet(new long[]{0x1A21000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_48_in_postfix_expression467 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_postfix_expression469 = new BitSet(new long[]{0x1A21000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_48_in_postfix_expression474 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression476 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_postfix_expression478 = new BitSet(new long[]{0x1A21000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_60_in_postfix_expression483 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_Identifier_in_postfix_expression484 = new BitSet(new long[]{0x1A21000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_59_in_postfix_expression489 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_Identifier_in_postfix_expression491 = new BitSet(new long[]{0x1A21000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_53_in_postfix_expression496 = new BitSet(new long[]{0x1A21000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_57_in_postfix_expression501 = new BitSet(new long[]{0x1A21000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_primaryExpr571 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_expression_in_primaryExpr573 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_primaryExpr575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_conditional_expression648 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_expression_in_conditional_expression650 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_conditional_expression652 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_conditional_expression_in_conditional_expression654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_logical_or_expression671 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression673 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression686 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_logical_and_expression689 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression691 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression704 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_inclusive_or_expression707 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression722 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_exclusive_or_expression725 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression727 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression740 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_and_expression743 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression745 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression757 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_set_in_equality_expression760 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression766 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression779 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000192L});
	public static final BitSet FOLLOW_set_in_relational_expression782 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression792 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000192L});
	public static final BitSet FOLLOW_arith_expression_in_shift_expression805 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000204L});
	public static final BitSet FOLLOW_set_in_shift_expression808 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_arith_expression_in_shift_expression814 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000204L});
	public static final BitSet FOLLOW_type_in_statement829 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_Identifier_in_statement831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_statement833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_statement845 = new BitSet(new long[]{0x00000064C1312120L});
	public static final BitSet FOLLOW_Identifier_in_statement848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_statement850 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_arith_expression_in_statement852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_statement854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_statement_in_statement864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_then_statement_in_statement869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switch_statement_in_statement874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_labeled_statement_in_statement879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteration_statement_in_statement884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jump_statement_in_statement889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printf_statement_in_statement894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scanf_statement_in_statement899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_expression_statement910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expression_statement915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_expression_statement917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_then_statement928 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_if_then_statement930 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_expression_in_if_then_statement931 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_if_then_statement932 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000210001L});
	public static final BitSet FOLLOW_selection_statement_in_if_then_statement934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_then_statement_in_selection_statement944 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_else_statement_in_selection_statement947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_statement959 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000210001L});
	public static final BitSet FOLLOW_iteration_then_statement_in_else_statement961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_statement970 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_if_then_statement_in_else_statement972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_then_statement990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_then_statement1000 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000300001L});
	public static final BitSet FOLLOW_statements_in_then_statement1001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_then_statement1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_switch_statement1017 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_switch_statement1019 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_expression_in_switch_statement1021 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_switch_statement1023 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000210001L});
	public static final BitSet FOLLOW_iteration_then_statement_in_switch_statement1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_labeled_statement1041 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_labeled_statement1043 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000200001L});
	public static final BitSet FOLLOW_statement_in_labeled_statement1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_labeled_statement1050 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_conditional_expression_in_labeled_statement1052 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_labeled_statement1054 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000200001L});
	public static final BitSet FOLLOW_statement_in_labeled_statement1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_labeled_statement1065 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_labeled_statement1067 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000200001L});
	public static final BitSet FOLLOW_statement_in_labeled_statement1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_iteration_statement1084 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_iteration_statement1086 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1088 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_iteration_statement1090 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000210001L});
	public static final BitSet FOLLOW_iteration_then_statement_in_iteration_statement1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_iteration_statement1101 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000210001L});
	public static final BitSet FOLLOW_iteration_then_statement_in_iteration_statement1103 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_WHILE_in_iteration_statement1105 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_iteration_statement1107 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1109 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_iteration_statement1111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_iteration_statement1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_iteration_statement1122 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_iteration_statement1124 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200001L});
	public static final BitSet FOLLOW_expression_statement_in_iteration_statement1126 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200001L});
	public static final BitSet FOLLOW_expression_statement_in_iteration_statement1128 = new BitSet(new long[]{0x0337420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1130 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_iteration_statement1133 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000210001L});
	public static final BitSet FOLLOW_iteration_then_statement_in_iteration_statement1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_iteration_then_statement1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_iteration_then_statement1154 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000300001L});
	public static final BitSet FOLLOW_statements_in_iteration_then_statement1155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_iteration_then_statement1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_jump_statement1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_jump_statement1172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_jump_statement1174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_jump_statement1184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_jump_statement1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_jump_statement1196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_jump_statement1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_jump_statement1208 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_expression_in_jump_statement1210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_jump_statement1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_printf_statement1227 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_printf_statement1229 = new BitSet(new long[]{0x0002000800000000L});
	public static final BitSet FOLLOW_printf_parameters_in_printf_statement1230 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_printf_statement1231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_printf_statement1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGS_in_printf_parameters1242 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_printf_func_in_printf_parameters1244 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_printf_func1261 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_printf_func1262 = new BitSet(new long[]{0x0001000000640000L});
	public static final BitSet FOLLOW_primaryExpr_in_printf_func1263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCANF_in_scanf_statement1278 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_scanf_statement1279 = new BitSet(new long[]{0x0002000800000000L});
	public static final BitSet FOLLOW_scanf_parameters_in_scanf_statement1280 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_scanf_statement1281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_scanf_statement1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGS_in_scanf_parameters1293 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_scanf_func_in_scanf_parameters1295 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_scanf_func1313 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_expression_in_scanf_func1314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_synpred23_myparser345 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_assignment_expression_in_synpred23_myparser347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_synpred24_myparser360 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_assignment_expression_in_synpred24_myparser371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred69_myparser829 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_Identifier_in_synpred69_myparser831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_synpred69_myparser833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred71_myparser845 = new BitSet(new long[]{0x00000064C1312120L});
	public static final BitSet FOLLOW_Identifier_in_synpred71_myparser848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_synpred71_myparser850 = new BitSet(new long[]{0x0335420100640000L,0x0000000000200000L});
	public static final BitSet FOLLOW_arith_expression_in_synpred71_myparser852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_synpred71_myparser854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_statement_in_synpred72_myparser864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_labeled_statement_in_synpred75_myparser879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jump_statement_in_synpred77_myparser889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_else_statement_in_synpred80_myparser947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred81_myparser959 = new BitSet(new long[]{0x033542F5F57F3DE0L,0x0000000000210001L});
	public static final BitSet FOLLOW_iteration_then_statement_in_synpred81_myparser961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred82_myparser970 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_if_then_statement_in_synpred82_myparser972 = new BitSet(new long[]{0x0000000000000002L});
}
