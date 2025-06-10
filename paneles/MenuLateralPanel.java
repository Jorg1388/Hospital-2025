package paneles;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class MenuLateralPanel extends JPanel{
    
    public MenuLateralPanel(){
        this.setPreferredSize(new Dimension(400, 1000));
        this.setOpaque(true);
        this.setBackground(Color.RED);
    }

    public JPanel getPanel() {
        return this;
    }
}
