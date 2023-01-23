class Movimiento(val posicion: Int, val tamano: Int) {
    fun movment() {

        println("Muevete")
        val mov = readln().toLowerCase()

        if (mov == "w") {
            arriba(posicion, tamano)
        } else if (mov == "s") {
            abajo(posicion, tamano)
        } else if (mov == "d") {
            derecha(posicion, tamano)
        } else if (mov == "a") {
            izquierda(posicion, tamano)
        } else {
            derecha(posicion, tamano)
        }
    }


    fun arriba(posicion: Int, tamano: Int) {

    }

    fun abajo(posicion: Int, tamano: Int) {

    }

    fun derecha(posicion: Int, tamano: Int): Int {
        return posicion + 1
    }

    fun izquierda(posicion: Int, tamano: Int): Int {
        return posicion - 1
    }
}