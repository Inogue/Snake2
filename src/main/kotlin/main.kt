import java.io.FileDescriptor
import java.io.FileOutputStream
import java.io.PrintStream
import java.nio.charset.StandardCharsets

fun main() {
    if (System.out.charset() != StandardCharsets.UTF_8)
        System.setOut(PrintStream(FileOutputStream(FileDescriptor.out), true, StandardCharsets.UTF_8))

    println("Dime el tamaño del mapa")
    val tamano = readln().toInt()
    val mapa = Mapa(tamano)
    mapa.inicio(tamano)
    //val ventana=Ventana("Patata")
    //  ventana.eventoTeclado()
    // ventana.evento()
//val menu = Menu()
    //menu.visual1()
}
