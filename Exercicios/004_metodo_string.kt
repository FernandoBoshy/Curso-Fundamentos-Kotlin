package Exercicios

fun main(args: Array<String>){
    print("Digite algo: ")
    var algo = readln()
    println(algo.length) // retorna quantos caracteres foram digitados
    println(algo.equals("palavra")) // retorna um booleano
    println(algo + algo)
    println((algo.toIntOrNull() ?: 0) + 10) // transforma o que foi escrito em Inteiro
    println("______________")
    println(algo.lowercase()) // tudo em minúsculo
    println(algo.uppercase()) // tudo em maiúsculo
    println(algo.capitalize()) // primeira letra em maiúsculo (Capitalizado)
    println(algo.isBlank())  // retorna um booleano, true se não foi digitado nada
    println("______________")
    println("123".toInt() -23)
    println(12.toString() + "34")



}