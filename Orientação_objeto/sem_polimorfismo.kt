package Orientação_objeto

class Feijao(val peso: Double)
class Arroz(val peso: Double)

class Pessoa(var peso: Double){
    fun comer(feijao: Feijao){
        peso += feijao.peso
    }
    fun comer(arroz: Arroz){
        peso += arroz.peso
    }
}

fun main(args: Array<String>){
    val feijao = Feijao(0.3)
    val arroz = Arroz(0.5)

    val joao = Pessoa(85.2)

    println(joao.peso)
    joao.comer(arroz)
    joao.comer(feijao)
    println(joao.peso)
}

