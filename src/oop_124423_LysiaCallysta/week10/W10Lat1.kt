package oop_124423_LysiaCallysta.week10

//code non-generic
class rumah(var alamat: Any) //any = bisa banyak tipe data

//code generic
class campus<T>(val alamat: T)

//code generic - multi parameter
class Komputer<T, V>(val merk: T, val barcode: V)

//code generic - func
fun <T> Password(isiPass: T): T{
    return isiPass
}

//code generic - func constraint
class kalkulator<T: Number> (val a: T, val b: T){
    fun tambah(): Int{
        return a.toInt() - b.toInt()
    }

    fun kurang(): Double{
        return a.toDouble() - b.toDouble()
    }
}

//code generic - where
fun<T> penilaian(list: List<T>, kkm: T): List<T> where T: Comparable<T>{
    return list.filter { it > kkm }
}

fun main(){
    println("===SAMPLE GENERIC - WHERE===")
    val daftarNilai = listOf(60, 71, 90, 83, 73, 67, 55, 84, 72)
    println("Daftar Nilai: " + daftarNilai)
    val nilaiAtasKKM = penilaian(daftarNilai, 70)
    println("Nilai diatas KKM: " + nilaiAtasKKM)

    println("===SAMPLE GENERIC - CONSTRAINT===")
    val kalk = kalkulator(10.52, 20.347)
    println("penambahan ${kalk.a} ditambah ${kalk.b}: " + kalk.tambah())
    println("pengurangan ${kalk.a} dikurang ${kalk.b}: " + kalk.kurang())

    println("===SAMPLE GENERIC - MULTI PARAM===")
    val komp = Komputer("Dell", 12345)
    println("Merk komputer: ${komp.merk}")
    println("Barcode komputer: ${komp.barcode}")

    println("===GENERIC SAMPLE - FUNC===")
    println("Password kamu: " + Password("12345"))

    println("===SAMPLE GENERIC===")
    val kmps = campus(alamat = "Tangerang")
    println(kmps.alamat)
}