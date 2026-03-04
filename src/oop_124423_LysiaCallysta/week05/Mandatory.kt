package oop_124423_LysiaCallysta.week05

class Mandatory: Matakuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "OOP"
        println("Matkul ${super.nama} sksnya $sks")
    }

    fun ada_seminar(){
        println("Wajib ada seminar")
    }
}