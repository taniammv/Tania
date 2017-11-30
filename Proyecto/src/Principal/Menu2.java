package Principal;

import Control.JPanelPPT;
import Control.Validaciones;
import Datos.DatosRetornar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Menu2 extends javax.swing.JFrame {

    private JPanelPPT ppt = new JPanelPPT();
    public static int Precioxpaqute[] = {0, 20, 24, 27, 31, 35, 39, 42};
    public static int Precioxsemana[] = {0, 140, 168, 189, 217, 245, 273, 294};
    Validaciones v = new Validaciones();

    public Menu2() {
        initComponents();
        try {
            v.LimitarCaracteres(txtCantidad, 10);
            v.SoloNumeros(txtCantidad);
            comboCantidad.setVisible(true);
            txtCantidad.setVisible(false);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//evita cerra jframe con ALT+C
            setIconImage(new ImageIcon(getClass().getResource("../imagenes/bak.png")).getImage());
            Menu.Informacion(txtinfo);
            jPanel.add(ppt);
            repaint();
            cronometro();

        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboPrese = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Tipo_paquete = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboCantidad = new javax.swing.JComboBox<>();
        txtCantidad = new JTextFieldPersonalizado.JCTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "      ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 3, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 11)); // NOI18N
        jLabel2.setText("Tipo de alimento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, 138, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Información", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 2, 12))); // NOI18N

        txtinfo.setEditable(false);
        txtinfo.setColumns(20);
        txtinfo.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        txtinfo.setLineWrap(true);
        txtinfo.setRows(5);
        txtinfo.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtinfo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 540, 130));

        comboTipo.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "Fórmula Original" }));
        comboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoItemStateChanged(evt);
            }
        });
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, 138, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 11)); // NOI18N
        jLabel3.setText("Presentaciones");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 220, 138, -1));

        comboPrese.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        comboPrese.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPreseItemStateChanged(evt);
            }
        });
        jPanel1.add(comboPrese, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 240, 138, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 11)); // NOI18N
        jLabel4.setText("Precio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 370, 138, -1));

        txtprecio.setEditable(false);
        txtprecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtprecio.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 390, 138, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/perro.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, -5, 25, 25));

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 378, 230));

        jLabel5.setFont(new java.awt.Font("Georgia", 3, 11)); // NOI18N
        jLabel5.setText("Tipo de paquete");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 270, 138, -1));

        Tipo_paquete.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        Tipo_paquete.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Tipo_paqueteItemStateChanged(evt);
            }
        });
        jPanel1.add(Tipo_paquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 290, 138, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 3, 11)); // NOI18N
        jLabel6.setText("Cantidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 320, -1, -1));

        comboCantidad.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        comboCantidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCantidadItemStateChanged(evt);
            }
        });
        jPanel1.add(comboCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 340, 138, -1));

        txtCantidad.setText("0");
        txtCantidad.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        txtCantidad.setPlaceholder("Ejemp : 30");
        txtCantidad.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCantidadCaretUpdate(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 340, 138, 20));

        jButton1.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/confirmar.png"))); // NOI18N
        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/return.png"))); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo-Bak-Food-3.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img.PNG"))); // NOI18N

        jButton3.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cancelar.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Menu p = new Menu();
            Regresar();
            p.setVisible(true);
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMouseClicked
        ppt.play(JPanelPPT.CTRL.NEXT);
    }//GEN-LAST:event_jPanelMouseClicked

    private void comboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoItemStateChanged
        Presentaciones();      // TODO add your handling code here:;
    }//GEN-LAST:event_comboTipoItemStateChanged

    private void Tipo_paqueteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Tipo_paqueteItemStateChanged
        isVacia();
        CalcularPrecios();
        // TODO add your handling code here:
    }//GEN-LAST:event_Tipo_paqueteItemStateChanged

    private void comboPreseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPreseItemStateChanged
        CalcularPrecios();        // TODO add your handling code here:
    }//GEN-LAST:event_comboPreseItemStateChanged

    private void comboCantidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCantidadItemStateChanged
        isVacia();
        CalcularPrecios();        // TODO add your handling code here:
    }//GEN-LAST:event_comboCantidadItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Salir();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCantidadCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCantidadCaretUpdate
        isVacia();
        CalcularPrecios();
    }//GEN-LAST:event_txtCantidadCaretUpdate

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Menu m = new Menu();
            this.dispose();
            m.setVisible(true);
            m.Nuevo();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Salir();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Tipo_paquete;
    private javax.swing.JComboBox<String> comboCantidad;
    private javax.swing.JComboBox<String> comboPrese;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static JTextFieldPersonalizado.JCTextField txtCantidad;
    private javax.swing.JTextArea txtinfo;
    private javax.swing.JFormattedTextField txtprecio;
    // End of variables declaration//GEN-END:variables
    DatosRetornar d = new DatosRetornar();

    public void Regresar() {
        try {
            Menu.txtnombre.setText(d.getNombre());
            Menu.comboRaza.setSelectedIndex(d.getRaza());
            Menu.txtPeso.setText(d.getPeso());
            Menu.ComboEdad.setSelectedIndex(d.getEdad());
            Menu.ComboTamanio.setSelectedIndex(d.getTamaño());
        } catch (Exception e) {
        }
    }

    public void cronometro() {
        try {
            Timer timer = new Timer(10000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Aquí el código que queramos ejecutar.
                    ppt.play(JPanelPPT.CTRL.NEXT);
                }
            });
            timer.start();
        } catch (Exception e) {
        }
    }

    public void Presentaciones() {
        try {
            switch (comboTipo.getSelectedIndex()) {
                case 0:
                    comboPrese.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
                    Tipo_paquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
                    comboCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
                    break;
                case 1:
                    comboPrese.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{" --Seleccione--", "400 Gramos", "500 Gramos", "600 Gramos",
                        "700 Gramos", "800 Gramos", "900 Gramos", "1000 Gramos"}));
                    Tipo_paquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{" --Seleccione--", "Paquete Individual", "Paquete Semanal"}));
                    comboCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Otra"}));
                    comboCantidad.setSelectedIndex(0);
                    break;
                case 2:
                    comboPrese.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{" --Seleccione--", "400 Gramos", "500 Gramos", "600 Gramos",
                        "700 Gramos", "800 Gramos", "900 Gramos", "1000 Gramos"}));
                    Tipo_paquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{" --Seleccione--", "Paquete Individual", "Paquete Semanal"}));
                    comboCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Otra"}));
                    comboCantidad.setSelectedIndex(0);
                    break;
            }
        } catch (Exception e) {
        }
    }

    public void isVacia() {
        if (comboCantidad.getSelectedIndex() == 10) {
            if (txtCantidad.getText().trim().isEmpty()) {
                txtprecio.setText(null);
            }
        }
    }

    public void CalcularPrecios() {
        try {
            int precio;
            if (comboCantidad.getSelectedIndex() == 10) {
                comboCantidad.setVisible(false);
                txtCantidad.setVisible(true);
            } else if (comboCantidad.getSelectedIndex() < 10) {
                comboCantidad.setVisible(true);
                txtCantidad.setVisible(false);
            }
            switch (Tipo_paquete.getSelectedIndex()) {
                case 1:
                    if (comboCantidad.getSelectedIndex() < 10) {
                        precio = Precioxpaqute[comboPrese.getSelectedIndex()] * (comboCantidad.getSelectedIndex() + 1);
                        txtprecio.setText("$" + precio + ".00");
                    } else if (comboCantidad.getSelectedIndex() >= 10) {
                        precio = Precioxpaqute[comboPrese.getSelectedIndex()] * Integer.parseInt(txtCantidad.getText());
                        txtprecio.setText("$" + precio + ".00");
                    }
                    break;
                case 2:
                    if (comboCantidad.getSelectedIndex() < 10) {
                        precio = Precioxsemana[comboPrese.getSelectedIndex()] * (comboCantidad.getSelectedIndex() + 1);
                        txtprecio.setText("$" + precio + ".00");
                    } else if (comboCantidad.getSelectedIndex() >= 10) {
                        precio = Precioxsemana[comboPrese.getSelectedIndex()] * Integer.parseInt(txtCantidad.getText());
                        txtprecio.setText("$" + precio + ".00");
                    }
                    break;
                case 0:
                    txtprecio.setText(null);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
        }
    }

    public void Salir() {
        try {
            Icon icon = new ImageIcon(getClass().getResource("../Icon/question.png"));
            int OP = JOptionPane.showConfirmDialog(null, "¿Seguro quieres salir de la aplicación BAK?", "¿SALIR AHORA?", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, icon);
            if (OP == 0) {
                System.exit(0);
            }
        } catch (Exception e) {
        }
    }
}
