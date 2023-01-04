package Collections

fun main(args: Array<String>){
    val numeros = Array<Int>(size = 10) {i -> i * 10}  // é uma lista de numeros com íncice 10

    for(numero in numeros){
        print("${numero}_")
    }
    println(numeros.get(1)) // pega o numero do índice 1
    println(numeros[1] * 1.5)     // mesma coisa

    println(numeros.size)

    numeros.set(1, 123)
    println(numeros[1])

    numeros[1] = 234
    println(numeros[1])


}