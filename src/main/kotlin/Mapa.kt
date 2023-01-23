import javax.swing.Icon

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
        mapa[0][6] = Iconos.MANZANA
        mapa[0][5] = Iconos.MANZANA
        mapa[0][2] = Iconos.MANZANA
        this.mapa = mapa
    }

    fun inicio(tamano: Int) {
        val posi = 0
        val serTamano=0
        actualizar(posi, serTamano)
    }

    fun actualizar(posicion: Int, tamano: Int) {
        Thread.sleep(Iconos.REFRESH)
        //val movi=Movimiento(posicion, tamano).movment()
        try {
            if (mapa[0][posicion + 1] == Iconos.MANZANA) {
                mapa[0][posicion] = Iconos.SERPIENTE
                printaBordes()
                actualizar(posicion + 1, tamano + 1)
            }
        }catch(e: IndexOutOfBoundsException){
            mapa[0][posicion] = Iconos.SERPIENTE
for(elem in 0..tamano) {
    mapa[0][posicion - elem] = Iconos.MAPA
}
}
               mapa[0][posicion] = Iconos.SERPIENTE


if(tamano>0){
    suma(posicion, tamano)
}
        if (posicion < mapa.size - 1) {
            printaBordes()
                mapa[0][posicion-tamano] = Iconos.VACIO
                actualizar(posicion + 1, tamano)
            }

    }

    fun suma(posicion: Int, serTamano: Int) {
for(elem in 0..serTamano) {
    mapa[0][posicion - elem] = Iconos.SERPIENTE

}
    }

    /*/  fun suma(posicion: Int, serTamano: Int) {
          Thread.sleep(Iconos.REFRESH)

          mapa[0][posicion] = Iconos.SERPIENTE
          mapa[0][posicion - 1] = Iconos.SERPIENTE

          printaBordes()
          if (posicion <= mapa.size) {
              mapa[0][posicion] = Iconos.MAPA
              mapa[0][posicion - 1] = Iconos.MAPA
              suma(posicion + 1, serTamano)
          }

      }
  */
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
