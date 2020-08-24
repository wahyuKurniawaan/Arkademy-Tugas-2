package task_01

/**
 * Soal : Buat dua variabel x=10, y=20 Kemudian tukarkan isi variabel tersebut menjadi output x=20, y=10
 */

fun main() {
    var x = 10
    var y = 20
    val temporary: Int?

    temporary = x
    x = y
    y = temporary

    println("X = $x")
    println("Y = $y")
}