package Principal;

import Datos.Conexion;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal {
    
    

   public static Conexion hc;

    public static void main(String[] args) {
        Principal p = new Principal();
        p.Principal();
    }

    public static void Reconectar() {
        hc = new Conexion();
    }

    public  void Principal() {
        try {
            Menu m = new Menu(); // objeto de la clase menu
            m.setLocationRelativeTo(null); //esto es para centrar la ventana 
            m.setVisible(true); // esto es para hacerla visible 
            hc = new Conexion();
            Mensaje(m);
        } catch (Exception e) {
        }
    }

    public void Mensaje(Menu m) {
        try {
            if (Conexion.conectarte == false) {
                Icon icon = new ImageIcon(getClass().getResource("../Icon/tacha.png"));
                JOptionPane.showMessageDialog(null, "Ocurrio un error al conectarse con la base de datos", "Error",
                        JOptionPane.WARNING_MESSAGE, icon);
                abrir();
              //  m.dispose();
               
            }
        } catch (Exception e) {
        }
    }

    public static void abrir() throws IOException {
        ProcessBuilder p = new ProcessBuilder();
        p.command("cmd.exe", "/c", "C:\\Windows\\SysWOW64\\mmc.exe /32 C:\\WINDOWS\\SysWOW64\\SQLServerManager12.msc");
        p.start();

    }
}
