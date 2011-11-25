package silAST.symbols
import silAST.source.SourceLocation
import silAST.ASTNode

abstract class Function(
		sl : SourceLocation, 
		val name : String,
		val signature : FunctionSignature
    ) extends ASTNode(sl)
{

}