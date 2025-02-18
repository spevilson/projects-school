import javax.swing.*;
import java.awt.Graphics;

class pictest {

    public pictest () {
        // initialization code
    }


    public static void main(String[] args) {


        JLabel label = new JLabel();

        ImageIcon image = new ImageIcon("swesb.jpg");
        // label.setTitle("HAHA");
        label.setIcon(image);

        label.setOpaque(true);
        

        var window = new JFrame();
        // Set window size
        window.setSize(400,500);
        // Tell program how to close
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // What to put inside your window
        // window.setLocationRelativeTo(null);
        // make it visible
        window.setVisible(true);
        // window.setContentPane(new pictest());
        window.add(label);
        window.pack();
    }
}