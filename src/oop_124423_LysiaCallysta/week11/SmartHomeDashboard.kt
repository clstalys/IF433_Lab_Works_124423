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
}