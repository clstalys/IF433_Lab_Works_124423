package oop_124423_LysiaCallysta.week07

enum class MataKuliah (val jmlSks:Int) {
    OOP(3),
    GAMEDEV(5),
    DASPRO(2);

    fun sks_matkul(){
        println("Jml sksnya: $jmlSks")
    }
}