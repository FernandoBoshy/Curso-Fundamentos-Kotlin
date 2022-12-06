package fundamentos

fun main(args: Array<String>){
    val aprov = listOf("joão", "maria", "pedro")
    println("o primeiro colocado foi ${aprov[0]}")
    println("o segundo colocado foi ${aprov[1]}")
    println("o terceiro colocado foi ${aprov[2]}")
    println("___________________________")

    //usando if
    var bom_humor = true
    println("hoje estou ${if (bom_humor) "feliz" else "triste"}")
    bom_humor = false
    println("hoje estou ${if (bom_humor) "feliz" else "triste"}")
    println("___________________________")

    // métodos
    val a: Int = 50.dec()
    var b = a.toString()
    println("Int: $a.-º-.")
    println("primeiro char de string b é: ${b.first()}")


}