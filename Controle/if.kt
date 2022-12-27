package Controle

fun main(args: Array<String>){
    var nota: Float = 8.4F
    val x: Boolean = true

    if(nota >= 7.0F && x == true) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }
// ____________________________________
    nota = 5.0F
    val nota2: Float = 7.8F
    val maior_nota = if (nota > nota2) {  // usando if como expressão de valor
        // nota nao pode ficar aqui, deve ser a ultima sentença
        println("processando if...")
        nota
    } else {
        println("processando else...")
        nota2
    }

    val menor_nota = if(nota < nota2) nota else nota2   // forma reduzida e também válida



    println("a maior nota é $maior_nota")
    println("a menor nota é $menor_nota")
}