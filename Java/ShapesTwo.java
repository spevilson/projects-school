import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

class ShapesTwo extends JPanel {
    

    public int getRandomNumber() {
        return (int)(Math.random() * 600);
    }

    public void drawOvals(int x, int y, int distance, Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(35+x, 100+y, 150, 200);
        g.setColor(Color.BLUE);
        g.fillOval(25+distance+x, 100+y, 150, 200);

    }
    public void drawCont(int x, int y, int width, Graphics g) {
        drawOvals(x, y, width, g);
        g.setColor(Color.BLACK);
        g.fillRect(100+x, 100+y, width, 200);
    }
    public void drawRandomCont(int width, Graphics g) {
        int x = getRandomNumber();
        int y = getRandomNumber();
        drawOvals(x, y, width, g);
        g.setColor(Color.BLACK);
        g.fillRect(100+x, 100+y, width, 200);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        drawCont(0,0,200, g);
        drawCont(300,300,200,g);
        drawRandomCont(200, g);
        }
    public static void main(String[] args) {
        //create a new window
        var window = new JFrame();
        //set the windows size to 200 pixels wide, 200 pixels high
        window.setSize(1000,1000);
        //close the app when the user closes the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* make the LO class responsible for the contents of our window */
        window.setContentPane(new ShapesTwo());
        //turn the window on
        window.setVisible(true);
        }
}
