import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

class SheepFun extends JPanel{

    public SheepFun () {
        // initialization code
    }

    @Override
    public void paintComponent(Graphics g) {
        // rendering code
        g.setColor(Color.GREEN);
        var w = getWidth();
        var h = getHeight();
        g.fillRect(0,0,w,h);

    }

    public static void main(String[] args) {
        System.out.println("It's alive!");

        var window = new JFrame();

        // Set window size
        window.setSize(400,400);
        // Tell program how to close
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // What to put inside your window
        window.setContentPane(new SheepFun());
        // make it visible
        window.setVisible(true);
    }
}