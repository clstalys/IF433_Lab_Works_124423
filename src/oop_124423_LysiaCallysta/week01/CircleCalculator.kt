package oop_124423_LysiaCallysta.week01

fun main() {
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius : $radius, Area: $area")

    println("Status: ${checkSize(area)}")
}

fun checkSize(area: Double) = if (area > 100) "This is a big circle" else "This is a small circle"