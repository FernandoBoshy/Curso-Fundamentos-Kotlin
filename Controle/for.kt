package Controle

fun main(args: Array<String>){
    for(i in 0..10){
        print(i)
    }
    println("")
    for(i in 10 downTo 0){
        print(i)
    }
    println("")
    for(i in 0..50 step 5){
        print(i)
    }
    println("")
    for(i in 100 downTo 0 step 10){
        print(i)
    }
}