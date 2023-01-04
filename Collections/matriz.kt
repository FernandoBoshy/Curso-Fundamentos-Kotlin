package Collections

fun main(args: Array<String>){
    val matriz = Array(3) { arrayOfNulls<Int>(3) }

    matriz[0][0] = 1
    matriz[0][1] = 2
    matriz[0][2] = 3
    matriz[1][0] = 4
    matriz[1][1] = 5
    matriz[1][2] = 6
    matriz[2][0] = 7
    matriz[2][1] = 8
    matriz.get(2).set(2, 9)  // mesmo efeito

    for((linha, linha_array) in matriz.withIndex()) {
        for ((coluna, valor) in linha_array.withIndex()){
            println("[$linha]/[$coluna] - ${matriz[linha][coluna]} == $valor")
        }
    }

    for(linha in matriz){
        println("${linha[0]} - ${linha[1]} - ${linha[2]}")
    }
}