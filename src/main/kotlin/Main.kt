fun main() {
    val itemPrice = 100_50
    val itemCount = 101
    val discountStartLevel1 = 1_000_00
    val discountStartLevel2 = 10_000_00
    val discountLevel1 = 100_00
    val discountLevel2 = 0.05
    val discountRegularCustomer = 0.01
    val totalPrice = itemPrice * itemCount
    val discountAmountLevel = if (totalPrice > discountStartLevel2 ) {
        (totalPrice * discountLevel2).toInt()
    }
    else if (totalPrice>discountStartLevel1) {
        discountLevel1
    }
    else 0
    val resultPriceLevel = totalPrice - discountAmountLevel
    val customer: Boolean = true
    val discountAmountRegularCustomer = if(customer == true) (resultPriceLevel * discountRegularCustomer).toInt() else 0
    val resultTotal = totalPrice - discountAmountLevel - discountAmountRegularCustomer
    println( "Сумма выбранной музыки " + totalPrice/100 + " руб. " + totalPrice%100 + " коп.")
    println ("Скидка за сумму покупки "  + discountAmountLevel/100 + " руб. " + discountAmountLevel%100 + " коп." )
    println("Сумма с учетом скидки " + + resultPriceLevel/100 + " руб. " + resultPriceLevel%100 + " коп." )
    println("Скидка постоянного покупателя " +  discountAmountRegularCustomer/100 + " руб. " + discountAmountRegularCustomer%100 + " коп.")
    println("Итого к оплате " + resultTotal/100 + " руб. " + resultTotal%100 + " коп.")
}