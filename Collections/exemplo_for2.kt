package Collections

fun main(args: Array<String>){
    val alunos = arrayListOf("amanda", "andre", "bernardo", "carlos")
    alunos.forEach{println(it)}

    alunos.forEach(
        {println(it)}
    )
}