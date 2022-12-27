package Controle

//a unica diferença do "do while" para "while" é que o "do while" executará pelo menos 1 vez mesmo se o teste for falso

fun main(args: Array<String>){
    var opcao: Int = 0
    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("escolheu $opcao")
    } while(opcao != -1)
    println("até mais")
}