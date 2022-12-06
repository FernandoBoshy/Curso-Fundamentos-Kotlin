package fundamentos

import fundamentos.pacotes.funcao_simples as funcao_texto   // não precisa referenciar o file
import fundamentos.pacotes.Coisa
import fundamentos.pacotes.FaceMoeda.CARA
import fundamentos.pacotes.subtraindo
import fundamentos.pacotes.somando

// import fundamentos.pacotes.* para importar tudo

fun main(args: Array<String>){
    kotlin.io.println(funcao_texto("teste"))

    val coisa = Coisa("Bola")
    println(coisa)
    println(coisa.nome)

    println(CARA)

    println("a soma de 2 e 3 é ${somando(2, 3)} e a subtração de 5 e 2 é ${subtraindo(5, 2)}")
}