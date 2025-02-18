import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Graphics;


public class MultiArrayFun extends JPanel {

    String[] studentNames = {"Luffy", "Zoro", "Sanji", "Nami", "Robin"};  
    int[][] testScores = {
        {75,78,80},
        {80,89,86},
        {82,88,85},
        {95,94,98},
        {100,100,100}
    };

    ImageIcon swesb;
    public MultiArrayFun() {
        swesb = new ImageIcon("swesb.jpg");


    }

    @Override
    public void paintComponent(Graphics g) {
        int x = 10;
        int y = 20;
        double average = 0;
        for (int i=0; i<5;i++) {
            double sum = 0;
            for (int j=0; j<3;j++) {
                sum +=testScores[i][j];
                average = sum/3;
            }
            g.drawString((studentNames[i] + ": " + average), 0, y);
            y+=20;
        }




        // for (String name : studentNames) {
        //     if (name.equals("Luffy")) {
        //         swesb.paintIcon(null,g,0,10);
        //         y+=swesb.getIconHeight();
        //     }
        //     // g.drawString(name, x, y);
        //     y+=20;
        // }
    }

    public static void main(String[] args) {
        var window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setContentPane(new MultiArrayFun());
        // window.setPositionRelativeTo(null);
        window.setVisible(true);
    }
}