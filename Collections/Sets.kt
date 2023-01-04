package Collections

fun Any.print() = println(this)

fun main(args: Array<String>){
    val conjunto = hashSetOf(3, 'a', 3.00, "texto", true, false)

//    conjunto.get(1)

    conjunto.add(3).print()
    conjunto.add(5).print()

    conjunto.size.print()
    conjunto.remove("a").print()  // false
    conjunto.remove('a').print()  // true

    conjunto.contains('a').print()
    conjunto.contains("texto").print()

    val nums = setOf(1, 2, 3)  // não consigo adicionar valores, setOf só aceita leitura
//    nums.add(4)
    (conjunto + nums).print()
    (conjunto - nums).print()


}