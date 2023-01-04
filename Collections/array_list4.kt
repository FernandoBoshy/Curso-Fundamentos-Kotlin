package Collections

fun main(args: Array<String>){
    val num = arrayListOf(1, 2, 3)
    val str = arrayListOf("joão", "pedro", "maria")
    val uniao = num + str  // sobrecarga de operadores

    for(item in uniao){
        println(item)
    }
}