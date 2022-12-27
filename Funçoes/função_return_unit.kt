package Funçoes

fun imprime_maior(a: Int, b: Int){
    println(Math.max(a, b))
}
fun imprime_maior2(a: Int, b: Int): Unit { // Unit representa ausência de valor
    println(Math.max(a, b))
}
fun imprime_maior3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}
fun imprime_maior4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}
fun imprime_maior5(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>){
    imprime_maior(1, 2)
    imprime_maior2(1, 2)
    imprime_maior3(2, 1)
    imprime_maior4(3, 5)
    imprime_maior5(1, 2).run{2 > 1}.run{println("Resultado = $this")} // Unit é considerado um objeto, logo, ele tem métodos próprios para ele
}