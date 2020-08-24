package task_02

/**
 * Buat dua variabel x=10, y=20 Kemudian tukarkan isi variabel tersebut menjadi output x=20, y=10.
 * Dengan syarat tanpa menambahkan variabel baru (Clue: gunakan math operation).
 */

fun main() {
    var x: Int = 10
    var y: Int = 20

    x += y
    y = x - y
    x -= y

    println("X = $x")
    println("Y = $y")
}