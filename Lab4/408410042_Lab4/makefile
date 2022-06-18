all: myCompiler compile_java

myCompiler:
	java -cp ../antlr-3.5.2-complete-no-st3.jar org.antlr.Tool myCompiler.g

compile_java:
	javac -cp ../antlr-3.5.2-complete-no-st3.jar ./*.java

test1:
	java -cp ../antlr-3.5.2-complete-no-st3.jar:. myCompiler_test ./test/test1.c
	cp ./tmp.ll ./test/test1.ll
	llc ./test/test1.ll
	gcc ./test/test1.s -o ./test/test1.exe
	./test/test1.exe
test2:
	java -cp ../antlr-3.5.2-complete-no-st3.jar:. myCompiler_test ./test/test2.c
	cp ./tmp.ll ./test/test2.ll
	llc ./test/test2.ll
	gcc ./test/test2.s -o ./test/test2.exe
	./test/test2.exe

test3:
	java -cp ../antlr-3.5.2-complete-no-st3.jar:. myCompiler_test ./test/test3.c
	cp ./tmp.ll ./test/test3.ll
	llc ./test/test3.ll
	gcc ./test/test3.s -o ./test/test3.exe
	./test/test3.exe
clean:
	rm ./*.class
	rm ./*.tokens
	rm ./myCompilerParser.java
	rm ./myCompilerLexer.java
	rm ./tmp.ll

clean_classes:
	rm ./*.class

clean_tokens:
	rm ./*.tokens
	rm ./myCompilerParser.java
	rm ./myCompilerLexer.java
