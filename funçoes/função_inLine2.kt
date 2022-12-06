package funçoes

inline fun <T> executar_com_log(nome_funcao: String, funcao: () -> T): T {
    println("entrando método $nome_funcao. . .")
    try {
        return funcao()
    } finally {
        println("metodo $nome_funcao finalizado")
    }
}

fun somar2(a: Int, b: Int): Int{
    return a + b
}

fun main(args: Array<String>){
    val resultado = executar_com_log("somar"){
        somar2(3, 6)
    }
    println(resultado)

    val resultado2 = executar_com_log("somar"){
        somar2(3, 6)
        2 + 2 // o resultado da função vai ser a ultima sentença de operação do corpo da função
    }
    println(resultado2)
}