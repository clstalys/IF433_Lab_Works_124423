package oop_124423_LysiaCallysta.week05

fun Main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdetesi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("------------------------")
    }

    val math = MathHelper()

    println("Luas persegi: " + math.hitungLuas(4))
    println("Luas persegi panjang: " + math.hitungLuas(5, 2))
    println("Luas lingkaran: " + math.hitungLuas(7.0))

    val wallet = EWallet("Lys", 50000.0)
    val card = CreditCard("Lysia", 100000.0)

    val payments: List<PaymentMethod> = listOf (wallet, card, card)

    for (payment in payments) {

        println("=== ${payment.accountName} ===")

        payment.processPayment(75000.0)

        println()
    }

}