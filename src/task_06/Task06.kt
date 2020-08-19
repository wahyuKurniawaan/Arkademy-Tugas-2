package task_06

/**
 * Buatlah fungsi untuk menghitung Luas Lingkaran dengan parameter berupa nilai jari-jari. */

fun main() {
    print(luasLingkaran(7))
}

fun luasLingkaran(jariJari: Double): Double = Math.PI * jariJari * jariJari
fun luasLingkaran(jariJari: Int): Double = Math.PI * jariJari * jariJari