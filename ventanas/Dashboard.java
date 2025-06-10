package ventanas;
import java.awt.BorderLayout;

import javax.swing.JFrame;

import paneles.MenuLateralPanel;
import paneles.Tabla;

public class Dashboard extends JFrame {

    public Dashboard() {

        this.setTitle("Dashboard"); 
        this.setSize(1600, 800); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        this.add(new MenuLateralPanel().getPanel(), BorderLayout.WEST);
        Tabla tabla = new Tabla();
        add(tabla);

        this.setVisible(true);
    }

}
