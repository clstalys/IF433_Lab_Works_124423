package oop_124423_LysiaCallysta.week12

fun main(){
    println("===TEST RUNCATCHING===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}