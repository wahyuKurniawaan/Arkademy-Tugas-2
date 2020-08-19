package task_09

/**
 * Buatlah program yang memiliki satu variabel dengan nama “printSegitiga” yg berisi tipe data number
 * yang menghasilkan output segitiga terbalik yang berisi angka
 * Contoh:
 * const printSegitiga = 5
 * Output:
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 */

fun main() {
    val printSegitiga = 5

    for (baris in printSegitiga downTo 1) {
        for (kolom in 1..baris) {
            print("$kolom ")
        }
        println()
    }
}