package oop_124423_LysiaCallysta.week08

class City (val name: String)
class Address (val city: String)
class DeliveryDetails(val address: Address?)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)
