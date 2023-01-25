import java.awt.*
import java.awt.event.*
import javax.swing.*
import java.awt.event.KeyEvent


/*/class Ventana(titulo: String?) : JFrame(titulo) {
    fun onKeyUp(keyCode: Int, event: KeyEvent): Boolean {
        return when (keyCode) {
            KeyEvent. -> {
                moveShip(MOVE_LEFT)
                true
            }
            KeyEvent.KEYCODE_F -> {
                moveShip(MOVE_RIGHT)
                true
            }
            KeyEvent.KEYCODE_J -> {
                fireMachineGun()
                true
            }
            KeyEvent.KEYCODE_K -> {
                fireMissile()
                true
            }
            else -> super.onKeyUp(keyCode, event)
        }
    }
}

 */