package oop_124423_LysiaCallysta.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice> ()

    SmartDevice(
        name = "Philips WiZ Living Room",
        category = "Lighting",
        isOnline = true,
        powerLoad = 12
    ).apply {
    }.also {
        homeDevices.add(it)
    }

    SmartDevice(
        name = "Ezviz Outdoor",
        category = "Camera",
        isOnline = false,
        powerLoad = 0
    ).apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acDevice = run {
        SmartDevice(
            name = "Daikin Inverter (Kabel 3x2.5)",
            category = "HVAC",
            isOnline = false,
            powerLoad = 800
        )
    }

    homeDevices.add(acDevice)
    homeDevices.add(
        SmartDevice(
            name = "Picolo's Auto Feeder",
            category = "Pet Care",
            isOnline = true,
            powerLoad = 10
        )
    )

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }

    searchResult?.let {
        println(it.diagnose())
    }

    with(homeDevices) {
        println("Jumlah perangkat: ${this.size}")
    }

    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("Total daya: $totalPower Watt")

    homeDevices.forEach {
        println(it.diagnose())
    }
}