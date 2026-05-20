package oop_124423_LysiaCallysta.week13

import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)

fun Student.toCsv(): String = "$name, $age, $gpa"

fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}

fun saveStudent(student: List<Student>, path: String) {
    File(path).writeText(student.joinToString(separator = "\n"){it.toCsv()})
}

fun loadStudents(path: String): List<Student> {
    return try {
        File(path).readLines().map { fromCsv(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}

fun main(){
    val students = listOf(
        Student("Alice", 20, 3.8),
        Student("Bob", 22, 3.6)
    )
    saveStudent(students, "students.csv")

    val loaded = loadStudents("students.csv")
    println("===LOAD STUDENT DATA===")
    loaded.forEach { println(it) }
}