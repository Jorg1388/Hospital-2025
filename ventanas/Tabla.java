package ventanas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabla extends JScrollPane {

    public Tabla() {

        String[] columnas = {"ID", "Nombre", "Edad"};
        Object[][] datos = {
            {1, "Ana", 20},
            {2, "Luis", 22},
            {3, "María", 19}
        };


        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        JTable table = new JTable(model);
        

        this.setViewportView(table);
        this.setBounds(50, 50, 400, 100);
    }
}