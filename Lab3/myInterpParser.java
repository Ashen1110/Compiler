// $ANTLR 3.5.2 myInterp.g 2022-05-24 12:33:15

    import java.util.Scanner;
    import java.util.HashMap;
    import java.util.Set;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myInterpParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUTO", "AssignmentOP", "BOOLEAN", 
		"BREAK", "CASE", "CHAR", "COMMENT", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
		"ELSE", "EXTERN", "FLOAT", "FOR", "Floating_point_constant", "IF", "INT", 
		"Identifier", "Integer_constant", "LINE_COMMAND", "LONG", "MAIN", "PRINTF", 
		"REGISTER", "RETURN", "RelationOP", "SCANF", "SHORT", "SIGNED", "SIZEOF", 
		"STATIC", "STRING", "STRINGS", "SWITCH", "UNSIGNED", "VOID", "WHILE", 
		"WS", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", "'\\%'", 
		"'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int AUTO=4;
	public static final int AssignmentOP=5;
	public static final int BOOLEAN=6;
	public static final int BREAK=7;
	public static final int CASE=8;
	public static final int CHAR=9;
	public static final int COMMENT=10;
	public static final int CONTINUE=11;
	public static final int DEFAULT=12;
	public static final int DO=13;
	public static final int DOUBLE=14;
	public static final int ELSE=15;
	public static final int EXTERN=16;
	public static final int FLOAT=17;
	public static final int FOR=18;
	public static final int Floating_point_constant=19;
	public static final int IF=20;
	public static final int INT=21;
	public static final int Identifier=22;
	public static final int Integer_constant=23;
	public static final int LINE_COMMAND=24;
	public static final int LONG=25;
	public static final int MAIN=26;
	public static final int PRINTF=27;
	public static final int REGISTER=28;
	public static final int RETURN=29;
	public static final int RelationOP=30;
	public static final int SCANF=31;
	public static final int SHORT=32;
	public static final int SIGNED=33;
	public static final int SIZEOF=34;
	public static final int STATIC=35;
	public static final int STRING=36;
	public static final int STRINGS=37;
	public static final int SWITCH=38;
	public static final int UNSIGNED=39;
	public static final int VOID=40;
	public static final int WHILE=41;
	public static final int WS=42;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myInterpParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myInterpParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myInterpParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myInterp.g"; }


	    boolean TRACEON = true;
	    HashMap memory = new HashMap();



	// $ANTLR start "program"
	// myInterp.g:19:1: program : ( VOID MAIN '(' ')' '{' statements[1] '}' | INT MAIN '(' ')' '{' statements[1] '}' );
	public final void program() throws RecognitionException {
		try {
			// myInterp.g:19:8: ( VOID MAIN '(' ')' '{' statements[1] '}' | INT MAIN '(' ')' '{' statements[1] '}' )
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
					// myInterp.g:20:2: VOID MAIN '(' ')' '{' statements[1] '}'
					{
					match(input,VOID,FOLLOW_VOID_in_program45); if (state.failed) return;
					match(input,MAIN,FOLLOW_MAIN_in_program47); if (state.failed) return;
					match(input,44,FOLLOW_44_in_program49); if (state.failed) return;
					match(input,45,FOLLOW_45_in_program51); if (state.failed) return;
					match(input,53,FOLLOW_53_in_program53); if (state.failed) return;
					pushFollow(FOLLOW_statements_in_program55);
					statements(1);
					state._fsp--;
					if (state.failed) return;
					match(input,54,FOLLOW_54_in_program58); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");}
					}
					break;
				case 2 :
					// myInterp.g:22:7: INT MAIN '(' ')' '{' statements[1] '}'
					{
					match(input,INT,FOLLOW_INT_in_program76); if (state.failed) return;
					match(input,MAIN,FOLLOW_MAIN_in_program78); if (state.failed) return;
					match(input,44,FOLLOW_44_in_program80); if (state.failed) return;
					match(input,45,FOLLOW_45_in_program82); if (state.failed) return;
					match(input,53,FOLLOW_53_in_program84); if (state.failed) return;
					pushFollow(FOLLOW_statements_in_program86);
					statements(1);
					state._fsp--;
					if (state.failed) return;
					match(input,54,FOLLOW_54_in_program89); if (state.failed) return;
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
	// myInterp.g:27:1: type : ( FLOAT | INT | DOUBLE | CHAR | SHORT | LONG | SIGNED | UNSIGNED | BOOLEAN | STRING | VOID );
	public final void type() throws RecognitionException {
		try {
			// myInterp.g:27:5: ( FLOAT | INT | DOUBLE | CHAR | SHORT | LONG | SIGNED | UNSIGNED | BOOLEAN | STRING | VOID )
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
					// myInterp.g:27:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type109); if (state.failed) return;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: FLOAT"); }
					}
					break;
				case 2 :
					// myInterp.g:28:4: INT
					{
					match(input,INT,FOLLOW_INT_in_type116); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: INT"); }
					}
					break;
				case 3 :
					// myInterp.g:29:4: DOUBLE
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_type123); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: DOUBLE");}
					}
					break;
				case 4 :
					// myInterp.g:30:4: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type130); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: CHAR");}
					}
					break;
				case 5 :
					// myInterp.g:31:4: SHORT
					{
					match(input,SHORT,FOLLOW_SHORT_in_type137); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: SHORT");}
					}
					break;
				case 6 :
					// myInterp.g:32:4: LONG
					{
					match(input,LONG,FOLLOW_LONG_in_type144); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: LONG");}
					}
					break;
				case 7 :
					// myInterp.g:33:4: SIGNED
					{
					match(input,SIGNED,FOLLOW_SIGNED_in_type151); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: SIGNED");}
					}
					break;
				case 8 :
					// myInterp.g:34:4: UNSIGNED
					{
					match(input,UNSIGNED,FOLLOW_UNSIGNED_in_type158); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: UNSIGNED");}
					}
					break;
				case 9 :
					// myInterp.g:35:4: BOOLEAN
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type165); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: BOOLEAN");}
					}
					break;
				case 10 :
					// myInterp.g:36:4: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_type172); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: STRING");}
					}
					break;
				case 11 :
					// myInterp.g:37:4: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_type179); if (state.failed) return;
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



	// $ANTLR start "statements"
	// myInterp.g:40:1: statements[int flag] : ( statement[$flag] statements[$flag] |);
	public final void statements(int flag) throws RecognitionException {
		try {
			// myInterp.g:40:21: ( statement[$flag] statements[$flag] |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= BOOLEAN && LA3_0 <= BREAK)||LA3_0==CHAR||LA3_0==CONTINUE||LA3_0==DOUBLE||LA3_0==FLOAT||(LA3_0 >= IF && LA3_0 <= Identifier)||LA3_0==LONG||LA3_0==PRINTF||LA3_0==RETURN||(LA3_0 >= SCANF && LA3_0 <= SIGNED)||LA3_0==STRING||(LA3_0 >= UNSIGNED && LA3_0 <= VOID)||LA3_0==51) ) {
				alt3=1;
			}
			else if ( (LA3_0==EOF||LA3_0==54) ) {
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
					// myInterp.g:41:2: statement[$flag] statements[$flag]
					{
					pushFollow(FOLLOW_statement_in_statements192);
					statement(flag);
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statements_in_statements195);
					statements(flag);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myInterp.g:43:2: 
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
	// myInterp.g:46:1: statement[int flag0] : ( declarations_statement | assignment_statement[$flag0] ';' | if_statement[$flag0] | printf_func[$flag0] ';' | scanf_func[$flag0] ';' | jump_statement );
	public final void statement(int flag0) throws RecognitionException {
		try {
			// myInterp.g:46:22: ( declarations_statement | assignment_statement[$flag0] ';' | if_statement[$flag0] | printf_func[$flag0] ';' | scanf_func[$flag0] ';' | jump_statement )
			int alt4=6;
			switch ( input.LA(1) ) {
			case FLOAT:
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1==Identifier) ) {
					int LA4_17 = input.LA(3);
					if ( (LA4_17==48||LA4_17==51) ) {
						alt4=1;
					}
					else if ( (LA4_17==AssignmentOP) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
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
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT:
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2==Identifier) ) {
					int LA4_17 = input.LA(3);
					if ( (LA4_17==48||LA4_17==51) ) {
						alt4=1;
					}
					else if ( (LA4_17==AssignmentOP) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
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
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE:
				{
				int LA4_3 = input.LA(2);
				if ( (LA4_3==Identifier) ) {
					int LA4_17 = input.LA(3);
					if ( (LA4_17==48||LA4_17==51) ) {
						alt4=1;
					}
					else if ( (LA4_17==AssignmentOP) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
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
							new NoViableAltException("", 4, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA4_4 = input.LA(2);
				if ( (LA4_4==Identifier) ) {
					int LA4_17 = input.LA(3);
					if ( (LA4_17==48||LA4_17==51) ) {
						alt4=1;
					}
					else if ( (LA4_17==AssignmentOP) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
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
							new NoViableAltException("", 4, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SHORT:
				{
				int LA4_5 = input.LA(2);
				if ( (LA4_5==Identifier) ) {
					int LA4_17 = input.LA(3);
					if ( (LA4_17==48||LA4_17==51) ) {
						alt4=1;
					}
					else if ( (LA4_17==AssignmentOP) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
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
							new NoViableAltException("", 4, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONG:
				{
				int LA4_6 = input.LA(2);
				if ( (LA4_6==Identifier) ) {
					int LA4_17 = input.LA(3);
					if ( (LA4_17==48||LA4_17==51) ) {
						alt4=1;
					}
					else if ( (LA4_17==AssignmentOP) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
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
							new NoViableAltException("", 4, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SIGNED:
				{
				int LA4_7 = input.LA(2);
				if ( (LA4_7==Identifier) ) {
					int LA4_17 = input.LA(3);
					if ( (LA4_17==48||LA4_17==51) ) {
						alt4=1;
					}
					else if ( (LA4_17==AssignmentOP) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
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
							new NoViableAltException("", 4, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case UNSIGNED:
				{
				int LA4_8 = input.LA(2);
				if ( (LA4_8==Identifier) ) {
					int LA4_17 = input.LA(3);
					if ( (LA4_17==48||LA4_17==51) ) {
						alt4=1;
					}
					else if ( (LA4_17==AssignmentOP) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
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
							new NoViableAltException("", 4, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
				{
				int LA4_9 = input.LA(2);
				if ( (LA4_9==Identifier) ) {
					int LA4_17 = input.LA(3);
					if ( (LA4_17==48||LA4_17==51) ) {
						alt4=1;
					}
					else if ( (LA4_17==AssignmentOP) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
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
							new NoViableAltException("", 4, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRING:
				{
				int LA4_10 = input.LA(2);
				if ( (LA4_10==Identifier) ) {
					int LA4_17 = input.LA(3);
					if ( (LA4_17==48||LA4_17==51) ) {
						alt4=1;
					}
					else if ( (LA4_17==AssignmentOP) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
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
							new NoViableAltException("", 4, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOID:
				{
				int LA4_11 = input.LA(2);
				if ( (LA4_11==Identifier) ) {
					int LA4_17 = input.LA(3);
					if ( (LA4_17==48||LA4_17==51) ) {
						alt4=1;
					}
					else if ( (LA4_17==AssignmentOP) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
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
							new NoViableAltException("", 4, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				alt4=2;
				}
				break;
			case IF:
				{
				alt4=3;
				}
				break;
			case PRINTF:
				{
				alt4=4;
				}
				break;
			case SCANF:
				{
				alt4=5;
				}
				break;
			case BREAK:
			case CONTINUE:
			case RETURN:
			case 51:
				{
				alt4=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// myInterp.g:47:2: declarations_statement
					{
					pushFollow(FOLLOW_declarations_statement_in_statement212);
					declarations_statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myInterp.g:48:4: assignment_statement[$flag0] ';'
					{
					pushFollow(FOLLOW_assignment_statement_in_statement217);
					assignment_statement(flag0);
					state._fsp--;
					if (state.failed) return;
					match(input,51,FOLLOW_51_in_statement220); if (state.failed) return;
					}
					break;
				case 3 :
					// myInterp.g:49:4: if_statement[$flag0]
					{
					pushFollow(FOLLOW_if_statement_in_statement225);
					if_statement(flag0);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// myInterp.g:50:4: printf_func[$flag0] ';'
					{
					pushFollow(FOLLOW_printf_func_in_statement231);
					printf_func(flag0);
					state._fsp--;
					if (state.failed) return;
					match(input,51,FOLLOW_51_in_statement235); if (state.failed) return;
					}
					break;
				case 5 :
					// myInterp.g:51:4: scanf_func[$flag0] ';'
					{
					pushFollow(FOLLOW_scanf_func_in_statement240);
					scanf_func(flag0);
					state._fsp--;
					if (state.failed) return;
					match(input,51,FOLLOW_51_in_statement244); if (state.failed) return;
					}
					break;
				case 6 :
					// myInterp.g:52:4: jump_statement
					{
					pushFollow(FOLLOW_jump_statement_in_statement249);
					jump_statement();
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



	// $ANTLR start "declarations_statement"
	// myInterp.g:54:1: declarations_statement : type Identifier ( ',' Identifier )* ';' ;
	public final void declarations_statement() throws RecognitionException {
		try {
			// myInterp.g:54:23: ( type Identifier ( ',' Identifier )* ';' )
			// myInterp.g:55:2: type Identifier ( ',' Identifier )* ';'
			{
			pushFollow(FOLLOW_type_in_declarations_statement258);
			type();
			state._fsp--;
			if (state.failed) return;
			match(input,Identifier,FOLLOW_Identifier_in_declarations_statement260); if (state.failed) return;
			// myInterp.g:55:18: ( ',' Identifier )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==48) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myInterp.g:55:19: ',' Identifier
					{
					match(input,48,FOLLOW_48_in_declarations_statement263); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_declarations_statement265); if (state.failed) return;
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,51,FOLLOW_51_in_declarations_statement268); if (state.failed) return;
			if ( state.backtracking==0 ) { if(TRACEON) System.out.println("declarations: type Identifier : declarations"); }
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
	// $ANTLR end "declarations_statement"



	// $ANTLR start "if_statement"
	// myInterp.g:59:1: if_statement[int flag_if] : IF '(' a= cond_expression[$flag_if] ')' block_stmt[$a.flag] ( ( ELSE )=> ELSE block_stmt[($a.flag==0?1:0)] )? ;
	public final void if_statement(int flag_if) throws RecognitionException {
		int a =0;

		try {
			// myInterp.g:59:27: ( IF '(' a= cond_expression[$flag_if] ')' block_stmt[$a.flag] ( ( ELSE )=> ELSE block_stmt[($a.flag==0?1:0)] )? )
			// myInterp.g:60:2: IF '(' a= cond_expression[$flag_if] ')' block_stmt[$a.flag] ( ( ELSE )=> ELSE block_stmt[($a.flag==0?1:0)] )?
			{
			match(input,IF,FOLLOW_IF_in_if_statement287); if (state.failed) return;
			match(input,44,FOLLOW_44_in_if_statement289); if (state.failed) return;
			pushFollow(FOLLOW_cond_expression_in_if_statement295);
			a=cond_expression(flag_if);
			state._fsp--;
			if (state.failed) return;
			match(input,45,FOLLOW_45_in_if_statement298); if (state.failed) return;
			pushFollow(FOLLOW_block_stmt_in_if_statement300);
			block_stmt(a);
			state._fsp--;
			if (state.failed) return;
			// myInterp.g:60:63: ( ( ELSE )=> ELSE block_stmt[($a.flag==0?1:0)] )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ELSE) ) {
				int LA6_1 = input.LA(2);
				if ( (synpred19_myInterp()) ) {
					alt6=1;
				}
			}
			switch (alt6) {
				case 1 :
					// myInterp.g:60:64: ( ELSE )=> ELSE block_stmt[($a.flag==0?1:0)]
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_statement310); if (state.failed) return;
					pushFollow(FOLLOW_block_stmt_in_if_statement312);
					block_stmt((a==0?1:0));
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
	// $ANTLR end "if_statement"



	// $ANTLR start "block_stmt"
	// myInterp.g:63:1: block_stmt[int flag_blk] : ( '{' statements[$flag_blk] '}' | statement[$flag_blk] );
	public final void block_stmt(int flag_blk) throws RecognitionException {
		try {
			// myInterp.g:63:26: ( '{' statements[$flag_blk] '}' | statement[$flag_blk] )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==53) ) {
				alt7=1;
			}
			else if ( ((LA7_0 >= BOOLEAN && LA7_0 <= BREAK)||LA7_0==CHAR||LA7_0==CONTINUE||LA7_0==DOUBLE||LA7_0==FLOAT||(LA7_0 >= IF && LA7_0 <= Identifier)||LA7_0==LONG||LA7_0==PRINTF||LA7_0==RETURN||(LA7_0 >= SCANF && LA7_0 <= SIGNED)||LA7_0==STRING||(LA7_0 >= UNSIGNED && LA7_0 <= VOID)||LA7_0==51) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// myInterp.g:64:2: '{' statements[$flag_blk] '}'
					{
					match(input,53,FOLLOW_53_in_block_stmt326); if (state.failed) return;
					pushFollow(FOLLOW_statements_in_block_stmt328);
					statements(flag_blk);
					state._fsp--;
					if (state.failed) return;
					match(input,54,FOLLOW_54_in_block_stmt331); if (state.failed) return;
					}
					break;
				case 2 :
					// myInterp.g:65:4: statement[$flag_blk]
					{
					pushFollow(FOLLOW_statement_in_block_stmt336);
					statement(flag_blk);
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



	// $ANTLR start "assignment_statement"
	// myInterp.g:68:1: assignment_statement[int flag] returns [int value] : ( type )? Identifier (op= AssignmentOP ) (a= arith_expression[$flag] ) ;
	public final int assignment_statement(int flag) throws RecognitionException {
		int value = 0;


		Token op=null;
		Token Identifier1=null;
		int a =0;

		try {
			// myInterp.g:68:52: ( ( type )? Identifier (op= AssignmentOP ) (a= arith_expression[$flag] ) )
			// myInterp.g:69:2: ( type )? Identifier (op= AssignmentOP ) (a= arith_expression[$flag] )
			{
			// myInterp.g:69:2: ( type )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==BOOLEAN||LA8_0==CHAR||LA8_0==DOUBLE||LA8_0==FLOAT||LA8_0==INT||LA8_0==LONG||(LA8_0 >= SHORT && LA8_0 <= SIGNED)||LA8_0==STRING||(LA8_0 >= UNSIGNED && LA8_0 <= VOID)) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// myInterp.g:69:3: type
					{
					pushFollow(FOLLOW_type_in_assignment_statement354);
					type();
					state._fsp--;
					if (state.failed) return value;
					}
					break;

			}

			Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignment_statement358); if (state.failed) return value;
			// myInterp.g:69:21: (op= AssignmentOP )
			// myInterp.g:69:22: op= AssignmentOP
			{
			op=(Token)match(input,AssignmentOP,FOLLOW_AssignmentOP_in_assignment_statement365); if (state.failed) return value;
			}

			// myInterp.g:69:41: (a= arith_expression[$flag] )
			// myInterp.g:69:42: a= arith_expression[$flag]
			{
			pushFollow(FOLLOW_arith_expression_in_assignment_statement373);
			a=arith_expression(flag);
			state._fsp--;
			if (state.failed) return value;
			}

			if ( state.backtracking==0 ) {
					if(flag == 1){
						Integer v=(Integer)memory.get((Identifier1!=null?Identifier1.getText():null));
						if(v == null) v = 0;
						switch((op!=null?op.getText():null)){
							case "=":
								v = a;
								System.out.println("Assignment statement");
								break;
							case "+=":
								v += a;
								break;
							case "-=":
								v -= a;
								break;
							case "*=":
								v *= a;
								break;
							case "/=":
								v /= a;
								break;
							case "%=":
								v %= a;
								break;				
						}
						memory.put((Identifier1!=null?Identifier1.getText():null), v);
						value = v;
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
		return value;
	}
	// $ANTLR end "assignment_statement"



	// $ANTLR start "cond_expression"
	// myInterp.g:100:1: cond_expression[int flag1] returns [int flag] : (a= arith_expression[$flag1] |a= assignment_statement[$flag1] ) (op= RelationOP ) (b= arith_expression[$flag1] |b= assignment_statement[$flag1] ) ;
	public final int cond_expression(int flag1) throws RecognitionException {
		int flag = 0;


		Token op=null;
		int a =0;
		int b =0;

		try {
			// myInterp.g:100:47: ( (a= arith_expression[$flag1] |a= assignment_statement[$flag1] ) (op= RelationOP ) (b= arith_expression[$flag1] |b= assignment_statement[$flag1] ) )
			// myInterp.g:101:2: (a= arith_expression[$flag1] |a= assignment_statement[$flag1] ) (op= RelationOP ) (b= arith_expression[$flag1] |b= assignment_statement[$flag1] )
			{
			// myInterp.g:101:2: (a= arith_expression[$flag1] |a= assignment_statement[$flag1] )
			int alt9=2;
			switch ( input.LA(1) ) {
			case Integer_constant:
			case 44:
			case 49:
				{
				alt9=1;
				}
				break;
			case Identifier:
				{
				int LA9_2 = input.LA(2);
				if ( (LA9_2==RelationOP||(LA9_2 >= 46 && LA9_2 <= 47)||(LA9_2 >= 49 && LA9_2 <= 50)||LA9_2==52) ) {
					alt9=1;
				}
				else if ( (LA9_2==AssignmentOP) ) {
					alt9=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return flag;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case SIGNED:
			case STRING:
			case UNSIGNED:
			case VOID:
				{
				alt9=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return flag;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// myInterp.g:101:3: a= arith_expression[$flag1]
					{
					pushFollow(FOLLOW_arith_expression_in_cond_expression402);
					a=arith_expression(flag1);
					state._fsp--;
					if (state.failed) return flag;
					}
					break;
				case 2 :
					// myInterp.g:101:34: a= assignment_statement[$flag1]
					{
					pushFollow(FOLLOW_assignment_statement_in_cond_expression411);
					a=assignment_statement(flag1);
					state._fsp--;
					if (state.failed) return flag;
					}
					break;

			}

			// myInterp.g:101:68: (op= RelationOP )
			// myInterp.g:101:69: op= RelationOP
			{
			op=(Token)match(input,RelationOP,FOLLOW_RelationOP_in_cond_expression420); if (state.failed) return flag;
			}

			// myInterp.g:102:2: (b= arith_expression[$flag1] |b= assignment_statement[$flag1] )
			int alt10=2;
			switch ( input.LA(1) ) {
			case Integer_constant:
			case 44:
			case 49:
				{
				alt10=1;
				}
				break;
			case Identifier:
				{
				int LA10_2 = input.LA(2);
				if ( ((LA10_2 >= 45 && LA10_2 <= 47)||(LA10_2 >= 49 && LA10_2 <= 50)||LA10_2==52) ) {
					alt10=1;
				}
				else if ( (LA10_2==AssignmentOP) ) {
					alt10=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return flag;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case SIGNED:
			case STRING:
			case UNSIGNED:
			case VOID:
				{
				alt10=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return flag;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// myInterp.g:102:3: b= arith_expression[$flag1]
					{
					pushFollow(FOLLOW_arith_expression_in_cond_expression430);
					b=arith_expression(flag1);
					state._fsp--;
					if (state.failed) return flag;
					}
					break;
				case 2 :
					// myInterp.g:102:34: b= assignment_statement[$flag1]
					{
					pushFollow(FOLLOW_assignment_statement_in_cond_expression439);
					b=assignment_statement(flag1);
					state._fsp--;
					if (state.failed) return flag;
					}
					break;

			}

			if ( state.backtracking==0 ) {
					if(flag1 == 1){
						switch((op!=null?op.getText():null)){
							case ">":
								flag = (a>b) ?1 : 0;
								break;
							case ">=":
								flag = (a>=b)?1:0;
								break;
							case "<":
								flag = (a<b)?1:0;
								break;
							case "<=":
								flag = (a<=b)?1:0;
								break;
							case "!=":
								flag = (a!=b)?1:0;
								break;
							case "==":
								flag = (a ==b)?1:0;
								break;
						}
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
		return flag;
	}
	// $ANTLR end "cond_expression"



	// $ANTLR start "arith_expression"
	// myInterp.g:129:1: arith_expression[int flag] returns [int value] : a= multExpr[$flag] ( '+' b= multExpr[$flag] | '-' c= multExpr[$flag] )* ;
	public final int arith_expression(int flag) throws RecognitionException {
		int value = 0;


		int a =0;
		int b =0;
		int c =0;

		try {
			// myInterp.g:129:48: (a= multExpr[$flag] ( '+' b= multExpr[$flag] | '-' c= multExpr[$flag] )* )
			// myInterp.g:130:2: a= multExpr[$flag] ( '+' b= multExpr[$flag] | '-' c= multExpr[$flag] )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression461);
			a=multExpr(flag);
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {if(flag == 1) value = a; }
			// myInterp.g:130:56: ( '+' b= multExpr[$flag] | '-' c= multExpr[$flag] )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==47) ) {
					alt11=1;
				}
				else if ( (LA11_0==49) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// myInterp.g:131:3: '+' b= multExpr[$flag]
					{
					match(input,47,FOLLOW_47_in_arith_expression470); if (state.failed) return value;
					pushFollow(FOLLOW_multExpr_in_arith_expression474);
					b=multExpr(flag);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = value + b;}
					}
					break;
				case 2 :
					// myInterp.g:132:12: '-' c= multExpr[$flag]
					{
					match(input,49,FOLLOW_49_in_arith_expression489); if (state.failed) return value;
					pushFollow(FOLLOW_multExpr_in_arith_expression495);
					c=multExpr(flag);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = value - c;}
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
		return value;
	}
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// myInterp.g:136:1: multExpr[int flag] returns [int value] : a= signExpr[$flag] ( '*' b= signExpr[$flag] | '/' c= signExpr[$flag] | '\\%' d= signExpr[$flag] )* ;
	public final int multExpr(int flag) throws RecognitionException {
		int value = 0;


		int a =0;
		int b =0;
		int c =0;
		int d =0;

		try {
			// myInterp.g:136:40: (a= signExpr[$flag] ( '*' b= signExpr[$flag] | '/' c= signExpr[$flag] | '\\%' d= signExpr[$flag] )* )
			// myInterp.g:137:2: a= signExpr[$flag] ( '*' b= signExpr[$flag] | '/' c= signExpr[$flag] | '\\%' d= signExpr[$flag] )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr519);
			a=signExpr(flag);
			state._fsp--;
			if (state.failed) return value;
			if ( state.backtracking==0 ) {if(flag == 1) value = a;}
			// myInterp.g:137:56: ( '*' b= signExpr[$flag] | '/' c= signExpr[$flag] | '\\%' d= signExpr[$flag] )*
			loop12:
			while (true) {
				int alt12=4;
				switch ( input.LA(1) ) {
				case 46:
					{
					alt12=1;
					}
					break;
				case 50:
					{
					alt12=2;
					}
					break;
				case 52:
					{
					alt12=3;
					}
					break;
				}
				switch (alt12) {
				case 1 :
					// myInterp.g:138:3: '*' b= signExpr[$flag]
					{
					match(input,46,FOLLOW_46_in_multExpr527); if (state.failed) return value;
					pushFollow(FOLLOW_signExpr_in_multExpr533);
					b=signExpr(flag);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = value * b;}
					}
					break;
				case 2 :
					// myInterp.g:139:5: '/' c= signExpr[$flag]
					{
					match(input,50,FOLLOW_50_in_multExpr542); if (state.failed) return value;
					pushFollow(FOLLOW_signExpr_in_multExpr548);
					c=signExpr(flag);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {value = value / c;}
					}
					break;
				case 3 :
					// myInterp.g:140:5: '\\%' d= signExpr[$flag]
					{
					match(input,52,FOLLOW_52_in_multExpr557); if (state.failed) return value;
					pushFollow(FOLLOW_signExpr_in_multExpr563);
					d=signExpr(flag);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { value = value % d;}
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
		return value;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myInterp.g:144:1: signExpr[int flag] returns [int value] : (a= primaryExpr[$flag] | '-' primaryExpr[$flag] );
	public final int signExpr(int flag) throws RecognitionException {
		int value = 0;


		int a =0;

		try {
			// myInterp.g:144:40: (a= primaryExpr[$flag] | '-' primaryExpr[$flag] )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= Identifier && LA13_0 <= Integer_constant)||LA13_0==44) ) {
				alt13=1;
			}
			else if ( (LA13_0==49) ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// myInterp.g:145:9: a= primaryExpr[$flag]
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr596);
					a=primaryExpr(flag);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) { if(flag == 1) { value = a; }}
					}
					break;
				case 2 :
					// myInterp.g:146:11: '-' primaryExpr[$flag]
					{
					match(input,49,FOLLOW_49_in_signExpr612); if (state.failed) return value;
					pushFollow(FOLLOW_primaryExpr_in_signExpr614);
					primaryExpr(flag);
					state._fsp--;
					if (state.failed) return value;
					if ( state.backtracking==0 ) {if(flag == 1) {value = -1*a;}}
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
		return value;
	}
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myInterp.g:149:1: primaryExpr[int flag] returns [int value] : ( Integer_constant | Identifier | '(' a= arith_expression[$flag] ')' );
	public final int primaryExpr(int flag) throws RecognitionException {
		int value = 0;


		Token Integer_constant2=null;
		Token Identifier3=null;
		int a =0;

		try {
			// myInterp.g:149:43: ( Integer_constant | Identifier | '(' a= arith_expression[$flag] ')' )
			int alt14=3;
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
			case 44:
				{
				alt14=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return value;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// myInterp.g:150:2: Integer_constant
					{
					Integer_constant2=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr632); if (state.failed) return value;
					if ( state.backtracking==0 ) {
							if (flag ==1) {value = Integer.parseInt((Integer_constant2!=null?Integer_constant2.getText():null)); }
						}
					}
					break;
				case 2 :
					// myInterp.g:153:4: Identifier
					{
					Identifier3=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr638); if (state.failed) return value;
					if ( state.backtracking==0 ) {
							if(flag == 1){
								Integer v = (Integer) memory.get((Identifier3!=null?Identifier3.getText():null));
								if(v != null) value = v;
								else System.err.println("Undefined variable: " + (Identifier3!=null?Identifier3.getText():null));
							}
						}
					}
					break;
				case 3 :
					// myInterp.g:160:4: '(' a= arith_expression[$flag] ')'
					{
					match(input,44,FOLLOW_44_in_primaryExpr644); if (state.failed) return value;
					pushFollow(FOLLOW_arith_expression_in_primaryExpr648);
					a=arith_expression(flag);
					state._fsp--;
					if (state.failed) return value;
					match(input,45,FOLLOW_45_in_primaryExpr651); if (state.failed) return value;
					if ( state.backtracking==0 ) { if (flag == 1) value = a;}
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
		return value;
	}
	// $ANTLR end "primaryExpr"



	// $ANTLR start "printf_func"
	// myInterp.g:163:1: printf_func[int flag] : PRINTF '(' a= STRINGS b= ( ',' ( Identifier | Integer_constant ) )* ')' ;
	public final void printf_func(int flag) throws RecognitionException {
		Token a=null;
		Token b=null;

		try {
			// myInterp.g:163:23: ( PRINTF '(' a= STRINGS b= ( ',' ( Identifier | Integer_constant ) )* ')' )
			// myInterp.g:164:2: PRINTF '(' a= STRINGS b= ( ',' ( Identifier | Integer_constant ) )* ')'
			{
			match(input,PRINTF,FOLLOW_PRINTF_in_printf_func663); if (state.failed) return;
			match(input,44,FOLLOW_44_in_printf_func665); if (state.failed) return;
			a=(Token)match(input,STRINGS,FOLLOW_STRINGS_in_printf_func671); if (state.failed) return;
			// myInterp.g:164:29: ( ',' ( Identifier | Integer_constant ) )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==48) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// myInterp.g:164:30: ',' ( Identifier | Integer_constant )
					{
					b=(Token)match(input,48,FOLLOW_48_in_printf_func678); if (state.failed) return;
					b=input.LT(1);
					if ( (input.LA(1) >= Identifier && input.LA(1) <= Integer_constant) ) {
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
					break;

				default :
					break loop15;
				}
			}

			match(input,45,FOLLOW_45_in_printf_func690); if (state.failed) return;
			if ( state.backtracking==0 ) {
					if(flag==1){
						if(b == null){
							String s = (a!=null?a.getText():null).replace("\\n", "\n").replace("\"", "");
							System.out.print(s);
						}
						else{
							Integer v = (Integer) memory.get((b!=null?b.getText():null));
							if(v == null) v = Integer.parseInt((b!=null?b.getText():null));
							String s = (a!=null?a.getText():null).replace("\\n", "\n").replace("\"", "").replace("%d", Integer.toString(v));
							System.out.print(s);
						}
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
	// $ANTLR end "printf_func"



	// $ANTLR start "scanf_func"
	// myInterp.g:179:1: scanf_func[int flag] : SCANF '(' a= STRINGS ( ',' b= ( ( '&' )? Identifier ) ) ')' ;
	public final void scanf_func(int flag) throws RecognitionException {
		Token a=null;
		Token b=null;

		try {
			// myInterp.g:179:22: ( SCANF '(' a= STRINGS ( ',' b= ( ( '&' )? Identifier ) ) ')' )
			// myInterp.g:180:2: SCANF '(' a= STRINGS ( ',' b= ( ( '&' )? Identifier ) ) ')'
			{
			match(input,SCANF,FOLLOW_SCANF_in_scanf_func702); if (state.failed) return;
			match(input,44,FOLLOW_44_in_scanf_func704); if (state.failed) return;
			a=(Token)match(input,STRINGS,FOLLOW_STRINGS_in_scanf_func710); if (state.failed) return;
			// myInterp.g:180:24: ( ',' b= ( ( '&' )? Identifier ) )
			// myInterp.g:180:25: ',' b= ( ( '&' )? Identifier )
			{
			match(input,48,FOLLOW_48_in_scanf_func713); if (state.failed) return;
			// myInterp.g:180:33: ( ( '&' )? Identifier )
			// myInterp.g:180:34: ( '&' )? Identifier
			{
			// myInterp.g:180:34: ( '&' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==43) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// myInterp.g:180:34: '&'
					{
					b=(Token)match(input,43,FOLLOW_43_in_scanf_func720); if (state.failed) return;
					}
					break;

			}

			b=(Token)match(input,Identifier,FOLLOW_Identifier_in_scanf_func723); if (state.failed) return;
			}

			}

			match(input,45,FOLLOW_45_in_scanf_func727); if (state.failed) return;
			if ( state.backtracking==0 ) {
					if(flag == 1){
						Scanner scanner = new Scanner(System.in);
						switch((a!=null?a.getText():null).replace("\"", "")){
							case "%d":
								Integer v = scanner.nextInt();
								memory.put((b!=null?b.getText():null), v);
								break;
						}
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
	// $ANTLR end "scanf_func"



	// $ANTLR start "jump_statement"
	// myInterp.g:193:1: jump_statement : ( ';' | CONTINUE ';' | BREAK ';' | RETURN ';' | RETURN arith_expression[1] ';' );
	public final void jump_statement() throws RecognitionException {
		try {
			// myInterp.g:193:15: ( ';' | CONTINUE ';' | BREAK ';' | RETURN ';' | RETURN arith_expression[1] ';' )
			int alt17=5;
			switch ( input.LA(1) ) {
			case 51:
				{
				alt17=1;
				}
				break;
			case CONTINUE:
				{
				alt17=2;
				}
				break;
			case BREAK:
				{
				alt17=3;
				}
				break;
			case RETURN:
				{
				int LA17_4 = input.LA(2);
				if ( (LA17_4==51) ) {
					alt17=4;
				}
				else if ( ((LA17_4 >= Identifier && LA17_4 <= Integer_constant)||LA17_4==44||LA17_4==49) ) {
					alt17=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 4, input);
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
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// myInterp.g:194:2: ';'
					{
					match(input,51,FOLLOW_51_in_jump_statement739); if (state.failed) return;
					}
					break;
				case 2 :
					// myInterp.g:195:4: CONTINUE ';'
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_jump_statement744); if (state.failed) return;
					match(input,51,FOLLOW_51_in_jump_statement746); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("jump_statement: continue");}
					}
					break;
				case 3 :
					// myInterp.g:197:4: BREAK ';'
					{
					match(input,BREAK,FOLLOW_BREAK_in_jump_statement756); if (state.failed) return;
					match(input,51,FOLLOW_51_in_jump_statement758); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("jump_statement: break");}
					}
					break;
				case 4 :
					// myInterp.g:199:4: RETURN ';'
					{
					match(input,RETURN,FOLLOW_RETURN_in_jump_statement768); if (state.failed) return;
					match(input,51,FOLLOW_51_in_jump_statement770); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("jump_statement: return;");}
					}
					break;
				case 5 :
					// myInterp.g:201:4: RETURN arith_expression[1] ';'
					{
					match(input,RETURN,FOLLOW_RETURN_in_jump_statement780); if (state.failed) return;
					pushFollow(FOLLOW_arith_expression_in_jump_statement782);
					arith_expression(1);
					state._fsp--;
					if (state.failed) return;
					match(input,51,FOLLOW_51_in_jump_statement785); if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("jump_statement: return;");}
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

	// $ANTLR start synpred19_myInterp
	public final void synpred19_myInterp_fragment() throws RecognitionException {
		// myInterp.g:60:64: ( ELSE )
		// myInterp.g:60:65: ELSE
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred19_myInterp305); if (state.failed) return;
		}

	}
	// $ANTLR end synpred19_myInterp

	// Delegated rules

	public final boolean synpred19_myInterp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_myInterp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_VOID_in_program45 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_MAIN_in_program47 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_program49 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_program51 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_program53 = new BitSet(new long[]{0x00480193AA724AC0L});
	public static final BitSet FOLLOW_statements_in_program55 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_program58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_program76 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_MAIN_in_program78 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_program80 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_program82 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_program84 = new BitSet(new long[]{0x00480193AA724AC0L});
	public static final BitSet FOLLOW_statements_in_program86 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_program89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_type123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_in_type137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_type144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIGNED_in_type151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNSIGNED_in_type158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_type165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_type172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_type179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements192 = new BitSet(new long[]{0x00080193AA724AC0L});
	public static final BitSet FOLLOW_statements_in_statements195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarations_statement_in_statement212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_statement_in_statement217 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_statement220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_statement225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printf_func_in_statement231 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_statement235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scanf_func_in_statement240 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_statement244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jump_statement_in_statement249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations_statement258 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Identifier_in_declarations_statement260 = new BitSet(new long[]{0x0009000000000000L});
	public static final BitSet FOLLOW_48_in_declarations_statement263 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Identifier_in_declarations_statement265 = new BitSet(new long[]{0x0009000000000000L});
	public static final BitSet FOLLOW_51_in_declarations_statement268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement287 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_if_statement289 = new BitSet(new long[]{0x0002119302E24240L});
	public static final BitSet FOLLOW_cond_expression_in_if_statement295 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_if_statement298 = new BitSet(new long[]{0x00280193AA724AC0L});
	public static final BitSet FOLLOW_block_stmt_in_if_statement300 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement310 = new BitSet(new long[]{0x00280193AA724AC0L});
	public static final BitSet FOLLOW_block_stmt_in_if_statement312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_block_stmt326 = new BitSet(new long[]{0x00480193AA724AC0L});
	public static final BitSet FOLLOW_statements_in_block_stmt328 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_block_stmt331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block_stmt336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_assignment_statement354 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Identifier_in_assignment_statement358 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AssignmentOP_in_assignment_statement365 = new BitSet(new long[]{0x0002100000C00000L});
	public static final BitSet FOLLOW_arith_expression_in_assignment_statement373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression402 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_assignment_statement_in_cond_expression411 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_RelationOP_in_cond_expression420 = new BitSet(new long[]{0x0002119302E24240L});
	public static final BitSet FOLLOW_arith_expression_in_cond_expression430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_statement_in_cond_expression439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression461 = new BitSet(new long[]{0x0002800000000002L});
	public static final BitSet FOLLOW_47_in_arith_expression470 = new BitSet(new long[]{0x0002100000C00000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression474 = new BitSet(new long[]{0x0002800000000002L});
	public static final BitSet FOLLOW_49_in_arith_expression489 = new BitSet(new long[]{0x0002100000C00000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression495 = new BitSet(new long[]{0x0002800000000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr519 = new BitSet(new long[]{0x0014400000000002L});
	public static final BitSet FOLLOW_46_in_multExpr527 = new BitSet(new long[]{0x0002100000C00000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr533 = new BitSet(new long[]{0x0014400000000002L});
	public static final BitSet FOLLOW_50_in_multExpr542 = new BitSet(new long[]{0x0002100000C00000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr548 = new BitSet(new long[]{0x0014400000000002L});
	public static final BitSet FOLLOW_52_in_multExpr557 = new BitSet(new long[]{0x0002100000C00000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr563 = new BitSet(new long[]{0x0014400000000002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_signExpr612 = new BitSet(new long[]{0x0000100000C00000L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_primaryExpr644 = new BitSet(new long[]{0x0002100000C00000L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr648 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_primaryExpr651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_printf_func663 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_printf_func665 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_STRINGS_in_printf_func671 = new BitSet(new long[]{0x0001200000000000L});
	public static final BitSet FOLLOW_48_in_printf_func678 = new BitSet(new long[]{0x0000000000C00000L});
	public static final BitSet FOLLOW_set_in_printf_func680 = new BitSet(new long[]{0x0001200000000000L});
	public static final BitSet FOLLOW_45_in_printf_func690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCANF_in_scanf_func702 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_scanf_func704 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_STRINGS_in_scanf_func710 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_scanf_func713 = new BitSet(new long[]{0x0000080000400000L});
	public static final BitSet FOLLOW_43_in_scanf_func720 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Identifier_in_scanf_func723 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_scanf_func727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_jump_statement739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_jump_statement744 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_jump_statement746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_jump_statement756 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_jump_statement758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_jump_statement768 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_jump_statement770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_jump_statement780 = new BitSet(new long[]{0x0002100000C00000L});
	public static final BitSet FOLLOW_arith_expression_in_jump_statement782 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_jump_statement785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred19_myInterp305 = new BitSet(new long[]{0x0000000000000002L});
}
