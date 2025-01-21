import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

class Shapes extends JPanel {

    public Shapes () {
        
    }

    @Override
    public void paintComponent(Graphics g) {

        int changeY = 200;
        int changeX = 100;
        int changeW = 0;

        g.setColor(Color.RED);
        g.fillOval(50 + changeX,50 + changeY,100,200);

        g.setColor(Color.BLUE);
        g.fillOval(350 + changeX + changeW,50 + changeY,100,200);


        g.setColor(Color.BLACK);
        //g.drawRect(100,100,300,200);
        g.fillRect(100+changeX,50 + changeY,300+changeW,200);

        g.setColor(Color.WHITE);
        g.drawRect(120+changeX,70+changeY,260+changeW,160);

    }

    public static void main(String[] args) {
        // "it works" message
        System.out.println("It's alive!");

        var window = new JFrame();

        // Set window size
        window.setSize(700,700);

        // Tell program 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pass class as content of window
        window.setContentPane(new Shapes());

        // make it visible
        window.setVisible(true);
    }
}