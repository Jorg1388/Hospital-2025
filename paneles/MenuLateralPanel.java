package paneles;

import java.awt.*;
import javax.swing.*;

public class MenuLateralPanel extends JPanel {

    private CardLayout cardLayout;
    private JPanel contentPanel;

    public MenuLateralPanel() {
        this.setPreferredSize(new Dimension(400, 1000));
        this.setOpaque(true);
        this.setBackground(Color.RED);
        this.setLayout(new BorderLayout());

        // Crear botones
        JButton btnPacientes = new JButton("Pacientes");
        JButton btnHistorial = new JButton("Historial");

        // Panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(btnPacientes);
        panelBotones.add(btnHistorial);

        // Panel de contenido con CardLayout
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        // Crear ambos paneles con tablas
        TablaPacientes tablaPacientes = new TablaPacientes();
        TablaHistorial tablaHistorial = new TablaHistorial();

        // Agregar los paneles al CardLayout
        contentPanel.add(tablaPacientes.getPanel(), "PACIENTES");
        contentPanel.add(tablaHistorial.getPanel(), "HISTORIAL");

        // Acciones de botones
        btnPacientes.addActionListener(e -> cardLayout.show(contentPanel, "PACIENTES"));
        btnHistorial.addActionListener(e -> cardLayout.show(contentPanel, "HISTORIAL"));

        // Agregar botones y contenido al panel principal
        this.add(panelBotones, BorderLayout.NORTH);
        this.add(contentPanel, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return this;
    }
}
