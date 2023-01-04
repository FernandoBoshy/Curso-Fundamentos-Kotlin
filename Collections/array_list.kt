package Collections

fun main(args: Array<String>){
    val string = arrayListOf("Carro", "Moto", "Barco", "Avião")
    for(item in string){
        println(item.toUpperCase())
    }
}