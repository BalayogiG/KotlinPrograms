fun main(args: Array<String>){
    val list = listOf("a", "b", "c")
    print("For loop using listOf\n")
    for(s:String in list){
        print(s)
    }
    print("\n")

    print("For loop using mapOf\n")
    val map=mapOf(1 to "One",
        2 to "Two",
        3 to "Three")
    for((key,value) in map){
        println("$key = $value")
    }

    for(i in 1..9){     //using upper bound and lower bound
        print(i)
    }
    print("\n")
    for(i in 1 until 10){       //using Unitl keyword
        print(i)
    }
    print("\n")
    for(i in 9 downTo 1 step 2){    //using dowmTo keyword
        print(i)
    }
    print("\n")
    for(ch in "abc"){       //using for loop in character
        print(ch+1)
    }
}