package Fundamentos

fun main(args: Array<String>){
    val a: Int? = null  // safe call operator, para variaveis nulas
    println(a?.dec())

    var opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor padrão" // sem o operador elvis (?:) vai dar erro no print
    println(obrigatorio)
    opcional = "outro valor"
    println(opcional)
}