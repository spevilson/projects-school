import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

public class WindowFun extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        g.drawString("Ickle Me, Pickle Me, Tickle Me too", 50, 50);
        g.drawString("Went for a ride in a flying shoe.",50,65);
        g.drawString("'Hooray! What fun! It's time we flew!'",50,80);
        g.drawString("Cried Ickle Me, Pickle Me, Tickle Me too.",50,95);
    }
    
    public static void main (String[] args) {
        // create a new window
        var window = new JFrame();

        // set the window to be 200 pixels by 200 pixels
        window.setSize(400,400);

        // close the app when the user closes the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //make the windowfun class responsible for the contents
        // of the window
        window.setContentPane(new WindowFun());

        // turn the window on
        window.setVisible(true);
    }
}
