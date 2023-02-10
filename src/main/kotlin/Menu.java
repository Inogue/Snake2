import java.awt.Container;

import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 7, 1},

        d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0002¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\f"},
        d2 = {"LMenu;", "Ljavax/swing/JFrame;", "title", "", "(Ljava/lang/String;)V", "createLayout", "", "arg", "", "Ljavax/swing/JComponent;", "([Ljavax/swing/JComponent;)V", "createUI", "Snake2"}
)
public final class Menu extends JFrame {
    private  void createUI(String title) {
        this.setTitle(title);

        JLabel titulo = new JLabel("SNAKE");
        JButton facil = new JButton("FACIL");
        JButton normal = new JButton("NORMAL");
        JButton dificil = new JButton("DIFICIL");
        titulo.setFont(titulo.getFont().deriveFont(50.0F));
        facil.addActionListener(e -> startGame(new Snake(1)));
        normal.addActionListener(e -> startGame(new Snake(2)));
        dificil.addActionListener(e -> startGame(new Snake(3)));
        this.createLayout(titulo, facil, normal, dificil);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
    }

    private void createLayout(JComponent... arg) {
        GroupLayout gl = new GroupLayout(this.getContentPane());
        Container var10000 = this.getContentPane();
        Intrinsics.checkNotNullExpressionValue(var10000, "contentPane");
        var10000.setLayout(gl);
        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);
        gl.setHorizontalGroup(gl.createParallelGroup(Alignment.CENTER).addComponent(arg[0]).addGap(60, 150, Integer.MAX_VALUE)
                .addComponent(arg[1])
                .addComponent(arg[2])
                .addComponent(arg[3]));
        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0])
                .addGap(30).addComponent(arg[1])
                .addComponent(arg[2]).addComponent(arg[3]));
        this.pack();
    }

    public Menu(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.createUI(title);
    }

    public ActionListener startGame(Snake s) {
        s.setVisible(true);
        return s;
    }
}
// MenuKt.java


@Metadata(
        mv = {1, 7, 1},
        k = 2,
        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
        d2 = {"showUI", "", "Snake2"}
)
   final class MenuKt {
    public static void showUI() {
        Menu frame = new Menu("Snake");
        frame.setVisible(true);
    }
}
