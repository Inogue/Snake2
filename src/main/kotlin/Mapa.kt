class Mapa(tamaño: Int) {
    val void = Vacio().vacio()
    var mapa: List<ArrayList<Any?>>

    init {
        val mapa = arrayListOf<ArrayList<Any?>>()
        for (x in 0..tamaño - 1) {
            mapa.add(arrayListOf())
            for (y in 0..tamaño - 1) {
                mapa[x].add(void)
            }
        }
        this.mapa = mapa
    }

    fun inicio(tamano: Int) {
        val mapa2 = arrayListOf<ArrayList<Any?>>()
        var posi = 0
        for (x in 0..tamano - 1) {
            mapa2.add(arrayListOf())
            for (y in 0..tamano - 1) {
                if (mapa[0][0] == null && x == 0 && y == 0) {
                    mapa2[x].add(Serpiente())
                    posi = x
                } else if (mapa[x][y] == null) {
                    mapa2[x].add(void)
                }
            }
        }
        actualizar(posi)
    }

    fun actualizar(posicion: Int) {
        Thread.sleep(500)
        mapa[0][posicion] = Serpiente()
        bordes()
        if (posicion < mapa.size - 1) {
            mapa[0][posicion] = void
            actualizar(posicion + 1)
        }

    }


//    fun actualizar(mapa3: ArrayList<ArrayList<Any?>>, posicion: Int) {
//        val mapa2 = arrayListOf<ArrayList<Any?>>()
//        var contador = posicion
//
//        for (x in 0..mapa.size - 1) {
//            mapa2.add(arrayListOf())
//            for (y in 0..mapa.size - 1) {
//                if (mapa3[contador][contador] == null && x == contador && y == contador) {
//                    mapa2[contador].add(Serpiente())
//                    contador += 1
//                } else if (mapa[x][y] == null) {
//                    mapa2[x].add(void)
//                } else if (contador >= mapa.size - 1) {
//                    break
//                }
//            }
//        }
//        bordes(mapa2)
//        for (elem in mapa2) {
//            println(elem)
//        }
//
//    }


    fun bordes() {
        repeat(mapa.size + 1) {
            print(" # ")
        }

        println()
        for (fila in mapa) {
            print("# ")

            for (casilla in fila) {
                print(casilla ?: " · ")
            }

            println(" #")
        }

        repeat(mapa.size + 1) {
            print(" # ")
        }
        println()
    }
}
