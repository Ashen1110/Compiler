lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*   	 headers	 */
/*----------------------*/
HEADER: '<'(LETTER)(LETTER | DIGIT)*'.'(LETTER)'>';

/*----------------------*/
/*   	   type	 */
/*----------------------*/
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
FLOAT_TYPE: 'float';
DOUBLE_TYPE: 'double';
SIGNED_TYPE: 'signed';
UNSIGNED_TYPE: 'unsigned';
BOOLEAN_TYPE: 'bool';
STRING_TYPE: 'string';
STRUCTURE_TYPE: 'struct';
UNION_TYPE: 'union';
LONG_TYPE: 'long';
SHORT_TYPE: 'short';
TRUE_TYPE: 'true';
FALSE_TYPE: 'false';
STRINGSTREAM: 'stringstream';

/*----------------------*/
/*   	  storage	 */
/*----------------------*/
T_AUTO: 'auto';
T_STATIC: 'static';
T_EXTERN: 'extern';

/*----------------------*/
/*     print type	 */
/*----------------------*/
T_DECIMAL: '%d';
T_CHAR: '%c';
T_STRING: '%s';
T_FLOAT: '%f';

/*----------------------*/
/*   special symbols	 */
/*----------------------*/
T_END: ';';
T_colon: ':';
T_HASHTAG: '#';
T_LPAREN: '(';
T_RPAREN: ')';
T_Lbracket: '{';
T_Rbracket: '}';
T_Lsquare: '[';
T_Rsquare: ']';
T_ADDRRESS: '&';
T_LT: '<';
T_MT: '>';
T_DOT: '.';
T_QUESTION: '?';
T_MARK: '"';
T_COMMO: ',';
T_APOSTROPHE: '\'';

/*----------------------*/
/*  Arithmetic symbols	 */
/*----------------------*/
T_ADD: '+';
T_SUB: '-';
T_MUL: '*';
T_DIV: '/';
T_MOD: '%';
T_ASSIGN: '=';

/*----------------------*/
/*  	functions	 */
/*----------------------*/
INCLUDE_FUN: 'include';
DEFINE_FUN: 'define';
MAIN_FUN: 'main';
SCAN_FUN: 'scanf';
PRINT_FUN: 'printf';
WHILE_FUN: 'while';
FOR_FUN: 'for';
IF_FUN: 'if';
ELSE_FUN: 'else';
BREAK_FUN: 'break';
CONTINUE_FUN: 'continue';
RETURN_FUN: 'return';
DO_FUN: 'do';
SWITCH_FUN: 'switch';
SWITCH_CASE: 'case';
DEFAULT: 'default';
SIZE_FUN: 'sizeof';


/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';


NEW_LINE: '\n';
DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;
STRING: '"'(options{greedy = false;}: .)*'"';

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;

/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';


fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


WS  : (' '|'\r'|'\t')+
    ;
