fun foo(): String{
    println("calculating foo...")
    return "foo"
}

fun main(args: Array<String>){
    println("first ${foo()}, second ${foo()}")
}