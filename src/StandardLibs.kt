fun main(args: Array<String>){
    val set = hashSetOf(1,7,53)
    val list = arrayListOf(1,3,53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    val a="""
        |Keep calm
        |and learn Kotlin""".trimMargin()
    val q = """To code,
        or not to code?..""".trimIndent()
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
    println(q)
    println(a)
}