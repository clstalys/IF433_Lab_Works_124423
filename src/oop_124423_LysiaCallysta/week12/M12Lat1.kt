package oop_124423_LysiaCallysta.week12

//basic exception - trycatch
fun pembagian(pembilang: Int, penyebut: Int) {
    try {
        val hasilBagi = pembilang / penyebut
        println("Hasil bagi: $hasilBagi")
    }catch (e:Exception){
        println("Error di Pembagian: ${e.message}")
    } finally {
        println("Selesai pembagian")
    }
}

//exception - expression - tipe data
fun cek_tipe_data(){
    var angka: Int = try {
        Integer.parseInt("123")
    }catch (e: Exception) {
        println("ada err di cekTipeData ${e.message}")
        111
    }

    println("Angka kamu adalah ${angka}")
}

//throw
fun cek_saldo(saldoSaya: Int) {
    if (saldoSaya<10000){
        throw IllegalArgumentException("Saldo ${saldoSaya} tidak perlu bayar pajak")
    } else {
        println("Selamat kamu orang kaya")
    }
}

//custom exception
class CekNilaiKKM (val kkm: Int, val nilai: Int): Exception("Nilai $nilai berada dibawah kkm $kkm")

class nilai_siswa(val kkm: Int){
    fun input_nilai (nilaiKamu: Int){
        if (nilaiKamu<kkm){
            throw CekNilaiKKM(kkm, nilaiKamu)
        } else{
            println("Kamu lulus dengan niali $nilaiKamu")
        }
    }
}

fun main(){
    val nsiswa = nilai_siswa(70)
    try {
        nsiswa.input_nilai(71)
    } catch (e: Exception) {
        println("Error saat inputnilai: ${e.message}")
    }

    try {
        cek_saldo(12000)
    } catch (e: Exception) {
        println("Error di Throw ${e.message}")
    }

    pembagian(1,2)
}