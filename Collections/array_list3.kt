package Collections

fun main(args: Array<String>){
    val lista_any = arrayListOf<Any>("carro", "moto", 1, 5, true, "b")

    for(item in lista_any){
        if(item is String){  // smart cast
            println(item.toUpperCase())
        } else {
            println(item)
        }
    }
}