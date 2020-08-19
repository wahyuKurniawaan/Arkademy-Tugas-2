package task_13

/**
 * Diberikan sebuah variabel yang berisikan bilangan integer dengan ketentuan
 * angka 0 (nol) dalam variabel tersebut merupakan pemisah antara satu bilangan dengan bilangan lainnya.
 * Bilangan-bilangan tersebut akan dipisah dan diurutkan berdasarkan angka di bilangan-bilangan itu sendiri.
 * Setelah itu, bilangan hasil pengurutan akan digabung kembali dengan tanpa pemisah
 * dengan output berupa bilangan integer.
 * Buatlah function yang menerima parameter hanya deret angka
 * dan menghasilkan output seperti keterangan di atas.
 * Contoh input = divideAndSort(5956560159466056)
 * Output = 55566914566956
 * */

fun main() {
    divideAndSort(5956560159466056)
}

fun divideAndSort(number: Long) {
    val listNumber = number.toString().split("0")
    for (data in listNumber) {
        data.toCharArray().sorted().forEach { print(it) }

    }
}