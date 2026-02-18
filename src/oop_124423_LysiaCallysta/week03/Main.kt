package oop_124423_LysiaCallysta.week03

fun main () {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformanceRating()

    println("Pajak yang harus dibayar: ${e.tax}")


    //Main task 1
    val w = Weapon("Katana")

    w.damage = -50
    println("Damage: ${w.damage}")

    w.damage = 9999
    println("Damage: ${w.damage}")
    println("Tier: ${w.tier}")

}