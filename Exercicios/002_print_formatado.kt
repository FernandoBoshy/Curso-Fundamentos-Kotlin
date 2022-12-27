package Exercicios

fun main(args: Array<String>){
    print("Digite seu nome: ")
    val nome = readLine()              // readLine() ja é desatualizado
    print("Digite seu sobrenome: ")
    val sobrenome: String = readln()   // preferível usar readln()
    println("Seu nome é $nome")
    println("Seu sobrenome é $sobrenome")
}