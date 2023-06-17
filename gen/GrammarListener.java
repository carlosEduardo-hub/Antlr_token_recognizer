// Generated from C:/Users/joseg/PycharmProjects/antlr_simple_token_recognizer\Grammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(GrammarParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(GrammarParser.InicioContext ctx);
}