package oop_124423_LysiaCallysta.week04

open class Vehicle {
    var speed: Int = 0

    open fun accelerate(){
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk(){
        println("Beep beep!")
    }
}
