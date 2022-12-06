package funçoes

fun ordenar(vararg numero: Int): IntArray{
    return numero.sortedArray()
}
fun main(args:Array<String>){
    for(x in ordenar(1, 4, 7, 2, 4, 9, 7)){
        print("$x ")
    }
}