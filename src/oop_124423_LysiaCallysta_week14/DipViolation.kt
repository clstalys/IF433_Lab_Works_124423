package oop_124423_LysiaCallysta_week14

class MySQLDatabase {
    fun query(sql: String): List <String> = listOf("data1", "data2")
}

class UserService {
    private val database = MySQLDatabase()
    fun getUsers(id: Int) = database.query("SELECT * FROM users WHERE id=$id")
}