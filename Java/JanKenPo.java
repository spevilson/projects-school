import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Graphics;

class JanKenPo extends JPanel{
    String input;
    int userInput;
    String output;
    String output1;
    String output2;
    String output3;

    public JanKenPo () {
        // initialization code
        input = JOptionPane.showInputDialog("Welcome, please make your selection (rock, paper, scissors)");
        /*System.out.println*/output1 = ("User Input: " + input);

        if (input.equalsIgnoreCase("rock")) {
            userInput = 1;
        }
        else if (input.equalsIgnoreCase("paper")) {
            userInput = 2;
        }
        else if (input.equalsIgnoreCase("scissors")) {
            userInput = 3;
        }
        // 1 = rock
        // 2 = paper
        // 3 = scissors
        int ran = (int)(Math.random() * 3) + 1;
        System.out.println("Random generated: " + ran);

        if (ran == 1) {
            output = "rock";
        }
        else if (ran == 2) {
            output = "paper";
        }
        else if (ran == 3) {
            output = "scissors";
        }
        /*System.out.println*/output2 = ("Computer's input: " + output);
        
        // if ran is exactly 1 more than userInput, then you lose
        // but if ran is 3 and userInput is 1, than you win
        if (ran == userInput) {
            // System.out.println("It's a tie! Try again!");
            output3 = "It's a tie! Try again!";
        }
        else if (ran > userInput && ran != 3 && userInput !=1) {
            // System.out.println("You lose!");
            output3 = "You lose!";
        }
        else {
            // System.out.println("You win!");
            output3 = "You win!";
        }


    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawString(output1, 100,100);
        g.drawString(output2, 100,120);
        g.drawString(output3, 100,140);
    }

    public static void main(String[] args) {
        System.out.println("");

        var window = new JFrame();

        // Window size
        window.setSize(700,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new JanKenPo());
        window.setVisible(true);
    }
}