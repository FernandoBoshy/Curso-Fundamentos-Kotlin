package Orientação_objeto

// serve para var, val e fun
private val x = 1  // dentro do arquivo
//protected val y = 2  // só pode ser usado dentro de classes
val z = 0 // constante pública
internal val w  = 0  // dentro do projeto
internal fun funcao() = 0

open class Capsula {
    private val dentro_objeto = 0  // dentro do objeto
    internal val interna = 0  // dentro do projeto
    protected val  heranca = 0  // acessível por herança ou na propria classe
    val publica = 0  // publico
}

class Capsula_filha : Capsula() {  // criação de uma classe por herança
    fun verificar_acesso() {
//      println(Capsula.dentro_objeto)   não funciona, a variável é privada, não transmite por herança
//      println(Capsula.heranca)         não precisa instanciar o tipo da classe pai
        println(heranca)  //             forma correta de transmitir por herança
        println(interna)
        println(publica)
    }
}
fun verificar_acesso(){
//  println(Capsula().dentro_objeto)
//  println(Capsula().heranca)
    println(Capsula().interna)
    println(Capsula().publica)
}
