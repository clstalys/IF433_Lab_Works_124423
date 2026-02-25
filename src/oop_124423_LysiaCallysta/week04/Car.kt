package oop_124423_LysiaCallysta.week04

class Car {
    open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand){
        fun openTrunk(){
            println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
        }
    }
}