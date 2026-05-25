package oop_124423_LysiaCallysta_week14

interface Database {
    fun query (sql: String): List<String>
}

class PostgresDatabase : Database {
    override fun query(sql: String) = listOf("pg_data1", "pg_data2")
}

class SafeUserService (private val db: Database) {
    fun getUsers(id: Int) = db.query("SELECT * FROM users WHERE id=$id")
}