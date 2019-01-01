enum class Color{
    BLUE,ORANGE,RED
}
fun main(args: Array<String>){
    val a= 10
    val b= 20
    val c=if(a<b) a else b  //If statement
    println("$c, is smaller")
    val sam="balayogi"
    val result=when(sam){   //when statement
        is String->"is the String of length ${sam.length}"
        else-> "is Integer"
    }
    println(result)
}

