import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import java.io.*;

public class injection extends  taskBaseListener  {
    TokenStreamRewriter rewriter;
    static int num = 0;

    public injection (TokenStream tokens) throws FileNotFoundException {
        rewriter = new TokenStreamRewriter( tokens);
    }

    @Override public void enterCompilationUnit(taskParser.CompilationUnitContext ctx) {
        String s ="FILE *fp;\n" ;
        rewriter.insertBefore((ctx.start), s);
    }

    @Override public void enterCompoundStatement(taskParser.CompoundStatementContext ctx) throws IOException {
        String s ="fp =fopen(\"blocks.txt\", \"a\");\n"+
                "fprintf(fp,\""+num++ +"\\n\");\n"
                +"fclose(fp);";
        rewriter.insertAfter(ctx.start, s);
    }
}
