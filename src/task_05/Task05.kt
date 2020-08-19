package task_05

/**
 * Buatlah fungsi untuk menghitung Luas Segitiga dengan parameter berupa alas dan tinggi.
 */

fun main() {
    print(luasSegitiga(5, 7))
}

fun luasSegitiga(alas:Int, tinggi:Int): Double = (alas * tinggi).toDouble() / 2
fun luasSegitiga(alas:Double, tinggi:Double): Double = (alas * tinggi / 2)
fun luasSegitiga(alas:Int, tinggi:Double): Double = (alas.toDouble() * tinggi / 2)
fun luasSegitiga(alas:Double, tinggi:Int): Double = (alas * tinggi.toDouble() / 2)