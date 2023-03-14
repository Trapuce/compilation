// Generated from calcul.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculParser}.
 */
public interface calculListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(calculParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(calculParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#calcul}.
	 * @param ctx the parse tree
	 */
	void enterCalcul(calculParser.CalculContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#calcul}.
	 * @param ctx the parse tree
	 */
	void exitCalcul(calculParser.CalculContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(calculParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(calculParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(calculParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(calculParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(calculParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(calculParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(calculParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(calculParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#fonction}.
	 * @param ctx the parse tree
	 */
	void enterFonction(calculParser.FonctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#fonction}.
	 * @param ctx the parse tree
	 */
	void exitFonction(calculParser.FonctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(calculParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(calculParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(calculParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(calculParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#loopFor}.
	 * @param ctx the parse tree
	 */
	void enterLoopFor(calculParser.LoopForContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#loopFor}.
	 * @param ctx the parse tree
	 */
	void exitLoopFor(calculParser.LoopForContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#bloc}.
	 * @param ctx the parse tree
	 */
	void enterBloc(calculParser.BlocContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#bloc}.
	 * @param ctx the parse tree
	 */
	void exitBloc(calculParser.BlocContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(calculParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(calculParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(calculParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(calculParser.FinInstructionContext ctx);
}