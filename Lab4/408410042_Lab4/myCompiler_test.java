import org.antlr.runtime.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class myCompiler_test {
	public static void main(String[] args) throws Exception {

      CharStream input = new ANTLRFileStream(args[0]);
      myCompilerLexer lexer = new myCompilerLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
 
      myCompilerParser parser = new myCompilerParser(tokens);
      parser.program();
      
      /* Output text section */
      List<String> text_code = parser.getTextCode();
      List<String> printf_code;
      
      printf_code = parser.getPrintfCode();
      printf_code.addAll(text_code);
      int len = printf_code.size();
      BufferedWriter bw;
      bw = new BufferedWriter(new FileWriter("./tmp.ll"));
      try{
      for (int i=0; i < len; i++){
      	// System.out.println(printf_code.get(i));
	 bw.write(printf_code.get(i).toString());
	 bw.newLine();
	 bw.flush();
      }
      bw.close();
      } catch (IOException e){
      	e.printStackTrace();
      }
}
}
