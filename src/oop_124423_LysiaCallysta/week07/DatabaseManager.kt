package oop_124423_LysiaCallysta.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected to Server"
        println("Database is ready")
    }
}