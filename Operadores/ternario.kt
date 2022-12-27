package Operadores

fun obter_resultado(nota: Double) : String = if(nota >= 7) "Passou" else "Reprovado"

//é a mesma coisa que

fun obter_resultado2(nota: Double) : String {
    return if (nota >= 7) "Passou" else "Reprovado"
}


fun main(args: Array<String>){
    print(obter_resultado(8.0))
}