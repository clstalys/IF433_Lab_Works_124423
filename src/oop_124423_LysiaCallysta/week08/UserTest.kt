package oop_124423_LysiaCallysta.week08

import oop_124423_LysiaCallysta.week08.DatabaseMock.findUser

object DatabaseMock {
    fun findUser(id: Int): UserProfile?{
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest(){
    println("\n === RUNNING UNIT TEST ===")

    val testUser = DatabaseMock.findUser(1)

    val initial = testUser!!.name.substring(0, 1)

    check(initial == "T"){"Test Failed! Initial is wrong."}
    println("Test passed: Initial is T")
}