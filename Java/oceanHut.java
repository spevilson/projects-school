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

        // airplane!!

        // cockpit
        g.setColor(Color.BLACK);
        g.drawOval(200,36,20,10);
        // fuselage
        g.setColor(Color.GRAY);
        g.fillRect(185,40,50,16);
        g.fillOval(177,40,16,16);
        // tail
        g.fillPolygon(new int[] {235,235,261},new int[] {40,56,40}, 3);
        // wings
        g.fillPolygon(new int[] {200,235,215},new int[] {50,20,50}, 3);
        g.fillPolygon(new int[] {200,175,215},new int[] {50,80,50}, 3);


        // rope for banner
        g.setColor(Color.BLACK);
        g.drawPolygon(new int[] {261,271,271},new int[] {40,50,30},3);

        // Banner
        g.setColor(Color.GRAY);
        g.fillRect(271,30,100,20);
        g.fillPolygon(new int[] {371,371,381},new int[] {30,40,30},3);
        g.fillPolygon(new int[] {371,371,381},new int[] {50,40,50},3);

        // Banner message
        g.setColor(Color.RED);
        g.drawString("GO SEASIDERS!", 276, 45);

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