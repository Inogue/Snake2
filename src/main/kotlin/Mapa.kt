import java.lang.IndexOutOfBoundsException

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
        mapa[2][0] = Iconos.MANZANA
        this.mapa = mapa
    }

    fun suma(posicion: Int, serTamano: Int, movment: Int) {
        if(movment==1) {
            for (elem in 0..serTamano) {
                mapa[posicion - elem][0] = Iconos.SERPIENTE

            }
        }
        if(movment==2){
            for (elem in 0..serTamano) {
                mapa[0][posicion - elem] = Iconos.SERPIENTE

            }
        }
        if(movment==3){
            for (elem in 0..serTamano) {
                mapa[posicion + elem][0] = Iconos.SERPIENTE

            }
        }
        if(movment==4){
            for (elem in 0..serTamano) {
                mapa[0][posicion + elem] = Iconos.SERPIENTE

            }
        }
    }

    fun appleSpawn(tamano: Int) {
        var confirm = false
        for (elem in mapa) {
            for (casilla in elem) {
                if (casilla == Iconos.MANZANA)
                    confirm = true
            }
        }
        if (!confirm) {
            mapa[(0 until tamano).random()][(0 until tamano).random()] = Iconos.MANZANA
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
