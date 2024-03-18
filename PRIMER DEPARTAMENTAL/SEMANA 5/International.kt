package FLIGHTS



class International(override val country: String, override val city: String) : Travel() {
    // Impuestos por país
    private val taxes = mapOf(
        "Alemania" to 0.16,
        "Chile" to 0.05,
        "Canadá" to 0.10
    )

    // Ciudades y sus precios por día
    private val cities = mapOf(
        "Alemania" to mapOf(
            "Munich" to 980,
            "Berlín" to 820,
            "Francfort" to 850
        ),
        "Chile" to mapOf(
            "Santiago" to 643,
            "Valparaíso" to 721
        ),
        "Canadá" to mapOf(
            "Vancouver" to 620,
            "Ottawa" to 680,
            "Montreal" to 600
        )
    )

    // Función para obtener el precio total de un viaje con impuesto incluido
    override fun getPrice(numDays: Int): Int {
        val basePrice = cities[country]?.get(city)
        if (basePrice == null) {
            println("Lo sentimos, no hay tarifas disponibles para $city en $country.")
            return 0
        }
        val tax = taxes[country] ?: 0.0
        return (basePrice * numDays * (1 + tax)).toInt()
    }

    // Función para obtener el precio cotizado de un viaje
    override fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        if (price == 0) {
            println("No se pudo cotizar el precio para $city en $country.")
        } else {
            println("Precio cotizado para $country - $city por $numDays días: $price")
        }
    }
}