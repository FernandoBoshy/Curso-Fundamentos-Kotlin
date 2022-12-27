package Controle

fun main(args: Array<String>){
    for(i in 1..10){
        if(i == 1 || i == 3){
            continue
        }
        println("numero $i")
    }

}