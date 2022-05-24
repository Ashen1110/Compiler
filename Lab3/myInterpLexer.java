// $ANTLR 3.5.2 myInterp.g 2022-05-24 12:33:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myInterpLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myInterpLexer() {} 
	public myInterpLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myInterpLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myInterp.g"; }

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:7:7: ( '&' )
			// myInterp.g:7:9: '&'
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:8:7: ( '(' )
			// myInterp.g:8:9: '('
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:9:7: ( ')' )
			// myInterp.g:9:9: ')'
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:10:7: ( '*' )
			// myInterp.g:10:9: '*'
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:11:7: ( '+' )
			// myInterp.g:11:9: '+'
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:12:7: ( ',' )
			// myInterp.g:12:9: ','
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
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:13:7: ( '-' )
			// myInterp.g:13:9: '-'
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
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:14:7: ( '/' )
			// myInterp.g:14:9: '/'
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
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:15:7: ( ';' )
			// myInterp.g:15:9: ';'
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
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:16:7: ( '\\%' )
			// myInterp.g:16:9: '\\%'
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
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:17:7: ( '{' )
			// myInterp.g:17:9: '{'
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
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:18:7: ( '}' )
			// myInterp.g:18:9: '}'
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
	// $ANTLR end "T__54"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:208:4: ( 'int' )
			// myInterp.g:208:6: 'int'
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
			// myInterp.g:209:5: ( 'char' )
			// myInterp.g:209:7: 'char'
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

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:210:5: ( 'void' )
			// myInterp.g:210:7: 'void'
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

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:211:6: ( 'float' )
			// myInterp.g:211:8: 'float'
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

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:212:7: ( 'double' )
			// myInterp.g:212:9: 'double'
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
	// $ANTLR end "DOUBLE"

	// $ANTLR start "SIGNED"
	public final void mSIGNED() throws RecognitionException {
		try {
			int _type = SIGNED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:213:7: ( 'signed' )
			// myInterp.g:213:9: 'signed'
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
	// $ANTLR end "SIGNED"

	// $ANTLR start "UNSIGNED"
	public final void mUNSIGNED() throws RecognitionException {
		try {
			int _type = UNSIGNED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:214:9: ( 'unsigned' )
			// myInterp.g:214:11: 'unsigned'
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
	// $ANTLR end "UNSIGNED"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:215:8: ( 'bool' )
			// myInterp.g:215:10: 'bool'
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
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:216:7: ( 'string' )
			// myInterp.g:216:9: 'string'
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
	// $ANTLR end "STRING"

	// $ANTLR start "LONG"
	public final void mLONG() throws RecognitionException {
		try {
			int _type = LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:217:5: ( 'long' )
			// myInterp.g:217:7: 'long'
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
	// $ANTLR end "LONG"

	// $ANTLR start "SHORT"
	public final void mSHORT() throws RecognitionException {
		try {
			int _type = SHORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:218:6: ( 'short' )
			// myInterp.g:218:8: 'short'
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
	// $ANTLR end "SHORT"

	// $ANTLR start "AUTO"
	public final void mAUTO() throws RecognitionException {
		try {
			int _type = AUTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:221:5: ( 'auto' )
			// myInterp.g:221:7: 'auto'
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
	// $ANTLR end "AUTO"

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:222:7: ( 'static' )
			// myInterp.g:222:9: 'static'
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
	// $ANTLR end "STATIC"

	// $ANTLR start "EXTERN"
	public final void mEXTERN() throws RecognitionException {
		try {
			int _type = EXTERN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:223:7: ( 'extern' )
			// myInterp.g:223:9: 'extern'
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
	// $ANTLR end "EXTERN"

	// $ANTLR start "REGISTER"
	public final void mREGISTER() throws RecognitionException {
		try {
			int _type = REGISTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:224:9: ( 'register' )
			// myInterp.g:224:11: 'register'
			{
			match("register"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REGISTER"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:227:5: ( 'main' )
			// myInterp.g:227:7: 'main'
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

	// $ANTLR start "SIZEOF"
	public final void mSIZEOF() throws RecognitionException {
		try {
			int _type = SIZEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:228:7: ( 'sizeof' )
			// myInterp.g:228:9: 'sizeof'
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
	// $ANTLR end "SIZEOF"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:229:3: ( 'if' )
			// myInterp.g:229:5: 'if'
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
			// myInterp.g:230:5: ( 'else' )
			// myInterp.g:230:7: 'else'
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

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:231:7: ( 'switch' )
			// myInterp.g:231:9: 'switch'
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
	// $ANTLR end "SWITCH"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:232:5: ( 'case' )
			// myInterp.g:232:7: 'case'
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
	// $ANTLR end "CASE"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:233:8: ( 'default' )
			// myInterp.g:233:10: 'default'
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

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:234:6: ( 'while' )
			// myInterp.g:234:8: 'while'
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

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:235:3: ( 'do' )
			// myInterp.g:235:5: 'do'
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
	// $ANTLR end "DO"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:236:4: ( 'for' )
			// myInterp.g:236:6: 'for'
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

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:237:9: ( 'continue' )
			// myInterp.g:237:11: 'continue'
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
	// $ANTLR end "CONTINUE"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:238:6: ( 'break' )
			// myInterp.g:238:8: 'break'
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
	// $ANTLR end "BREAK"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:239:7: ( 'return' )
			// myInterp.g:239:9: 'return'
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

	// $ANTLR start "PRINTF"
	public final void mPRINTF() throws RecognitionException {
		try {
			int _type = PRINTF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:240:7: ( 'printf' )
			// myInterp.g:240:9: 'printf'
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

	// $ANTLR start "SCANF"
	public final void mSCANF() throws RecognitionException {
		try {
			int _type = SCANF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:241:6: ( 'scanf' )
			// myInterp.g:241:8: 'scanf'
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
	// $ANTLR end "SCANF"

	// $ANTLR start "RelationOP"
	public final void mRelationOP() throws RecognitionException {
		try {
			int _type = RelationOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:243:11: ( '>' | '>=' | '<' | '<=' | '==' | '!=' )
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
					// myInterp.g:243:13: '>'
					{
					match('>'); 
					}
					break;
				case 2 :
					// myInterp.g:243:18: '>='
					{
					match(">="); 

					}
					break;
				case 3 :
					// myInterp.g:243:25: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// myInterp.g:243:31: '<='
					{
					match("<="); 

					}
					break;
				case 5 :
					// myInterp.g:243:38: '=='
					{
					match("=="); 

					}
					break;
				case 6 :
					// myInterp.g:243:45: '!='
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

	// $ANTLR start "AssignmentOP"
	public final void mAssignmentOP() throws RecognitionException {
		try {
			int _type = AssignmentOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:245:13: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' )
			int alt2=6;
			switch ( input.LA(1) ) {
			case '=':
				{
				alt2=1;
				}
				break;
			case '*':
				{
				alt2=2;
				}
				break;
			case '/':
				{
				alt2=3;
				}
				break;
			case '%':
				{
				alt2=4;
				}
				break;
			case '+':
				{
				alt2=5;
				}
				break;
			case '-':
				{
				alt2=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// myInterp.g:245:15: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// myInterp.g:245:21: '*='
					{
					match("*="); 

					}
					break;
				case 3 :
					// myInterp.g:245:28: '/='
					{
					match("/="); 

					}
					break;
				case 4 :
					// myInterp.g:245:35: '%='
					{
					match("%="); 

					}
					break;
				case 5 :
					// myInterp.g:245:42: '+='
					{
					match("+="); 

					}
					break;
				case 6 :
					// myInterp.g:245:49: '-='
					{
					match("-="); 

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
	// $ANTLR end "AssignmentOP"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:247:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myInterp.g:247:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myInterp.g:247:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myInterp.g:
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
					break loop3;
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
			// myInterp.g:249:17: ( ( '0' .. '9' )+ )
			// myInterp.g:249:18: ( '0' .. '9' )+
			{
			// myInterp.g:249:18: ( '0' .. '9' )+
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
					// myInterp.g:
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
	// $ANTLR end "Integer_constant"

	// $ANTLR start "Floating_point_constant"
	public final void mFloating_point_constant() throws RecognitionException {
		try {
			int _type = Floating_point_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:250:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myInterp.g:250:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myInterp.g:250:25: ( '0' .. '9' )+
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
					// myInterp.g:
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

			match('.'); 
			// myInterp.g:250:39: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myInterp.g:
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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

	// $ANTLR start "STRINGS"
	public final void mSTRINGS() throws RecognitionException {
		try {
			int _type = STRINGS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:252:8: ( '\"' ( options {greedy=false; } : . )* '\"' )
			// myInterp.g:252:10: '\"' ( options {greedy=false; } : . )* '\"'
			{
			match('\"'); 
			// myInterp.g:252:14: ( options {greedy=false; } : . )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\"') ) {
					alt7=2;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myInterp.g:252:41: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop7;
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
	// $ANTLR end "STRINGS"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myInterp.g:254:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myInterp.g:254:4: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// myInterp.g:256:8: ( '/*' ( . )* '*/' )
			// myInterp.g:256:9: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myInterp.g:256:14: ( . )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='*') ) {
					int LA8_1 = input.LA(2);
					if ( (LA8_1=='/') ) {
						alt8=2;
					}
					else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
						alt8=1;
					}

				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myInterp.g:256:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop8;
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
			// myInterp.g:259:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// myInterp.g:259:7: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match('#'); 
			// myInterp.g:259:11: (~ ( '\\n' | '\\r' ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myInterp.g:
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
					break loop9;
				}
			}

			// myInterp.g:259:25: ( '\\r' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\r') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// myInterp.g:259:25: '\\r'
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

	@Override
	public void mTokens() throws RecognitionException {
		// myInterp.g:1:8: ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | INT | CHAR | VOID | FLOAT | DOUBLE | SIGNED | UNSIGNED | BOOLEAN | STRING | LONG | SHORT | AUTO | STATIC | EXTERN | REGISTER | MAIN | SIZEOF | IF | ELSE | SWITCH | CASE | DEFAULT | WHILE | DO | FOR | CONTINUE | BREAK | RETURN | PRINTF | SCANF | RelationOP | AssignmentOP | Identifier | Integer_constant | Floating_point_constant | STRINGS | WS | COMMENT | LINE_COMMAND )
		int alt11=51;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// myInterp.g:1:10: T__43
				{
				mT__43(); 

				}
				break;
			case 2 :
				// myInterp.g:1:16: T__44
				{
				mT__44(); 

				}
				break;
			case 3 :
				// myInterp.g:1:22: T__45
				{
				mT__45(); 

				}
				break;
			case 4 :
				// myInterp.g:1:28: T__46
				{
				mT__46(); 

				}
				break;
			case 5 :
				// myInterp.g:1:34: T__47
				{
				mT__47(); 

				}
				break;
			case 6 :
				// myInterp.g:1:40: T__48
				{
				mT__48(); 

				}
				break;
			case 7 :
				// myInterp.g:1:46: T__49
				{
				mT__49(); 

				}
				break;
			case 8 :
				// myInterp.g:1:52: T__50
				{
				mT__50(); 

				}
				break;
			case 9 :
				// myInterp.g:1:58: T__51
				{
				mT__51(); 

				}
				break;
			case 10 :
				// myInterp.g:1:64: T__52
				{
				mT__52(); 

				}
				break;
			case 11 :
				// myInterp.g:1:70: T__53
				{
				mT__53(); 

				}
				break;
			case 12 :
				// myInterp.g:1:76: T__54
				{
				mT__54(); 

				}
				break;
			case 13 :
				// myInterp.g:1:82: INT
				{
				mINT(); 

				}
				break;
			case 14 :
				// myInterp.g:1:86: CHAR
				{
				mCHAR(); 

				}
				break;
			case 15 :
				// myInterp.g:1:91: VOID
				{
				mVOID(); 

				}
				break;
			case 16 :
				// myInterp.g:1:96: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 17 :
				// myInterp.g:1:102: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 18 :
				// myInterp.g:1:109: SIGNED
				{
				mSIGNED(); 

				}
				break;
			case 19 :
				// myInterp.g:1:116: UNSIGNED
				{
				mUNSIGNED(); 

				}
				break;
			case 20 :
				// myInterp.g:1:125: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 21 :
				// myInterp.g:1:133: STRING
				{
				mSTRING(); 

				}
				break;
			case 22 :
				// myInterp.g:1:140: LONG
				{
				mLONG(); 

				}
				break;
			case 23 :
				// myInterp.g:1:145: SHORT
				{
				mSHORT(); 

				}
				break;
			case 24 :
				// myInterp.g:1:151: AUTO
				{
				mAUTO(); 

				}
				break;
			case 25 :
				// myInterp.g:1:156: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 26 :
				// myInterp.g:1:163: EXTERN
				{
				mEXTERN(); 

				}
				break;
			case 27 :
				// myInterp.g:1:170: REGISTER
				{
				mREGISTER(); 

				}
				break;
			case 28 :
				// myInterp.g:1:179: MAIN
				{
				mMAIN(); 

				}
				break;
			case 29 :
				// myInterp.g:1:184: SIZEOF
				{
				mSIZEOF(); 

				}
				break;
			case 30 :
				// myInterp.g:1:191: IF
				{
				mIF(); 

				}
				break;
			case 31 :
				// myInterp.g:1:194: ELSE
				{
				mELSE(); 

				}
				break;
			case 32 :
				// myInterp.g:1:199: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 33 :
				// myInterp.g:1:206: CASE
				{
				mCASE(); 

				}
				break;
			case 34 :
				// myInterp.g:1:211: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 35 :
				// myInterp.g:1:219: WHILE
				{
				mWHILE(); 

				}
				break;
			case 36 :
				// myInterp.g:1:225: DO
				{
				mDO(); 

				}
				break;
			case 37 :
				// myInterp.g:1:228: FOR
				{
				mFOR(); 

				}
				break;
			case 38 :
				// myInterp.g:1:232: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 39 :
				// myInterp.g:1:241: BREAK
				{
				mBREAK(); 

				}
				break;
			case 40 :
				// myInterp.g:1:247: RETURN
				{
				mRETURN(); 

				}
				break;
			case 41 :
				// myInterp.g:1:254: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 42 :
				// myInterp.g:1:261: SCANF
				{
				mSCANF(); 

				}
				break;
			case 43 :
				// myInterp.g:1:267: RelationOP
				{
				mRelationOP(); 

				}
				break;
			case 44 :
				// myInterp.g:1:278: AssignmentOP
				{
				mAssignmentOP(); 

				}
				break;
			case 45 :
				// myInterp.g:1:291: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 46 :
				// myInterp.g:1:302: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 47 :
				// myInterp.g:1:319: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 48 :
				// myInterp.g:1:343: STRINGS
				{
				mSTRINGS(); 

				}
				break;
			case 49 :
				// myInterp.g:1:351: WS
				{
				mWS(); 

				}
				break;
			case 50 :
				// myInterp.g:1:354: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 51 :
				// myInterp.g:1:362: LINE_COMMAND
				{
				mLINE_COMMAND(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\4\uffff\1\44\1\45\1\uffff\1\46\1\50\1\uffff\1\51\2\uffff\17\36\1\uffff"+
		"\1\43\1\uffff\1\104\12\uffff\1\36\1\107\6\36\1\117\21\36\2\uffff\1\144"+
		"\1\uffff\5\36\1\152\1\36\1\uffff\24\36\1\uffff\1\u0080\1\u0081\1\36\1"+
		"\u0083\1\36\1\uffff\12\36\1\u008f\1\36\1\u0091\1\u0092\1\36\1\u0094\2"+
		"\36\1\u0097\2\36\2\uffff\1\36\1\uffff\1\u009b\6\36\1\u00a2\1\36\1\u00a4"+
		"\1\36\1\uffff\1\u00a6\2\uffff\1\36\1\uffff\2\36\1\uffff\1\u00aa\2\36\1"+
		"\uffff\1\u00ad\1\36\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\uffff\1\u00b3\1"+
		"\uffff\1\36\1\uffff\1\u00b5\1\36\1\u00b7\1\uffff\1\u00b8\1\36\1\uffff"+
		"\1\u00ba\5\uffff\1\36\1\uffff\1\36\2\uffff\1\u00bd\1\uffff\1\u00be\1\u00bf"+
		"\3\uffff";
	static final String DFA11_eofS =
		"\u00c0\uffff";
	static final String DFA11_minS =
		"\1\11\3\uffff\2\75\1\uffff\1\75\1\52\1\uffff\1\75\2\uffff\1\146\1\141"+
		"\1\157\1\154\1\145\1\143\1\156\2\157\1\165\1\154\1\145\1\141\1\150\1\162"+
		"\1\uffff\1\75\1\uffff\1\56\12\uffff\1\164\1\60\1\141\1\163\1\156\1\151"+
		"\1\157\1\162\1\60\1\146\1\147\1\141\1\157\1\151\1\141\1\163\1\157\1\145"+
		"\1\156\2\164\1\163\1\147\3\151\2\uffff\1\60\1\uffff\1\162\1\145\1\164"+
		"\1\144\1\141\1\60\1\142\1\uffff\1\141\1\156\1\145\1\151\1\164\1\162\1"+
		"\164\1\156\1\151\1\154\1\141\1\147\1\157\2\145\1\151\1\165\1\156\1\154"+
		"\1\156\1\uffff\2\60\1\151\1\60\1\164\1\uffff\1\154\1\165\1\145\1\157\1"+
		"\156\1\151\1\164\1\143\1\146\1\147\1\60\1\153\2\60\1\162\1\60\1\163\1"+
		"\162\1\60\1\145\1\164\2\uffff\1\156\1\uffff\1\60\1\145\1\154\1\144\1\146"+
		"\1\147\1\143\1\60\1\150\1\60\1\156\1\uffff\1\60\2\uffff\1\156\1\uffff"+
		"\1\164\1\156\1\uffff\1\60\1\146\1\165\1\uffff\1\60\1\164\4\60\1\uffff"+
		"\1\60\1\uffff\1\145\1\uffff\1\60\1\145\1\60\1\uffff\1\60\1\145\1\uffff"+
		"\1\60\5\uffff\1\144\1\uffff\1\162\2\uffff\1\60\1\uffff\2\60\3\uffff";
	static final String DFA11_maxS =
		"\1\175\3\uffff\2\75\1\uffff\2\75\1\uffff\1\75\2\uffff\1\156\4\157\1\167"+
		"\1\156\1\162\1\157\1\165\1\170\1\145\1\141\1\150\1\162\1\uffff\1\75\1"+
		"\uffff\1\71\12\uffff\1\164\1\172\1\141\1\163\1\156\1\151\1\157\1\162\1"+
		"\172\1\146\1\172\1\162\1\157\1\151\1\141\1\163\1\157\1\145\1\156\2\164"+
		"\1\163\1\164\3\151\2\uffff\1\172\1\uffff\1\162\1\145\1\164\1\144\1\141"+
		"\1\172\1\142\1\uffff\1\141\1\156\1\145\1\151\1\164\1\162\1\164\1\156\1"+
		"\151\1\154\1\141\1\147\1\157\2\145\1\151\1\165\1\156\1\154\1\156\1\uffff"+
		"\2\172\1\151\1\172\1\164\1\uffff\1\154\1\165\1\145\1\157\1\156\1\151\1"+
		"\164\1\143\1\146\1\147\1\172\1\153\2\172\1\162\1\172\1\163\1\162\1\172"+
		"\1\145\1\164\2\uffff\1\156\1\uffff\1\172\1\145\1\154\1\144\1\146\1\147"+
		"\1\143\1\172\1\150\1\172\1\156\1\uffff\1\172\2\uffff\1\156\1\uffff\1\164"+
		"\1\156\1\uffff\1\172\1\146\1\165\1\uffff\1\172\1\164\4\172\1\uffff\1\172"+
		"\1\uffff\1\145\1\uffff\1\172\1\145\1\172\1\uffff\1\172\1\145\1\uffff\1"+
		"\172\5\uffff\1\144\1\uffff\1\162\2\uffff\1\172\1\uffff\2\172\3\uffff";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\1\2\1\3\2\uffff\1\6\2\uffff\1\11\1\uffff\1\13\1\14\17\uffff"+
		"\1\53\1\uffff\1\55\1\uffff\1\60\1\61\1\63\1\54\1\4\1\5\1\7\1\62\1\10\1"+
		"\12\32\uffff\1\56\1\57\1\uffff\1\36\7\uffff\1\44\24\uffff\1\15\5\uffff"+
		"\1\45\25\uffff\1\16\1\41\1\uffff\1\17\13\uffff\1\24\1\uffff\1\26\1\30"+
		"\1\uffff\1\37\2\uffff\1\34\3\uffff\1\20\6\uffff\1\27\1\uffff\1\52\1\uffff"+
		"\1\47\3\uffff\1\43\2\uffff\1\21\1\uffff\1\22\1\35\1\25\1\31\1\40\1\uffff"+
		"\1\32\1\uffff\1\50\1\51\1\uffff\1\42\2\uffff\1\46\1\23\1\33";
	static final String DFA11_specialS =
		"\u00c0\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\41\2\uffff\1\41\22\uffff\1\41\1\34\1\40\1\42\1\uffff\1\12\1\1\1\uffff"+
			"\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\12\37\1\uffff\1\11\1\34\1\35\1"+
			"\34\2\uffff\32\36\4\uffff\1\36\1\uffff\1\26\1\24\1\16\1\21\1\27\1\20"+
			"\2\36\1\15\2\36\1\25\1\31\2\36\1\33\1\36\1\30\1\22\1\36\1\23\1\17\1\32"+
			"\3\36\1\13\1\uffff\1\14",
			"",
			"",
			"",
			"\1\43",
			"\1\43",
			"",
			"\1\43",
			"\1\47\22\uffff\1\43",
			"",
			"\1\43",
			"",
			"",
			"\1\53\7\uffff\1\52",
			"\1\55\6\uffff\1\54\6\uffff\1\56",
			"\1\57",
			"\1\60\2\uffff\1\61",
			"\1\63\11\uffff\1\62",
			"\1\70\4\uffff\1\66\1\64\12\uffff\1\65\2\uffff\1\67",
			"\1\71",
			"\1\72\2\uffff\1\73",
			"\1\74",
			"\1\75",
			"\1\77\13\uffff\1\76",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"",
			"\1\34",
			"",
			"\1\105\1\uffff\12\37",
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
			"\1\106",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\24\36\1\116\5\36",
			"\1\120",
			"\1\121\22\uffff\1\122",
			"\1\124\20\uffff\1\123",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137\14\uffff\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\153",
			"",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u0082",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u0084",
			"",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u0090",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u0093",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u0095",
			"\1\u0096",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u0098",
			"\1\u0099",
			"",
			"",
			"\1\u009a",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u00a3",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u00a5",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"",
			"\1\u00a7",
			"",
			"\1\u00a8",
			"\1\u00a9",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u00ab",
			"\1\u00ac",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u00ae",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\1\u00b4",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u00b6",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\u00b9",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"",
			"",
			"",
			"",
			"\1\u00bb",
			"",
			"\1\u00bc",
			"",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | INT | CHAR | VOID | FLOAT | DOUBLE | SIGNED | UNSIGNED | BOOLEAN | STRING | LONG | SHORT | AUTO | STATIC | EXTERN | REGISTER | MAIN | SIZEOF | IF | ELSE | SWITCH | CASE | DEFAULT | WHILE | DO | FOR | CONTINUE | BREAK | RETURN | PRINTF | SCANF | RelationOP | AssignmentOP | Identifier | Integer_constant | Floating_point_constant | STRINGS | WS | COMMENT | LINE_COMMAND );";
		}
	}

}
