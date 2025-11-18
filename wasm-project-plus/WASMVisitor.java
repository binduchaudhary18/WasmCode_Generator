import java.util.*;

public class WASMVisitor extends MiniLangPlusBaseVisitor<String> {
    private Map<String, Integer> variables = new HashMap<>();

    @Override
    public String visitInt(MiniLangPlusParser.IntContext ctx) {
        return "(i32.const " + ctx.INT().getText() + ")";
    }

    @Override
    public String visitAddSub(MiniLangPlusParser.AddSubContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        return left + " " + right + " " +
               (ctx.op.getText().equals("+") ? "i32.add" : "i32.sub");
    }

    @Override
    public String visitMulDiv(MiniLangPlusParser.MulDivContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        return left + " " + right + " " +
               (ctx.op.getText().equals("*") ? "i32.mul" : "i32.div_s");
    }

    @Override
    public String visitPrintStmt(MiniLangPlusParser.PrintStmtContext ctx) {
        String value = visit(ctx.expr());
        return value + " call $print";
    }

    @Override
    public String visitProg(MiniLangPlusParser.ProgContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("(module\n");
        sb.append("  (import \"env\" \"print\" (func $print (param i32)))\n");
        sb.append("  (func (export \"main\")\n");

        for (var stmt : ctx.stmt()) {
            sb.append("    ").append(visit(stmt)).append("\n");
        }

        sb.append("  )\n)\n");
        return sb.toString();
    }
}
