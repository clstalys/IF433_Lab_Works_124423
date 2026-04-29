package oop_124423_LysiaCallysta.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 10000.0))
    coinRepo.add(Coin("ETH", 5000.0))
    coinRepo.add(Coin("USDT", 1000.0))

    println(coinRepo.getAll())

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")

    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX01", 200.0))
    txRepo.add(Transaction("TX02", 500.0))

    val txResponse = ApiResponse("200 OK", txRepo.getAll())
    println("Status: ${txResponse.status}")
    txResponse.data.forEach {
        println("ID: ${it.id}, Amount: ${it.amount}")
    }
}