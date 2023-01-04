package Lambdas

fun main(args: Array<String>){
    val soma = {x: Int, y: Int -> x + y}
    println(soma(1, 2))

    val soma2 = {x: Int, y: Int -> x + y
    3 + 5 // mostrar que o retorno é a ultima sentença da função da variável
    }
    println(soma2(1, 2))
}