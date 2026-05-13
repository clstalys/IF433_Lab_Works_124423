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