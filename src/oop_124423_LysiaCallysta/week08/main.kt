package oop_124423_LysiaCallysta.week08

fun main() {
    println("===TEST SAFE CALLS & ELVIS===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak Diketahui"

    println("Tujuan Pengiriman $destination")


    println("===TEST LET BLOCK===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid. Rp$price, Pajak Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)

    println("===TEST SAFE CASTING===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

}