// $ANTLR 3.5.2 myC_new.g 2022-04-17 13:57:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myC_newLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int COMMENT=4;
	public static final int ELSE=5;
	public static final int ELSEIF=6;
	public static final int FLOAT=7;
	public static final int FOR=8;
	public static final int Floating_point_constant=9;
	public static final int IF=10;
	public static final int INT=11;
	public static final int Identifier=12;
	public static final int Integer_constant=13;
	public static final int MAIN=14;
	public static final int VOID=15;
	public static final int WHILE=16;
	public static final int WS=17;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myC_newLexer() {} 
	public myC_newLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myC_newLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myC_new.g"; }

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:7:7: ( '(' )
			// myC_new.g:7:9: '('
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:8:7: ( ')' )
			// myC_new.g:8:9: ')'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:9:7: ( '*' )
			// myC_new.g:9:9: '*'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:10:7: ( '+' )
			// myC_new.g:10:9: '+'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:11:7: ( '-' )
			// myC_new.g:11:9: '-'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:12:7: ( '/' )
			// myC_new.g:12:9: '/'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:13:7: ( ';' )
			// myC_new.g:13:9: ';'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:14:7: ( '=' )
			// myC_new.g:14:9: '='
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:15:7: ( '{' )
			// myC_new.g:15:9: '{'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:16:7: ( '}' )
			// myC_new.g:16:9: '}'
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
	// $ANTLR end "T__27"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:62:6: ( 'float' )
			// myC_new.g:62:7: 'float'
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
			// myC_new.g:63:4: ( 'int' )
			// myC_new.g:63:5: 'int'
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

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:64:5: ( 'main' )
			// myC_new.g:64:7: 'main'
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
			// myC_new.g:65:5: ( 'void' )
			// myC_new.g:65:7: 'void'
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
			// myC_new.g:66:3: ( 'if' )
			// myC_new.g:66:5: 'if'
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

	// $ANTLR start "ELSEIF"
	public final void mELSEIF() throws RecognitionException {
		try {
			int _type = ELSEIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:67:7: ( 'else if' )
			// myC_new.g:67:9: 'else if'
			{
			match("else if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSEIF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:68:5: ( 'else' )
			// myC_new.g:68:7: 'else'
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
			// myC_new.g:69:4: ( 'for' )
			// myC_new.g:69:6: 'for'
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

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:70:6: ( 'while' )
			// myC_new.g:70:8: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:72:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myC_new.g:72:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myC_new.g:72:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myC_new.g:
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
					break loop1;
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
			// myC_new.g:73:17: ( ( '0' .. '9' )+ )
			// myC_new.g:73:18: ( '0' .. '9' )+
			{
			// myC_new.g:73:18: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myC_new.g:
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
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
			// myC_new.g:74:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myC_new.g:74:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myC_new.g:74:25: ( '0' .. '9' )+
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
					// myC_new.g:
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

			match('.'); 
			// myC_new.g:74:39: ( '0' .. '9' )+
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
					// myC_new.g:
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Floating_point_constant"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:76:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myC_new.g:76:4: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// myC_new.g:77:8: ( '/*' ( . )* '*/' )
			// myC_new.g:77:9: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myC_new.g:77:14: ( . )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='*') ) {
					int LA5_1 = input.LA(2);
					if ( (LA5_1=='/') ) {
						alt5=2;
					}
					else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
						alt5=1;
					}

				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myC_new.g:77:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop5;
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

	@Override
	public void mTokens() throws RecognitionException {
		// myC_new.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | FLOAT | INT | MAIN | VOID | IF | ELSEIF | ELSE | FOR | WHILE | Identifier | Integer_constant | Floating_point_constant | WS | COMMENT )
		int alt6=24;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// myC_new.g:1:10: T__18
				{
				mT__18(); 

				}
				break;
			case 2 :
				// myC_new.g:1:16: T__19
				{
				mT__19(); 

				}
				break;
			case 3 :
				// myC_new.g:1:22: T__20
				{
				mT__20(); 

				}
				break;
			case 4 :
				// myC_new.g:1:28: T__21
				{
				mT__21(); 

				}
				break;
			case 5 :
				// myC_new.g:1:34: T__22
				{
				mT__22(); 

				}
				break;
			case 6 :
				// myC_new.g:1:40: T__23
				{
				mT__23(); 

				}
				break;
			case 7 :
				// myC_new.g:1:46: T__24
				{
				mT__24(); 

				}
				break;
			case 8 :
				// myC_new.g:1:52: T__25
				{
				mT__25(); 

				}
				break;
			case 9 :
				// myC_new.g:1:58: T__26
				{
				mT__26(); 

				}
				break;
			case 10 :
				// myC_new.g:1:64: T__27
				{
				mT__27(); 

				}
				break;
			case 11 :
				// myC_new.g:1:70: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 12 :
				// myC_new.g:1:76: INT
				{
				mINT(); 

				}
				break;
			case 13 :
				// myC_new.g:1:80: MAIN
				{
				mMAIN(); 

				}
				break;
			case 14 :
				// myC_new.g:1:85: VOID
				{
				mVOID(); 

				}
				break;
			case 15 :
				// myC_new.g:1:90: IF
				{
				mIF(); 

				}
				break;
			case 16 :
				// myC_new.g:1:93: ELSEIF
				{
				mELSEIF(); 

				}
				break;
			case 17 :
				// myC_new.g:1:100: ELSE
				{
				mELSE(); 

				}
				break;
			case 18 :
				// myC_new.g:1:105: FOR
				{
				mFOR(); 

				}
				break;
			case 19 :
				// myC_new.g:1:109: WHILE
				{
				mWHILE(); 

				}
				break;
			case 20 :
				// myC_new.g:1:115: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 21 :
				// myC_new.g:1:126: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 22 :
				// myC_new.g:1:143: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 23 :
				// myC_new.g:1:167: WS
				{
				mWS(); 

				}
				break;
			case 24 :
				// myC_new.g:1:170: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\6\uffff\1\25\4\uffff\6\21\1\uffff\1\36\3\uffff\3\21\1\43\4\21\2\uffff"+
		"\1\21\1\51\1\52\1\uffff\5\21\2\uffff\1\60\1\61\1\63\1\21\1\65\4\uffff"+
		"\1\66\2\uffff";
	static final String DFA6_eofS =
		"\67\uffff";
	static final String DFA6_minS =
		"\1\11\5\uffff\1\52\4\uffff\1\154\1\146\1\141\1\157\1\154\1\150\1\uffff"+
		"\1\56\3\uffff\1\157\1\162\1\164\1\60\2\151\1\163\1\151\2\uffff\1\141\2"+
		"\60\1\uffff\1\156\1\144\1\145\1\154\1\164\2\uffff\2\60\1\40\1\145\1\60"+
		"\4\uffff\1\60\2\uffff";
	static final String DFA6_maxS =
		"\1\175\5\uffff\1\52\4\uffff\1\157\1\156\1\141\1\157\1\154\1\150\1\uffff"+
		"\1\71\3\uffff\1\157\1\162\1\164\1\172\2\151\1\163\1\151\2\uffff\1\141"+
		"\2\172\1\uffff\1\156\1\144\1\145\1\154\1\164\2\uffff\3\172\1\145\1\172"+
		"\4\uffff\1\172\2\uffff";
	static final String DFA6_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\11\1\12\6\uffff\1\24\1"+
		"\uffff\1\27\1\30\1\6\10\uffff\1\25\1\26\3\uffff\1\17\5\uffff\1\22\1\14"+
		"\5\uffff\1\15\1\16\1\20\1\21\1\uffff\1\13\1\23";
	static final String DFA6_specialS =
		"\67\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\23\2\uffff\1\23\22\uffff\1\23\7\uffff\1\1\1\2\1\3\1\4\1\uffff\1\5"+
			"\1\uffff\1\6\12\22\1\uffff\1\7\1\uffff\1\10\3\uffff\32\21\4\uffff\1\21"+
			"\1\uffff\4\21\1\17\1\13\2\21\1\14\3\21\1\15\10\21\1\16\1\20\3\21\1\11"+
			"\1\uffff\1\12",
			"",
			"",
			"",
			"",
			"",
			"\1\24",
			"",
			"",
			"",
			"",
			"\1\26\2\uffff\1\27",
			"\1\31\7\uffff\1\30",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"",
			"\1\37\1\uffff\12\22",
			"",
			"",
			"",
			"\1\40",
			"\1\41",
			"\1\42",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"",
			"",
			"\1\50",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\62\17\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"\1\64",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			"",
			"",
			"",
			"\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | FLOAT | INT | MAIN | VOID | IF | ELSEIF | ELSE | FOR | WHILE | Identifier | Integer_constant | Floating_point_constant | WS | COMMENT );";
		}
	}

}
