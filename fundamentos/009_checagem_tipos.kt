package fundamentos

fun main(args: Array<String>){
    val x: Any = 123 //sem o Any, ele vai retornar um erro por não fazer sentido comparar um int com string
    if(x is String){
        print(x)
    } else if(x !is String){
        print("não é valor")
    }
    val y = 2
    val z = 2.0 // isso é Double
    val w = 2.0F // isso é Float
    if(y is Int){
        print(y)
    }
    if (z is Double){ // z is Float retorna um erro
        print(z)
    }
}