package oop_124423_LysiaCallysta.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    val iniElectricCar = ElectricCar("BMW", 4, 85)
    iniElectricCar.accelerate()
    iniElectricCar.honk()
    iniElectricCar.openTrunk()

    val managerKeren = Manager("Lys", 10000000)
    managerKeren.work()

    val developerGweh = Developer("Lysia", 8_000_000, "Kotlin")
    developerGweh.work()
}