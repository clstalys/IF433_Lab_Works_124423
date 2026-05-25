package oop_124423_LysiaCallysta_week14

interface DiscountStrategy {
    fun apply(price: Double): Double
}
class StudentDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.80
}
class MemberDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.85
}