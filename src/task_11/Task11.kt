package task_11

/**
 * Diberikan sebuah text, periksa apakah text tersebut palindrom atau tidak.
 * contoh : text "malam", Output = palindrom
 * */

fun main() {
    isPalindrom("malam")
    isPalindrom("siang")

}

fun isPalindrom(text: String) {
    val reverseText = text.reversed()
    println(
            if (text == reverseText) "PALINDROM"
            else "Bukan Palindrom")
}