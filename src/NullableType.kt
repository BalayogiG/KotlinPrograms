fun  main(args : Array<String>){
    val s1: String = "always I am Best..."
    val s2: String? = null  //? is used to store null values in string
    print(s1+"\n")
    print(s2+"\n")
    print(s1.length)
    println()
    //print(s2.length)   // can't acceptable
    print(s2?.length)   //to print length of null variable
    println()
    method1()           //calling method
    println()
    method2()           // answer woule be 1 because of operator precedence
}

fun method1(){
    val a:Int? = null
    val b:Int? = 1
    val c:Int = 2

    val s1 = (a ?: 0)+c
    val s2 = (b ?: 0)+c
    print("$s1$s2")
}

fun method2(){
    val x: Int? =1
    val y: Int =2
    val sum  = x ?: 0+y
    print(sum)
}