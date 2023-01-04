package Collections

fun main(args: Array<String>){
    val pares = arrayListOf<Int>(2, 4, 6, 8, 10)
    val impares = intArrayOf(1, 3, 5, 7, 9)

    println(impares.union(pares))

    for(n in impares.union(pares).sorted())
        println("$n")

}