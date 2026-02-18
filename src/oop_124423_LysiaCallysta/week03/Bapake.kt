package oop_124423_LysiaCallysta.week03

open class Bapake { //open buat nambah anak
    private var nama: String = "Belum tau"
    private var umur: Int = 35
    protected var gaji:Int = 1000 //hanya bisa di class

    public var uangjajan:Int = 0
        set(value){
            if (value < 0) {
                println("Masa uang jajan 0 atau minus")
            } else {
                field = value
            }
        }
        get() {
            return field+123
        }

    public fun set_nama(namabaru: String) {
        if (this.nama.length <= 0) {
            println("Eh nama ga boleh kosong");
        } else {
            this.nama = namabaru;
        }
    } //set = rubah

    public fun get_nama(): String {
        return this.nama
    }

    public fun set_umur(umurbaru: Int) {
        if (this.umur <= 0) {
            println("Eh umur ga bisa minus");
        } else {
            this.umur = umurbaru;
        }
    }

    public fun get_umur(): Int {
        return this.umur;
    }
} //close class

class Anake: Bapake() {
    fun dapatin_gaji_bapak():Int {
        this.gaji = 5500
        return this.gaji;
    }
}

fun main(){
    var ank = Anake();
    ank.set_nama("Udin")
    ank.set_umur(10)
    println("Nama papi kamu: ${ank.get_nama()}")
    println("Gaji bapak: " +ank.dapatin_gaji_bapak());

    ank.uangjajan = -100;
}