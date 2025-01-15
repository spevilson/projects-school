import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

class GraphicsPractice extends JPanel{

    @Override
    public void paintComponent(Graphics g) {
        g.drawString("Ickle Me, Pickle Me, Tickle Me too", 50, 50);
        g.drawString("Went for a ride in a flying shoe.",50,65);
       
        
    }

    public static void main(String[] args) {
        System.out.println("Hello CS202!");

        var window = new JFrame();

        // Set window size
        window.setSize(400,500);
        // Tell program how to close
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // What to put inside your window
        window.setContentPane(new GraphicsPractice());
        // make it visible
        window.setVisible(true);
    }
}
