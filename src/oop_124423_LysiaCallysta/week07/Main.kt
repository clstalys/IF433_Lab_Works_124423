package oop_124423_LysiaCallysta.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")

    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)

    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")

    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)

    println(data1)
    println("Sama? ${data1 == data2}")

    println("\n=== TEST COPY & DESTRUCTURING ===")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")

    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.error}"
        is ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println(uiMessage)

    println("\n=== TEST BATTLE STATE ===")

    val state: BattleState = BattleState.MonsterEncounter("Goblin")

    val message = when (state) {
        is BattleState.MonsterEncounter -> "Musuh muncul: ${state.monsterName}"
        is BattleState.LootDropped -> "Dapat item: ${state.item.name}"
        is BattleState.GameOver -> "Game Over: ${state.reason}"
        is BattleState.SafeZone -> "Zona aman, istirahat..."
    }

    println(message)

    println("\n=== TEST GAME MANAGER (SINGLETON) ===")

    GameManager.startGame()
    GameManager.startGame() // panggil lagi -> ga duplikat

    println("\n=== TEST RARITY & FACTORY ===")

    println("Legendary drop chance: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()

    println("Weapon: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")

    println("\n=== TEST IMMUTABILITY & EVENT FLOW ===")

    val upgradedItem = starterWeapon.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)

    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))

    processEvent(BattleState.LootDropped(upgradedItem))

    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}