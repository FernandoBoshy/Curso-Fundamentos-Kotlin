package Classes

class Item_de_pedido(val nome: String, val preco: Double){
    companion object{
        fun create(nome: String, preco: Double) = Item_de_pedido(nome, preco)
        @JvmStatic var desconto: Double = 0.0
    }
    fun preco_desconto(): Double {
        return preco - preco * desconto
    }
}

fun main(args: Array<String>){
    val i1 = Item_de_pedido.create("Tv 50", 2500.00)
    val i2 = Item_de_pedido("liquidificador", 100.00)
    Item_de_pedido.desconto = 0.20
    println(i1.preco_desconto())
    println((i2.preco_desconto()))
}