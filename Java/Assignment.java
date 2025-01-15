import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

class Assignment extends JPanel{

    @Override
    public void paintComponent(Graphics g) {
        g.drawString("Ickle Me, Pickle Me, Tickle Me too", 50, 50);
        g.drawString("Went for a ride in a flying shoe.",50,65);
        g.drawString("'Hooray! What fun! It's time we flew!'",50,80);
        g.drawString("Cried Ickle Me, Pickle Me, Tickle Me too.",50,95);

        g.drawString("Ickle was captain, and Pickle was crew,",50,125);
        g.drawString("and Tickle served coffee and mulligan stew",50,140);
        g.drawString("As higher and higher and higher they flew.",50,155);
        g.drawString("Ickle Me, Pickle Me, Tickle Me too.",50,170);

        g.drawString("Ickle Me, Pickle Me, Tickle Me too,",50,200);
        g.drawString("Over the sun and beyond the blue.",50,215);
        g.drawString("'Hold on! Stay in! I hope we do!'",50,230);
        g.drawString("Cried Ickle Me, Pickle Me, Tickle Me too.",50,245);
       
        g.drawString("Ickle Me, Pickle Me, Tickle Me too,",50,275);
        g.drawString("Never returned to the world they knew",50,290);
        g.drawString("And no one knows what's happened to",50,305);
        g.drawString("Dear Ickle Me, Pickle Me, Tickle Me too.",50,320);
       
        
    }

    public static void main(String[] args) {
        System.out.println("Hello CS202!");

        var window = new JFrame();

        // Set window size
        window.setSize(400,500);
        // Tell program how to close
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // What to put inside your window
        window.setContentPane(new Assignment());
        // make it visible
        window.setVisible(true);
    }
}