import java.lang.IllegalArgumentException

fun main(args: Array<String>){
    val num =100
    val percentage=
        if(num in 0..100)
            num
        else
            throw IllegalArgumentException("A percentage value must be "+
                "between 0 and 100: $num")
    print(percentage)
}

