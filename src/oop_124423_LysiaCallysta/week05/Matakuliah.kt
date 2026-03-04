package oop_124423_LysiaCallysta.week05

abstract class Matakuliah {
    var nama: String = ""

    fun hasil_matkul(){
        println("Matkul diminati")
    }

    abstract fun set_matkul(sks:Int)
}

fun main(){
//    val matkul = Matakuliah() gabisa karena class abstract
//    matkul.nama = "OOP"
//    matkul.set_matkul(4)

//    val wjb = Mandatory()
//    wjb.set_matkul(3)
//
//    val elc = Elektif()
//    elc.set_matkul(2)

    val ListMatkul:List<Matakuliah> = listOf(
        Mandatory(),
        Elektif()
    )
    println("Banyak tipe matkul $ListMatkul")

    for (mku in ListMatkul) {
        mku.set_matkul(3)

        if(mku is Mandatory) {
            mku.ada_seminar() //cara1 panggil method yang beda
        } else if (mku is Elektif) {
            mku.ada_praktek()
        }

        when(mku) { //cara2 panggil method
            is Mandatory -> {
                print("Wajib dari When: ")
                mku.ada_seminar()
            }
            is Elektif -> {
                print("Elektif dari When: ")
                mku.ada_praktek()
            }
        }
    }


}