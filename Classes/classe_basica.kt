package Classes

class Cliente{
    var nome: String = ""
}

fun main(args: Array<String>){
    val cliente = Cliente()
    cliente.nome = "joão"
    print("seu nome é ${cliente.nome}")
}