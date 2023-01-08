package Avancado

annotation class Positivo
annotation class NaoVazio

class Pessoa(id: Int, nome: String){
    @Positivo
    var id: Int = id

    @NaoVazio
    var nome: String = nome
}

// reflection
fun get_valor(objeto: Any, nomeAtributo: String): Any {
    val atributo = objeto.javaClass.getDeclaredField(nomeAtributo)
    val acessivel = atributo.isAccessible   // nao sei se é true ou false

    atributo.isAccessible = true  // passando para true
    val valor = atributo.get(objeto)
    atributo.isAccessible = acessivel

    return valor
}