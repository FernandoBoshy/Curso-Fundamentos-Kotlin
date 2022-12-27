package Classes

class Filme2(val nome: String,val ano_lancamento: Int, val genero: String)

fun main(variavel_qualquer: Array<String>){
    val filme = Filme2("monstros SA", 2001, "comedia")
    println("${filme.nome} foi lançado em ${filme.ano_lancamento}")
}