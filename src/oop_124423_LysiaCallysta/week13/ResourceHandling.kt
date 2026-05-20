package oop_124423_LysiaCallysta.week13
import java.io.File

fun main(){
    println("===TEST UNSAFE RESOURCE HANDLING===")
    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log1: Membuka koneksi database")
    writer.println("Log2: Menulis data pengguna...")

    writer.close()
    println("Proses penulisan unsafe selesai")
}