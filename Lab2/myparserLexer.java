// $ANTLR 3.5.2 myparser.g 2022-05-11 02:25:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myparserLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myparserLexer() {} 
	public myparserLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myparserLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myparser.g"; }

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:7:7: ( '!' )
			// myparser.g:7:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:8:7: ( '!=' )
			// myparser.g:8:9: '!='
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:9:7: ( '%' )
			// myparser.g:9:9: '%'
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:10:7: ( '%=' )
			// myparser.g:10:9: '%='
			{
			match("%="); 

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
			// myparser.g:11:7: ( '&&' )
			// myparser.g:11:9: '&&'
			{
			match("&&"); 

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
			// myparser.g:12:7: ( '&' )
			// myparser.g:12:9: '&'
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:13:7: ( '&=' )
			// myparser.g:13:9: '&='
			{
			match("&="); 

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
			// myparser.g:14:7: ( '(' )
			// myparser.g:14:9: '('
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
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:15:7: ( ')' )
			// myparser.g:15:9: ')'
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
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:16:7: ( '*' )
			// myparser.g:16:9: '*'
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
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:17:7: ( '*=' )
			// myparser.g:17:9: '*='
			{
			match("*="); 

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
			// myparser.g:18:7: ( '+' )
			// myparser.g:18:9: '+'
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
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:19:7: ( '++' )
			// myparser.g:19:9: '++'
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
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:20:7: ( '+=' )
			// myparser.g:20:9: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:21:7: ( ',' )
			// myparser.g:21:9: ','
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
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:22:7: ( '-' )
			// myparser.g:22:9: '-'
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
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:23:7: ( '--' )
			// myparser.g:23:9: '--'
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
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:24:7: ( '-=' )
			// myparser.g:24:9: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:25:7: ( '->' )
			// myparser.g:25:9: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:26:7: ( '.' )
			// myparser.g:26:9: '.'
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
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:27:7: ( '/' )
			// myparser.g:27:9: '/'
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
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:28:7: ( '/=' )
			// myparser.g:28:9: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:29:7: ( ':' )
			// myparser.g:29:9: ':'
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
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:30:7: ( ';' )
			// myparser.g:30:9: ';'
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
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:31:7: ( '<' )
			// myparser.g:31:9: '<'
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
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:32:7: ( '<<' )
			// myparser.g:32:9: '<<'
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
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:33:7: ( '<<=' )
			// myparser.g:33:9: '<<='
			{
			match("<<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:34:7: ( '<=' )
			// myparser.g:34:9: '<='
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
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:35:7: ( '=' )
			// myparser.g:35:9: '='
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
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:36:7: ( '==' )
			// myparser.g:36:9: '=='
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
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:37:7: ( '>' )
			// myparser.g:37:9: '>'
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
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:38:7: ( '>=' )
			// myparser.g:38:9: '>='
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
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:39:7: ( '>>' )
			// myparser.g:39:9: '>>'
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
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:40:7: ( '>>=' )
			// myparser.g:40:9: '>>='
			{
			match(">>="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:41:7: ( '?' )
			// myparser.g:41:9: '?'
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
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:42:7: ( '[' )
			// myparser.g:42:9: '['
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
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:43:7: ( ']' )
			// myparser.g:43:9: ']'
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
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:44:7: ( '^' )
			// myparser.g:44:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:45:7: ( '^=' )
			// myparser.g:45:9: '^='
			{
			match("^="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:46:7: ( '{' )
			// myparser.g:46:9: '{'
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
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:47:7: ( '|' )
			// myparser.g:47:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:48:7: ( '|=' )
			// myparser.g:48:9: '|='
			{
			match("|="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:49:7: ( '||' )
			// myparser.g:49:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:50:7: ( '}' )
			// myparser.g:50:9: '}'
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
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:51:7: ( '~' )
			// myparser.g:51:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__85"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:281:4: ( 'int' )
			// myparser.g:281:6: 'int'
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
			// myparser.g:282:5: ( 'char' )
			// myparser.g:282:7: 'char'
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
			// myparser.g:283:5: ( 'void' )
			// myparser.g:283:7: 'void'
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
			// myparser.g:284:6: ( 'float' )
			// myparser.g:284:8: 'float'
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
			// myparser.g:285:7: ( 'double' )
			// myparser.g:285:9: 'double'
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
			// myparser.g:286:7: ( 'signed' )
			// myparser.g:286:9: 'signed'
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
			// myparser.g:287:9: ( 'unsigned' )
			// myparser.g:287:11: 'unsigned'
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
			// myparser.g:288:8: ( 'bool' )
			// myparser.g:288:10: 'bool'
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
			// myparser.g:289:7: ( 'string' )
			// myparser.g:289:9: 'string'
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
			// myparser.g:290:5: ( 'long' )
			// myparser.g:290:7: 'long'
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
			// myparser.g:291:6: ( 'short' )
			// myparser.g:291:8: 'short'
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
			// myparser.g:294:5: ( 'auto' )
			// myparser.g:294:7: 'auto'
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
			// myparser.g:295:7: ( 'static' )
			// myparser.g:295:9: 'static'
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
			// myparser.g:296:7: ( 'extern' )
			// myparser.g:296:9: 'extern'
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
			// myparser.g:297:9: ( 'register' )
			// myparser.g:297:11: 'register'
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
			// myparser.g:300:5: ( 'main' )
			// myparser.g:300:7: 'main'
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
			// myparser.g:301:7: ( 'sizeof' )
			// myparser.g:301:9: 'sizeof'
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
			// myparser.g:302:3: ( 'if' )
			// myparser.g:302:5: 'if'
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
			// myparser.g:303:5: ( 'else' )
			// myparser.g:303:7: 'else'
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
			// myparser.g:304:7: ( 'switch' )
			// myparser.g:304:9: 'switch'
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
			// myparser.g:305:5: ( 'case' )
			// myparser.g:305:7: 'case'
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
			// myparser.g:306:8: ( 'default' )
			// myparser.g:306:10: 'default'
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
			// myparser.g:307:6: ( 'while' )
			// myparser.g:307:8: 'while'
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
			// myparser.g:308:3: ( 'do' )
			// myparser.g:308:5: 'do'
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
			// myparser.g:309:4: ( 'for' )
			// myparser.g:309:6: 'for'
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
			// myparser.g:310:9: ( 'continue' )
			// myparser.g:310:11: 'continue'
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
			// myparser.g:311:6: ( 'break' )
			// myparser.g:311:8: 'break'
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
			// myparser.g:312:7: ( 'return' )
			// myparser.g:312:9: 'return'
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
			// myparser.g:313:7: ( 'printf' )
			// myparser.g:313:9: 'printf'
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
			// myparser.g:314:6: ( 'scanf' )
			// myparser.g:314:8: 'scanf'
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

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:316:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myparser.g:316:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myparser.g:316:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myparser.g:
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
			// myparser.g:318:17: ( ( '0' .. '9' )+ )
			// myparser.g:318:18: ( '0' .. '9' )+
			{
			// myparser.g:318:18: ( '0' .. '9' )+
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
					// myparser.g:
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
			// myparser.g:319:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myparser.g:319:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myparser.g:319:25: ( '0' .. '9' )+
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
					// myparser.g:
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
			// myparser.g:319:39: ( '0' .. '9' )+
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
					// myparser.g:
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

	// $ANTLR start "STRINGS"
	public final void mSTRINGS() throws RecognitionException {
		try {
			int _type = STRINGS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:321:8: ( '\"' ( options {greedy=false; } : . )* '\"' )
			// myparser.g:321:10: '\"' ( options {greedy=false; } : . )* '\"'
			{
			match('\"'); 
			// myparser.g:321:14: ( options {greedy=false; } : . )*
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
					// myparser.g:321:41: .
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
	// $ANTLR end "STRINGS"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:323:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myparser.g:323:4: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// myparser.g:325:8: ( '/*' ( . )* '*/' )
			// myparser.g:325:9: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myparser.g:325:14: ( . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='*') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='/') ) {
						alt6=2;
					}
					else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myparser.g:325:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
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
			// myparser.g:328:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// myparser.g:328:7: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match('#'); 
			// myparser.g:328:11: (~ ( '\\n' | '\\r' ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myparser.g:
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
					break loop7;
				}
			}

			// myparser.g:328:25: ( '\\r' )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\r') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// myparser.g:328:25: '\\r'
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
		// myparser.g:1:8: ( T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | INT | CHAR | VOID | FLOAT | DOUBLE | SIGNED | UNSIGNED | BOOLEAN | STRING | LONG | SHORT | AUTO | STATIC | EXTERN | REGISTER | MAIN | SIZEOF | IF | ELSE | SWITCH | CASE | DEFAULT | WHILE | DO | FOR | CONTINUE | BREAK | RETURN | PRINTF | SCANF | Identifier | Integer_constant | Floating_point_constant | STRINGS | WS | COMMENT | LINE_COMMAND )
		int alt9=82;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// myparser.g:1:10: T__41
				{
				mT__41(); 

				}
				break;
			case 2 :
				// myparser.g:1:16: T__42
				{
				mT__42(); 

				}
				break;
			case 3 :
				// myparser.g:1:22: T__43
				{
				mT__43(); 

				}
				break;
			case 4 :
				// myparser.g:1:28: T__44
				{
				mT__44(); 

				}
				break;
			case 5 :
				// myparser.g:1:34: T__45
				{
				mT__45(); 

				}
				break;
			case 6 :
				// myparser.g:1:40: T__46
				{
				mT__46(); 

				}
				break;
			case 7 :
				// myparser.g:1:46: T__47
				{
				mT__47(); 

				}
				break;
			case 8 :
				// myparser.g:1:52: T__48
				{
				mT__48(); 

				}
				break;
			case 9 :
				// myparser.g:1:58: T__49
				{
				mT__49(); 

				}
				break;
			case 10 :
				// myparser.g:1:64: T__50
				{
				mT__50(); 

				}
				break;
			case 11 :
				// myparser.g:1:70: T__51
				{
				mT__51(); 

				}
				break;
			case 12 :
				// myparser.g:1:76: T__52
				{
				mT__52(); 

				}
				break;
			case 13 :
				// myparser.g:1:82: T__53
				{
				mT__53(); 

				}
				break;
			case 14 :
				// myparser.g:1:88: T__54
				{
				mT__54(); 

				}
				break;
			case 15 :
				// myparser.g:1:94: T__55
				{
				mT__55(); 

				}
				break;
			case 16 :
				// myparser.g:1:100: T__56
				{
				mT__56(); 

				}
				break;
			case 17 :
				// myparser.g:1:106: T__57
				{
				mT__57(); 

				}
				break;
			case 18 :
				// myparser.g:1:112: T__58
				{
				mT__58(); 

				}
				break;
			case 19 :
				// myparser.g:1:118: T__59
				{
				mT__59(); 

				}
				break;
			case 20 :
				// myparser.g:1:124: T__60
				{
				mT__60(); 

				}
				break;
			case 21 :
				// myparser.g:1:130: T__61
				{
				mT__61(); 

				}
				break;
			case 22 :
				// myparser.g:1:136: T__62
				{
				mT__62(); 

				}
				break;
			case 23 :
				// myparser.g:1:142: T__63
				{
				mT__63(); 

				}
				break;
			case 24 :
				// myparser.g:1:148: T__64
				{
				mT__64(); 

				}
				break;
			case 25 :
				// myparser.g:1:154: T__65
				{
				mT__65(); 

				}
				break;
			case 26 :
				// myparser.g:1:160: T__66
				{
				mT__66(); 

				}
				break;
			case 27 :
				// myparser.g:1:166: T__67
				{
				mT__67(); 

				}
				break;
			case 28 :
				// myparser.g:1:172: T__68
				{
				mT__68(); 

				}
				break;
			case 29 :
				// myparser.g:1:178: T__69
				{
				mT__69(); 

				}
				break;
			case 30 :
				// myparser.g:1:184: T__70
				{
				mT__70(); 

				}
				break;
			case 31 :
				// myparser.g:1:190: T__71
				{
				mT__71(); 

				}
				break;
			case 32 :
				// myparser.g:1:196: T__72
				{
				mT__72(); 

				}
				break;
			case 33 :
				// myparser.g:1:202: T__73
				{
				mT__73(); 

				}
				break;
			case 34 :
				// myparser.g:1:208: T__74
				{
				mT__74(); 

				}
				break;
			case 35 :
				// myparser.g:1:214: T__75
				{
				mT__75(); 

				}
				break;
			case 36 :
				// myparser.g:1:220: T__76
				{
				mT__76(); 

				}
				break;
			case 37 :
				// myparser.g:1:226: T__77
				{
				mT__77(); 

				}
				break;
			case 38 :
				// myparser.g:1:232: T__78
				{
				mT__78(); 

				}
				break;
			case 39 :
				// myparser.g:1:238: T__79
				{
				mT__79(); 

				}
				break;
			case 40 :
				// myparser.g:1:244: T__80
				{
				mT__80(); 

				}
				break;
			case 41 :
				// myparser.g:1:250: T__81
				{
				mT__81(); 

				}
				break;
			case 42 :
				// myparser.g:1:256: T__82
				{
				mT__82(); 

				}
				break;
			case 43 :
				// myparser.g:1:262: T__83
				{
				mT__83(); 

				}
				break;
			case 44 :
				// myparser.g:1:268: T__84
				{
				mT__84(); 

				}
				break;
			case 45 :
				// myparser.g:1:274: T__85
				{
				mT__85(); 

				}
				break;
			case 46 :
				// myparser.g:1:280: INT
				{
				mINT(); 

				}
				break;
			case 47 :
				// myparser.g:1:284: CHAR
				{
				mCHAR(); 

				}
				break;
			case 48 :
				// myparser.g:1:289: VOID
				{
				mVOID(); 

				}
				break;
			case 49 :
				// myparser.g:1:294: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 50 :
				// myparser.g:1:300: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 51 :
				// myparser.g:1:307: SIGNED
				{
				mSIGNED(); 

				}
				break;
			case 52 :
				// myparser.g:1:314: UNSIGNED
				{
				mUNSIGNED(); 

				}
				break;
			case 53 :
				// myparser.g:1:323: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 54 :
				// myparser.g:1:331: STRING
				{
				mSTRING(); 

				}
				break;
			case 55 :
				// myparser.g:1:338: LONG
				{
				mLONG(); 

				}
				break;
			case 56 :
				// myparser.g:1:343: SHORT
				{
				mSHORT(); 

				}
				break;
			case 57 :
				// myparser.g:1:349: AUTO
				{
				mAUTO(); 

				}
				break;
			case 58 :
				// myparser.g:1:354: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 59 :
				// myparser.g:1:361: EXTERN
				{
				mEXTERN(); 

				}
				break;
			case 60 :
				// myparser.g:1:368: REGISTER
				{
				mREGISTER(); 

				}
				break;
			case 61 :
				// myparser.g:1:377: MAIN
				{
				mMAIN(); 

				}
				break;
			case 62 :
				// myparser.g:1:382: SIZEOF
				{
				mSIZEOF(); 

				}
				break;
			case 63 :
				// myparser.g:1:389: IF
				{
				mIF(); 

				}
				break;
			case 64 :
				// myparser.g:1:392: ELSE
				{
				mELSE(); 

				}
				break;
			case 65 :
				// myparser.g:1:397: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 66 :
				// myparser.g:1:404: CASE
				{
				mCASE(); 

				}
				break;
			case 67 :
				// myparser.g:1:409: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 68 :
				// myparser.g:1:417: WHILE
				{
				mWHILE(); 

				}
				break;
			case 69 :
				// myparser.g:1:423: DO
				{
				mDO(); 

				}
				break;
			case 70 :
				// myparser.g:1:426: FOR
				{
				mFOR(); 

				}
				break;
			case 71 :
				// myparser.g:1:430: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 72 :
				// myparser.g:1:439: BREAK
				{
				mBREAK(); 

				}
				break;
			case 73 :
				// myparser.g:1:445: RETURN
				{
				mRETURN(); 

				}
				break;
			case 74 :
				// myparser.g:1:452: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 75 :
				// myparser.g:1:459: SCANF
				{
				mSCANF(); 

				}
				break;
			case 76 :
				// myparser.g:1:465: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 77 :
				// myparser.g:1:476: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 78 :
				// myparser.g:1:493: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 79 :
				// myparser.g:1:517: STRINGS
				{
				mSTRINGS(); 

				}
				break;
			case 80 :
				// myparser.g:1:525: WS
				{
				mWS(); 

				}
				break;
			case 81 :
				// myparser.g:1:528: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 82 :
				// myparser.g:1:536: LINE_COMMAND
				{
				mLINE_COMMAND(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\1\uffff\1\56\1\60\1\63\2\uffff\1\65\1\70\1\uffff\1\74\1\uffff\1\77\2"+
		"\uffff\1\102\1\104\1\107\3\uffff\1\111\1\uffff\1\114\2\uffff\17\50\1\uffff"+
		"\1\147\26\uffff\1\152\5\uffff\1\154\6\uffff\1\50\1\156\6\50\1\166\21\50"+
		"\6\uffff\1\u008b\1\uffff\5\50\1\u0091\1\50\1\uffff\24\50\1\uffff\1\u00a7"+
		"\1\u00a8\1\50\1\u00aa\1\50\1\uffff\12\50\1\u00b6\1\50\1\u00b8\1\u00b9"+
		"\1\50\1\u00bb\2\50\1\u00be\2\50\2\uffff\1\50\1\uffff\1\u00c2\6\50\1\u00c9"+
		"\1\50\1\u00cb\1\50\1\uffff\1\u00cd\2\uffff\1\50\1\uffff\2\50\1\uffff\1"+
		"\u00d1\2\50\1\uffff\1\u00d4\1\50\1\u00d6\1\u00d7\1\u00d8\1\u00d9\1\uffff"+
		"\1\u00da\1\uffff\1\50\1\uffff\1\u00dc\1\50\1\u00de\1\uffff\1\u00df\1\50"+
		"\1\uffff\1\u00e1\5\uffff\1\50\1\uffff\1\50\2\uffff\1\u00e4\1\uffff\1\u00e5"+
		"\1\u00e6\3\uffff";
	static final String DFA9_eofS =
		"\u00e7\uffff";
	static final String DFA9_minS =
		"\1\11\2\75\1\46\2\uffff\1\75\1\53\1\uffff\1\55\1\uffff\1\52\2\uffff\1"+
		"\74\2\75\3\uffff\1\75\1\uffff\1\75\2\uffff\1\146\1\141\1\157\1\154\1\145"+
		"\1\143\1\156\2\157\1\165\1\154\1\145\1\141\1\150\1\162\1\uffff\1\56\26"+
		"\uffff\1\75\5\uffff\1\75\6\uffff\1\164\1\60\1\141\1\163\1\156\1\151\1"+
		"\157\1\162\1\60\1\146\1\147\1\141\1\157\1\151\1\141\1\163\1\157\1\145"+
		"\1\156\2\164\1\163\1\147\3\151\6\uffff\1\60\1\uffff\1\162\1\145\1\164"+
		"\1\144\1\141\1\60\1\142\1\uffff\1\141\1\156\1\145\1\151\1\164\1\162\1"+
		"\164\1\156\1\151\1\154\1\141\1\147\1\157\2\145\1\151\1\165\1\156\1\154"+
		"\1\156\1\uffff\2\60\1\151\1\60\1\164\1\uffff\1\154\1\165\1\145\1\157\1"+
		"\156\1\151\1\164\1\143\1\146\1\147\1\60\1\153\2\60\1\162\1\60\1\163\1"+
		"\162\1\60\1\145\1\164\2\uffff\1\156\1\uffff\1\60\1\145\1\154\1\144\1\146"+
		"\1\147\1\143\1\60\1\150\1\60\1\156\1\uffff\1\60\2\uffff\1\156\1\uffff"+
		"\1\164\1\156\1\uffff\1\60\1\146\1\165\1\uffff\1\60\1\164\4\60\1\uffff"+
		"\1\60\1\uffff\1\145\1\uffff\1\60\1\145\1\60\1\uffff\1\60\1\145\1\uffff"+
		"\1\60\5\uffff\1\144\1\uffff\1\162\2\uffff\1\60\1\uffff\2\60\3\uffff";
	static final String DFA9_maxS =
		"\1\176\3\75\2\uffff\2\75\1\uffff\1\76\1\uffff\1\75\2\uffff\2\75\1\76\3"+
		"\uffff\1\75\1\uffff\1\174\2\uffff\1\156\4\157\1\167\1\156\1\162\1\157"+
		"\1\165\1\170\1\145\1\141\1\150\1\162\1\uffff\1\71\26\uffff\1\75\5\uffff"+
		"\1\75\6\uffff\1\164\1\172\1\141\1\163\1\156\1\151\1\157\1\162\1\172\1"+
		"\146\1\172\1\162\1\157\1\151\1\141\1\163\1\157\1\145\1\156\2\164\1\163"+
		"\1\164\3\151\6\uffff\1\172\1\uffff\1\162\1\145\1\164\1\144\1\141\1\172"+
		"\1\142\1\uffff\1\141\1\156\1\145\1\151\1\164\1\162\1\164\1\156\1\151\1"+
		"\154\1\141\1\147\1\157\2\145\1\151\1\165\1\156\1\154\1\156\1\uffff\2\172"+
		"\1\151\1\172\1\164\1\uffff\1\154\1\165\1\145\1\157\1\156\1\151\1\164\1"+
		"\143\1\146\1\147\1\172\1\153\2\172\1\162\1\172\1\163\1\162\1\172\1\145"+
		"\1\164\2\uffff\1\156\1\uffff\1\172\1\145\1\154\1\144\1\146\1\147\1\143"+
		"\1\172\1\150\1\172\1\156\1\uffff\1\172\2\uffff\1\156\1\uffff\1\164\1\156"+
		"\1\uffff\1\172\1\146\1\165\1\uffff\1\172\1\164\4\172\1\uffff\1\172\1\uffff"+
		"\1\145\1\uffff\1\172\1\145\1\172\1\uffff\1\172\1\145\1\uffff\1\172\5\uffff"+
		"\1\144\1\uffff\1\162\2\uffff\1\172\1\uffff\2\172\3\uffff";
	static final String DFA9_acceptS =
		"\4\uffff\1\10\1\11\2\uffff\1\17\1\uffff\1\24\1\uffff\1\27\1\30\3\uffff"+
		"\1\43\1\44\1\45\1\uffff\1\50\1\uffff\1\54\1\55\17\uffff\1\114\1\uffff"+
		"\1\117\1\120\1\122\1\2\1\1\1\4\1\3\1\5\1\7\1\6\1\13\1\12\1\15\1\16\1\14"+
		"\1\21\1\22\1\23\1\20\1\26\1\121\1\25\1\uffff\1\34\1\31\1\36\1\35\1\40"+
		"\1\uffff\1\37\1\47\1\46\1\52\1\53\1\51\32\uffff\1\115\1\116\1\33\1\32"+
		"\1\42\1\41\1\uffff\1\77\7\uffff\1\105\24\uffff\1\56\5\uffff\1\106\25\uffff"+
		"\1\57\1\102\1\uffff\1\60\13\uffff\1\65\1\uffff\1\67\1\71\1\uffff\1\100"+
		"\2\uffff\1\75\3\uffff\1\61\6\uffff\1\70\1\uffff\1\113\1\uffff\1\110\3"+
		"\uffff\1\104\2\uffff\1\62\1\uffff\1\63\1\76\1\66\1\72\1\101\1\uffff\1"+
		"\73\1\uffff\1\111\1\112\1\uffff\1\103\2\uffff\1\107\1\64\1\74";
	static final String DFA9_specialS =
		"\u00e7\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\53\2\uffff\1\53\22\uffff\1\53\1\1\1\52\1\54\1\uffff\1\2\1\3\1\uffff"+
			"\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\12\51\1\14\1\15\1\16\1\17\1\20\1"+
			"\21\1\uffff\32\50\1\22\1\uffff\1\23\1\24\1\50\1\uffff\1\42\1\40\1\32"+
			"\1\35\1\43\1\34\2\50\1\31\2\50\1\41\1\45\2\50\1\47\1\50\1\44\1\36\1\50"+
			"\1\37\1\33\1\46\3\50\1\25\1\26\1\27\1\30",
			"\1\55",
			"\1\57",
			"\1\61\26\uffff\1\62",
			"",
			"",
			"\1\64",
			"\1\66\21\uffff\1\67",
			"",
			"\1\71\17\uffff\1\72\1\73",
			"",
			"\1\76\22\uffff\1\75",
			"",
			"",
			"\1\100\1\101",
			"\1\103",
			"\1\105\1\106",
			"",
			"",
			"",
			"\1\110",
			"",
			"\1\112\76\uffff\1\113",
			"",
			"",
			"\1\116\7\uffff\1\115",
			"\1\120\6\uffff\1\117\6\uffff\1\121",
			"\1\122",
			"\1\123\2\uffff\1\124",
			"\1\126\11\uffff\1\125",
			"\1\133\4\uffff\1\131\1\127\12\uffff\1\130\2\uffff\1\132",
			"\1\134",
			"\1\135\2\uffff\1\136",
			"\1\137",
			"\1\140",
			"\1\142\13\uffff\1\141",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"",
			"\1\150\1\uffff\12\51",
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
			"",
			"\1\151",
			"",
			"",
			"",
			"",
			"",
			"\1\153",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\155",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\165\5\50",
			"\1\167",
			"\1\170\22\uffff\1\171",
			"\1\173\20\uffff\1\172",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086\14\uffff\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0092",
			"",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
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
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00a9",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00ab",
			"",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00b7",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00ba",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00bc",
			"\1\u00bd",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00bf",
			"\1\u00c0",
			"",
			"",
			"\1\u00c1",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00ca",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00cc",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\1\u00ce",
			"",
			"\1\u00cf",
			"\1\u00d0",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00d2",
			"\1\u00d3",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00d5",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\u00db",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00dd",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00e0",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e2",
			"",
			"\1\u00e3",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | INT | CHAR | VOID | FLOAT | DOUBLE | SIGNED | UNSIGNED | BOOLEAN | STRING | LONG | SHORT | AUTO | STATIC | EXTERN | REGISTER | MAIN | SIZEOF | IF | ELSE | SWITCH | CASE | DEFAULT | WHILE | DO | FOR | CONTINUE | BREAK | RETURN | PRINTF | SCANF | Identifier | Integer_constant | Floating_point_constant | STRINGS | WS | COMMENT | LINE_COMMAND );";
		}
	}

}
