// Generated from F:/Marwa/compilers/untitled1\task.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link taskParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface taskVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link taskParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(taskParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(taskParser.GenericSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssocList(taskParser.GenericAssocListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssociation(taskParser.GenericAssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(taskParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(taskParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(taskParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(taskParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(taskParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(taskParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(taskParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(taskParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(taskParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(taskParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(taskParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(taskParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(taskParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(taskParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(taskParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(taskParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(taskParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(taskParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(taskParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(taskParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(taskParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(taskParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(taskParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(taskParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(taskParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(taskParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(taskParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(taskParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(taskParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(taskParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(taskParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(taskParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(taskParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(taskParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(taskParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(taskParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(taskParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(taskParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(taskParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(taskParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(taskParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(taskParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(taskParser.AlignmentSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(taskParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(taskParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccDeclaratorExtension(taskParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeSpecifier(taskParser.GccAttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeList(taskParser.GccAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttribute(taskParser.GccAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(taskParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(taskParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(taskParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(taskParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(taskParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(taskParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(taskParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(taskParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(taskParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(taskParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(taskParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(taskParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(taskParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(taskParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(taskParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(taskParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(taskParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(taskParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(taskParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(taskParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(taskParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(taskParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(taskParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(taskParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(taskParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(taskParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(taskParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(taskParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(taskParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(taskParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(taskParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(taskParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(taskParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link taskParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(taskParser.DeclarationListContext ctx);
}