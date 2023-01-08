package Funcoes

fun min(a: Int, b: Int): Int{
    return if(a < b) a else b
}

fun main(args: Array<String>){
    val x = 5
    val y = 8
    print("o menor valor é ${min(x, y)}")
}