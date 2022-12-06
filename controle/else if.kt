package controle

fun main(args: Array<String>) {
    val nota: Double = 9.6

    if (nota in 9.0..10.0) {
        println ("Fantastico")
    } else if (nota in 7.0..8.99) {
        println("Passou")
    } else if (nota in 3.0..6.99) {
        println("Da pra recuperar")
    } else {
        println("Reprovado")
    }
}