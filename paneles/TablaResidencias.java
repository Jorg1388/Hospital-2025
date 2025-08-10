package paneles;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TablaResidencias {

    private JPanel panelTabla;
    private JTable tabla;
    private DefaultTableModel modelo;

    public TablaResidencias() {
        panelTabla = new JPanel(new BorderLayout());

        // Columnas
        String[] columnas = {"Dirección", "Residencial", "Departamento", "Horario"};

        // Datos de ejemplo
        Object[][] datos = {
            {"Av. Las Flores 123", "Residencial Las Flores", "Guatemala", "08:00 - 17:00"},
            {"Calle 5 No. 45", "Residencial Los Pinos", "Quetzaltenango", "09:00 - 18:00"},
            {"Zona 10, Torre A", "Residencial Altamira", "Sacatepéquez", "07:30 - 16:30"},
            {"Km 15 Carretera al Salvador", "Residencial El Encanto", "Guatemala", "08:00 - 15:00"}
        };

        // Modelo y tabla
        modelo = new DefaultTableModel(datos, columnas);
        tabla = new JTable(modelo);

        // Scroll para la tabla
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setPreferredSize(new Dimension(500, 200)); // opcional

        // Agregar scroll al panel
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
