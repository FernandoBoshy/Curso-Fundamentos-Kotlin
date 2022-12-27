package Operadores

data class Carro(val marca: String, val modelo: String)

fun main(args: Array<String>) {
    val (marca, modelo) = Carro("ford", "fusion")
    println("$marca $modelo")

    val (marido, mulher) = listOf("joão", "maria")
    println("$marido $mulher")

    val (_, segundo, terceiro) = listOf("primeiro lugar", "segundo lugar", "terceiro lugar")
    println(terceiro)
}
