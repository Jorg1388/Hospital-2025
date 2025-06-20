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

        // Solo agregamos el menú lateral y el header
        this.add(new MenuLateralPanel().getPanel(), BorderLayout.CENTER); // Cambiado a CENTER
        this.add(new HeaderPanel().getPanel(), BorderLayout.NORTH);

        this.setVisible(true);
    }
}
