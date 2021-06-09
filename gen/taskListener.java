// Generated from F:/Marwa/compilers/untitled1\task.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

import java.io.IOException;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link taskParser}.
 */
public interface taskListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link taskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(taskParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(taskParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(taskParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(taskParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(taskParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(taskParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(taskParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(taskParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(taskParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(taskParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(taskParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(taskParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(taskParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(taskParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(taskParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(taskParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(taskParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(taskParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(taskParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(taskParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(taskParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(taskParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(taskParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(taskParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(taskParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(taskParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(taskParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(taskParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(taskParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(taskParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(taskParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(taskParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(taskParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(taskParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(taskParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(taskParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(taskParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(taskParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(taskParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(taskParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(taskParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(taskParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(taskParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(taskParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(taskParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(taskParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(taskParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(taskParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(taskParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(taskParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(taskParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(taskParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(taskParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(taskParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(taskParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(taskParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(taskParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(taskParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(taskParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(taskParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(taskParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(taskParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(taskParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(taskParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(taskParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(taskParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(taskParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(taskParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(taskParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(taskParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(taskParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(taskParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(taskParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(taskParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(taskParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(taskParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(taskParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(taskParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(taskParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(taskParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(taskParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(taskParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(taskParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(taskParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(taskParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(taskParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(taskParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(taskParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(taskParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(taskParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(taskParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(taskParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(taskParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(taskParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(taskParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(taskParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(taskParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(taskParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(taskParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(taskParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(taskParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(taskParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(taskParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(taskParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(taskParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(taskParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(taskParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(taskParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(taskParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(taskParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(taskParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(taskParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(taskParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(taskParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(taskParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(taskParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(taskParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(taskParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(taskParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(taskParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(taskParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(taskParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(taskParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(taskParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(taskParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(taskParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(taskParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(taskParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(taskParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(taskParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(taskParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(taskParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(taskParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(taskParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(taskParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(taskParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(taskParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(taskParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(taskParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(taskParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(taskParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(taskParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(taskParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(taskParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(taskParser.CompoundStatementContext ctx) throws IOException;
	/**
	 * Exit a parse tree produced by {@link taskParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(taskParser.CompoundStatementContext ctx) throws IOException;
	/**
	 * Enter a parse tree produced by {@link taskParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(taskParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(taskParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(taskParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(taskParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(taskParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(taskParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(taskParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(taskParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(taskParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(taskParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(taskParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(taskParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(taskParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(taskParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(taskParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(taskParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(taskParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(taskParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(taskParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(taskParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(taskParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(taskParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(taskParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(taskParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(taskParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(taskParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link taskParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(taskParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link taskParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(taskParser.DeclarationListContext ctx);
}