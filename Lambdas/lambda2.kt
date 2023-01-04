package Lambdas

fun main(args: Array<String>){
    val nome = arrayListOf("fernando", "gui", "pedro", "joão", "Caio")
    val ordenado = nome.sortedBy { it }
    val ordenado2 = nome.sortedBy { it.reversed() } // o reversed inverte cada item da array,
                                                    // dessa forma seria como se fosse em ordem alfabetica da ultima letra
    println(ordenado)
    println(ordenado2)
}