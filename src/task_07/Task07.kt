package task_07

/**
 * Buatlah sebuah fungsi yang menerima parameter sebuah tahun,
 * kemudian diperiksa apakah tahun tersebut merupakan tahun kabisat.
 *
 * ketentuan tahun kabisat =
 *  - tahun bisa di bagi dengan angka 4, namun tidak bisa di bagi dengan angka 100, atau
 *  - tahun bisa di bagi dengan angka 400
 */

fun main() {
    isLeapYear(2000)
    isLeapYear(2100)
}

fun isLeapYear(year: Int) {
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) println("tahun $year, adalah tahun kabisat")
    else println("tahun $year, adalah bukan tahun kabisat")
}