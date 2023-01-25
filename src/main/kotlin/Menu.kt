class Menu() {
    fun visual1(){
        val salida="!"
        println("SELECCIONA UN MODO DE JUEGO")
        println("1-MODO PUNTOS")
        println("2-MODO INFINITO")
        println("3-VER RECORD")
        println("4-SALIR")
        var respuesta= readln()
if(respuesta.toInt()==1){
      puntuos()
  }
    else if(respuesta.toInt()==2){
           infinito()

   }

    else if(respuesta.toInt()==3){
                record()
        }
    else if(respuesta.toInt()==4){
            println("¡¡ADIOS!!")
    }
    else{
        println("HAS DE DECIDIR ALGO CON LOS NUMEROS")
    respuesta= readln()
    }

    }
    fun puntuos() {

        println("BIEN, HAS ELEGIDO MODO PUNTUACION, QUE DIFICULTAD QUIERES JUGAR?")
        println("1-MODO FACIL")
        println("2-MODO NORMAL")
        println("3-MODO DIFICIL")
        println("4-VOLVER AL MENU")
        val respuesta = readln()
    }
    fun infinito(){
        println("BIEN, HAS ELEGIDO MODO INFINITO, QUE MODO QUIERES JUGAR?")
        println("1-MODO SOLITARIO")
        println("2-MODO VS IA")
        println("3-VOLVER AL MENU")
        val respuesta = readln()
    }

    fun record(){
        println("BIEN, HAS ELEGIDO VER LOS DE TUS PARTIDAS RECORDS")
        println("ESTA ES TU LISTA")
        println("LISTA")
        println("INTRODUCE LA TECLA ! PARA VOLVER AL MENU")
        val respuesta = readln()
    }

}
