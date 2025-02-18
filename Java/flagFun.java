import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JOptionPane;




class flagFun extends JPanel {
    int increment = 0;
    


    @Override
    public void paintComponent(Graphics g) {
        
        int height = getHeight();
        int width = getWidth();

        String inputS = JOptionPane.showInputDialog("How many stripes?");
        String inputX = JOptionPane.showInputDialog("How many rows of stars?");
        String inputY = JOptionPane.showInputDialog("How many columns of stars?");
        int inputStripes = Integer.parseInt(inputS);
        int inputStarR = Integer.parseInt(inputX);
        int inputStarC = Integer.parseInt(inputY);

        for (int i=0;i<13;i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.WHITE);
            }
            g.fillRect(0,(i*(height/13)),width,(height/13));
            
            
            System.out.println(height);
            System.out.println(width);
            //g.fillRect(0,0,(2*width/5),(2*height/5));

        }
        g.setColor(Color.BLUE);
        g.fillRect(0,0,2*width/5,7*height/13);
        g.setColor(Color.WHITE);
        int widthBox = 2*width/5;
        int heightBox = 7*height/13;
        for (int i=0;i<10;i++) {
            for (int j=0;j<5;j++) {
                g.fillOval(i*(widthBox/10),j*(heightBox/5),widthBox/10,heightBox/5);
            }
        }
        
        


    }
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setSize(500,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new flagFun());
        window.setVisible(true);
    }












}