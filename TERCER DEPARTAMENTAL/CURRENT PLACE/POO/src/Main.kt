import FLIGHTS.International
import FLIGHTS.National
import FLIGHTS.NationalLowSeason

fun main() {
    println("Bienvenido al sistema de reserva de viajes")

    // Ciclo principal del programa
    while (true) {
        println("\nPor favor, elige una opción:")
        println("1. Reservar un viaje nacional")
        println("2. Reservar un viaje internacional")
        println("3. Cancelar un viaje")
        println("4. Salir del programa")

        // Leer la opción del usuario
        val choice = readLine()?.toIntOrNull() ?: 0

        when (choice) {
            1 -> {
                println("\nIngresa el destino del viaje nacional:")
                val destination = readLine() ?: ""
                val nationalTrip = National(destination)
                println("Viaje nacional cotizado para $destination:")
                nationalTrip.quotePrice(7) // Cotizar precio para 7 días
                nationalTrip.reserve(7) // Reservar el viaje para 7 días
            }
            2 -> {
                println("\nIngresa el país para el viaje internacional:")
                val country = readLine() ?: ""
                println("Ingresa la ciudad para el viaje internacional:")
                val city = readLine() ?: ""
                val internationalTrip = International(country, city)
                println("Viaje internacional cotizado para $country - $city:")
                internationalTrip.quotePrice(7) // Cotizar precio para 7 días
                internationalTrip.reserve(7) // Reservar el viaje para 7 días
            }
            3 -> {
                println("\nCancelar un viaje:")
                println("Ingresa el destino del viaje a cancelar:")
                val destination = readLine() ?: ""
                val tripToCancel = NationalLowSeason(destination)
                println("Viaje en temporada baja a $destination:")
                tripToCancel.cancel() // Cancelar el viaje en temporada baja
            }
            4 -> {
                println("Gracias por utilizar nuestro sistema de reserva de viajes. ¡Hasta luego!")
                return
            }
            else -> {
                println("Opción no válida. Por favor, elige una opción del 1 al 4.")
            }
        }
    }
}