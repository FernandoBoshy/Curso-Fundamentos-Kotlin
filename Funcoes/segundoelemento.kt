package Funcoes

fun <E>List<E>.second_or_null(): E? = if(this.size >= 2) this.get(1) else null

fun main(args:Array<String>){
    val list = listOf("joão", "maria", "pedro")
    print(list.second_or_null())
}