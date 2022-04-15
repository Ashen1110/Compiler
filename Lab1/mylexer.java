// $ANTLR 3.5.2 mylexer.g 2022-04-15 15:50:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mylexer extends Lexer {
	public static final int EOF=-1;
	public static final int BOOLEAN_TYPE=4;
	public static final int BREAK_FUN=5;
	public static final int CHAR_TYPE=6;
	public static final int COMMENT1=7;
	public static final int COMMENT2=8;
	public static final int CONTINUE_FUN=9;
	public static final int DEC_NUM=10;
	public static final int DEFAULT=11;
	public static final int DEFINE_FUN=12;
	public static final int DIGIT=13;
	public static final int DOUBLE_TYPE=14;
	public static final int DO_FUN=15;
	public static final int ELSE_FUN=16;
	public static final int EQ_OP=17;
	public static final int FALSE_TYPE=18;
	public static final int FLOAT_NUM=19;
	public static final int FLOAT_NUM1=20;
	public static final int FLOAT_NUM2=21;
	public static final int FLOAT_NUM3=22;
	public static final int FLOAT_TYPE=23;
	public static final int FOR_FUN=24;
	public static final int GE_OP=25;
	public static final int HEADER=26;
	public static final int ID=27;
	public static final int IF_FUN=28;
	public static final int INCLUDE_FUN=29;
	public static final int INT_TYPE=30;
	public static final int LETTER=31;
	public static final int LE_OP=32;
	public static final int LONG_TYPE=33;
	public static final int LSHIFT_OP=34;
	public static final int MAIN_FUN=35;
	public static final int MM_OP=36;
	public static final int NEW_LINE=37;
	public static final int NE_OP=38;
	public static final int PP_OP=39;
	public static final int PRINT_FUN=40;
	public static final int RETURN_FUN=41;
	public static final int RSHIFT_OP=42;
	public static final int SCAN_FUN=43;
	public static final int SHORT_TYPE=44;
	public static final int SIGNED_TYPE=45;
	public static final int SIZE_FUN=46;
	public static final int STRING=47;
	public static final int STRINGSTREAM=48;
	public static final int STRING_TYPE=49;
	public static final int STRUCTURE_TYPE=50;
	public static final int SWITCH_CASE=51;
	public static final int SWITCH_FUN=52;
	public static final int TRUE_TYPE=53;
	public static final int T_ADD=54;
	public static final int T_ADDRRESS=55;
	public static final int T_APOSTROPHE=56;
	public static final int T_ASSIGN=57;
	public static final int T_AUTO=58;
	public static final int T_CHAR=59;
	public static final int T_COMMO=60;
	public static final int T_DECIMAL=61;
	public static final int T_DIV=62;
	public static final int T_DOT=63;
	public static final int T_END=64;
	public static final int T_EXTERN=65;
	public static final int T_FLOAT=66;
	public static final int T_HASHTAG=67;
	public static final int T_LPAREN=68;
	public static final int T_LT=69;
	public static final int T_Lbracket=70;
	public static final int T_Lsquare=71;
	public static final int T_MARK=72;
	public static final int T_MOD=73;
	public static final int T_MT=74;
	public static final int T_MUL=75;
	public static final int T_QUESTION=76;
	public static final int T_RPAREN=77;
	public static final int T_Rbracket=78;
	public static final int T_Rsquare=79;
	public static final int T_STATIC=80;
	public static final int T_STRING=81;
	public static final int T_SUB=82;
	public static final int T_colon=83;
	public static final int UNION_TYPE=84;
	public static final int UNSIGNED_TYPE=85;
	public static final int VOID_TYPE=86;
	public static final int WHILE_FUN=87;
	public static final int WS=88;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mylexer() {} 
	public mylexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mylexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "mylexer.g"; }

	// $ANTLR start "HEADER"
	public final void mHEADER() throws RecognitionException {
		try {
			int _type = HEADER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:10:7: ( '<' ( LETTER ) ( LETTER | DIGIT )* '.' ( LETTER ) '>' )
			// mylexer.g:10:9: '<' ( LETTER ) ( LETTER | DIGIT )* '.' ( LETTER ) '>'
			{
			match('<'); 
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:10:20: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// mylexer.g:
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

			match('.'); 
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEADER"

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:15:11: ( 'int' )
			// mylexer.g:15:13: 'int'
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
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:16:11: ( 'char' )
			// mylexer.g:16:13: 'char'
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
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:17:11: ( 'void' )
			// mylexer.g:17:13: 'void'
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
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:18:11: ( 'float' )
			// mylexer.g:18:13: 'float'
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
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "DOUBLE_TYPE"
	public final void mDOUBLE_TYPE() throws RecognitionException {
		try {
			int _type = DOUBLE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:19:12: ( 'double' )
			// mylexer.g:19:14: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_TYPE"

	// $ANTLR start "SIGNED_TYPE"
	public final void mSIGNED_TYPE() throws RecognitionException {
		try {
			int _type = SIGNED_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:20:12: ( 'signed' )
			// mylexer.g:20:14: 'signed'
			{
			match("signed"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGNED_TYPE"

	// $ANTLR start "UNSIGNED_TYPE"
	public final void mUNSIGNED_TYPE() throws RecognitionException {
		try {
			int _type = UNSIGNED_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:21:14: ( 'unsigned' )
			// mylexer.g:21:16: 'unsigned'
			{
			match("unsigned"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNSIGNED_TYPE"

	// $ANTLR start "BOOLEAN_TYPE"
	public final void mBOOLEAN_TYPE() throws RecognitionException {
		try {
			int _type = BOOLEAN_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:22:13: ( 'bool' )
			// mylexer.g:22:15: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN_TYPE"

	// $ANTLR start "STRING_TYPE"
	public final void mSTRING_TYPE() throws RecognitionException {
		try {
			int _type = STRING_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:23:12: ( 'string' )
			// mylexer.g:23:14: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_TYPE"

	// $ANTLR start "STRUCTURE_TYPE"
	public final void mSTRUCTURE_TYPE() throws RecognitionException {
		try {
			int _type = STRUCTURE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:24:15: ( 'struct' )
			// mylexer.g:24:17: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRUCTURE_TYPE"

	// $ANTLR start "UNION_TYPE"
	public final void mUNION_TYPE() throws RecognitionException {
		try {
			int _type = UNION_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:25:11: ( 'union' )
			// mylexer.g:25:13: 'union'
			{
			match("union"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNION_TYPE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:26:10: ( 'long' )
			// mylexer.g:26:12: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "SHORT_TYPE"
	public final void mSHORT_TYPE() throws RecognitionException {
		try {
			int _type = SHORT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:27:11: ( 'short' )
			// mylexer.g:27:13: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT_TYPE"

	// $ANTLR start "TRUE_TYPE"
	public final void mTRUE_TYPE() throws RecognitionException {
		try {
			int _type = TRUE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:28:10: ( 'true' )
			// mylexer.g:28:12: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE_TYPE"

	// $ANTLR start "FALSE_TYPE"
	public final void mFALSE_TYPE() throws RecognitionException {
		try {
			int _type = FALSE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:29:11: ( 'false' )
			// mylexer.g:29:13: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE_TYPE"

	// $ANTLR start "STRINGSTREAM"
	public final void mSTRINGSTREAM() throws RecognitionException {
		try {
			int _type = STRINGSTREAM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:30:13: ( 'stringstream' )
			// mylexer.g:30:15: 'stringstream'
			{
			match("stringstream"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGSTREAM"

	// $ANTLR start "T_AUTO"
	public final void mT_AUTO() throws RecognitionException {
		try {
			int _type = T_AUTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:35:7: ( 'auto' )
			// mylexer.g:35:9: 'auto'
			{
			match("auto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_AUTO"

	// $ANTLR start "T_STATIC"
	public final void mT_STATIC() throws RecognitionException {
		try {
			int _type = T_STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:36:9: ( 'static' )
			// mylexer.g:36:11: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_STATIC"

	// $ANTLR start "T_EXTERN"
	public final void mT_EXTERN() throws RecognitionException {
		try {
			int _type = T_EXTERN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:37:9: ( 'extern' )
			// mylexer.g:37:11: 'extern'
			{
			match("extern"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_EXTERN"

	// $ANTLR start "T_DECIMAL"
	public final void mT_DECIMAL() throws RecognitionException {
		try {
			int _type = T_DECIMAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:42:10: ( '%d' )
			// mylexer.g:42:12: '%d'
			{
			match("%d"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_DECIMAL"

	// $ANTLR start "T_CHAR"
	public final void mT_CHAR() throws RecognitionException {
		try {
			int _type = T_CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:43:7: ( '%c' )
			// mylexer.g:43:9: '%c'
			{
			match("%c"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_CHAR"

	// $ANTLR start "T_STRING"
	public final void mT_STRING() throws RecognitionException {
		try {
			int _type = T_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:44:9: ( '%s' )
			// mylexer.g:44:11: '%s'
			{
			match("%s"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_STRING"

	// $ANTLR start "T_FLOAT"
	public final void mT_FLOAT() throws RecognitionException {
		try {
			int _type = T_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:45:8: ( '%f' )
			// mylexer.g:45:10: '%f'
			{
			match("%f"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_FLOAT"

	// $ANTLR start "T_END"
	public final void mT_END() throws RecognitionException {
		try {
			int _type = T_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:50:6: ( ';' )
			// mylexer.g:50:8: ';'
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
	// $ANTLR end "T_END"

	// $ANTLR start "T_colon"
	public final void mT_colon() throws RecognitionException {
		try {
			int _type = T_colon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:51:8: ( ':' )
			// mylexer.g:51:10: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_colon"

	// $ANTLR start "T_HASHTAG"
	public final void mT_HASHTAG() throws RecognitionException {
		try {
			int _type = T_HASHTAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:52:10: ( '#' )
			// mylexer.g:52:12: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_HASHTAG"

	// $ANTLR start "T_LPAREN"
	public final void mT_LPAREN() throws RecognitionException {
		try {
			int _type = T_LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:53:9: ( '(' )
			// mylexer.g:53:11: '('
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
	// $ANTLR end "T_LPAREN"

	// $ANTLR start "T_RPAREN"
	public final void mT_RPAREN() throws RecognitionException {
		try {
			int _type = T_RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:54:9: ( ')' )
			// mylexer.g:54:11: ')'
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
	// $ANTLR end "T_RPAREN"

	// $ANTLR start "T_Lbracket"
	public final void mT_Lbracket() throws RecognitionException {
		try {
			int _type = T_Lbracket;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:55:11: ( '{' )
			// mylexer.g:55:13: '{'
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
	// $ANTLR end "T_Lbracket"

	// $ANTLR start "T_Rbracket"
	public final void mT_Rbracket() throws RecognitionException {
		try {
			int _type = T_Rbracket;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:56:11: ( '}' )
			// mylexer.g:56:13: '}'
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
	// $ANTLR end "T_Rbracket"

	// $ANTLR start "T_Lsquare"
	public final void mT_Lsquare() throws RecognitionException {
		try {
			int _type = T_Lsquare;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:57:10: ( '[' )
			// mylexer.g:57:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_Lsquare"

	// $ANTLR start "T_Rsquare"
	public final void mT_Rsquare() throws RecognitionException {
		try {
			int _type = T_Rsquare;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:58:10: ( ']' )
			// mylexer.g:58:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_Rsquare"

	// $ANTLR start "T_ADDRRESS"
	public final void mT_ADDRRESS() throws RecognitionException {
		try {
			int _type = T_ADDRRESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:59:11: ( '&' )
			// mylexer.g:59:13: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_ADDRRESS"

	// $ANTLR start "T_LT"
	public final void mT_LT() throws RecognitionException {
		try {
			int _type = T_LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:60:5: ( '<' )
			// mylexer.g:60:7: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_LT"

	// $ANTLR start "T_MT"
	public final void mT_MT() throws RecognitionException {
		try {
			int _type = T_MT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:61:5: ( '>' )
			// mylexer.g:61:7: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_MT"

	// $ANTLR start "T_DOT"
	public final void mT_DOT() throws RecognitionException {
		try {
			int _type = T_DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:62:6: ( '.' )
			// mylexer.g:62:8: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_DOT"

	// $ANTLR start "T_QUESTION"
	public final void mT_QUESTION() throws RecognitionException {
		try {
			int _type = T_QUESTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:63:11: ( '?' )
			// mylexer.g:63:13: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_QUESTION"

	// $ANTLR start "T_MARK"
	public final void mT_MARK() throws RecognitionException {
		try {
			int _type = T_MARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:64:7: ( '\"' )
			// mylexer.g:64:9: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_MARK"

	// $ANTLR start "T_COMMO"
	public final void mT_COMMO() throws RecognitionException {
		try {
			int _type = T_COMMO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:65:8: ( ',' )
			// mylexer.g:65:10: ','
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
	// $ANTLR end "T_COMMO"

	// $ANTLR start "T_APOSTROPHE"
	public final void mT_APOSTROPHE() throws RecognitionException {
		try {
			int _type = T_APOSTROPHE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:66:13: ( '\\'' )
			// mylexer.g:66:15: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_APOSTROPHE"

	// $ANTLR start "T_ADD"
	public final void mT_ADD() throws RecognitionException {
		try {
			int _type = T_ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:71:6: ( '+' )
			// mylexer.g:71:8: '+'
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
	// $ANTLR end "T_ADD"

	// $ANTLR start "T_SUB"
	public final void mT_SUB() throws RecognitionException {
		try {
			int _type = T_SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:72:6: ( '-' )
			// mylexer.g:72:8: '-'
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
	// $ANTLR end "T_SUB"

	// $ANTLR start "T_MUL"
	public final void mT_MUL() throws RecognitionException {
		try {
			int _type = T_MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:73:6: ( '*' )
			// mylexer.g:73:8: '*'
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
	// $ANTLR end "T_MUL"

	// $ANTLR start "T_DIV"
	public final void mT_DIV() throws RecognitionException {
		try {
			int _type = T_DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:74:6: ( '/' )
			// mylexer.g:74:8: '/'
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
	// $ANTLR end "T_DIV"

	// $ANTLR start "T_MOD"
	public final void mT_MOD() throws RecognitionException {
		try {
			int _type = T_MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:75:6: ( '%' )
			// mylexer.g:75:8: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_MOD"

	// $ANTLR start "T_ASSIGN"
	public final void mT_ASSIGN() throws RecognitionException {
		try {
			int _type = T_ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:76:9: ( '=' )
			// mylexer.g:76:11: '='
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
	// $ANTLR end "T_ASSIGN"

	// $ANTLR start "INCLUDE_FUN"
	public final void mINCLUDE_FUN() throws RecognitionException {
		try {
			int _type = INCLUDE_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:81:12: ( 'include' )
			// mylexer.g:81:14: 'include'
			{
			match("include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE_FUN"

	// $ANTLR start "DEFINE_FUN"
	public final void mDEFINE_FUN() throws RecognitionException {
		try {
			int _type = DEFINE_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:82:11: ( 'define' )
			// mylexer.g:82:13: 'define'
			{
			match("define"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFINE_FUN"

	// $ANTLR start "MAIN_FUN"
	public final void mMAIN_FUN() throws RecognitionException {
		try {
			int _type = MAIN_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:83:9: ( 'main' )
			// mylexer.g:83:11: 'main'
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
	// $ANTLR end "MAIN_FUN"

	// $ANTLR start "SCAN_FUN"
	public final void mSCAN_FUN() throws RecognitionException {
		try {
			int _type = SCAN_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:84:9: ( 'scanf' )
			// mylexer.g:84:11: 'scanf'
			{
			match("scanf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCAN_FUN"

	// $ANTLR start "PRINT_FUN"
	public final void mPRINT_FUN() throws RecognitionException {
		try {
			int _type = PRINT_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:85:10: ( 'printf' )
			// mylexer.g:85:12: 'printf'
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
	// $ANTLR end "PRINT_FUN"

	// $ANTLR start "WHILE_FUN"
	public final void mWHILE_FUN() throws RecognitionException {
		try {
			int _type = WHILE_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:86:10: ( 'while' )
			// mylexer.g:86:12: 'while'
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
	// $ANTLR end "WHILE_FUN"

	// $ANTLR start "FOR_FUN"
	public final void mFOR_FUN() throws RecognitionException {
		try {
			int _type = FOR_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:87:8: ( 'for' )
			// mylexer.g:87:10: 'for'
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
	// $ANTLR end "FOR_FUN"

	// $ANTLR start "IF_FUN"
	public final void mIF_FUN() throws RecognitionException {
		try {
			int _type = IF_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:88:7: ( 'if' )
			// mylexer.g:88:9: 'if'
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
	// $ANTLR end "IF_FUN"

	// $ANTLR start "ELSE_FUN"
	public final void mELSE_FUN() throws RecognitionException {
		try {
			int _type = ELSE_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:89:9: ( 'else' )
			// mylexer.g:89:11: 'else'
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
	// $ANTLR end "ELSE_FUN"

	// $ANTLR start "BREAK_FUN"
	public final void mBREAK_FUN() throws RecognitionException {
		try {
			int _type = BREAK_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:90:10: ( 'break' )
			// mylexer.g:90:12: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK_FUN"

	// $ANTLR start "CONTINUE_FUN"
	public final void mCONTINUE_FUN() throws RecognitionException {
		try {
			int _type = CONTINUE_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:91:13: ( 'continue' )
			// mylexer.g:91:15: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE_FUN"

	// $ANTLR start "RETURN_FUN"
	public final void mRETURN_FUN() throws RecognitionException {
		try {
			int _type = RETURN_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:92:11: ( 'return' )
			// mylexer.g:92:13: 'return'
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
	// $ANTLR end "RETURN_FUN"

	// $ANTLR start "DO_FUN"
	public final void mDO_FUN() throws RecognitionException {
		try {
			int _type = DO_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:93:7: ( 'do' )
			// mylexer.g:93:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO_FUN"

	// $ANTLR start "SWITCH_FUN"
	public final void mSWITCH_FUN() throws RecognitionException {
		try {
			int _type = SWITCH_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:94:11: ( 'switch' )
			// mylexer.g:94:13: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH_FUN"

	// $ANTLR start "SWITCH_CASE"
	public final void mSWITCH_CASE() throws RecognitionException {
		try {
			int _type = SWITCH_CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:95:12: ( 'case' )
			// mylexer.g:95:14: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH_CASE"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:96:8: ( 'default' )
			// mylexer.g:96:10: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "SIZE_FUN"
	public final void mSIZE_FUN() throws RecognitionException {
		try {
			int _type = SIZE_FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:97:9: ( 'sizeof' )
			// mylexer.g:97:11: 'sizeof'
			{
			match("sizeof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIZE_FUN"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:104:7: ( '==' )
			// mylexer.g:104:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:105:7: ( '<=' )
			// mylexer.g:105:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:106:7: ( '>=' )
			// mylexer.g:106:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:107:7: ( '!=' )
			// mylexer.g:107:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:108:7: ( '++' )
			// mylexer.g:108:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:109:7: ( '--' )
			// mylexer.g:109:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MM_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:110:11: ( '<<' )
			// mylexer.g:110:13: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:111:11: ( '>>' )
			// mylexer.g:111:13: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:114:9: ( '\\n' )
			// mylexer.g:114:11: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:115:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// mylexer.g:115:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// mylexer.g:115:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='0') ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// mylexer.g:115:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// mylexer.g:115:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// mylexer.g:115:28: ( DIGIT )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// mylexer.g:
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
							break loop2;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:117:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// mylexer.g:117:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:117:14: ( LETTER | DIGIT )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// mylexer.g:
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
					break loop4;
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
	// $ANTLR end "ID"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:118:7: ( '\"' ( options {greedy=false; } : . )* '\"' )
			// mylexer.g:118:9: '\"' ( options {greedy=false; } : . )* '\"'
			{
			match('\"'); 
			// mylexer.g:118:12: ( options {greedy=false; } : . )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\"') ) {
					alt5=2;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// mylexer.g:118:39: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop5;
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
	// $ANTLR end "STRING"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:120:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt6=3;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// mylexer.g:120:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// mylexer.g:120:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// mylexer.g:120:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

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
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// mylexer.g:121:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// mylexer.g:121:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// mylexer.g:121:22: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// mylexer.g:
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			match('.'); 
			// mylexer.g:121:33: ( DIGIT )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// mylexer.g:
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
					break loop8;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// mylexer.g:122:20: ( '.' ( DIGIT )+ )
			// mylexer.g:122:22: '.' ( DIGIT )+
			{
			match('.'); 
			// mylexer.g:122:25: ( DIGIT )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// mylexer.g:
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
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// mylexer.g:123:20: ( ( DIGIT )+ )
			// mylexer.g:123:22: ( DIGIT )+
			{
			// mylexer.g:123:22: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// mylexer.g:
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
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:126:10: ( '//' ( . )* '\\n' )
			// mylexer.g:126:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// mylexer.g:126:16: ( . )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='\n') ) {
					alt11=2;
				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// mylexer.g:126:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop11;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:127:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// mylexer.g:127:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// mylexer.g:127:17: ( options {greedy=false; } : . )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='*') ) {
					int LA12_1 = input.LA(2);
					if ( (LA12_1=='/') ) {
						alt12=2;
					}
					else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
						alt12=1;
					}

				}
				else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// mylexer.g:127:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop12;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// mylexer.g:130:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// mylexer.g:131:16: ( '0' .. '9' )
			// mylexer.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:134:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// mylexer.g:134:7: ( ' ' | '\\r' | '\\t' )+
			{
			// mylexer.g:134:7: ( ' ' | '\\r' | '\\t' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='\t'||LA13_0=='\r'||LA13_0==' ') ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// mylexer.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// mylexer.g:1:8: ( HEADER | INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | DOUBLE_TYPE | SIGNED_TYPE | UNSIGNED_TYPE | BOOLEAN_TYPE | STRING_TYPE | STRUCTURE_TYPE | UNION_TYPE | LONG_TYPE | SHORT_TYPE | TRUE_TYPE | FALSE_TYPE | STRINGSTREAM | T_AUTO | T_STATIC | T_EXTERN | T_DECIMAL | T_CHAR | T_STRING | T_FLOAT | T_END | T_colon | T_HASHTAG | T_LPAREN | T_RPAREN | T_Lbracket | T_Rbracket | T_Lsquare | T_Rsquare | T_ADDRRESS | T_LT | T_MT | T_DOT | T_QUESTION | T_MARK | T_COMMO | T_APOSTROPHE | T_ADD | T_SUB | T_MUL | T_DIV | T_MOD | T_ASSIGN | INCLUDE_FUN | DEFINE_FUN | MAIN_FUN | SCAN_FUN | PRINT_FUN | WHILE_FUN | FOR_FUN | IF_FUN | ELSE_FUN | BREAK_FUN | CONTINUE_FUN | RETURN_FUN | DO_FUN | SWITCH_FUN | SWITCH_CASE | DEFAULT | SIZE_FUN | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | NEW_LINE | DEC_NUM | ID | STRING | FLOAT_NUM | COMMENT1 | COMMENT2 | WS )
		int alt14=80;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// mylexer.g:1:10: HEADER
				{
				mHEADER(); 

				}
				break;
			case 2 :
				// mylexer.g:1:17: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 3 :
				// mylexer.g:1:26: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 4 :
				// mylexer.g:1:36: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 5 :
				// mylexer.g:1:46: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 6 :
				// mylexer.g:1:57: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 7 :
				// mylexer.g:1:69: SIGNED_TYPE
				{
				mSIGNED_TYPE(); 

				}
				break;
			case 8 :
				// mylexer.g:1:81: UNSIGNED_TYPE
				{
				mUNSIGNED_TYPE(); 

				}
				break;
			case 9 :
				// mylexer.g:1:95: BOOLEAN_TYPE
				{
				mBOOLEAN_TYPE(); 

				}
				break;
			case 10 :
				// mylexer.g:1:108: STRING_TYPE
				{
				mSTRING_TYPE(); 

				}
				break;
			case 11 :
				// mylexer.g:1:120: STRUCTURE_TYPE
				{
				mSTRUCTURE_TYPE(); 

				}
				break;
			case 12 :
				// mylexer.g:1:135: UNION_TYPE
				{
				mUNION_TYPE(); 

				}
				break;
			case 13 :
				// mylexer.g:1:146: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 14 :
				// mylexer.g:1:156: SHORT_TYPE
				{
				mSHORT_TYPE(); 

				}
				break;
			case 15 :
				// mylexer.g:1:167: TRUE_TYPE
				{
				mTRUE_TYPE(); 

				}
				break;
			case 16 :
				// mylexer.g:1:177: FALSE_TYPE
				{
				mFALSE_TYPE(); 

				}
				break;
			case 17 :
				// mylexer.g:1:188: STRINGSTREAM
				{
				mSTRINGSTREAM(); 

				}
				break;
			case 18 :
				// mylexer.g:1:201: T_AUTO
				{
				mT_AUTO(); 

				}
				break;
			case 19 :
				// mylexer.g:1:208: T_STATIC
				{
				mT_STATIC(); 

				}
				break;
			case 20 :
				// mylexer.g:1:217: T_EXTERN
				{
				mT_EXTERN(); 

				}
				break;
			case 21 :
				// mylexer.g:1:226: T_DECIMAL
				{
				mT_DECIMAL(); 

				}
				break;
			case 22 :
				// mylexer.g:1:236: T_CHAR
				{
				mT_CHAR(); 

				}
				break;
			case 23 :
				// mylexer.g:1:243: T_STRING
				{
				mT_STRING(); 

				}
				break;
			case 24 :
				// mylexer.g:1:252: T_FLOAT
				{
				mT_FLOAT(); 

				}
				break;
			case 25 :
				// mylexer.g:1:260: T_END
				{
				mT_END(); 

				}
				break;
			case 26 :
				// mylexer.g:1:266: T_colon
				{
				mT_colon(); 

				}
				break;
			case 27 :
				// mylexer.g:1:274: T_HASHTAG
				{
				mT_HASHTAG(); 

				}
				break;
			case 28 :
				// mylexer.g:1:284: T_LPAREN
				{
				mT_LPAREN(); 

				}
				break;
			case 29 :
				// mylexer.g:1:293: T_RPAREN
				{
				mT_RPAREN(); 

				}
				break;
			case 30 :
				// mylexer.g:1:302: T_Lbracket
				{
				mT_Lbracket(); 

				}
				break;
			case 31 :
				// mylexer.g:1:313: T_Rbracket
				{
				mT_Rbracket(); 

				}
				break;
			case 32 :
				// mylexer.g:1:324: T_Lsquare
				{
				mT_Lsquare(); 

				}
				break;
			case 33 :
				// mylexer.g:1:334: T_Rsquare
				{
				mT_Rsquare(); 

				}
				break;
			case 34 :
				// mylexer.g:1:344: T_ADDRRESS
				{
				mT_ADDRRESS(); 

				}
				break;
			case 35 :
				// mylexer.g:1:355: T_LT
				{
				mT_LT(); 

				}
				break;
			case 36 :
				// mylexer.g:1:360: T_MT
				{
				mT_MT(); 

				}
				break;
			case 37 :
				// mylexer.g:1:365: T_DOT
				{
				mT_DOT(); 

				}
				break;
			case 38 :
				// mylexer.g:1:371: T_QUESTION
				{
				mT_QUESTION(); 

				}
				break;
			case 39 :
				// mylexer.g:1:382: T_MARK
				{
				mT_MARK(); 

				}
				break;
			case 40 :
				// mylexer.g:1:389: T_COMMO
				{
				mT_COMMO(); 

				}
				break;
			case 41 :
				// mylexer.g:1:397: T_APOSTROPHE
				{
				mT_APOSTROPHE(); 

				}
				break;
			case 42 :
				// mylexer.g:1:410: T_ADD
				{
				mT_ADD(); 

				}
				break;
			case 43 :
				// mylexer.g:1:416: T_SUB
				{
				mT_SUB(); 

				}
				break;
			case 44 :
				// mylexer.g:1:422: T_MUL
				{
				mT_MUL(); 

				}
				break;
			case 45 :
				// mylexer.g:1:428: T_DIV
				{
				mT_DIV(); 

				}
				break;
			case 46 :
				// mylexer.g:1:434: T_MOD
				{
				mT_MOD(); 

				}
				break;
			case 47 :
				// mylexer.g:1:440: T_ASSIGN
				{
				mT_ASSIGN(); 

				}
				break;
			case 48 :
				// mylexer.g:1:449: INCLUDE_FUN
				{
				mINCLUDE_FUN(); 

				}
				break;
			case 49 :
				// mylexer.g:1:461: DEFINE_FUN
				{
				mDEFINE_FUN(); 

				}
				break;
			case 50 :
				// mylexer.g:1:472: MAIN_FUN
				{
				mMAIN_FUN(); 

				}
				break;
			case 51 :
				// mylexer.g:1:481: SCAN_FUN
				{
				mSCAN_FUN(); 

				}
				break;
			case 52 :
				// mylexer.g:1:490: PRINT_FUN
				{
				mPRINT_FUN(); 

				}
				break;
			case 53 :
				// mylexer.g:1:500: WHILE_FUN
				{
				mWHILE_FUN(); 

				}
				break;
			case 54 :
				// mylexer.g:1:510: FOR_FUN
				{
				mFOR_FUN(); 

				}
				break;
			case 55 :
				// mylexer.g:1:518: IF_FUN
				{
				mIF_FUN(); 

				}
				break;
			case 56 :
				// mylexer.g:1:525: ELSE_FUN
				{
				mELSE_FUN(); 

				}
				break;
			case 57 :
				// mylexer.g:1:534: BREAK_FUN
				{
				mBREAK_FUN(); 

				}
				break;
			case 58 :
				// mylexer.g:1:544: CONTINUE_FUN
				{
				mCONTINUE_FUN(); 

				}
				break;
			case 59 :
				// mylexer.g:1:557: RETURN_FUN
				{
				mRETURN_FUN(); 

				}
				break;
			case 60 :
				// mylexer.g:1:568: DO_FUN
				{
				mDO_FUN(); 

				}
				break;
			case 61 :
				// mylexer.g:1:575: SWITCH_FUN
				{
				mSWITCH_FUN(); 

				}
				break;
			case 62 :
				// mylexer.g:1:586: SWITCH_CASE
				{
				mSWITCH_CASE(); 

				}
				break;
			case 63 :
				// mylexer.g:1:598: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 64 :
				// mylexer.g:1:606: SIZE_FUN
				{
				mSIZE_FUN(); 

				}
				break;
			case 65 :
				// mylexer.g:1:615: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 66 :
				// mylexer.g:1:621: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 67 :
				// mylexer.g:1:627: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 68 :
				// mylexer.g:1:633: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 69 :
				// mylexer.g:1:639: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 70 :
				// mylexer.g:1:645: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 71 :
				// mylexer.g:1:651: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 72 :
				// mylexer.g:1:661: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 73 :
				// mylexer.g:1:671: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 74 :
				// mylexer.g:1:680: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 75 :
				// mylexer.g:1:688: ID
				{
				mID(); 

				}
				break;
			case 76 :
				// mylexer.g:1:691: STRING
				{
				mSTRING(); 

				}
				break;
			case 77 :
				// mylexer.g:1:698: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 78 :
				// mylexer.g:1:708: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 79 :
				// mylexer.g:1:717: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 80 :
				// mylexer.g:1:726: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA6_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA6_eofS =
		"\5\uffff";
	static final String DFA6_minS =
		"\2\56\3\uffff";
	static final String DFA6_maxS =
		"\2\71\3\uffff";
	static final String DFA6_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA6_specialS =
		"\5\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
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
			return "120:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA14_eotS =
		"\1\uffff\1\61\14\54\1\116\12\uffff\1\121\1\122\1\uffff\1\124\2\uffff\1"+
		"\127\1\131\1\uffff\1\134\1\136\4\54\2\uffff\2\143\6\uffff\1\54\1\147\7"+
		"\54\1\160\16\54\25\uffff\4\54\1\uffff\1\143\1\u0086\1\54\1\uffff\6\54"+
		"\1\u008e\1\54\1\uffff\25\54\1\uffff\1\54\1\u00a8\1\54\1\u00aa\1\u00ab"+
		"\2\54\1\uffff\15\54\1\u00bb\1\54\1\u00bd\1\u00be\1\u00bf\1\54\1\u00c1"+
		"\1\u00c2\4\54\1\uffff\1\54\2\uffff\1\u00c8\1\u00c9\10\54\1\u00d2\1\u00d3"+
		"\2\54\1\u00d6\1\uffff\1\u00d7\3\uffff\1\54\2\uffff\1\54\1\u00da\3\54\2"+
		"\uffff\1\u00de\1\u00df\1\54\1\u00e1\1\u00e2\1\u00e4\1\u00e5\1\u00e6\2"+
		"\uffff\1\u00e7\1\54\2\uffff\1\u00e9\1\u00ea\1\uffff\1\u00eb\1\u00ec\1"+
		"\54\2\uffff\1\u00ee\2\uffff\1\54\4\uffff\1\54\4\uffff\1\u00f1\1\uffff"+
		"\1\54\1\u00f3\1\uffff\1\54\1\uffff\2\54\1\u00f7\1\uffff";
	static final String DFA14_eofS =
		"\u00f8\uffff";
	static final String DFA14_minS =
		"\1\11\1\74\1\146\1\141\1\157\1\141\1\145\1\143\1\156\2\157\1\162\1\165"+
		"\1\154\1\143\12\uffff\1\75\1\60\1\uffff\1\0\2\uffff\1\53\1\55\1\uffff"+
		"\1\52\1\75\1\141\1\162\1\150\1\145\2\uffff\2\56\6\uffff\1\143\1\60\1\141"+
		"\1\156\1\163\1\151\1\157\1\154\1\162\1\60\1\146\1\147\1\141\1\157\1\141"+
		"\2\151\1\157\1\145\1\156\1\165\2\164\1\163\25\uffff\3\151\1\164\1\uffff"+
		"\1\56\1\60\1\154\1\uffff\1\162\1\164\1\145\1\144\1\141\1\163\1\60\1\142"+
		"\1\uffff\1\141\1\156\1\145\1\151\1\164\1\162\1\156\1\164\1\151\1\157\1"+
		"\154\1\141\1\147\1\145\1\157\2\145\2\156\1\154\1\165\1\uffff\1\165\1\60"+
		"\1\151\2\60\1\164\1\145\1\uffff\1\154\1\156\1\165\1\145\1\157\1\156\1"+
		"\143\1\151\1\164\1\146\1\143\1\147\1\156\1\60\1\153\3\60\1\162\2\60\1"+
		"\164\1\145\1\162\1\144\1\uffff\1\156\2\uffff\2\60\2\145\1\154\1\144\1"+
		"\146\1\147\1\164\1\143\2\60\1\150\1\156\1\60\1\uffff\1\60\3\uffff\1\156"+
		"\2\uffff\1\146\1\60\1\156\1\145\1\165\2\uffff\2\60\1\164\5\60\2\uffff"+
		"\1\60\1\145\2\uffff\2\60\1\uffff\2\60\1\145\2\uffff\1\60\2\uffff\1\164"+
		"\4\uffff\1\144\4\uffff\1\60\1\uffff\1\162\1\60\1\uffff\1\145\1\uffff\1"+
		"\141\1\155\1\60\1\uffff";
	static final String DFA14_maxS =
		"\1\175\1\172\1\156\4\157\1\167\1\156\1\162\1\157\1\162\1\165\1\170\1\163"+
		"\12\uffff\1\76\1\71\1\uffff\1\uffff\2\uffff\1\53\1\55\1\uffff\1\57\1\75"+
		"\1\141\1\162\1\150\1\145\2\uffff\2\71\6\uffff\1\164\1\172\1\141\1\156"+
		"\1\163\1\151\1\157\1\154\1\162\1\172\1\146\1\172\1\162\1\157\1\141\1\151"+
		"\1\163\1\157\1\145\1\156\1\165\2\164\1\163\25\uffff\3\151\1\164\1\uffff"+
		"\1\71\1\172\1\154\1\uffff\1\162\1\164\1\145\1\144\1\141\1\163\1\172\1"+
		"\142\1\uffff\1\151\1\156\1\145\1\165\1\164\1\162\1\156\1\164\1\151\1\157"+
		"\1\154\1\141\1\147\1\145\1\157\2\145\2\156\1\154\1\165\1\uffff\1\165\1"+
		"\172\1\151\2\172\1\164\1\145\1\uffff\1\154\1\156\1\165\1\145\1\157\1\156"+
		"\1\143\1\151\1\164\1\146\1\143\1\147\1\156\1\172\1\153\3\172\1\162\2\172"+
		"\1\164\1\145\1\162\1\144\1\uffff\1\156\2\uffff\2\172\2\145\1\154\1\144"+
		"\1\146\1\147\1\164\1\143\2\172\1\150\1\156\1\172\1\uffff\1\172\3\uffff"+
		"\1\156\2\uffff\1\146\1\172\1\156\1\145\1\165\2\uffff\2\172\1\164\5\172"+
		"\2\uffff\1\172\1\145\2\uffff\2\172\1\uffff\2\172\1\145\2\uffff\1\172\2"+
		"\uffff\1\164\4\uffff\1\144\4\uffff\1\172\1\uffff\1\162\1\172\1\uffff\1"+
		"\145\1\uffff\1\141\1\155\1\172\1\uffff";
	static final String DFA14_acceptS =
		"\17\uffff\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\2\uffff\1"+
		"\46\1\uffff\1\50\1\51\2\uffff\1\54\6\uffff\1\104\1\111\2\uffff\1\113\1"+
		"\120\1\1\1\102\1\107\1\43\30\uffff\1\25\1\26\1\27\1\30\1\56\1\103\1\110"+
		"\1\44\1\45\1\115\1\47\1\114\1\105\1\52\1\106\1\53\1\116\1\117\1\55\1\101"+
		"\1\57\4\uffff\1\112\3\uffff\1\67\10\uffff\1\74\25\uffff\1\2\7\uffff\1"+
		"\66\31\uffff\1\3\1\uffff\1\76\1\4\17\uffff\1\11\1\uffff\1\15\1\17\1\22"+
		"\1\uffff\1\70\1\62\5\uffff\1\5\1\20\10\uffff\1\16\1\63\2\uffff\1\14\1"+
		"\71\2\uffff\1\65\3\uffff\1\6\1\61\1\uffff\1\7\1\100\1\uffff\1\12\1\13"+
		"\1\23\1\75\1\uffff\1\24\1\64\1\73\1\60\1\uffff\1\77\2\uffff\1\72\1\uffff"+
		"\1\10\3\uffff\1\21";
	static final String DFA14_specialS =
		"\34\uffff\1\0\u00db\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\55\1\51\2\uffff\1\55\22\uffff\1\55\1\50\1\34\1\21\1\uffff\1\16\1\30"+
			"\1\36\1\22\1\23\1\41\1\37\1\35\1\40\1\32\1\42\1\52\11\53\1\20\1\17\1"+
			"\1\1\43\1\31\1\33\1\uffff\32\54\1\26\1\uffff\1\27\1\uffff\1\54\1\uffff"+
			"\1\14\1\11\1\3\1\6\1\15\1\5\2\54\1\2\2\54\1\12\1\44\2\54\1\45\1\54\1"+
			"\47\1\7\1\13\1\10\1\4\1\46\3\54\1\24\1\uffff\1\25",
			"\1\60\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\63\7\uffff\1\62",
			"\1\66\6\uffff\1\64\6\uffff\1\65",
			"\1\67",
			"\1\71\12\uffff\1\70\2\uffff\1\72",
			"\1\74\11\uffff\1\73",
			"\1\100\4\uffff\1\77\1\75\12\uffff\1\76\2\uffff\1\101",
			"\1\102",
			"\1\103\2\uffff\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\111\13\uffff\1\110",
			"\1\113\1\112\1\uffff\1\115\14\uffff\1\114",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\117\1\120",
			"\12\123",
			"",
			"\0\125",
			"",
			"",
			"\1\126",
			"\1\130",
			"",
			"\1\133\4\uffff\1\132",
			"\1\135",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"",
			"",
			"\1\123\1\uffff\12\123",
			"\1\123\1\uffff\12\144",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\146\20\uffff\1\145",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\24\54\1\157\5\54",
			"\1\161",
			"\1\162\22\uffff\1\163",
			"\1\165\20\uffff\1\164",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\172\11\uffff\1\171",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"",
			"\1\123\1\uffff\12\144",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0087",
			"",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u008f",
			"",
			"\1\u0091\7\uffff\1\u0090",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094\13\uffff\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"",
			"\1\u00a7",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00a9",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00ac",
			"\1\u00ad",
			"",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00bc",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00c0",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"",
			"\1\u00c7",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00d4",
			"\1\u00d5",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"",
			"\1\u00d8",
			"",
			"",
			"\1\u00d9",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00e0",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22\54\1\u00e3\7\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00e8",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00ed",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"\1\u00ef",
			"",
			"",
			"",
			"",
			"\1\u00f0",
			"",
			"",
			"",
			"",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u00f2",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u00f4",
			"",
			"\1\u00f5",
			"\1\u00f6",
			"\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( HEADER | INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | DOUBLE_TYPE | SIGNED_TYPE | UNSIGNED_TYPE | BOOLEAN_TYPE | STRING_TYPE | STRUCTURE_TYPE | UNION_TYPE | LONG_TYPE | SHORT_TYPE | TRUE_TYPE | FALSE_TYPE | STRINGSTREAM | T_AUTO | T_STATIC | T_EXTERN | T_DECIMAL | T_CHAR | T_STRING | T_FLOAT | T_END | T_colon | T_HASHTAG | T_LPAREN | T_RPAREN | T_Lbracket | T_Rbracket | T_Lsquare | T_Rsquare | T_ADDRRESS | T_LT | T_MT | T_DOT | T_QUESTION | T_MARK | T_COMMO | T_APOSTROPHE | T_ADD | T_SUB | T_MUL | T_DIV | T_MOD | T_ASSIGN | INCLUDE_FUN | DEFINE_FUN | MAIN_FUN | SCAN_FUN | PRINT_FUN | WHILE_FUN | FOR_FUN | IF_FUN | ELSE_FUN | BREAK_FUN | CONTINUE_FUN | RETURN_FUN | DO_FUN | SWITCH_FUN | SWITCH_CASE | DEFAULT | SIZE_FUN | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | NEW_LINE | DEC_NUM | ID | STRING | FLOAT_NUM | COMMENT1 | COMMENT2 | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA14_28 = input.LA(1);
						s = -1;
						if ( ((LA14_28 >= '\u0000' && LA14_28 <= '\uFFFF')) ) {s = 85;}
						else s = 84;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 14, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
