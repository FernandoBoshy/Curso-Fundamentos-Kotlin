package Collections

fun main(args: Array<String>){
    val map = hashMapOf(1 to "gui", 2 to "maria", 3 to "pedro")
    for((x, y) in map){
        println("$x é $y")
    }
}