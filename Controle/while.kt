package Controle

fun main(args: Array<String>){
    var opcao: Int = 0

    while(opcao != -1){
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("opção escolhida: $opcao")

    }
    println("Final de código")

    var x: Int = 1
    var y: Int = 1
    while(y <= 10) {
        if(x == 10){
            println("$x x $y = ${x*y}")
            x++
        } else {
            print("$x x $y = ${x*y}  _~_  ")
            x++
        }

        if(x >= 11){
            x = 1
            y++
        }

    }
}