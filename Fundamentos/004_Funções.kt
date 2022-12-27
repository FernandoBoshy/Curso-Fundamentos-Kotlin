package Fundamentos

// fun func(param: Int): Int{} param = tipo de entrada e depois tipo de saída (nenhum deles é obrigatório)

fun somar(a: Int, b: Int, c: Int){  // função sem retorno
    println(a + b + c)
}

fun somar2(a: Int = 8, b: Int = 10){
    println(a + b)

}

fun main(args: Array<String>){
    somar(1, 2, 3)
    somar2(5)
    somar2()

}