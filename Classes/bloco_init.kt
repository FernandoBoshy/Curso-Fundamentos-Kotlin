package Classes

class Filme3(nome: String, ano_lancamento: Int, genero: String) {
    val nome: String
    val ano_lancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.ano_lancamento = ano_lancamento
        this.genero = genero
    }
}
fun main(args: Array<String>){
    val filme = Filme3(nome = "os incriveis", ano_lancamento = 2004, genero = "ação")
    println("${filme.nome} foi lançado em ${filme.ano_lancamento}")
}