package Menu_bar;

import Control.BllPerrito;
import Datos.Perrito;
import Principal.Menu;
import static Principal.Menu.LabelFotoPerro;
import static Principal.Menu.comboRaza;
import static Principal.Menu.txtDatosIntere;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Lista_de_Perro extends javax.swing.JDialog {

    public static final int RET_CANCEL = 0;
    public static final int RET_OK = 1;
    DefaultTableModel modelo;
    BllPerrito bll = new BllPerrito();
    public static int Fila;
    Perrito p = new Perrito();
    int id;
    private int returnStatus = RET_CANCEL;
    String detalles, raza;

    public Lista_de_Perro(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        try {
            initComponents();
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            this.setLocationRelativeTo(null);
            Tabla();
            setIconImage(new ImageIcon(getClass().getResource("../imagenes/bak.png")).getImage());

            String cancelName = "cancel";
            InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
            inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
            ActionMap actionMap = getRootPane().getActionMap();
            actionMap.put(cancelName, new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    doClose(RET_CANCEL);
                }
            });
        } catch (Exception e) {
        }
    }

    public int getReturnStatus() {
        return returnStatus;
    }

    public void Tabla() {
        try {
            modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    return false;
                }
            };
            tabla.setModel(modelo);
            modelo.addColumn("Id");
            modelo.addColumn("Raza");
            tabla.getTableHeader().setReorderingAllowed(false);
            bll.MostrarLista(modelo, tabla);
            tabla.getColumnModel().getColumn(0).setMaxWidth(0);
            tabla.getColumnModel().getColumn(0).setMinWidth(0);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(0);
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lbfoto = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        txtDatosIntere = new javax.swing.JTextArea();
        txtbuscar = new JTextFieldPersonalizado.JCTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo-Bak-Food-3.png"))); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tabla.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Raza"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        tabla.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tablaPropertyChange(evt);
            }
        });
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setHeaderValue("Raza");
        }

        lbfoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbfoto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Imágen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 2, 14))); // NOI18N

        jScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Datos interesantes...", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 2, 12))); // NOI18N
        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setMaximumSize(null);
        jScrollPane.setMinimumSize(null);
        jScrollPane.setName(""); // NOI18N
        jScrollPane.setWheelScrollingEnabled(false);

        txtDatosIntere.setEditable(false);
        txtDatosIntere.setFont(new java.awt.Font("Georgia", 2, 13)); // NOI18N
        txtDatosIntere.setLineWrap(true);
        txtDatosIntere.setTabSize(0);
        txtDatosIntere.setWrapStyleWord(true);
        txtDatosIntere.setAutoscrolls(false);
        txtDatosIntere.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtDatosIntere.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtDatosIntere.setDragEnabled(true);
        txtDatosIntere.setSelectionStart(5);
        jScrollPane.setViewportView(txtDatosIntere);

        txtbuscar.setPlaceholder("Buscar");
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
        });
        txtbuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbuscarCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void tablaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tablaPropertyChange

    }//GEN-LAST:event_tablaPropertyChange

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        visualizar();
    }//GEN-LAST:event_tablaMouseClicked

    private void tablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyReleased
        try {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_DOWN || evt.getExtendedKeyCode() == KeyEvent.VK_UP) {
                visualizar();
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_tablaKeyReleased

    private void txtbuscarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbuscarCaretUpdate
        Buscar();
    }//GEN-LAST:event_txtbuscarCaretUpdate

    private void tablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyPressed
        try {

            if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
                int Fila = tabla.getSelectedRow();
                String nombre = (String) tabla.getValueAt(Fila, 1);
                System.out.println(nombre);
                comboRaza.setSelectedItem(nombre);
                doClose(RET_CANCEL);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tablaKeyPressed

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed

    }//GEN-LAST:event_txtbuscarKeyPressed

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Lista_de_Perro dialog = new Lista_de_Perro(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbfoto;
    private javax.swing.JTable tabla;
    public static javax.swing.JTextArea txtDatosIntere;
    private JTextFieldPersonalizado.JCTextField txtbuscar;
    // End of variables declaration//GEN-END:variables

    public void visualizar() {
        try {
            int Fila = tabla.getSelectedRow();
            id = (int) tabla.getValueAt(Fila, 0);
            Object[] dato = bll.MostrarListaRazaXId(lbfoto, id);
            detalles = (dato[0].toString());
            txtDatosIntere.setText(detalles);
            lbfoto.setIcon((Icon) dato[2]);
            ScrollArriba();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    int contador = -1;

    public void ActualizarTabla() {
        try {
            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }
            bll.MostrarLista(modelo, tabla);
        } catch (Exception e) {
        }
    }

    public void Buscar() {
        try {

            String dato = txtbuscar.getText();
            if (dato.isEmpty()) {
                ActualizarTabla();
            } else if (!dato.isEmpty()) {
                while (modelo.getRowCount() > 0) {
                    modelo.removeRow(0);
                }
                bll.Buscar(modelo, tabla, dato);
            }
        } catch (Exception e) {
        }
    }

    public static void ScrollArriba() {
        try {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    jScrollPane.getVerticalScrollBar().setValue(jScrollPane.getVerticalScrollBar().getMinimum());
                }
            });
        } catch (Exception e) {
        }
    }
}
