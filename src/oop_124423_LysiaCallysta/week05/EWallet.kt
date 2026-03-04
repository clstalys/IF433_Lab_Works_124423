package oop_124423_LysiaCallysta.week05

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount){
            balance -= amount
            println("Pembayaran berhasil. Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double){
        balance += amount
        println("Top Up berhasil. Saldo: $balance")
    }
}