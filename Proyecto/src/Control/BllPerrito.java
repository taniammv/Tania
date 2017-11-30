package Control;

import Datos.DalPerrito;
import Datos.Perrito;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BllPerrito {

    DalPerrito dall = new DalPerrito();

    public void InsertaDatos(Perrito p) {
        dall.InsertaDatos(p);
    }

    public Object[] MostrarListaRazaXId(JLabel lbfoto, int id) {
        return dall.MostrarListaRazaXId(lbfoto, id);
    }

    public void MostrarLista(DefaultTableModel model, JTable tabla) {
        dall.MostrarLista(model, tabla);
    }

    public void Buscar(DefaultTableModel model, JTable table, String dato) {
        dall.Buscar(model, table, dato);
    }

    public Object[] ConsultaPorId(int id, JLabel lbfoto) {
        return dall.ConsultaPorId(id, lbfoto);
    }

}
