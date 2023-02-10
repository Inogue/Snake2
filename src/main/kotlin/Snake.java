import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import kotlin.Metadata;

@Metadata(
        mv = {1, 7, 1},

        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"},
        d2 = {"LSnake;", "Ljavax/swing/JFrame;", "difficulty", "", "(I)V", "initUI", "", "Snake2"}
)
public final class Snake extends JFrame implements ActionListener {
    private final int difficulty;

    private final void initUI() {
        if (this.difficulty == 1) {
            this.add((new Pantalla(100, 100, 100, 10, 250, 20)));
        }

        if (this.difficulty == 2) {
            this.add((new Pantalla(150, 150, 225, 15, 200, 75)));
        }

        if (this.difficulty == 3) {
            this.add((new Pantalla(300, 300, 900, 25, 150, 150)));
        }

        this.setTitle("Snake");
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public Snake(int difficulty) {
        this.difficulty = difficulty;
        this.initUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}