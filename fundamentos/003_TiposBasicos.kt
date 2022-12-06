package fundamentos

fun main(args: Array<String>){
    // Tipos numeric inteiros = byte, short, int e long
    val num1: Byte = 127
    val num2: Short = 30_000 // Pode colocar underline entre os números
    val num3: Int = 2_000_000_000
    val num4: Long = 9_000_000_000_000_000_000
    print(Long.MAX_VALUE) // Print do valor maximo de um long

    // Tipos de números reais
    val num5: Float = 3.5F
    val num6: Double = 4.5

    // Tipos String
    val char1: Char = 'b' // Char aceita só 1 Character

    // Tipos booleanos
    val bool1: Boolean = true
    val bool2: Boolean = false

    println(listOf(num1, num2, num3, num4, num5, num6, char1, bool1))
}