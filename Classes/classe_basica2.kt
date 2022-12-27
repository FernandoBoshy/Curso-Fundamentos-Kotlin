package Classes

class pessoa1(var nome: String)
class pessoa2(val nome: String, val sobrenome: String)
class pessoa3(nomeInicial: String) {  // "nomeInicial não pode ser usado como atributo de instancia (por exemplo p3.nomeInicial) por não ter sido atribuido que é var ou val
    val nome: String = nomeInicial
}
fun main(args: Array<String>){
    val p1 = pessoa1(nome = "maria")
    p1.nome = "joão"
    println("nome da pessoa 1 = ${p1.nome}")

    val p2 = pessoa2(nome = "maria", sobrenome = "madalena")  // é uma constante
    val p3 = pessoa3("guilherme")
    println("${p2.nome} e ${p3.nome}")
    println("${p2.sobrenome} é legal")

}