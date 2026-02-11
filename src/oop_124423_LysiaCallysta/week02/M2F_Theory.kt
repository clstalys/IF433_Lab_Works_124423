package oop_124423_LysiaCallysta.week02

class Pemain {
    var nama:String = "tidak terdaftar";
    var speed:Int = 9;
    val shoot:Int = 8;

    init{ //primary
        this.nama = "Messi";
        println("Ini adalah constructor")
    }

    constructor(alias:String="Budi", kecepatan:Int=5){ //secondary
        nama = alias;
        speed = kecepatan;
        println("Ini constructor kedua")
    }

    fun bawa_bola(){
        println("si $nama sedang bawa bola");
    }
}

fun main(){
    val player = Pemain(alias = "Yoel", kecepatan = 100); //object1
    player.bawa_bola();
    println("nama pemain: ${player.nama}");
    println("skill kecepatan: " + player.speed);
    
    val player2 = Pemain(alias = "Ronaldo", kecepatan = 99) //object2
    println("nama pemain: ${player2.nama}");
    println("skill kecepatan: " + player2.speed);



}