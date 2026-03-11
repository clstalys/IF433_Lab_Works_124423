package oop_124423_LysiaCallysta_week06

interface Organisasi {
    val namOrg: String
    val budgetRapat:Int
    val jmlOrg: Int
    val biayaKonsumsi: Int
        get() = budgetRapat * jmlOrg
    fun rapat()
    fun keaktifan(){
        println("Ih kamu aktif")
    }
    }
