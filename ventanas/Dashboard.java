package ventanas;
import javax.swing.JFrame;

public class Dashboard extends JFrame {

    public Dashboard() {

        this.setTitle("Dashboard"); 
        this.setSize(1600, 800); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        this.setVisible(true);
    }

    public JFrame getDashboard() {
        return this;
    }

}
