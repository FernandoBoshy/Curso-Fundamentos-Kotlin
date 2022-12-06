package funçoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.mais_caro(produto: Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>){
    val p1 = Produto(nome = "ipad", preco = 2345.00)
    val p2 = Produto("carimbo", 150.00)
    println(p1 mais_caro p2) // infix quer dizer que a função está no meio dos operadores (como 1+1, o + é infix)
    println(p2.mais_caro(p1)) // notação convencional também funciona
}