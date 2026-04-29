package oop_124423_LysiaCallysta.week10

fun main(){
    println("===TEST GENERIC CLASS===")
    val intBox = Box(100)
    val StringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${StringBox}")
    println("Isi stringBox: ${StringBox}")

    println("===TEST MULTIPLE PARAMETERS===")
    val itemPrice = PairBox("Bitcoin", 65000)

    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("===TEST GENERIC FUNCTIONS===")
    printData(3.14)

    val result = processData("Stable Coin")
    println("Hasil proses: $result")
}