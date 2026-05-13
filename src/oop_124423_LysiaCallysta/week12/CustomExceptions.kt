package oop_124423_LysiaCallysta.week12

class InsufficientFundsException(val amount: Double, val balance: Double) : Exception("Attempted $amount, balance: $balance") {
}

//udh kepush di commit 2 krna sblmnya lupa commit...

class BankAccount(var balance: Double) : Exception("Bank account balance $balance"){
    fun withdraw(amount: Double) {
        if (amount < 0){
            throw IllegalArgumentException("Amount must be positive")
        }
        if (amount > balance){
            throw InsufficientFundsException(amount, balance)
        }
        balance -= amount
        println("Withdrawal successful. Remaining balance: $balance")
    }
}

fun main(){
    println("===TEST MULTIPLE CATCH===")
    val account1 = BankAccount(100.0)

    try{
        account1.withdraw(150.0)
    } catch (e: InsufficientFundsException) {
        println("Caught Domain Error: Uang tidak cukup. ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("Caught Domain Error: Input tidak valid. ${e.message}")
    } catch (e: Exception) {
        println("Caught General Error: Terjadi kesalahan tidak terduga.")
    }
}