import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

class MethodFun extends JPanel{

    public int getRandomNumber() {
        return (int)(Math.random() * 600);
    }

    public void drawRectang(int width, int height, Color c, Graphics g) {
        g.setColor(c);
        g.fillRect(getRandomNumber(),getRandomNumber(),width,height);
    }
    // int randomX = (int)(Math.random()*600);
    // int randomY = (int)(Math.random()*600);

    @Override
    public void paintComponent(Graphics g) {
        drawRectang(50,60, Color.YELLOW, g);
        
    
    // g.setColor(Color.BLACK);
    // g.fillRect(10,10,50,50);
    // g.setColor(Color.RED);
    // g.fillRect(10,150,140,90);
    // g.setColor(Color.BLUE);
    // g.fillRect(10,300,200,70);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();

        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600,600);
        window.setContentPane(new MethodFun());
        window.setVisible(true);
    }


}