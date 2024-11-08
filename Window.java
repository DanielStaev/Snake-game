import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Window extends JFrame {
    public Window() {
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(600, 600);
        
        this.setVisible(true);

    }

    public void paint(Graphics g) {
        super.paint(g); // Call the superclass's paint method
        drawSnake(g); // Call the drawSnake method to draw the rectangle
    }

    public void drawSnake(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.RED);
        g2D.fillRect(100, 100, 20, 20);
    }
}
