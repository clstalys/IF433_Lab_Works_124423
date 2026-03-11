package oop_124423_LysiaCallysta_week06

class Mahasiswa(override val namOrg: String, override val budgetRapat: Int, override val jmlOrg: Int,
                override val namaMk: String, override val nilaiMk: Int): Organisasi, KelasMK {
    override fun rapat() {
        println("Sedang rapat di $namOrg")
        println("Biaya konsum rapat: ${super.biayaKonsumsi}")
    }

    override fun penilaian() {
        println("Nilai MK $namaMk adalah $nilaiMk")
    }

    override fun keaktifan() {
        super<KelasMK>.keaktifan()
        super<Organisasi>.keaktifan()
    }
}