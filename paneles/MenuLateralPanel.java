package paneles;

import data.Medicamento;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MenuLateralPanel extends JPanel {

    private CardLayout cardLayout;
    private JPanel contentPanel;

    public MenuLateralPanel() {
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

        // Panel de botones
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

        // Panel central con CardLayout
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        // Lista de medicamentos 
        List<Medicamento> listaMedicamentos = new ArrayList<>();
        listaMedicamentos.add(new Medicamento("Paracetamol", 30, "2025-08-01", 3));
        listaMedicamentos.add(new Medicamento("Ibuprofeno", 20, "2024-12-15", 2));
        listaMedicamentos.add(new Medicamento("Amoxicilina", 15, "2025-03-10", 1));
        listaMedicamentos.add(new Medicamento("Omeprazol", 10, "2026-01-20", 1));
        listaMedicamentos.add(new Medicamento("Loratadina", 25, "2025-07-05", 1));
        listaMedicamentos.add(new Medicamento("Metformina", 40, "2026-09-12", 2));
        listaMedicamentos.add(new Medicamento("Losartán", 35, "2025-10-30", 1));
        listaMedicamentos.add(new Medicamento("Clonazepam", 12, "2024-11-18", 1));
        listaMedicamentos.add(new Medicamento("Prednisona", 18, "2025-04-25", 1));
        listaMedicamentos.add(new Medicamento("Vitamina C", 50, "2027-01-01", 2));
        listaMedicamentos.add(new Medicamento("Azitromicina", 14, "2025-02-02", 1));
        listaMedicamentos.add(new Medicamento("Furosemida", 22, "2025-06-15", 1));
        listaMedicamentos.add(new Medicamento("Enalapril", 30, "2026-03-05", 2));
        listaMedicamentos.add(new Medicamento("Atorvastatina", 28, "2026-08-21", 1));
        listaMedicamentos.add(new Medicamento("Ciprofloxacino", 16, "2025-12-12", 1));
        listaMedicamentos.add(new Medicamento("Dexametasona", 20, "2025-11-01", 1));
        listaMedicamentos.add(new Medicamento("Hidroxicloroquina", 10, "2026-04-09", 1));
        listaMedicamentos.add(new Medicamento("Insulina", 18, "2024-10-10", 2));
        listaMedicamentos.add(new Medicamento("Ranitidina", 24, "2025-09-14", 1));
        listaMedicamentos.add(new Medicamento("Salbutamol", 26, "2025-05-22", 2));

        // Paneles para cada sección
        JPanel panelFarmacia = new MedicamentoPanel(listaMedicamentos); 

        JPanel panelResidencial = new JPanel();
        panelResidencial.add(new JLabel("Contenido de Residencial"));

        JPanel panelHistorial = new TablaHistorial().getPanel();
        JPanel panelPacientes = new TablaPacientes().getPanel();

        // Agregar paneles al contentPanel con nombres
        contentPanel.add(panelFarmacia, "FARMACIA");
        contentPanel.add(panelResidencial, "RESIDENCIAL");
        contentPanel.add(panelHistorial, "HISTORIAL");
        contentPanel.add(panelPacientes, "PACIENTES");

        // Configurar acciones de los botones
        btnFarmacia.addActionListener(e -> cardLayout.show(contentPanel, "FARMACIA"));
        btnResidencial.addActionListener(e -> cardLayout.show(contentPanel, "RESIDENCIAL"));
        btnHistorial.addActionListener(e -> cardLayout.show(contentPanel, "HISTORIAL"));
        btnPacientes.addActionListener(e -> cardLayout.show(contentPanel, "PACIENTES"));

        // Agregar al panel principal
        this.add(panelBotones, BorderLayout.WEST);
        this.add(contentPanel, BorderLayout.CENTER);
    }
}
