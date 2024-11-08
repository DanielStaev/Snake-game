import javax.swing.JFrame;

public class Window {
    JFrame window = new JFrame();

    void createWindow(){
        window.setTitle("Snake Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(600, 600);
        window.setVisible(true);
    }
}
