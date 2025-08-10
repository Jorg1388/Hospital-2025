package paneles;

import data.Medicamento;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MenuLateralPanel extends JPanel {

    private CardLayout cardLayout;
    private JPanel contentPanel;

    public MenuLateralPanel(List<Medicamento> listaMedicamentos) {
        this.setPreferredSize(new Dimension(400, 1000));
        this.setLayout(new BorderLayout());

        // Crear botones
        JButton btnFarmacia = new JButton("Farmacia");
        JButton btnResidencial = new JButton("Residencial");
        JButton btnHistorial = new JButton("Historial");
        JButton btnPacientes = new JButton("Pacientes");

        Dimension buttonSize = new Dimension(120, 30);
        btnFarmacia.setPreferredSize(buttonSize);
        btnResidencial.setPreferredSize(buttonSize);
        btnHistorial.setPreferredSize(buttonSize);
        btnPacientes.setPreferredSize(buttonSize);

        // Panel lateral de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelBotones.setBackground(Color.LIGHT_GRAY);

        panelBotones.add(btnFarmacia);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(btnResidencial);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(btnHistorial);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(btnPacientes);

        // Panel central 
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        // Paneles para cada sección
        JPanel panelFarmacia = new MedicamentoPanel(listaMedicamentos); 
        JPanel panelResidencial = new TablaResidencias().getPanel(); // ← Aquí se agregó la nueva tabla
        JPanel panelHistorial = new TablaHistorial().getPanel();
        JPanel panelPacientes = new TablaPacientes().getPanel();

        //  paneles al contentPanel
        contentPanel.add(panelFarmacia, "FARMACIA");
        contentPanel.add(panelResidencial, "RESIDENCIAL");
        contentPanel.add(panelHistorial, "HISTORIAL");
        contentPanel.add(panelPacientes, "PACIENTES");

        // Acciones de los botones
        btnFarmacia.addActionListener(e -> cardLayout.show(contentPanel, "FARMACIA"));
        btnResidencial.addActionListener(e -> cardLayout.show(contentPanel, "RESIDENCIAL"));
        btnHistorial.addActionListener(e -> cardLayout.show(contentPanel, "HISTORIAL"));
        btnPacientes.addActionListener(e -> cardLayout.show(contentPanel, "PACIENTES"));

        //  panel principal
        this.add(panelBotones, BorderLayout.WEST);
        this.add(contentPanel, BorderLayout.CENTER);
    }
}
