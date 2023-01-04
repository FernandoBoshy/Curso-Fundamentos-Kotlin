package Classes

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean){
    val inativo: Boolean get() = !ativo
    val preco_desconto: Double get() = preco * (1 - desconto)
}

fun main(args: Array<String>){
    val p1 = Produto(nome = "ipad", preco = 1500.00, desconto = 0.40, ativo = true)
    println(p1.preco_desconto)
    val p2 = Produto("galaxy", 1000.00, 0.30, false)
    println("${p2.nome}\n\t${p2.preco}\n\t${p2.preco_desconto}")   // \n é a quebra de linha e \t é o tab

    if(p2.inativo){
        p2.preco = 0.0
        println("Depois de inativo: ${p2.preco_desconto}")
    }
}