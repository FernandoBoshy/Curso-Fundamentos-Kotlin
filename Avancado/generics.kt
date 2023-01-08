package Avancado

import Collections.Objeto

class Caixa<generico>(val objeto: generico){   // tipo genérico inferido
    private val objetos = ArrayList<generico>()

    init {
        adicionar(objeto)
    }
    fun adicionar(novoObjeto: generico){
        objetos.add(novoObjeto)
    }
    override fun toString(): String = objetos.toString()
}

fun main(args: Array<String>){
    val itens = Caixa(objeto = "penal")
    itens.adicionar("borracha")
    itens.adicionar("caneta")
    val num = Caixa(1)
    num.adicionar(2)
    num.adicionar(3)
    println("$itens e $num")  // não funciona sem a linha 14
}