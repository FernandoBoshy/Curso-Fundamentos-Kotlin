package Collections

data class Fruta(val nome: String, val preco: Double)

fun main(args: Array<String>){
    var frutas = arrayListOf(
        Fruta("banana", 2.0),
        Fruta("maça", 5.0),
        Fruta("morango", 20.0),
        Fruta("melancia", 20.0)
    )
    for(fruta in frutas){
        println("${fruta.nome} -- R$${fruta.preco}")
    }

    println(frutas.contains(Fruta("banana", 2.0)))  // retorna true por conta da classe ser um "data class"
                                                                // se fosse apenas "class" retornaria false
    println(frutas.distinctBy { it.preco })  // não mostra itens com valores iguais
}