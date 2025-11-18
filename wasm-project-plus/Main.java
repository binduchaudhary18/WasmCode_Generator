import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("input.minilang");
        MiniLangPlusLexer lexer = new MiniLangPlusLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniLangPlusParser parser = new MiniLangPlusParser(tokens);
        ParseTree tree = parser.prog();

        WASMVisitor visitor = new WASMVisitor();
        String wat = visitor.visit(tree);

        FileWriter fw = new FileWriter("output.wat");
        fw.write(wat);
        fw.close();

        System.out.println("✅ Generated output.wat");
    }
}

