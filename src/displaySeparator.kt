fun main(args: Array<String>){
    displaySeparator( '*', 20)
}

fun displaySeparator(character: Char = '*', size:Int = 10){
    repeat(size){
        print(character)
    }
}