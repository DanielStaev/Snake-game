import java.awt.*;
import javax.swing.*;


public class Snake extends JPanel{

    public void paint(Graphics g) {
        super.paint(g); // Call the superclass's paint method
        drawSnake(g); // Call the drawSnake method to draw the rectangle
    }

    public void drawSnake(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.green);
        g2D.fillRect(100, 100, 20, 20);
    }
    
}
