package oop_124423_LysiaCallysta.week01

fun main() {
    val gameTitle: String = "Tes Lys"
    val price: Int = 15000
    var userNote: String? = null

    println("Game Title: $gameTitle")
    println("Price: $price")

    println("Discount: ${calculateDiscount(price)}")

    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice, userNote = userNote)
}

fun calculateDiscount(price: Int) = if (price > 500000) price * 80 / 100 else price * 90 / 100

fun printReceipt(title: String, finalPrice: Int, userNote: String? = null) {
    println("RECEIPT")
    println("Title: $title")
    println("Final Price: $finalPrice")

    val nullSafety = userNote ?: "Tidak ada catatan"
    println("User Note: $nullSafety")
}