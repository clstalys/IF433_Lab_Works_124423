package oop_124423_LysiaCallysta.week05

class Elektif: Matakuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "VR Programming"
        println("Elektif ${super.nama} sksnya $sks")
    }

    fun ada_praktek(){
        println("Wajib di praktekin")
    }
}