package oop_124423_LysiaCallysta.week09

fun main(){
    println("===LIST OF IMUT===")
    val arSiswa = listOf("Budi", "Danu", "Susi", "Cica")

    println(arSiswa) //view in Array: Object

    println("Banyak Siswa: " + arSiswa.size) //panjang array

    println("Siswa bernama ${arSiswa[1]}")

    for (a in arSiswa) { //loop isi
        print("Siswa " + a + " dan")
    }

    println("===LIST OF MUTABLE===")
    val arMatkul = mutableListOf("OOP", "Pemweb", "Matdis", "Kalkulus")
    arMatkul.add("Algo")
    arMatkul[2] = "Aljabar"
    arMatkul.remove("Pemweb")
    println(arMatkul)

    println("====SET OF IMUT===")
    val arNilai = setOf(80,90,75,85,80,30,50,85)
    println("Banayak nilai: ${arNilai.size}")
    println("ada angka 90 ga? ${arNilai.contains(90)}")
    println(arNilai)

    println("====SET OF MUTABLE===")
    val arMahasiswa = mutableSetOf("Andi", "Yuli", "Yanto", "Udin", "Yuda")
    arMahasiswa.add("Yanti")
    arMahasiswa.remove("Udin")
    arMahasiswa.add("Udin")
    println(arMahasiswa)
}