package Collections

fun main(args: Array<String>){
    var map = HashMap<Long, String>()

    map.put(10020030040, "joão")
    map.put(10020030041, "maria")
    map.put(10020030042, "carlos")

    map.put(10020030042, "carlos filho")

    for(x in map){
        println(x)
    }
    for(nome in map.values){
        println(nome)
    }
    for(cpf in map.keys){
        println(cpf)
    }
    for((x, y) in map){
        println("$x - $y")
    }
}