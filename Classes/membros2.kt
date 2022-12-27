package Classes

class Calculadora {
    private var resultado: Int = 0
    fun somar(vararg valores: Int): Calculadora {
        valores.forEach{resultado += it}
        return this
    }
    fun mult(valor: Int): Calculadora {
        resultado *= valor
        return this
    }
    fun limpar(): Calculadora{
        resultado = 0
        return this
    }
    fun print(): Calculadora{
        println(resultado)
        return this
    }
    fun obter_resultado(): Int {
        return resultado
    }
}

fun main(args: Array<String>){
    val calculadora = Calculadora()
    calculadora.somar(1, 2 ,3, 4).mult(5).print()
    calculadora.somar(1).print()
    calculadora.somar(1).print().limpar()

    println(calculadora.obter_resultado())
}