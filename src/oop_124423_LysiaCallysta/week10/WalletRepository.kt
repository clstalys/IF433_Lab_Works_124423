package oop_124423_LysiaCallysta.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(name: String, selector: (T) -> String): List<T> {
        return items.filter { selector(it).contains(name, ignoreCase = true) }
    }
}