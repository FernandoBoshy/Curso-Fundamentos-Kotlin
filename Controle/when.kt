package Controle

fun main(args: Array<String>) {
    val nota = 2

    when (nota){
        10, 9 -> println("Fantástico")
        8, 7 -> println("Ótimo")
        4, 5, 6 -> println("Recuperável")
        in 0..3 -> println("Reprovado")
        else -> println("Nota inválida")
    }
}