package oop_124423_LysiaCallysta_week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("$name dinyalakan")
        startRecord()
    }

    override fun turnOff() {
        println("$name dimatikan")
        stopRecord()
    }

    override fun startRecord() {
        println("$name mulai merekam")
    }
}