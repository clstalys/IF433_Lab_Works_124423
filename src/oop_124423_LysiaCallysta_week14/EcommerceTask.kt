import java.io.File

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price
    }
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double)
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")

    override fun saveOrder(itemName: String, finalPrice: Double) {
        file.appendText("$itemName,$finalPrice\n")
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        pricingStrategy: PricingStrategy
    ) {
        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice)

        notifier.sendNotification(
            "Pesanan $itemName Anda telah dikonfirmasi!"
        )
    }
}

fun main() {

    val repository = CsvOrderRepository()
    val notifier = EmailNotifier()

    val processor = SafeOrderProcessor(repository, notifier)

    val vipCustomer = VipPricing()
    val regularCustomer = RegularPricing()

    processor.processOrder(
        "Laptop",
        10000000.0,
        vipCustomer
    )

    processor.processOrder(
        "Mouse",
        500000.0,
        regularCustomer
    )
}