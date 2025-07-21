package paneles;

import data.Medicamento;

import javax.swing.*;
import java.util.List;

public class MedicamentoPanel {
    private JPanel panel;

    public MedicamentoPanel(List<Medicamento> listaMedicamentos) {
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Columnas para la tabla
        String[] columnas = {"Nombre", "Cantidad", "Vencimiento", "Dosis por día"};
        Object[][] datos = new Object[listaMedicamentos.size()][4];

        for (int i = 0; i < listaMedicamentos.size(); i++) {
            Medicamento med = listaMedicamentos.get(i);
            datos[i][0] = med.getNombreMedicamento();
            datos[i][1] = med.getCantidadAsignada();
            datos[i][2] = med.getFechaVencimiento();
            datos[i][3] = med.getDosisPorDia();
        }

        JTable tabla = new JTable(datos, columnas);
        JScrollPane scrollPane = new JScrollPane(tabla);

        panel.add(new JLabel("Medicamentos Disponibles:"));
        panel.add(scrollPane);
    }

    public JPanel getPanel() {
        return panel;
    }
}
