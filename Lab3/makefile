all: Interp, test1, test2, test3, test3, clean

Interp:
	java -jar ../antlr-3.5.2-complete-no-st3.jar myInterp.g
	javac -cp ../antlr-3.5.2-complete-no-st3.jar ./*.java


test1:
	java -cp ../antlr-3.5.2-complete-no-st3.jar:. testInterp test1.c
test2:
	java -cp ../antlr-3.5.2-complete-no-st3.jar:. testInterp test2.c
test3:
	java -cp ../antlr-3.5.2-complete-no-st3.jar:. testInterp test3.c
test4:
	java -cp ../antlr-3.5.2-complete-no-st3.jar:. testInterp test4.c
clean:
	rm ./*.tokens
	rm myInterpLexer.java
	rm myInterpParser.java
	rm ./*.class
