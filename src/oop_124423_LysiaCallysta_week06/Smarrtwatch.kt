package oop_124423_LysiaCallysta_week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime(){
        println("Lampu OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W")
    }
}