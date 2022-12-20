fun main() {
    val mapa = Mapa(10)
    val tablero = mapa.mapa

    repeat(tablero.size + 1) {
        print(" # ")
    }

    println()
    for (fila in tablero) {
        print("# ")
        for (casilla in fila) {
            print("$casilla")
        }
        println(" #")
    }

    repeat(tablero.size + 1) {
        print(" # ")
    }
}
