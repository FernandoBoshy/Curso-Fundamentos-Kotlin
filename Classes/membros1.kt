package Classes

class Data(var dia: Int, var mes: Int, var ano: Int){
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main(args: Array<String>){
    var nascimento: Data = Data(dia = 10, mes = 12, ano = 2003)
    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")  // forma tradicional
    with(nascimento) {println("$dia/$mes/$ano")}  // forma reduzida e simplificada
    nascimento.dia = 23
    println(nascimento.formatar())
}