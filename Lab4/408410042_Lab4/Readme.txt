Project 4 Readme
408410042 林靖紳

* 編譯：
	- 在本目錄下的 terminal 上執行 make 此步驟會先執行 .g 檔之後編譯此目錄下的 *.java檔
	- 如果需要將上述兩個步驟分的話
		+ 請在 terminal 上打：make myCompiler 將會執行 myCompiler.g，並產生 
			◎ myCompilerLexer.java
			◎ myCompilerParser.java
			◎ myCompilertokens
		+ 請在 terminal 上打： make compile 將會編譯此目錄底下所有的 .java 檔案
		
* 執行 compiler：
	- 所有測試檔都在 test 目錄底下，底下附 4 個測試檔 test1.c, test2.c, test3.c
	- 再來請根據測試需求在 terminal 上打： make test1 或是 make test2 或 make test3 
	- 此步驟會根據 make 後面接的 test[num]，產生 test[num].c 相對應的 LLVM IR assembly code 在此目錄底下的 tmp.ll
	- 接著會複製 tmp.ll 到 ./test/test[num].ll
	- 之後執行 llc test[num].ll，產生 test[num].s
	- 接著執行 gcc test[num].s，產生 test[num].exe
	- 最後執行 test[num].exe，並將結果顯示在 terminal 上 
	
	
* 清空：
	- makefile 提供 make clean 的功能
	- 在 terminal 上打 make clean 之後可以清除中間所有產生的檔案 
		*.tokens, myInterpLexer.java, myInterpParser.java, *.class, tmp.ll
	- 也分別提供 只清空執行 .g 檔之後產生的檔案 以及 編譯 .java 時產生的 .class 檔
		1. make clean_tokens: 刪除 myCompilerLexer.java, myCompilerParser.java, myCompilertokens
		2. make clean_classes: 刪除 *.class
