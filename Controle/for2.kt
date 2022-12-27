package Controle

fun main(args: Array<String>){
    val nomes = arrayListOf("paulo", "mario", "fernando", "guilherme")
    for((indice, nome) in nomes.withIndex()){
        println("${indice + 1} - $nome")
    }
}