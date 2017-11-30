package Menu_bar;

import Control.BllPerrito;
import Control.CopiarPegar;
import Control.DragListenerrx;
import Datos.DalPerrito;
import Datos.Perrito;
import Principal.Menu;
import static Principal.Menu.comboRaza;
import java.awt.Image;
import java.awt.dnd.DropTarget;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AddPerrito extends javax.swing.JDialog {

    public static final int RET_CANCEL = 0;
    public static final int RET_OK = 1;
    public static FileInputStream fis;
    public static int longitudFoto, aprietafoto = 0;
     public static boolean Consulta = false;
     
    DalPerrito dall = new DalPerrito();
   
    Perrito u = new Perrito();
    BllPerrito bll = new BllPerrito();
    CopiarPegar cp = new CopiarPegar();

    public AddPerrito(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        try {
            initComponents();
            
            cp.DesacerArea(txtDescripcion);
            cp.DesacerTexFiel(txtRaza);
            
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            
            setIconImage(new ImageIcon(getClass().getResource("../imagenes/bak.png")).getImage());
            
            connectToDragDrop();
            
            this.setLocationRelativeTo(null); //
            
            btnGuardar.setEnabled(false);
            
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

    private void connectToDragDrop() {
        try {
            DragListenerrx d = new DragListenerrx(labelfoto);
            new DropTarget(this, d);
            aprietafoto = 1;
        } catch (Exception e) {
        }
    }

    public static int getLongitudFoto() {
        return longitudFoto;
    }

    public static void setLongitudFoto(int aLongitudFoto) {
        longitudFoto = aLongitudFoto;
    }

    public int getReturnStatus() {
        return returnStatus;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        labelfoto = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/new.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelfoto.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Foto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 2, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jButton2.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/camara.png"))); // NOI18N
        jButton2.setText("Subir Foto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        jLabel2.setText("Raza");

        txtRaza.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        txtRaza.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtRazaCaretUpdate(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        jLabel3.setText("Descripción");

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDescripcionCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo-Bak-Food-3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtRaza, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jButton2)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );

        getRootPane().setDefaultButton(btnGuardar);

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Guardar();
        ActualizarDatos();
        //doClose(RET_OK);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void txtRazaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtRazaCaretUpdate
        isVacia();        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaCaretUpdate

    private void txtDescripcionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDescripcionCaretUpdate
        isVacia();        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionCaretUpdate

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CargarFoto();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddPerrito dialog;
                dialog = new AddPerrito(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel labelfoto;
    public static javax.swing.JTextArea txtDescripcion;
    public static javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;

    public void Limpiar() {
        try {
            txtRaza.setText(null);
            txtDescripcion.setText(null);
            labelfoto.setIcon(null);
            btnGuardar.setEnabled(false);
            Consulta = false;
        } catch (Exception e) {
        }
    }

    public void isVacia() {
        try {
            if (txtRaza.getText().isEmpty() || txtDescripcion.getText().isEmpty() 
                    || aprietafoto == 0) {
                btnGuardar.setEnabled(false);
            } else if (!txtRaza.getText().isEmpty() || !txtDescripcion.getText().isEmpty() 
                    || aprietafoto == 1) {
                btnGuardar.setEnabled(true);
            }
        } catch (Exception e) {
        }
    }

    public void Guardar() {
        try {
            String raza = txtRaza.getText();
            String descripcion = txtDescripcion.getText();
            u.setRaza(raza);
            u.setDescripcion(descripcion);
            u.setFis(fis);
            u.setLongitudByteFoto(getLongitudFoto());
            Limpiar();
            bll.InsertaDatos(u);
        } catch (Exception e) {
        }
    }

    public void ActualizarDatos() {
        Menu.comboRaza.removeAllItems();
        dall.Lista_raza(comboRaza);
    }

    public void CargarFoto() {
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG PNG", "jpg", "png");
        j.setFileFilter(filtro);
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = (new FileInputStream(j.getSelectedFile()));
                this.setLongitudFoto((int) j.getSelectedFile().length());
                try {
                    labelfoto.setIcon(null);
                    Image icon = ImageIO.read(j.getSelectedFile()).getScaledInstance
        (labelfoto.getWidth(), labelfoto.getHeight(), Image.SCALE_DEFAULT);
                    labelfoto.setIcon(new ImageIcon(icon));
                    labelfoto.updateUI();
                    aprietafoto = 1;
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("error al cargar foto " + e);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void abrir(String url) throws IOException {
        try {
            ProcessBuilder p = new ProcessBuilder();
            p.command("cmd.exe", "/c", url);
            p.start();
        } catch (Exception e) {
        }
    }
}
