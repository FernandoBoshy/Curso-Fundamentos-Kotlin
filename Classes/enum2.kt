package Classes

enum class DiaSemana2(val id: Int, val nome: String, val util: Boolean){
    DOMINGO(1, "domingo", false),
    SEGUNDA(2, "segunda", true),
    TERCA(3, "terça", true),
    QUARTA(4, "quarta", true),
    QUINTA(5, "quinta", true),
    SEXTA(6, "sexta", true),
    SABADO(7, "sabado", false)
}

fun main(args: Array<String>){
    for(dia in DiaSemana2.values()) {
        println("${dia.nome} é o ${dia.id}º da semana e ${if(dia.util) "é" else "não é"} um dia útil")
    }
}