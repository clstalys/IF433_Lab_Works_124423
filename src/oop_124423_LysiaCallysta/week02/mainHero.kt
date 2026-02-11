package oop_124423_LysiaCallysta.week02

import java.util.Scanner
import kotlin.random.Random

fun main() {

    val scanner = Scanner(System.`in`)

    println("=== HERO BATTLE ===")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage = baseDamage)

    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\nMenu:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {

            hero.attack("Musuh")
            enemyHp -= hero.baseDamage

            if (enemyHp < 0) enemyHp = 0

            println("Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val randomDamage = (10..20).random()
                println("Musuh membalas sebesar $randomDamage!")
                hero.takeDamage(randomDamage)
            }

            println("Sisa HP Hero: ${hero.hp}")

        } else if (choice == 2) {
            println("${hero.name} kabur dari pertarungan!")
            break
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")

    if (hero.hp > enemyHp) {
        println("Hero menang!")
    } else if (enemyHp > hero.hp) {
        println("Musuh menang!")
    } else {
        println("Seri!")
    }
}