package Classes

class Filme{
    val nome: String
    val ano_lancamento: Int
    val genero: String

    constructor(nome: String, ano_lancamento: Int, genero: String) {
        this.nome = nome
        this.ano_lancamento = ano_lancamento
        this.genero = genero
    }
}
fun main(args: Array<String>){
    val filme = Filme(nome = "chefão", ano_lancamento = 1972, genero = "drama")
    println("o filme ${filme.nome} foi lançado em ${filme.ano_lancamento}")
}