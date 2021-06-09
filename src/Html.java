import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import java.io.*;

public class Html extends  taskBaseListener {
    TokenStreamRewriter rewriter;
    static int num = 0;

    File file = new File("blocks.txt");    //creates a new file instance
    FileReader fr = new FileReader(file);   //reads the file
    BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
    StringBuffer sb = new StringBuffer();    //constructs a string buffer with no characters
    String line;
    boolean flag = true;

    public Html(TokenStream tokens) throws FileNotFoundException {
        rewriter = new TokenStreamRewriter(tokens);
    }

    public Html() throws FileNotFoundException {
    }

    @Override
    public void enterCompilationUnit(taskParser.CompilationUnitContext ctx) {
        rewriter.insertBefore(0, "<html> \n <body><pre style=\"background-color:#90FD52; font-size:20px;\">");
        rewriter.insertAfter(ctx.stop, "</pre></body> \n </html>");
    }

    @Override
    public void enterCompoundStatement(taskParser.CompoundStatementContext ctx) throws IOException {
        if (flag) {
            line = br.readLine();
            while ((line)!=null &&Integer.parseInt(line)<num){
                line = br.readLine();
            }
            flag = false;
        }
        if (line != null && num++ == (Integer.parseInt(line))) {
            rewriter.insertBefore(ctx.start, "<pre style=\"background-color:#90FD52;\">");
            flag = true;
        } else {
            rewriter.insertBefore(ctx.start, "<pre style=\"background-color:#E54E4E;\">");
        }
    }

    @Override
    public void exitCompoundStatement(taskParser.CompoundStatementContext ctx) throws IOException {
        rewriter.insertAfter(ctx.stop, "</pre>\n");
    }

    @Override
    public void exitCompilationUnit(taskParser.CompilationUnitContext ctx) {
        rewriter.insertAfter(ctx.stop, "</pre></body> \n </html>");
    }

}