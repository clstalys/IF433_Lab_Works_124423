package oop_124423_LysiaCallysta.week07

import oop_124423_LysiaCallysta.week07.Koneksi.linkServer

fun main(){
    println("Server: ${Koneksi.linkServer}")
    Koneksi.test_koneksi()

    Mahasiswa.nama="udin"
    val na:Int = Mahasiswa.set_nilai(80, 100)
    println("Nilai ${Mahasiswa.nama} adalah $na")

    Mahasiswa.isi_nama_kampus("UMN")

    val dsn1 = Dosen("Indah", "12345", 2020)
    println(dsn1)
    val dsn2 = dsn1.copy(nama="Budi", nik="31254")
    println(dsn2)

    println("Nama dosen1: ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}")

    println("Matkul fav saya: " + MataKuliah.OOP.name)
    println("Index matkul: " + MataKuliah.OOP.ordinal)
    MataKuliah.OOP.sks_matkul()

    for(matkul in MataKuliah.entries){
        println("matkul: " + matkul)
        matkul.sks_matkul()
    }
}