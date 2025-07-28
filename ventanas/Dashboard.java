package ventanas;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import paneles.HeaderPanel;
import paneles.MenuLateralPanel;

public class Dashboard extends JFrame {

    public Dashboard() {
        this.setTitle("Dashboard"); 
        this.setSize(1600, 800); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // Agregar directamente los paneles
        this.add(new HeaderPanel(), BorderLayout.NORTH);
        this.add(new MenuLateralPanel(), BorderLayout.CENTER);

        this.setVisible(true);
    }
}
