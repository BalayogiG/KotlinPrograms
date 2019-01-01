//using Extenstion functions

import java.lang.StringBuilder

fun String.lastChar() = get(length-1)

fun String.repeat(n:Int): String{
    val sb=StringBuilder(n*length)
    for(i in 1..n){
        sb.append(this)
    }
    return sb.toString()
}

fun main(args: Array<String>) {
    val c: Char = "abcdefghijk".lastChar()      //printing last character in string
    val str: String = "abc".repeat(3)           //print the given string for 3 number of times
    print(c)
    print("\n")
    print(str)
}