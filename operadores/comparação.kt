package operadores

import java.util.Date

fun main(args: Array<String>){
    val x = Date(0)
    val y = Date(0)
    val z = y
    //igualdade estrutural
    println(x == y)
    println(x == z)
    //igualdade referencial
    println(x === y)
    println(x === z)


}