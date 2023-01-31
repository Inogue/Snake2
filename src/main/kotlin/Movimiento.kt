import java.lang.IndexOutOfBoundsException

class Movimiento() {
    val mapeo = Mapa(Iconos.TAMANO)
    val mapa = mapeo.mapa

    fun inicio() {
        mapa[0][0] = Iconos.SERPIENTE
        izquierda(0, 0)
    }

    fun abajo(posicion: Int, serTamano: Int) {

        mapeo.appleSpawn(Iconos.TAMANO)
        Thread.sleep(Iconos.REFRESH)
        mapa[posicion][0] = Iconos.SERPIENTE
        if (serTamano > 0) {
            mapeo.suma(posicion, serTamano, 1)
        }

        try {

            if (mapa[posicion + 1][0] == Iconos.MANZANA) {
                mapa[posicion][0] = Iconos.SERPIENTE
                mapeo.printaBordes()
                abajo(posicion + 1, serTamano + 1)

            } else if (posicion < mapa.size - 1) {
                mapeo.printaBordes()

                mapa[posicion - serTamano][0] = Iconos.VACIO
                abajo(posicion + 1, serTamano)

            }
        } catch (e: IndexOutOfBoundsException) {
            mapeo.printaBordes()
            return
        }
    }

    fun derecha(posicion: Int, serTamano: Int) {

        mapeo.appleSpawn(Iconos.TAMANO)
        Thread.sleep(Iconos.REFRESH)
        mapa[0][posicion] = Iconos.SERPIENTE
        if (serTamano > 0) {
            mapeo.suma(posicion, serTamano, 2)
        }

        try {

            if (mapa[0][posicion + 1] == Iconos.MANZANA) {
                mapa[0][posicion] = Iconos.SERPIENTE
                mapeo.printaBordes()
                derecha(posicion + 1, serTamano + 1)

            } else if (posicion < mapa.size - 1) {
                mapeo.printaBordes()

                mapa[0][posicion - serTamano] = Iconos.VACIO
                derecha(posicion + 1, serTamano)

            }
        } catch (e: IndexOutOfBoundsException) {
            mapeo.printaBordes()
            return
        }
    }

    fun arriba(posicion: Int, serTamano: Int) {
        mapeo.appleSpawn(Iconos.TAMANO)
        Thread.sleep(Iconos.REFRESH)
        mapa[posicion][0] = Iconos.SERPIENTE
        if (serTamano > 0) {
            mapeo.suma(posicion, serTamano, 3)
        }

        try {

            if (mapa[posicion - 1][0] == Iconos.MANZANA) {
                mapa[posicion][0] = Iconos.SERPIENTE
                mapeo.printaBordes()
                arriba(posicion - 1, serTamano + 1)

            } else if (posicion < mapa.size - 1) {
                mapeo.printaBordes()

                mapa[posicion + serTamano][0] = Iconos.VACIO
                arriba(posicion - 1, serTamano)

            }
        } catch (e: IndexOutOfBoundsException) {
            mapeo.printaBordes()
            return
        }
    }

    fun izquierda(posicion: Int, serTamano: Int) {

        mapeo.appleSpawn(Iconos.TAMANO)
        Thread.sleep(Iconos.REFRESH)
        mapa[0][posicion] = Iconos.SERPIENTE
        if (serTamano > 0) {
            mapeo.suma(posicion, serTamano, 4)
        }

        try {

            if (mapa[0][posicion - 1] == Iconos.MANZANA) {
                mapa[0][posicion] = Iconos.SERPIENTE
                mapeo.printaBordes()
                izquierda(posicion - 1, serTamano + 1)

            } else if (posicion < mapa.size - 1) {
                mapeo.printaBordes()

                mapa[0][posicion + serTamano] = Iconos.VACIO
                izquierda(posicion - 1, serTamano)

            }
        } catch (e: IndexOutOfBoundsException) {
            mapeo.printaBordes()
            return
        }
    }

}