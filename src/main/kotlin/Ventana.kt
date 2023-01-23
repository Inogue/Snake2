import java.awt.*
import java.awt.event.*
import javax.swing.*

class Ventana(titulo: String?) : JFrame(titulo) {
    var contenedor = JPanel()

    init {
        val d = Dimension(500, 500)
        this.size = d
        defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        this.contentPane.add(contenedor)
        contenedor.layout = null
        eventoTeclado()

    }

    fun eventoTeclado() {
        val caja = JTextField()
        caja.setBounds(10, 10, 400, 30)
        contenedor.add(caja)
        val areaTexto = JTextArea()
        areaTexto.setBounds(10, 50, 400, 200)
        contenedor.add(areaTexto)
        val l: KeyListener = object : KeyListener {
            override fun keyPressed(e: KeyEvent?) {
                areaTexto.append("keyPressed\n")
            }

            override fun keyTyped(e: KeyEvent?) {
                areaTexto.append("keyTyped\n")
            }

            override fun keyReleased(e: KeyEvent?) {
                //areaTexto.append("keyReleased\n")
                if ((e?.keyChar ?: "*") == '*') {
                    areaTexto.append("Soltaste el asterisco\n")
                }
                if (e?.keyChar == '\n') {
                    areaTexto.append("Soltaste el enter\n")
                }
                if (e?.keyChar == ' ') {
                    areaTexto.append("Soltaste el espacio\n")
                }
            }
        }
        caja.addKeyListener(l)
    }
    fun evento(){
        val boton=JButton("")
        boton.setBounds(10,10,450,30)
        contenedor.add(boton)
        val caja=JTextField()
        caja.setBounds(10,50,400,30)
        contenedor.add(caja)
        val etiqueta=JLabel()
        etiqueta.setBounds(10,100,400,30)
        contenedor.add(etiqueta)
        val accion=ActionListener{
            etiqueta.text="Hola ${caja.text}"
        }
        boton.addActionListener(accion)
    }
}