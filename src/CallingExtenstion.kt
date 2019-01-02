open class Parent
class Child: Parent()

fun Parent.foo() = "Parent"
fun Child.foo() = "Child"

fun main(args:Array<String>){
    val parent: Parent=Child()
    println(parent.foo())
}