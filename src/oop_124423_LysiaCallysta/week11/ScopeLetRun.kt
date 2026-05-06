package oop_124423_LysiaCallysta.week11

import java.awt.SystemColor.text

fun main(){
    println("===TEST LET FUNC===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }

    println("Panjang nama: $length")
}