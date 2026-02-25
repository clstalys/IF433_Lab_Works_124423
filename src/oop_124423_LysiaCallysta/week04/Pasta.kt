package oop_124423_LysiaCallysta.week04

class Pasta:Makanan() {
    private var toping:String = ""

    public fun pasta_terjual(jml:Int){
        this.toping = "nora"
        super.harga = jml * 120
        println("pasta $toping laris $harga")
    }

    override fun jual_makanan() {
        println("Saya jual PASTA enak")
    }
}