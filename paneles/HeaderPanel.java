package paneles;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class HeaderPanel extends JPanel {

    public HeaderPanel() {
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(1600, 70));
        this.setLayout(new BorderLayout());

        Font tituloFuente = new Font("Serif", Font.BOLD, 25);

        JPanel panelIzquierdo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelIzquierdo.setOpaque(false);
        JLabel tituloLabel = new JLabel("Hospital");
        tituloLabel.setFont(tituloFuente);
        tituloLabel.setForeground(Color.BLACK);
        tituloLabel.setBorder(new EmptyBorder(10, 50, 0, 0)); 
        panelIzquierdo.add(tituloLabel);

        JPanel panelDerecho = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelDerecho.setOpaque(false);
        JLabel nombresLabel = new JLabel("Jorge Gómez y Erick García");
        nombresLabel.setFont(tituloFuente);
        nombresLabel.setForeground(Color.BLACK);
        nombresLabel.setBorder(new EmptyBorder(10, 100, 0, 20));
        panelDerecho.add(nombresLabel);

       this. add(panelIzquierdo, BorderLayout.WEST);
        this.add(panelDerecho, BorderLayout.EAST);
    }

    public JPanel getPanel() {
        return this;
    }
}
