package funçoes

fun relacao_trabalho(chefe: String, funcionario: String): String{
    return "$funcionario é subordinado de $chefe."
}
fun main(args: Array<String>){
    println(relacao_trabalho("joão", "pedro"))
    println(relacao_trabalho(funcionario = "fernando", chefe = "lucas"))
}