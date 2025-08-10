package paneles;

import data.Medicamento;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MedicamentoPanel extends JPanel {

    public MedicamentoPanel(List<Medicamento> listaMedicamentos) {
        // Usar un BorderLayout para colocar la tabla en el centro
        this.setLayout(new BorderLayout());

        // Nombres de las columnas
        String[] columnas = {"Nombre", "Cantidad", "Fecha de Vencimiento", "Dosis por Día"};

        // Llenar datos en una matriz
        Object[][] datos = new Object[listaMedicamentos.size()][4];
        int fila = 0;

        for (Medicamento med : listaMedicamentos) {
            datos[fila][0] = med.getNombreMedicamento();
            datos[fila][1] = med.getCantidadAsignada();
            datos[fila][2] = med.getFechaVencimiento();
            datos[fila][3] = med.getDosisPorDia();
            fila++;
        }

        // Crear tabla y agregarla con scroll
        JTable tabla = new JTable(datos, columnas);
        JScrollPane scrollPane = new JScrollPane(tabla);

        this.add(scrollPane, BorderLayout.CENTER);
    }
}
