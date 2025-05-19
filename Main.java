import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import vistas.loginPanel;

public class Main {

    public static void main(String[] args) {
        
        
        // ventana 
        JFrame miVentana = new JFrame(); 
        miVentana.setTitle("Hospital SCL"); 
        miVentana.setSize(1000, 800); 
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());

        //Panel banner
        JPanel panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500,800));
        panelBanner.setOpaque(true);
        panelBanner.setBackground(Color.RED);
        miVentana.add(panelBanner,BorderLayout.WEST);
        
        // Panel login
        miVentana.add(new loginPanel().getPanel(),BorderLayout.CENTER);

        miVentana.setVisible(true);
        
    }
}
