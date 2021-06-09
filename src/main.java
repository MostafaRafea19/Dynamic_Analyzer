import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.FileWriter;

public class main {
    public static void main(String[] args) throws Exception {
        String inputfile = "c_code_example.c";

        FileInputStream is = new FileInputStream(inputfile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        taskLexer lexer = new taskLexer(CharStreams.fromFileName(inputfile));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        taskParser parser = new taskParser(tokens);
        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker T =new ParseTreeWalker();


        // Step 1:
        // Uncomment this part to generate the c code
        /*
        injection d = new injection(tokens);
        T.walk(d,tree);
        FileWriter myWriter = new FileWriter("generated_c_code.c");
        myWriter.write(d.rewriter.getText());
        myWriter.close();
        */

        // Step 2:
        // Run the generated C code file, it will generate "blocks.txt" file
        // Use this file with the the object below to generate the html file

        // Step 3:
        // Uncomment this part to generate the html file
        /*
        Html html = new Html(tokens);
        T.walk(html,tree);
        FileWriter myWriter2 = new FileWriter("html_viewer.html");
        myWriter2.write(html.rewriter.getText());
        myWriter2.close();
        */
    }
}
