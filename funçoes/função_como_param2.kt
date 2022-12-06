package funçoes

fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E>{
    val lista_filtrada = arrayListOf<E>()
    for(e in lista) {
        if(filtro(e)){
            lista_filtrada.add(e)
        }
    }
    return lista_filtrada
}

fun tres_letras(nome: String): Boolean {
    return nome.length == 3
}
fun quatro_letras(nome: String): Boolean {
    return nome.length == 4
}


fun main(args: Array<String>){
    val nomes = listOf("pedro", "ana", "bia", "lucas", "gui", "jose")
    println(filtrar(nomes,::quatro_letras))
    println(filtrar(nomes, ::tres_letras))
}