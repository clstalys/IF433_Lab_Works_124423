package oop_124423_LysiaCallysta.week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius : $radius, Area: $area")

    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a big circle")
    } else {
        println("This is a small circle")
    }
}