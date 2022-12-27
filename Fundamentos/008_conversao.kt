package Fundamentos

fun main(args: Array<String>){
    var x = 1

    //int pra string
    println(x.toString() + 1)
    //string para numeros
    println("1.8".toDouble() + 3)
    println("teste".toIntOrNull() ?: 0)
    println("123".toInt() -100)
}