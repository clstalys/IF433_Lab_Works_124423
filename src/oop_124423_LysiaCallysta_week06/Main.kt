package oop_124423_LysiaCallysta_week06

fun processCheckout(method: PaymentMethod, amount: Double){
    println("--> Memulai Checkout...")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n===TESTING CHECKOUT===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    val hub = SmartHomeHub()
    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\n=== Security Mode Aktif ===")
    hub.activateSecurityMode()

    println("\n=== Mematikan Semua Switch ===")
    hub.turnOffAllSwitches()
}

//ini baru krna commit sblmnya typo jadi comit