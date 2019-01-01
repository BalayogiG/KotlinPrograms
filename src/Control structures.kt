enum class Color{
    BLUE,ORANGE,RED
}
fun main(args: Array<String>){
    val a= 10
    val b= 20
    val c=if(a<b) a else b
    println("$c, is smaller")

    val result=when(a){
        0->"is zero"
        else-> " is Integer"
    }
    println(result)
}

