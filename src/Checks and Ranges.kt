
fun main(args: Array<String>){
    println(recognise('5'))
    println(recognise('a'))
    println(recognise('D'))
    println(recognise('$'))

    println("Kotlin" in "Java".."Scala")        //using in (gets true because we compare alphabetically)
    println("Kotlin" in setOf("Java","Scala"))
}

fun recognise(c:Char) = when(c){
    in '0'..'9' -> "it is a digit"      //using ranges
    in 'a'..'z', in 'A'..'Z' -> "It is a letter!"
    else -> "I don't know..."
}