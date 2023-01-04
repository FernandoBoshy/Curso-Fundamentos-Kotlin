package Lambdas

class Calculadora2{
    var resultado = 0

    fun soma(valor1: Int, valor2: Int) {
        resultado += valor1 + valor2
    }
    fun add(valor: Int){
        resultado += valor
    }
}

fun main(args: Array<String>){
    val calculadora = Calculadora2()

    //encadeamento de chamadas
    calculadora.apply { soma(1, 2) }.apply { add(4) }.apply { println(resultado) }.apply { add(3) }.apply { println(resultado) }

    calculadora.apply {
        soma(200, 10)
        add(51)
        println(resultado)
    }
}