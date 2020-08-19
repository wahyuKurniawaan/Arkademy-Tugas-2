package task_08

/**
 *  Buat program yang menghitung rata-rata UN beserta gradenya, dengan mengisi 4 nilai yakni
 *  Bahasa indonesia, Bahasa Inggris Matematika dan IPA,
 *  yang di dalam program tersebut memiliki validasi yaitu semua nilai tersebut harus diisi
 *  dan juga untuk grade memiliki kondisi dengan ketentuan sebagai berikut:
 *  90 - 100 = A
 *  80 - 89 = B
 *  70 - 79 = C
 *  60 - 69 = D
 *  0 - 59 = E
 *  */

fun main() {
    val gradeEnglish: Int = 89
    val gradeMath: Int = 80
    val gradeIPA: Int = 69
    val gradeBhsIndo: Int = 90
    val average = (gradeBhsIndo + gradeEnglish + gradeMath + gradeIPA) / 4

    println("Rata-rata = $average")

    when (average) {
        in 90..100 -> println("Grade = A")
        in 80..89 -> println("Grade = B")
        in 70..79 -> println("Grade = C")
        in 60..69 -> println("Grade = D")
        else -> println("Grade = E")
    }
}
