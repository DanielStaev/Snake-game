import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {
    
    
    public Window() {
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(600, 600);
        this.getContentPane().setBackground(Color.black);
        this.setLocationRelativeTo(null);

        Snake snake = new Snake(); // Calling the snake class
        snake.setOpaque(false); //Making the snake panel transparent
        this.add(snake);//adding snake
        
        this.setVisible(true);
        
        
    }

   
}
