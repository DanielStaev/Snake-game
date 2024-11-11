import java.awt.event.*;

public class SnakeMovement implements KeyListener {

    int snakeX = 100;
    int snakeY = 100;
    int speed = 10;


    public int getSnakeX() {
        return snakeX;
    }

    public int getSnakeY() {
        return snakeY;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_D){
           snakeX += speed;
        }else if(key == KeyEvent.VK_A){
           moveLeft();
        }else if(key == KeyEvent.VK_W){
           moveUp();
        }else if(key == KeyEvent.VK_S){
           moveDown();
        }
    }

    public void moveUp() {
        snakeY -= speed;
    }
    public void moveDown(){
        snakeY += speed;
    }
    public void moveRight() {
        snakeX += speed;
    }
    public void moveLeft() {
        snakeX -= speed;
    }





    public void keyTyped(KeyEvent e) {
    }
    public void keyReleased(KeyEvent e) {
    }
    

}