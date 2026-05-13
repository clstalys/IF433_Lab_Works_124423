package oop_124423_LysiaCallysta.week12

class InsufficientFundsException(val amount: Double, val balance: Double) : Exception("Attempted $amount, balance: $balance") {
}

//udh kepush di commit 2 krna sblmnya lupa commit...