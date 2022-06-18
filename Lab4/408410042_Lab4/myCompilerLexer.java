// $ANTLR 3.5.2 myCompiler.g 2022-06-18 18:29:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCompilerLexer() {} 
	public myCompilerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myCompiler.g"; }

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:7:7: ( '(' )
			// myCompiler.g:7:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:8:7: ( ')' )
			// myCompiler.g:8:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:9:7: ( '*' )
			// myCompiler.g:9:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:10:7: ( '+' )
			// myCompiler.g:10:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:11:7: ( ',' )
			// myCompiler.g:11:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:12:7: ( '-' )
			// myCompiler.g:12:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:13:7: ( '/' )
			// myCompiler.g:13:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:14:7: ( '0;' )
			// myCompiler.g:14:9: '0;'
			{
			match("0;"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:15:7: ( ';' )
			// myCompiler.g:15:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:16:7: ( '=' )
			// myCompiler.g:16:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:17:7: ( '{' )
			// myCompiler.g:17:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:18:7: ( '}' )
			// myCompiler.g:18:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:548:6: ( 'float' )
			// myCompiler.g:548:7: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:549:4: ( 'int' )
			// myCompiler.g:549:5: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:550:5: ( 'char' )
			// myCompiler.g:550:7: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:552:5: ( 'main' )
			// myCompiler.g:552:7: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:553:5: ( 'void' )
			// myCompiler.g:553:7: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:554:3: ( 'if' )
			// myCompiler.g:554:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:555:5: ( 'else' )
			// myCompiler.g:555:7: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:556:4: ( 'for' )
			// myCompiler.g:556:6: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "PRINTF"
	public final void mPRINTF() throws RecognitionException {
		try {
			int _type = PRINTF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:557:7: ( 'printf' )
			// myCompiler.g:557:9: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:558:7: ( 'return' )
			// myCompiler.g:558:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "RelationOP"
	public final void mRelationOP() throws RecognitionException {
		try {
			int _type = RelationOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:559:11: ( '>' | '>=' | '<' | '<=' | '==' | '!=' )
			int alt1=6;
			switch ( input.LA(1) ) {
			case '>':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='=') ) {
					alt1=2;
				}

				else {
					alt1=1;
				}

				}
				break;
			case '<':
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='=') ) {
					alt1=4;
				}

				else {
					alt1=3;
				}

				}
				break;
			case '=':
				{
				alt1=5;
				}
				break;
			case '!':
				{
				alt1=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// myCompiler.g:559:13: '>'
					{
					match('>'); 
					}
					break;
				case 2 :
					// myCompiler.g:559:18: '>='
					{
					match(">="); 

					}
					break;
				case 3 :
					// myCompiler.g:559:25: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// myCompiler.g:559:31: '<='
					{
					match("<="); 

					}
					break;
				case 5 :
					// myCompiler.g:559:38: '=='
					{
					match("=="); 

					}
					break;
				case 6 :
					// myCompiler.g:559:45: '!='
					{
					match("!="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RelationOP"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:561:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myCompiler.g:561:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myCompiler.g:561:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myCompiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "Integer_constant"
	public final void mInteger_constant() throws RecognitionException {
		try {
			int _type = Integer_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:562:17: ( ( '0' .. '9' )+ )
			// myCompiler.g:562:18: ( '0' .. '9' )+
			{
			// myCompiler.g:562:18: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myCompiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer_constant"

	// $ANTLR start "Floating_point_constant"
	public final void mFloating_point_constant() throws RecognitionException {
		try {
			int _type = Floating_point_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:564:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myCompiler.g:564:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myCompiler.g:564:25: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myCompiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			match('.'); 
			// myCompiler.g:564:39: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myCompiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Floating_point_constant"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:567:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// myCompiler.g:567:8: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// myCompiler.g:567:12: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\\') ) {
					alt6=1;
				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// myCompiler.g:567:14: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// myCompiler.g:567:31: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:570:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myCompiler.g:570:4: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:571:8: ( '/*' ( . )* '*/' )
			// myCompiler.g:571:9: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myCompiler.g:571:14: ( . )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='*') ) {
					int LA7_1 = input.LA(2);
					if ( (LA7_1=='/') ) {
						alt7=2;
					}
					else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
						alt7=1;
					}

				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myCompiler.g:571:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop7;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "LINE_COMMAND"
	public final void mLINE_COMMAND() throws RecognitionException {
		try {
			int _type = LINE_COMMAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:573:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// myCompiler.g:573:7: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match('#'); 
			// myCompiler.g:573:11: (~ ( '\\n' | '\\r' ) )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myCompiler.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			// myCompiler.g:573:25: ( '\\r' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\r') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// myCompiler.g:573:25: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMAND"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// myCompiler.g:579:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// myCompiler.g:579:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	@Override
	public void mTokens() throws RecognitionException {
		// myCompiler.g:1:8: ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | FLOAT | INT | CHAR | MAIN | VOID | IF | ELSE | FOR | PRINTF | RETURN | RelationOP | Identifier | Integer_constant | Floating_point_constant | STRING_LITERAL | WS | COMMENT | LINE_COMMAND )
		int alt10=30;
		alt10 = dfa10.predict(input);
		switch (alt10) {
			case 1 :
				// myCompiler.g:1:10: T__23
				{
				mT__23(); 

				}
				break;
			case 2 :
				// myCompiler.g:1:16: T__24
				{
				mT__24(); 

				}
				break;
			case 3 :
				// myCompiler.g:1:22: T__25
				{
				mT__25(); 

				}
				break;
			case 4 :
				// myCompiler.g:1:28: T__26
				{
				mT__26(); 

				}
				break;
			case 5 :
				// myCompiler.g:1:34: T__27
				{
				mT__27(); 

				}
				break;
			case 6 :
				// myCompiler.g:1:40: T__28
				{
				mT__28(); 

				}
				break;
			case 7 :
				// myCompiler.g:1:46: T__29
				{
				mT__29(); 

				}
				break;
			case 8 :
				// myCompiler.g:1:52: T__30
				{
				mT__30(); 

				}
				break;
			case 9 :
				// myCompiler.g:1:58: T__31
				{
				mT__31(); 

				}
				break;
			case 10 :
				// myCompiler.g:1:64: T__32
				{
				mT__32(); 

				}
				break;
			case 11 :
				// myCompiler.g:1:70: T__33
				{
				mT__33(); 

				}
				break;
			case 12 :
				// myCompiler.g:1:76: T__34
				{
				mT__34(); 

				}
				break;
			case 13 :
				// myCompiler.g:1:82: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 14 :
				// myCompiler.g:1:88: INT
				{
				mINT(); 

				}
				break;
			case 15 :
				// myCompiler.g:1:92: CHAR
				{
				mCHAR(); 

				}
				break;
			case 16 :
				// myCompiler.g:1:97: MAIN
				{
				mMAIN(); 

				}
				break;
			case 17 :
				// myCompiler.g:1:102: VOID
				{
				mVOID(); 

				}
				break;
			case 18 :
				// myCompiler.g:1:107: IF
				{
				mIF(); 

				}
				break;
			case 19 :
				// myCompiler.g:1:110: ELSE
				{
				mELSE(); 

				}
				break;
			case 20 :
				// myCompiler.g:1:115: FOR
				{
				mFOR(); 

				}
				break;
			case 21 :
				// myCompiler.g:1:119: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 22 :
				// myCompiler.g:1:126: RETURN
				{
				mRETURN(); 

				}
				break;
			case 23 :
				// myCompiler.g:1:133: RelationOP
				{
				mRelationOP(); 

				}
				break;
			case 24 :
				// myCompiler.g:1:144: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 25 :
				// myCompiler.g:1:155: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 26 :
				// myCompiler.g:1:172: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 27 :
				// myCompiler.g:1:196: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 28 :
				// myCompiler.g:1:211: WS
				{
				mWS(); 

				}
				break;
			case 29 :
				// myCompiler.g:1:214: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 30 :
				// myCompiler.g:1:222: LINE_COMMAND
				{
				mLINE_COMMAND(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\7\uffff\1\34\1\36\1\uffff\1\40\2\uffff\10\26\2\uffff\1\36\11\uffff\3"+
		"\26\1\56\7\26\1\66\1\67\1\uffff\7\26\2\uffff\1\77\1\100\1\101\1\102\2"+
		"\26\1\105\4\uffff\2\26\1\uffff\1\110\1\111\2\uffff";
	static final String DFA10_eofS =
		"\112\uffff";
	static final String DFA10_minS =
		"\1\11\6\uffff\1\52\1\56\1\uffff\1\75\2\uffff\1\154\1\146\1\150\1\141\1"+
		"\157\1\154\1\162\1\145\2\uffff\1\56\11\uffff\1\157\1\162\1\164\1\60\1"+
		"\141\2\151\1\163\1\151\1\164\1\141\2\60\1\uffff\1\162\1\156\1\144\1\145"+
		"\1\156\1\165\1\164\2\uffff\4\60\1\164\1\162\1\60\4\uffff\1\146\1\156\1"+
		"\uffff\2\60\2\uffff";
	static final String DFA10_maxS =
		"\1\175\6\uffff\1\52\1\73\1\uffff\1\75\2\uffff\1\157\1\156\1\150\1\141"+
		"\1\157\1\154\1\162\1\145\2\uffff\1\71\11\uffff\1\157\1\162\1\164\1\172"+
		"\1\141\2\151\1\163\1\151\1\164\1\141\2\172\1\uffff\1\162\1\156\1\144\1"+
		"\145\1\156\1\165\1\164\2\uffff\4\172\1\164\1\162\1\172\4\uffff\1\146\1"+
		"\156\1\uffff\2\172\2\uffff";
	static final String DFA10_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\11\1\uffff\1\13\1\14\10\uffff"+
		"\1\27\1\30\1\uffff\1\33\1\34\1\36\1\35\1\7\1\10\1\31\1\32\1\12\15\uffff"+
		"\1\22\7\uffff\1\24\1\16\7\uffff\1\17\1\20\1\21\1\23\2\uffff\1\15\2\uffff"+
		"\1\25\1\26";
	static final String DFA10_specialS =
		"\112\uffff}>";
	static final String[] DFA10_transitionS = {
			"\2\31\2\uffff\1\31\22\uffff\1\31\1\25\1\30\1\32\4\uffff\1\1\1\2\1\3\1"+
			"\4\1\5\1\6\1\uffff\1\7\1\10\11\27\1\uffff\1\11\1\25\1\12\1\25\2\uffff"+
			"\32\26\4\uffff\1\26\1\uffff\2\26\1\17\1\26\1\22\1\15\2\26\1\16\3\26\1"+
			"\20\2\26\1\23\1\26\1\24\3\26\1\21\4\26\1\13\1\uffff\1\14",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\33",
			"\1\37\1\uffff\12\27\1\uffff\1\35",
			"",
			"\1\25",
			"",
			"",
			"\1\41\2\uffff\1\42",
			"\1\44\7\uffff\1\43",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"",
			"",
			"\1\37\1\uffff\12\27",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\53",
			"\1\54",
			"\1\55",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\103",
			"\1\104",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"",
			"",
			"",
			"\1\106",
			"\1\107",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | FLOAT | INT | CHAR | MAIN | VOID | IF | ELSE | FOR | PRINTF | RETURN | RelationOP | Identifier | Integer_constant | Floating_point_constant | STRING_LITERAL | WS | COMMENT | LINE_COMMAND );";
		}
	}

}
