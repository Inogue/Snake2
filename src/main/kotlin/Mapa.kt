class Mapa(tamaño: Int){
    var inicio=0
    val mapa : List<ArrayList<Vacio>>
    init {
        val mapa = arrayListOf<ArrayList<Vacio>>()
        for (x in 0..tamaño - 1) {
            mapa.add(arrayListOf())
            for (y in 0..tamaño - 1) {
                mapa[x].add(Vacio())
            }
        }
        // nou codi

        this.mapa = mapa
    }

    fun mapa(tablero: List<Any>){
  for (elemento in tablero){
     // if( ){

      }
  }


fun inicio(posicionx: Int, posiciony: Int){
    //Aqui iria la posicion inicial de la serpiente

}

}
