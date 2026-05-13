package oop_124423_LysiaCallysta.week11

//func biasa
fun panggil_nama(nama: String): String {
    return "Hai $nama"
}

//func extension basic
fun String.panggil_mahasiswa(): String {
    var hasil = this.split(" ").joinToString(" "){
        it.replaceFirstChar{
            c -> c.uppercase()
        }
    }
    return hasil
}
//func extension parameter
fun Int.tentukanLulus(nama: String): String {
    var keputusan = ""
    if (this>=70){
        keputusan = "Lulus"
    } else {
        keputusan = "Remedial"
    }
    return "Mahasiswa $nama hasil kelulusan adalah $keputusan"
}

//func extension cek null
fun String?.cekNullEmpty():String {
    if(this == null || this.isEmpty()) {
        return "gak boleh null/kosong bang"
    } else {
        return "username kamu adalah $this"
    }
}

fun main(){
    var inputUsername:String? = null
    println(inputUsername.cekNullEmpty()) //extension cek null

    println(80.tentukanLulus("Revan")) //extension parameter

    println(panggil_nama("Toni").uppercase()) //func biasa

    println("tonyyy stark iron man".panggil_mahasiswa()) //extension basic


}