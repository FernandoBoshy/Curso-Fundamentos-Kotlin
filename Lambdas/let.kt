package Lambdas

fun main(args: Array<String>){
    val lista_variada: List<String?> = listOf("A", null, "B", null, "C", null, "D", "E")

    for(item in lista_variada){
        item?.let{
            println(item)
        }
    }

}