package paneles;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import data.Pacientes;

public class Tabla extends JScrollPane {

    public Tabla() {

        String[] columnas = {"Nombre", "Consulta General", "Hora"};

        Object[][] datos = new Pacientes().getDatos();
   



        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        JTable table = new JTable(model);
        

        this.setViewportView(table);
        this.setBounds(0, 0, 400, 800);
    }
}