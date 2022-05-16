執行：
1. 首先請在 terminal 上打： make Interp。此步驟會先執行 .g 檔之後編譯此目錄下的 *.java檔

測試：
1. 本目錄底下附 4 個測試檔，分別命名為： test1.c, test2.c, test3.c, test4.c
2. 再來請根據測試需求在 terminal 上打： make test1 或是 make test2 或 make test3 或 make test4
3. 此步驟會根據 make 後面接的 test[num]，分析 test[num].c

清空：
1. makefile 提供 make clean 的功能
2. 在 terminal 上打 make clean 之後可以清除中間所有產生的檔案 
3. *.tokens, myInterpLexer.java, myInterpParser.java, *.class
