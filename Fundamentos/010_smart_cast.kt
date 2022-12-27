package Fundamentos

fun teste(valor: Any){ // pela variável ser de um tipo genérico, eu consigo usar métodos de qualquer tipo na mesma
    if(valor is String){
        println(valor.toUpperCase())
    } else if(valor is Int){
        println(valor.plus(3))
    }
}

fun teste2(valor: Any){
    when(valor){
        is String -> println(valor.toUpperCase())
        is Int -> println(valor.plus(4))
        else -> println("errado")
    }
}

fun main(args: Array<String>){
    teste("ola")
    teste(20)
    teste2("bom dia")
    teste2(40)
}