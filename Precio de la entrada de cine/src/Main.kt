fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Fill in the code.
    return when {
        age in 0..12 -> 15 // niños de 12 años o menos
        age in 13..60 -> if (isMonday) 25 else 30 // con o sin descuento adultos
        age in 61..100 -> 20 // adultos mayores 60 años
        else -> -1 // Edad fuera de las especificaciones, precio no válido
    }
}
