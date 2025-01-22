import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

class oceanHut extends JPanel{

    public oceanHut () {
        // initialization code
    }

    @Override
    public void paintComponent(Graphics g) {
        // this variable changes the y value for the entire house
        int house_y = 0;


        // Cyan for the light blue sky color
        g.setColor(Color.CYAN);
        g.fillRect(0,0,400,400);


        // Foliage
        g.setColor(Color.GREEN);
        g.fillOval(0,75,100,150);
        g.fillOval(75,120,100,100);
        g.fillOval(125,100,100,160);
        g.fillOval(200,80,120,130);
        g.fillOval(300,100,90,100);
        // Rectangle to eliminate weird spaces in between green
        // and the beach color
        g.fillRect(0,130,400,270);

        // Sand color
        g.setColor(Color.YELLOW);
        g.fillRect(0,265,400,200);

        // Ocean color
        g.setColor(Color.BLUE);
        g.fillOval(-100,300,600,100);

        // House wall color
        g.setColor(Color.MAGENTA);
        g.fillRect(100,175 - house_y,100,100);

        // House roof
        g.setColor(Color.ORANGE);
        g.fillRect(90,165 - house_y,120,10);
        g.fillRect(100,155 - house_y,100,10);
        g.fillRect(110,145 - house_y,80,10);


        // House windows and door
        g.setColor(Color.BLACK);
        g.fillRect(140,210 - house_y,20,65);
        g.fillRect(170,205 - house_y,20,20);


        // Sign
        g.setColor(Color.ORANGE);
        g.fillRect(40,250,100,20);
        g.fillRect(87,250,6,40);

        // sign message
        g.setColor(Color.BLACK);
        g.drawString("Spencer's Hut",45,265);

        // clouds
        g.setColor(Color.WHITE);
        g.fillOval(50,50,75,30);
        g.fillOval(30,40,75,30);
        g.fillOval(60,30,75,30);

        g.fillOval(140,50,30,15);
        g.fillOval(130,60,30,15);
        g.fillOval(155,55,30,15);

        g.fillOval(300,50,75,30);
        g.fillOval(320,35,75,30);
        g.fillOval(320,65,75,30);

        int xPoints = [];
        int yPoints = [];


        // airplane
        g.setColor(Color.GRAY);
        g.fillRect(225,40,60,16);
        g.fillOval(217,40,16,16);
        g.fillPolygon([285,285,301],[40,56,40], 3);

        g.setColor(Color.BLACK);
        g.drawOval(240,46,20,5);

        // Banner message


    }

    public static void main(String[] args) {
        System.out.println("It's alive!");

        var window = new JFrame();

        // Set window size
        window.setSize(400,400);
        // Tell program how to close
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // What to put inside your window
        window.setContentPane(new oceanHut());
        // make it visible
        window.setVisible(true);
    }
}