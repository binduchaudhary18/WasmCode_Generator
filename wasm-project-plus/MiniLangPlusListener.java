// Generated from MiniLangPlus.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniLangPlusParser}.
 */
public interface MiniLangPlusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniLangPlusParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MiniLangPlusParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangPlusParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MiniLangPlusParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(MiniLangPlusParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(MiniLangPlusParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(MiniLangPlusParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(MiniLangPlusParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(MiniLangPlusParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(MiniLangPlusParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(MiniLangPlusParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(MiniLangPlusParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(MiniLangPlusParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(MiniLangPlusParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(MiniLangPlusParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(MiniLangPlusParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStmt}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(MiniLangPlusParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStmt}
	 * labeled alternative in {@link MiniLangPlusParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(MiniLangPlusParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangPlusParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniLangPlusParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangPlusParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniLangPlusParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangPlusParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(MiniLangPlusParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangPlusParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(MiniLangPlusParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(MiniLangPlusParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(MiniLangPlusParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(MiniLangPlusParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(MiniLangPlusParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(MiniLangPlusParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(MiniLangPlusParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MiniLangPlusParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MiniLangPlusParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(MiniLangPlusParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(MiniLangPlusParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(MiniLangPlusParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(MiniLangPlusParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare(MiniLangPlusParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare(MiniLangPlusParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(MiniLangPlusParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MiniLangPlusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(MiniLangPlusParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangPlusParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(MiniLangPlusParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangPlusParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(MiniLangPlusParser.ArgListContext ctx);
}