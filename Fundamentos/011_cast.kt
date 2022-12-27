package Fundamentos

fun conceito(valor: Any) {
    when(valor as? Int){  //                sem a interrogação, a função vai retornar um erro por causa dos valores do "notas" ser um Double
        0, 1, 2, 3, 4 -> println('A')  //   com a interrogação, vai retornar nulo, mas sem erros críticos
        5, 6, 7 -> println("B") //          sem o "ToInt" não vai dar certo
        8, 9, 10 -> println("C")
        else -> println("inválido")
    }
}

fun main(args: Array<String>){
    val notas = arrayOf(9.0, 8.6, 7.7, 5.3, 4.2)
    for(x in notas){
        conceito(x.toInt())
    }
}