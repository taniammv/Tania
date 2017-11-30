package Datos;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Conexion implements Serializable {

    public static boolean conectarte;
    public Connection con = null;
    Icon Incorrecto = new ImageIcon(getClass().getResource("../Icon/tacha.png"));

    public Conexion() {
        con = Conexion.RealizarConexion();
    }

    public Connection getCon() {
        return con;
    }

    public static Connection RealizarConexion() {
        Connection c = null;
        try {
            conectarte = true;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-R8AL7N9\\SQLEXPRESS:1433;databaseName=veterinaria;user=sa;password=0590;";
            c = DriverManager.getConnection(url);
        } catch (SQLException e) {
            conectarte = false;
            System.out.println("Error al conectar 1" + e);
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
             conectarte = false;
            System.out.println("Error al conectar 2" + ex);
            ex.printStackTrace();
        }
        return c;
    }

    public boolean EjecutarSQL(PreparedStatement sentencia) {
        try {
            sentencia.execute();
            sentencia.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erroral ejecutar " + e);
            e.printStackTrace();
            return false;
        }
    }

    public ResultSet EjecutarSQLSelect(String sql) {
        ResultSet resultado;
        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            return resultado;
        } catch (Exception e) {
            System.out.println("Error al ejecutar consulta " + e);
            e.printStackTrace();
            return null;
        }
    }
}
