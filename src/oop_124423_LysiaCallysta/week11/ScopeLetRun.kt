package oop_124423_LysiaCallysta.week11

fun main() {

    println("===TEST LET FUNC===")

    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }

    println("Panjang nama: $length")

    println("\n===TEST RUN FUNC===")

    val result = "Kotlin".run {
        println("Memproses kata: $this")
        length?.times(2)
    }

    println("Hasil kalkulasi run: $result")
}