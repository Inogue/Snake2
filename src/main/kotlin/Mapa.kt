open class Mapa(tamano: Int) {
    var mapa: List<ArrayList<Any?>>

    init {
        val mapa = arrayListOf<ArrayList<Any?>>()
        for (x in 0 until tamano) {
            mapa.add(arrayListOf())
            for (y in 0 until tamano) {
                mapa[x].add(Iconos.MAPA)
            }
        }
        mapa[0][2] = Iconos.MANZANA
        this.mapa = mapa
    }

    fun inicio(tamano: Int) {
        val posi = 0
        val serTamano = 0
        actualizar(tamano, posi, serTamano)
    }

    fun actualizar(tamano: Int, posicion: Int, serTamano: Int) {
        appleSpawn(tamano)
        Thread.sleep(Iconos.REFRESH)
        //val movi=Movimiento(posicion, tamano).movment()
        if (mapa.size <= posicion + 1) {
            actualizar(tamano, posicion + 1, serTamano)
        }
        if (mapa[0][posicion + 1] == Iconos.MANZANA) {
            mapa[0][posicion] = Iconos.SERPIENTE
            printaBordes()
            actualizar(tamano, posicion + 1, serTamano + 1)
        }

        mapa[0][posicion] = Iconos.SERPIENTE

        if (serTamano > 0) {
            suma(posicion, serTamano)
        }
        if (posicion < mapa.size - 1) {
            printaBordes()
            mapa[0][posicion - serTamano] = Iconos.VACIO
            actualizar(tamano, posicion + 1, serTamano)
        }
    }

    private fun suma(posicion: Int, serTamano: Int) {
        for (elem in 0..serTamano) {
            mapa[0][posicion - elem] = Iconos.SERPIENTE

        }
    }

    private fun appleSpawn(tamano: Int)  {
        var confirm=false
        for (elem in mapa) {
            for (casilla in elem) {
                if (casilla == Iconos.MANZANA)
                    confirm = true
            }
        }
if(!confirm){
    mapa[(0 until tamano).random()][(1 until tamano).random()] = Iconos.MANZANA
}

    }

    fun printaBordes() {
        repeat(mapa.size + 1) {
            print(" # ")
        }
        println()
        for (fila in mapa) {
            print("# ")
            for (casilla in fila) {
                print(casilla ?: Iconos.VACIO)
            }
            println(" #")
        }
        repeat(mapa.size + 1) {
            print(" # ")
        }
        println()
    }
}
