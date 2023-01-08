package Funcoes

inline fun transacao(funcao:() -> Unit) {  // a função inline tem uma função como param // () significa que essa função não tem param // Unit = retorna void
    println("abrindo transação...")
    try{
        funcao()
    } finally {
        println("fechando transação")
    }
}

fun main(args: Array<String>){
    transacao {
        println("executando transação")  // esse corpo da função representa o "try funcao()" alí de cima
    }
    transacao ({
        println("executando transação")  // pode ser feito com parênteses igual uma função normal
    })
}
