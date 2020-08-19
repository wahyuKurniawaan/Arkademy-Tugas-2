package task_10

/**
 * Buatlah fungsi untuk menampilkan huruf Vokal dan Konsonan seperti dibawah ini:
 * Input = printWords(ARKADEMY)
 * Output = AAERKDMY
 * */

fun main() {
    printWords("ARKADEMY")
}

fun printWords(word: String) {
    val arrayWord = word.toCharArray()

    for (element in arrayWord) if (isVocal(element)) print(element)
    for (element in arrayWord) if (!isVocal(element)) print(element)

}

fun isVocal(word: Char): Boolean {
    val vocal = charArrayOf('a', 'A', 'i', 'I', 'u', 'U', 'e', 'E', 'o', 'O')
    var isTrue = false
    for (element in vocal) {
        isTrue = element == word
        if (isTrue) break
    }
    return isTrue
}