package task_03

/**
 * Buatlah sebuah fungsi untuk memeriksa angka tersebut ganjil atau genap. Contoh;
 * input: 5 output: the number is odd
 * input: 8 output: the number is even */

fun main() {
    cekGanjilGenap(5)
    cekGanjilGenap(8)
}

fun cekGanjilGenap(angka: Int) {
    if (angka % 2 == 0) println("The number is even")
    else println("The number is odd")
}