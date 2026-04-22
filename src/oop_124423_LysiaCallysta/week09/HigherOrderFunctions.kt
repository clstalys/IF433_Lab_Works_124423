package oop_124423_LysiaCallysta.week09

fun main(){
    val numbers = listOf(1,2,3,4,5, 6, 7, 8)
    println("Original Data: $numbers")
    println("\n===HOF: FILTER===")

    val evens = numbers.filter { it % 2 == 0 }
    println("Evens only: $evens")

    println("\n===HOF: MAP===")
    val multiplied = evens.map {it * 10}
    val asStrings = multiplied.map { "Rp ${it}k" }
    println("Multiplied: $multiplied")
    println("Formatted: $asStrings")

    println("\n=== HOF: SORT & FOREACH ===")

    val sortedDesc = multiplied.sortedByDescending { it }
    println("Sorted Descending: $sortedDesc")

    println("Print each element:")
    sortedDesc.forEach {
        println("Value: $it")
    }
}