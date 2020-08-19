package task_01

/**
 * Soal : Buat dua variabel x=10, y=20 Kemudian tukarkan isi variabel tersebut menjadi output x=20, y=10
 */

fun main() {
    var x: Int = 10
    var y: Int = 20
    var temporary: Int? = null

    temporary = x
    x = y
    y = temporary
}