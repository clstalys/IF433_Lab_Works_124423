package oop_124423_LysiaCallysta_week06

class Button(override val name:String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}