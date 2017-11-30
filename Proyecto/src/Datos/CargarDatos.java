package Datos;

import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CargarDatos {

    public void CargarTabla(int colimnas, ResultSet rs, DefaultTableModel model, JTable tabla) {
        try {
            Object[] fila = new Object[colimnas];
            while (rs.next()) {
                for (int i = 0; i < colimnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            tabla.updateUI();
            rs.close();
        } catch (Exception e) {
        }
    }
}
