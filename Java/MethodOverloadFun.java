import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.*;

class MethodOverloadFun extends JPanel /*implements MouseListener, MouseMotionListener */{
    private final int CORD_X;
    private final int CORD_Y;

    // private int mouseX;
    // private int mouseY;

    public MethodOverloadFun() {
        CORD_X = (int)(Math.random() * 300);
        CORD_Y = (int)(Math.random() * 300);

        // addMouseListener(this);
        // addMouseMotionListener(this);
    }

    public int getRandomX() {
        return (int)(Math.random() * getWidth());
    }
    public int getRandomY() {
        return (int)(Math.random() * getHeight());
    }
    public void drawRect(int width, int height, Color c, Graphics g) {
        int x = getRandomX();
        int y = getRandomY();
        g.setColor(c);
        g.fillRect(x,y,width,height);
        // if (c==Color.BLUE) {
        //     int blueX = x;
        //     int blueY = y;
        // } 
        }
    

    public void drawRect(int x, int y, int width, int height, Color c, Graphics g) {
        g.setColor(c);
        g.fillRect(x,y,width,height);

    }

    public void drawRect(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(CORD_X,CORD_Y,50,50);
    }

    // @Override
    // public void mouseClicked(MouseEvent e) {
    // }

    // public void mouseMoved(MouseEvent e) {
    //     mouseX = e.getX();
    //     mouseY = e.getY();
    // }

    @Override
    public void paintComponent(Graphics g) {

        drawRect(50,60, Color.BLUE, g);
        drawRect(140,90, Color.RED, g);
        drawRect(500,60, Color.BLACK, g);

        drawRect(CORD_X, CORD_Y, 100,100,Color.YELLOW, g);
        drawRect(g);

        System.out.println("We are done!");
    }




    public static void main(String[] args) {
        MethodOverloadFun m = new MethodOverloadFun();
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600,600);
        window.setContentPane(m);
        window.setVisible(true);
        for (int i=0;i<100;i++) {
            window.setSize(200+10*i,200+10*i);
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
            if (i==99) {
                i=i-98;
            }
            // if (m.mouseX >= m.blueX) {
            //     break;
            // }
        }
    }
}