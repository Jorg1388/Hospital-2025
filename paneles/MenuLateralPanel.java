package paneles;

import data.Medicamento;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class MenuLateralPanel extends JPanel {

    private CardLayout cardLayout;
    private JPanel contentPanel;

    public MenuLateralPanel() {
        this.setPreferredSize(new Dimension(400, 1000));
        this.setLayout(new BorderLayout());

        // Crear botones con tamaño reducido
        JButton btnFarmacia = new JButton("Farmacia");
        JButton btnResidencial = new JButton("Residencial");
        JButton btnHistorial = new JButton("Historial");
        JButton btnPacientes = new JButton("Pacientes");

        Dimension buttonSize = new Dimension(120, 30);
        btnFarmacia.setPreferredSize(buttonSize);
        btnResidencial.setPreferredSize(buttonSize);
        btnHistorial.setPreferredSize(buttonSize);
        btnPacientes.setPreferredSize(buttonSize);

        // Panel vertical para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelBotones.setBackground(Color.LIGHT_GRAY);

        // Centrar botones y agregar espacio entre ellos
        panelBotones.add(btnFarmacia);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(btnResidencial);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(btnHistorial);
        panelBotones.add(Box.createVerticalStrut(10));
        panelBotones.add(btnPacientes);

        // Panel de contenido con CardLayout
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

//        PANEL FARMACIA CON MedicamentoPanel
       List<Medicamento> listaMedicamentos = new ArrayList<>();

for (int i = 1; i <= 20; i++) {
    String nombre = "Medicamento " + i;
    int cantidad = 10 + i; // cantidades: 11, 12, ..., 30
    String fecha = "2025-12-" + (i < 10 ? "0" + i : i); // fechas: 2025-12-01 a 2025-12-20
    int dosis = (i % 3) + 1; // dosis: 1, 2 o 3
    listaMedicamentos.add(new Medicamento(nombre, cantidad, fecha, dosis));
}



        MedicamentoPanel panelMedicamentos = new MedicamentoPanel(listaMedicamentos);
        JPanel panelFarmacia = panelMedicamentos.getPanel();

        // Otros paneles
        JPanel panelResidencial = new JPanel();
        panelResidencial.add(new JLabel("Contenido de Residencial"));

        JPanel panelHistorial = new TablaHistorial().getPanel();
        JPanel panelPacientes = new TablaPacientes().getPanel();

        // Agregar los paneles al CardLayout
        contentPanel.add(panelFarmacia, "FARMACIA");
        contentPanel.add(panelResidencial, "RESIDENCIAL");
        contentPanel.add(panelHistorial, "HISTORIAL");
        contentPanel.add(panelPacientes, "PACIENTES");

        // Acciones de botones
        btnFarmacia.addActionListener(e -> cardLayout.show(contentPanel, "FARMACIA"));
        btnResidencial.addActionListener(e -> cardLayout.show(contentPanel, "RESIDENCIAL"));
        btnHistorial.addActionListener(e -> cardLayout.show(contentPanel, "HISTORIAL"));
        btnPacientes.addActionListener(e -> cardLayout.show(contentPanel, "PACIENTES"));

        // Agregar al panel principal
        this.add(panelBotones, BorderLayout.WEST);
        this.add(contentPanel, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return this;
    }
}
