import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SimpleWindow {
    public static void main(String[] args) {
            new MyFrame();
        }
}

class MyFrame extends JFrame {
    public MyFrame() {
        MyPanel panel = new MyPanel();
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Simple Window");
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}

class MyPanel extends JPanel {
    MyPanel() {
        this.setPreferredSize(new Dimension(800, 600));
        this.setFocusable(true);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_SPACE) {

                    JOptionPane.showMessageDialog(getComponentPopupMenu(),
                            "My name is Greta",
                            "Windowww",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
