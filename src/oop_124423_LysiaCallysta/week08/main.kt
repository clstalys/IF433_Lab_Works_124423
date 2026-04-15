package oop_124423_LysiaCallysta.week08

fun main {
    println("===TEST SAFE CALLS & ELVIS===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak Diketahui"

    println("Tujuan Pengiriman $destination")
}