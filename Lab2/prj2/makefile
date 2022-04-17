all: Parser, test1, test2, test3, clean

Parser:
	java -jar ../../antlr-3.5.2-complete-no-st3.jar myC_new.g
	javac -cp ../../antlr-3.5.2-complete-no-st3.jar ./*.java

test1:
	java -cp ../../antlr-3.5.2-complete-no-st3.jar:. myC_new_test test.c

test2:
	java -cp ../../antlr-3.5.2-complete-no-st3.jar:. myC_new_test test2.c

test3:
	java -cp ../../antlr-3.5.2-complete-no-st3.jar:. myC_new_test test3.c

clean:
	rm ./*.tokens
	rm myC_newLexer.java
	rm myC_newParser.java
	rm ./*.class
