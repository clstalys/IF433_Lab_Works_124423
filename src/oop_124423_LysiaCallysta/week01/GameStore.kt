package oop_124423_LysiaCallysta.week01

fun main() {
    val gameTitle: String = "Tes Lys"
    val price: Int = 15

    println("Game Title: $gameTitle")
    println("Price: $price")

    println("Discount: ${calculateDiscount(price)}")
}

fun calculateDiscount(price: Int) = if (price > 500000) price * 80 / 100 else price * 90 / 100
