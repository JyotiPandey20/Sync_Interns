
package snakeg;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SnakeG extends JFrame {
    public SnakeG() {
        initUI();
    }

    private void initUI() {
        add(new Game());

        setTitle("Snake Game");
        setSize(830, 630);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SnakeG ex = new SnakeG();
            ex.setVisible(true);
        });
    }
}
