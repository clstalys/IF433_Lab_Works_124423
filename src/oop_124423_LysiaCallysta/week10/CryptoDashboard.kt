package oop_124423_LysiaCallysta.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 10000.0))
    coinRepo.add(Coin("ETH", 5000.0))
    coinRepo.add(Coin("USDT", 1000.0))

    println(coinRepo.getAll())
}