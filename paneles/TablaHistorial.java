
    package paneles;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TablaHistorial {

    private JPanel panelTabla;
    private JTable tabla;
    private DefaultTableModel modelo;

    public TablaHistorial() {
        panelTabla = new JPanel(new BorderLayout());

        String[] columnas = {"Nombre del Paciente", "Fecha de Consulta", "Diagnóstico"};

        Object[][] datos = {
            {"Juan Pérez", "2024-05-12", "Migraña leve"},
            {"Ana Gómez", "2024-05-10", "Revisión general"},
            {"Carlos Ruiz", "2024-05-08", "Gastritis"}
        };

        modelo = new DefaultTableModel(datos, columnas);
        tabla = new JTable(modelo);

        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setPreferredSize(new Dimension(380, 200));

        panelTabla.add(scrollPane, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panelTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }
}


