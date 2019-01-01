fun sum(a:Int=0, b:Int=0,c:Int=0): Int{
    return a+b+c
}

fun main(args:Array<String>){
    println(sum())
    println(sum(1))
    println(sum(2))
    println(sum(3))
    println(sum(1, 2))
    println(sum(1, 3))
    println(sum(2, 3))
    println(sum(1, 2, 3))
}