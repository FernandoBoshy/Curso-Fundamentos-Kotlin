package Classes

// erro: a variável não pode ser reatribuida
//fun por_referencia(velocidade: Int) {
//    velocidade++
//}


data class Carro(var marca: String, var modelo: String, var velocidade: Int = 0)

fun por_referencia(carro: Carro){
    carro.velocidade++
}

fun main(args: Array<String>){
    var carro1 = Carro("ford", "fusion")
    var carro2 = carro1
    carro2.modelo = "edgy" // vai mudar na referencia das duas variáveis por causa do caminho da memoria
    println(carro1)

    carro1 = Carro("Audi", "A4")
    por_referencia(carro1)
    por_referencia(carro2)

    println(carro1)
    println(carro2)

    var a = 1
    var b = a
    println(a === b)
    b++  // mudou a referencia da variável
    println(a === b)
}
