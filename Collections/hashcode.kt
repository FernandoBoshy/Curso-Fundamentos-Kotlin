package Collections

class Objeto(val nome: String, val desc: String){
    override fun hashCode(): Int {
        return nome.length
    }

    override fun equals(other: Any?): Boolean {
        if(other is Objeto){
            return nome.equals(other.nome, ignoreCase = true)
        } else {
            return false
        }
    }

}

fun main(args: Array<String>){
    val conjunto = hashSetOf(
        Objeto("cadeira", "de madeira"),// hashcode vai ser igual 7 (# de caracteres)
        Objeto("mesa", "de madeira"),   // hashcode vai ser igual 4
        Objeto("copo", "de plastico"),  // hashcode vai ser igual 4
        Objeto("faca", "de plastico")   // hashcode vai ser igual 4
    )
}