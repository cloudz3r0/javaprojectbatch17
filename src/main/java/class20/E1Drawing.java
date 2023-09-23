package class20;

import javax.swing.*;
import java.awt.*;

public class E1Drawing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyCanvas c = new MyCanvas();

        frame.setSize(2000, 2000);//creates the window to paint in
        frame.add(c);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
    class MyCanvas extends Canvas{
        public void paint(Graphics g){
            g.setColor(Color.BLUE);//makes a blue rectangle.

            g.fillOval(200,200,500,500);

            g.setColor(Color.BLACK);
            g.fillRect(800,200,500,500);//x and y are position on screen.
        }
    }

