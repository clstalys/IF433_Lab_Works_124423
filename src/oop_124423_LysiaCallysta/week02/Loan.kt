package oop_124423_LysiaCallysta.week02

import java.util.Scanner

class Loan (val bookTitle: String, val borrower: String, var loanDuration: Int = 1) {

    fun calculateFine(): Int{
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {0}
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- LIBRARY FINE SYSTEM ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Durasi Lama Pinjam: ")
    var loadDuration = scanner.nextInt()

    scanner.nextLine()

    if (loadDuration < 0){
        loadDuration = 1
    }

    val loan = Loan (bookTitle, borrower, loadDuration)

    println("Judul: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration}")
    println("Total Denda: Rp ${loan.calculateFine()}")
}