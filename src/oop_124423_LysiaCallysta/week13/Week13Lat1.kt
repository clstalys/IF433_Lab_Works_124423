package oop_124423_LysiaCallysta.week13
import java.io.BufferedReader
import java.io.File
import java.io.FileReader

data class mahasiswa (val nim: String, val nama: String, val nilai: Int){
    fun simpanConvertCSV(): String{
        return "$nim, $nama $nilai"
    }
}

fun main(){
    println("\nCara 2-buat file")
    val mhs1 = mahasiswa("124423", "Lys", 84)

    val listMhss: List<mahasiswa> = listOf(
        mahasiswa("129999", "ya", 88),
        mahasiswa("121971", "jes", 83),
        mahasiswa("126961", "olin", 80)
    )

    val file5 = File("src/oop_124423_LysiaCallysta/week13/dataRahasiaMahasiswa.txt")

    file5.writeText(
        listMhss.joinToString("\n") {
            "${it.nim}, ${it.nama}, ${it.nilai}"
        }
    )

    println("Cara 1-baca file")
    val file1 = File("src/oop_124423_LysiaCallysta/week13/contohfile.txt")
    val isiContent = file1.readText()
    println(isiContent)

    println("\nCara 2-baca file")
    val contentSaya = file1.readLines()
    contentSaya.forEach {
        println(it)
    }

    println("\nCara 3-baca file BUFFERED READER")
    val file2 = BufferedReader(FileReader("src/oop_124423_LysiaCallysta/week13/contohfile.txt"))
    var isiFile:String? = file2.readLine()
    while (isiFile != null) {
        println(isiFile)
        isiFile = file2.readLine()
    }
    file2.close()

    println("\nCara 4-baca file BBUFFERED READER ver USE")
    val file3 = File("src/oop_124423_LysiaCallysta/week13/contohfile.txt").bufferedReader()
    file3.use{
        it.lineSequence()
            .filter {it.isNotEmpty()}
            .forEach { println(it) }
    }

    println("\nCara 1-buat file")
    val fileSaya = File("src/oop_124423_LysiaCallysta/week13/dataSaya.txt")
    fileSaya.writeText("Saya suka ke pasar\nBeli buah dan sayuran")
    fileSaya.appendText("Untuk ayah dan ibu\ndan kakak adik")

    val listJajanan = listOf("Ayam", "Pisang", "Beras")
    fileSaya.appendText(listJajanan.joinToString("\n"))

    fileSaya.printWriter().use(){
        it.println("Saya kuliah di UMN")
        it.println("UMN Kampus keren")
        it.println("Saya jurusan IT")
    }
}