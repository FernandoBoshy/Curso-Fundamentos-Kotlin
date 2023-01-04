package Lambdas

fun main(args: Array<String>){
    val alunos = arrayListOf("Pedro", "João", "Maria", "Guilherme", "Carlos")
    alunos.map { it.toUpperCase() }.apply { print(this) }

}