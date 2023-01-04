package Collections

fun main(args: Array<String>){
    val alunos = arrayListOf("pedro", "amanda", "fabio")
    for(aluno in alunos){
        println("$aluno")
    }
    for((indice, aluno) in alunos.withIndex()){
        println("${indice+1}ª - ${aluno}")
    }
}