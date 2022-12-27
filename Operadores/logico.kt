package Operadores

fun main(args: Array<String>){
    val trab1: Boolean = true
    val trab2: Boolean = false

    val tv50: Boolean = trab1 && trab2
    val sorvete: Boolean = trab1 || trab2
    val tv32: Boolean = trab1 xor trab2

    println(tv50)
    println(tv32)
    println(sorvete)
    if(!sorvete){
        println("sem sorvete")
    }
}