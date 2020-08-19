package task_12

/**
 * Diberikan sebuah kalimat, ubah urutan kata-kata didalam kalimat menjadi terbalik.
 * misalkan : "saya belajar javascript"
 * Output : "javascript belajar saya"
 * */

fun main() {
    changeOrder("saya belajar javascript")
}

fun changeOrder(sentence: String) {
    var listWord = sentence.split(" ").reversed()
    for (word in listWord) print("$word ")
}