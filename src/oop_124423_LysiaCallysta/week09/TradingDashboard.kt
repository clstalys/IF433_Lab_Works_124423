package oop_124423_LysiaCallysta.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 12.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 15, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 20, 8.1, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 10, -2.5, "CLOSED"),
        TradeLog("XRPUSDT", "SHORT", 5, 15.0, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 25, -10.0, "OPEN")
    )

    println("=== TRADE HISTORY ===")
    tradeHistory.forEach {
        println(it)
    }
}