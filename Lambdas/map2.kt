package Lambdas

class Produto(val nome: String, val preco: Double)

val material_escolar = listOf(
    Produto(nome = "Lápis", preco = 10.0),
    Produto("Borracha", 5.0),
    Produto("Tesoura", 15.0),
    Produto("apontador", 21.0)
)

fun main(args: Array<String>){
    val totalizar = {total: Double, atual: Double -> total + atual}
    val precototal = material_escolar.map{it.preco}.reduce(totalizar)
    val precototal2 = material_escolar.map{it.preco}.reduce{acumulator: Double, total: Double -> acumulator + total}  // mesmo efeito das linhas 13 e 14

    println("a média de preços dos materiais é ${precototal / material_escolar.size}")
    println(precototal2)
}