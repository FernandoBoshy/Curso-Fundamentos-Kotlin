package Lambdas

fun main(args: Array<String>){
    print("Digite sua mensagem: ")
    val entrada = readLine()
    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "Sem mensagem"

    println(mensagem)
}