package Avancado


fun fatorial(num: Int): Int = when(num) {
    in 0..1 -> 1
    in 2..Int.MAX_VALUE -> num * fatorial(num - 1)
    else -> throw IllegalArgumentException("Número inválido")
}

fun main(args: Array<String>){
    println("O resultado de fatorial de 5 é ${fatorial(5)}")
}