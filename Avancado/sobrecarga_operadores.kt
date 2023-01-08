package Avancado

data class Ponto(val x: Int, val y: Int) {
    operator fun plus(other: Ponto): Ponto = Ponto(x + other.x, y + other.y)
    operator fun unaryMinus(): Ponto = Ponto(-x, -y)
}

fun main(Args: Array<String>){
    val ponto1 = Ponto(5, 10)
    val ponto2 = Ponto(2, 6)

    println(-ponto1)
    println(ponto1 + ponto2)
}