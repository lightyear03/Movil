package FLIGHTS



class NationalLowSeason(city: String) : National(city), IPromotion, Cancelation {
    override val discount = 10 // Porcentaje de descuento
    override val typeDiscount = 0 // 0 para porcentaje, 1 para cantidad

    // Redefinición de la función getPrice para incluir el descuento en temporada baja
    override fun getPrice(numDays: Int): Int {
        val amount = super.getPrice(numDays)
        return if (amount == 0) 0 else getDiscountPrice(amount)
    }

    // Implementación de la función cancel para cancelar viajes
    override fun cancel() {
        println("Viaje nacional en temporada baja a $city ha sido cancelado.")
    }
}