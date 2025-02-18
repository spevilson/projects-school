import javax.swing.*;
import java.awt.Graphics;

class movieTheatre extends JPanel{
    String input;
    String input1;
    int ageRange;
    String message;
    String image;




    public movieTheatre () {
        // initialization code
        input = JOptionPane.showInputDialog("Welcome to Laie Palms Cinemas! Please enter age: ");
        System.out.println("User Input: " + input);
        int age = Integer.parseInt(input);
        if (age<0 || age>=120) {
            input1 = JOptionPane.showInputDialog("Are you sure you typed that correctly? Please try again- enter age: ");
            age = Integer.parseInt(input1);
        }
        if (age>=0 && age<3) {
            ageRange = 1;
        } else if (age>=3 && age<11) {
            ageRange = 2;
        } else if (age>=11 && age<60) {
            ageRange = 3;
        } else if (age>=60 && age<120) {
            ageRange = 4;
        } else {
            System.out.println("Wrong input twice in a row");
        }


    }

    @Override
    public void paintComponent(Graphics g) {
        
    }

    public static void main(String[] args) {
        // making the variable a part of this scope too
        movieTheatre aR = new movieTheatre();

        JLabel label = new JLabel();
         
        if (aR.ageRange == 1) {
            ImageIcon image = new ImageIcon("chipm.jpg");
            label.setIcon(image);
            label.setText("You get in free!");
        } else if (aR.ageRange == 2) {
            ImageIcon image = new ImageIcon("incredi.jpg");
            label.setIcon(image);
            label.setText("You owe $7.00!");
        } else if (aR.ageRange == 3) {
            ImageIcon image = new ImageIcon("swesb.jpg");
            label.setIcon(image);
            label.setText("You owe $10.00!");
        } else if (aR.ageRange == 4) {
            ImageIcon image = new ImageIcon("fiddl.jpg");
            label.setIcon(image);
            label.setText("That will be $7.00, please");
        }
        // window settings
        var window = new JFrame();
        
        window.setVisible(true);
        window.setTitle("Your Movie");
        window.setSize(700,400);
        window.add(label);
        // window.setIconImage()
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}