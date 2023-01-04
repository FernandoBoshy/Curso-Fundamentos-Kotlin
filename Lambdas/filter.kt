package Lambdas

data class Aluno(val nome: String, val nota: Double)

fun main(args: Array<String>){
    val alunos = arrayListOf(
        Aluno(nome = "Pedro", nota = 8.0),
        Aluno(nome = "Arthur", nota = 7.3),
        Aluno(nome = "Fernando", nota = 10.0),
        Aluno(nome = "João", nota = 5.8)
    )
    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }
    println(aprovados)
}