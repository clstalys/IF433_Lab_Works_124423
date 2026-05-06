package oop_124423_LysiaCallysta.week11

fun main() {
    println("===TEST EXTENSION FUNC===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}