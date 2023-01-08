package Orientação_objeto

open class Comida(var peso: Double)
class Feijao2(peso: Double): Comida(peso)
class Arroz2(peso: Double): Comida(peso)
class Ovo(peso: Double): Comida(peso)

class Pessoa2(var peso: Double){
    fun comer(comida: Comida){
        peso += comida.peso
    }
}

fun main(args: Array<String>){
    val feijao2 = Feijao2(0.3)
    val arroz2 = Arroz2(0.5)
    val ovo = Ovo(0.2)


    val joao = Pessoa2(85.2)

    println(joao.peso)
    joao.comer(arroz2)
    joao.comer(feijao2)
    joao.comer(ovo)
    println(joao.peso)
}