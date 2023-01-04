package Lambdas

data class Casa(var endereco: String = "", var num: Int = 0)

fun main(args: Array<String>){
    val casa = Casa()

    casa.run{
        endereco = "rua tal"
        num = 123
    }
    casa.apply {   // o apply retorna o proprio objeto, o run não retorna
        endereco = "rua abc"
        num = 456
    }

    println("${casa.endereco}, ${casa.num}")
}