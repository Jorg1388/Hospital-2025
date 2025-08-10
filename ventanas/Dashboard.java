package ventanas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;

import data.Medicamento;
import paneles.HeaderPanel;
import paneles.MenuLateralPanel;

public class Dashboard extends JFrame {

    public Dashboard() {
        this.setTitle("Dashboard"); 
        this.setSize(1600, 800); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

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

        // Agregar paneles
        this.add(new HeaderPanel(), BorderLayout.NORTH);
        this.add(new MenuLateralPanel(listaMedicamentos), BorderLayout.CENTER);

        this.setVisible(true);
    }
}
