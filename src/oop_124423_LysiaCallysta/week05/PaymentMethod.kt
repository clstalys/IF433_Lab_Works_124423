package oop_124423_LysiaCallysta.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}