import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

class className extends JPanel{

    public className () {
        // initialization code
    }

    @Override
    public void paintComponent(Graphics g) {
        // rendering code
    }

    public static void main(String[] args) {
        System.out.println("It's alive!");

        var window = new JFrame();

        // Set window size
        window.setSize(400,400);
        // Tell program how to close
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // What to put inside your window
        window.setContentPane(new className());
        // make it visible
        window.setVisible(true);
    }
}