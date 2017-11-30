package Datos;

import Principal.Principal;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DalPerrito {

    Conexion con = Principal.hc;
    CargarDatos c = new CargarDatos();
    JPanel panel = new JPanel();

    public void MostrarLista(DefaultTableModel model, JTable tabla) {
        try {
            String sql = "exec MostrarLista ";
            ResultSet rs = con.EjecutarSQLSelect(sql);
            c.CargarTabla(2, rs, model, tabla);
        } catch (Exception e) {
        }
    }

    public void InsertaDatos(Perrito p) {
        try {
            panel.setBackground(Color.WHITE);
            String slq = "exec Insertar_Perrito ?, ?, ?";
            PreparedStatement ps = con.con.prepareStatement(slq);
            ps.setString(1, p.getRaza());
            ps.setString(2, p.getDescripcion());
            ps.setBinaryStream(3, p.getFis());
            boolean Ejecucion = con.EjecutarSQL(ps);
            if (Ejecucion == true) {
                Icon correcto = new ImageIcon(getClass().getResource("../Icon/Palomita verde.png"));
                JOptionPane.showMessageDialog(panel, "Perrito Correctamente Registrado", "Registrado", JOptionPane.INFORMATION_MESSAGE, correcto);
            } else if (Ejecucion == false) {
                Icon Incorrecto = new ImageIcon(getClass().getResource("../Icon/tacha.png"));
                JOptionPane.showMessageDialog(null, "Error Al Regitrar Perrito", "Error", JOptionPane.INFORMATION_MESSAGE, Incorrecto);
            }
        } catch (Exception e) {
            System.out.println("Erro al insertar perrito " + e);
            e.printStackTrace();
        }
    }

    public void Lista_raza(JComboBox box) {
        DefaultComboBoxModel value;
        Conexion cone = new Conexion();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = cone.getCon();
            st = con.createStatement();
            rs = st.executeQuery("MOSTRAR_TODO_ORDENADO_NOMBRE");
            value = new DefaultComboBoxModel();
            box.setModel(value);
            while (rs.next()) {
                value.addElement(new Perrito(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Object[] MostrarListaRazaXId(JLabel lbfoto, int id) {
        Object[] datos = new Object[3];
        ImageIcon foto;
        InputStream is;
        try {
            Conexion con = Principal.hc;
            String sql = "EXEC MOSTRAR_POR_ID ?";
            PreparedStatement ps = con.con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                is = rs.getBinaryStream("FOTO");
                BufferedImage bi = ImageIO.read(is);
                foto = new ImageIcon(bi);
                Image img = foto.getImage();
                Image newimg = img.getScaledInstance(lbfoto.getWidth(),
                        lbfoto.getHeight(), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newicon = new ImageIcon(newimg);
                datos[2] = newicon;
            }
        } catch (Exception e) {
        }
        return datos;
    }

    public Object[] ConsultaPorId(int id, JLabel lbfoto) {
        Object[] datos = new Object[4];
        ImageIcon foto;
        InputStream is;
        try {
            String sql = "EXEC CONSULTAR_POR_ID ?";
            PreparedStatement ps = con.con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString("RAZA");
                datos[1] = rs.getString("DESCRIPCION");

                is = rs.getBinaryStream("FOTO");
                BufferedImage bi = ImageIO.read(is);
                foto = new ImageIcon(bi);
                Image img = foto.getImage();
                Image newimg = img.getScaledInstance(lbfoto.getWidth(),
                        lbfoto.getHeight(), java.awt.Image.SCALE_SMOOTH);
                ImageIcon newicon = new ImageIcon(newimg);
                datos[3] = newicon;
            }
        } catch (Exception e) {
            System.out.println("Error al Consultar por id" + e);
            e.printStackTrace();
        }
        return datos;
    }

    public void Buscar(DefaultTableModel model, JTable table, String dato) {
        String sql = "EXEC BUSCAR " + dato;
        ResultSet rs = con.EjecutarSQLSelect(sql);
        c.CargarTabla(2, rs, model, table);
    }

}
