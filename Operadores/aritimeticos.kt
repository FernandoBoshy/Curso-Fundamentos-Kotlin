package Operadores

fun main(args: Array<String>) {
    var(v1, v2, v3, v4) = listOf(3, 4, 7, 12)
    val soma = v1 + v2 + v3 + v4
    val sub = v1 - v2 - v3 - v4
    val mult = v1 * v2 * v3 * v4
    val div = v4 / v1
    println("$soma _ $sub _ $mult _ $div")
    println("")

    v1++ //pósfixado
    println(v1)
    ++v1 //préfixado
    v1--
    println(v1)
}