package Principal;

import Control.BllPerrito;
import Control.Validaciones;
import Datos.DalPerrito;
import Datos.DatosRetornar;
import Datos.Perrito;
import Menu_bar.Acerca_De;
import Menu_bar.AddPerrito;
import Menu_bar.Ayuda_BD;
import Menu_bar.Lista_de_Perro;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.undo.UndoManager;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Menu extends javax.swing.JFrame {

    DalPerrito dall = new DalPerrito();
    BllPerrito bll = new BllPerrito();
    DatosRetornar d = new DatosRetornar();
    JPopupMenu menu = new JPopupMenu();
    JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon(getClass().getResource("/iconos/copiar.png")));
    JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon(getClass().getResource("/iconos/pegar.png")));
    JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon(getClass().getResource("/iconos/cortar.png")));
    UndoManager manager = new UndoManager();
    static String recomendacion[] = {"", "dividir su comida en 4 raciones diarias", "dividir su comida en 3 raciones diarias",
        "dividir su comida en 2 raciones diarias", "dividir su comida en 2 raciones diarias"};
    private static double ter;
    Validaciones v = new Validaciones();

    public Menu() {
        try {

            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());

            initComponents();

            v.SoloNumeros(txtPeso);

            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//evita cerra jframe con ALT+F4
            LabelMens.setText("<html><body> Mayor de <b>12 meses</b>, el perro es <br>considerado "
                    + "como adulto.</body></html>");

            dall.Lista_raza(comboRaza);

            comboRaza.setSelectedIndex(0);

            setIconImage(new ImageIcon(getClass().getResource("../imagenes/bak.png")).getImage());

            this.setResizable(false); //es para deshabilitar el boton de maximizar pantalla

            this.setLocationRelativeTo(null);// es para centrar la ventana

            btnSiguiente.setEnabled(false);// para deshabilitar el boton de siguiente

            AutoCompleteDecorator.decorate(ComboEdad);
            AutoCompleteDecorator.decorate(comboRaza);
            AutoCompleteDecorator.decorate(ComboTamanio);

            txtPeso.setPlaceholder("Peso en KG");

        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        txtDatosIntere = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        LabelMens = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboRaza = new javax.swing.JComboBox<>();
        labelRaza = new javax.swing.JLabel();
        lbtamanio = new javax.swing.JLabel();
        ComboTamanio = new javax.swing.JComboBox<>();
        LabelFotoPerro = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbpeso = new javax.swing.JLabel();
        ComboEdad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtPeso = new JTextFieldPersonalizado.JCTextField();
        txtnombre = new JTextFieldPersonalizado.JCTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        Bak = new javax.swing.JRadioButtonMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img.PNG"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo-Bak-Food-3.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del perrito      ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 3, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 220, 284));
        jScrollPane.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 11)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 108, -1));

        LabelMens.setFont(new java.awt.Font("Georgia", 2, 9)); // NOI18N
        LabelMens.setForeground(new java.awt.Color(255, 0, 0));
        LabelMens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMens.setToolTipText(""); // NOI18N
        LabelMens.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        LabelMens.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        LabelMens.setName(""); // NOI18N
        jPanel2.add(LabelMens, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, 20));

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 11)); // NOI18N
        jLabel3.setText("*Raza");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        comboRaza.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        comboRaza.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboRazaItemStateChanged(evt);
            }
        });
        comboRaza.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                comboRazaPropertyChange(evt);
            }
        });
        jPanel2.add(comboRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 186, -1));

        labelRaza.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        labelRaza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRaza.setText("¿No sabes que raza es?");
        labelRaza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRaza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRazaMouseClicked(evt);
            }
        });
        jPanel2.add(labelRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, -1));

        lbtamanio.setFont(new java.awt.Font("Georgia", 3, 11)); // NOI18N
        lbtamanio.setText("Tamaño ");
        jPanel2.add(lbtamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 214, -1, 20));

        ComboTamanio.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        ComboTamanio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboTamanioItemStateChanged(evt);
            }
        });
        ComboTamanio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ComboTamanioPropertyChange(evt);
            }
        });
        jPanel2.add(ComboTamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 186, 20));

        LabelFotoPerro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Imagen del perrito", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 2, 12))); // NOI18N
        jPanel2.add(LabelFotoPerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 261, 284));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/perro.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, -8, 30, 30));

        lbpeso.setFont(new java.awt.Font("Georgia", 3, 11)); // NOI18N
        lbpeso.setText("*Peso");
        jPanel2.add(lbpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        ComboEdad.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        ComboEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona--", "Cachorro", "Adulto" }));
        ComboEdad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboEdadItemStateChanged(evt);
            }
        });
        ComboEdad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ComboEdadPropertyChange(evt);
            }
        });
        jPanel2.add(ComboEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 186, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 3, 11)); // NOI18N
        jLabel8.setText("*Edad");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtPeso.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        txtPeso.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPesoCaretUpdate(evt);
            }
        });
        jPanel2.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 186, 20));

        txtnombre.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        txtnombre.setPlaceholder("Ejemplo : Puppy");
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 186, 20));

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 11)); // NOI18N
        jLabel4.setText("* Campos obligatorios");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 355, -1, -1));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next.png"))); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/new.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnNuevo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar)
                            .addGap(18, 18, 18)
                            .addComponent(btnSiguiente)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addComponent(btnCancelar)
                    .addComponent(btnSiguiente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/new.png"))); // NOI18N
        jMenuItem1.setText("Agregar Perrito");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Ver");
        jMenu3.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ojo.png"))); // NOI18N
        jMenuItem3.setText("Perros registrados");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Herramientas");
        jMenu4.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N

        jMenu5.setText("Calcular Aliemento");
        jMenu5.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N

        buttonGroup1.add(Bak);
        Bak.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        Bak.setSelected(true);
        Bak.setText("Bak");
        jMenu5.add(Bak);

        jMenu4.add(jMenu5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        jMenuItem6.setText("Reconectar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Ayuda");
        jMenu2.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        jMenuItem5.setText("Ayuda Base de Datos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem4.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        jMenuItem4.setText("Acerca de");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        try {
            CalcularAlimento();
            Regresar();
            Menu2 p2 = new Menu2();
            p2.setVisible(true);
            this.dispose();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Salir();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            AddPerrito add = new AddPerrito(new javax.swing.JDialog(), true);
            add.setVisible(true);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void comboRazaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboRazaItemStateChanged
        Comboraza();
    }//GEN-LAST:event_comboRazaItemStateChanged

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void comboRazaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_comboRazaPropertyChange
        isVacia();
    }//GEN-LAST:event_comboRazaPropertyChange

    private void ComboTamanioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ComboTamanioPropertyChange
        isVacia();        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTamanioPropertyChange

    private void ComboEdadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ComboEdadPropertyChange
        isVacia();
    }//GEN-LAST:event_ComboEdadPropertyChange

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            Lista_de_Perro lis = new Lista_de_Perro(new javax.swing.JDialog(), true);
            lis.setVisible(true);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ComboEdadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboEdadItemStateChanged
        Edad();
    }//GEN-LAST:event_ComboEdadItemStateChanged

    private void ComboTamanioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboTamanioItemStateChanged
        //  CalcularAlimento();
    }//GEN-LAST:event_ComboTamanioItemStateChanged

    private void txtPesoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPesoCaretUpdate
        isVacia();
    }//GEN-LAST:event_txtPesoCaretUpdate

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void labelRazaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRazaMouseClicked
        try {
            Lista_de_Perro L = new Lista_de_Perro(new javax.swing.JDialog(), true);
            L.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_labelRazaMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Salir();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Acerca_De a = new Acerca_De(new javax.swing.JFrame(), true);
        a.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Principal p = new Principal();
        this.dispose();
        p.Principal();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Ayuda_BD db = new Ayuda_BD(new javax.swing.JFrame(), true);
        db.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem Bak;
    public static javax.swing.JComboBox<String> ComboEdad;
    public static javax.swing.JComboBox<String> ComboTamanio;
    public static javax.swing.JLabel LabelFotoPerro;
    private javax.swing.JLabel LabelMens;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNuevo;
    public static javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JComboBox<String> comboRaza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel labelRaza;
    private javax.swing.JLabel lbpeso;
    private javax.swing.JLabel lbtamanio;
    public static javax.swing.JTextArea txtDatosIntere;
    public static JTextFieldPersonalizado.JCTextField txtPeso;
    public static JTextFieldPersonalizado.JCTextField txtnombre;
    // End of variables declaration//GEN-END:variables

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


    public void Comboraza() {
        try {
            Perrito p = (Perrito) comboRaza.getSelectedItem();

            int id = p.getId();

            System.out.println(id);

            Object[] dato = bll.MostrarListaRazaXId(LabelFotoPerro, id);

            String detalles = (dato[0].toString());

            txtDatosIntere.setText(detalles);

            LabelFotoPerro.setIcon((Icon) dato[2]);

            ScrollArriba();

            isVacia();
        } catch (Exception e) {
        }
    }

    public void Regresar() {
        try {
            d.setNombre(txtnombre.getText());
            d.setRaza(comboRaza.getSelectedIndex());
            d.setTamaño(ComboTamanio.getSelectedIndex());
            d.setPeso(txtPeso.getText());
            d.setEdad(ComboEdad.getSelectedIndex());
        } catch (Exception e) {
        }

    }

    public static void ScrollArriba() throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                jScrollPane.getVerticalScrollBar().setValue(jScrollPane.getVerticalScrollBar().getMinimum());
            }
        });
    }

    public void Nuevo() {
        try {
            txtnombre.setText(null);
            txtPeso.setText(null);
            LabelFotoPerro.setIcon(null);
            txtDatosIntere.setText(null);
            comboRaza.setSelectedIndex(0);
            ComboEdad.setSelectedIndex(0);
            ComboTamanio.setSelectedIndex(0);
            ComboTamanio.setSelectedIndex(0);
        } catch (Exception e) {
        }

    }

    public static void isVacia() {
        try {
            if (comboRaza.getSelectedIndex() > 0 && !txtPeso.getText().isEmpty()
                    && ComboEdad.getSelectedIndex() >= 1) {
                btnSiguiente.setEnabled(true);
            } else if (comboRaza.getSelectedIndex() <= 0 || txtPeso.getText().isEmpty()
                    || ComboEdad.getSelectedIndex() <= 0) {
                btnSiguiente.setEnabled(false);
            }
        } catch (Exception e) {
        }
    }

    public void CalcularAlimento() {
        try {
            double peso = Double.parseDouble(txtPeso.getText());
            ter = peso * 30;
        } catch (Exception e) {
        }
    }

    public static void Informacion(JTextArea info) {
        try {
            double kilo = ((ter * 7) / 1000);
            if (ComboEdad.getSelectedIndex() == 2) {

                info.setText("El perrito " + txtnombre.getText()
                        + " debe de consumir al día " + Math.round(ter) + " gramos"
                        + " de alimento para su buena salud. \nA la semana, debe de comsumir "
                        + " un promedio de " + kilo + " Kilos.");
            } else if (ComboEdad.getSelectedIndex() == 1) {
                info.setText("El perrito " + txtnombre.getText()
                        + " debe de consumir al día " + Math.round(ter) + " gramos "
                        + "de alimento para su buena salud, por lo que te recomendamos "
                        + "" + recomendacion[ComboTamanio.getSelectedIndex()] + "."
                        + " \nA la semana, debe de comsumir "
                        + " un promedio de " + kilo + " Kilos.");
            }
        } catch (Exception e) {
        }
    }

    public void Edad() {
        try {
            switch (ComboEdad.getSelectedIndex()) {
                case 1:
                    lbtamanio.setText("Tipo de raza");
                    ComboTamanio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]
                     {" --Selecciona-- ", "Toy", "Pequeños ",
                        "Medianos",
                        "Grandes", "Gigantes"}));
                    lbpeso.setVisible(true);
                    txtPeso.setVisible(true);
                    break;
                case 2:
                    lbpeso.setVisible(true);
                    txtPeso.setVisible(true);
                    lbtamanio.setText("Tipo de raza");
                    ComboTamanio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]
                    {" --Selecciona-- ", "Toy", "Pequeños ",
                        "Medianos",
                        "Grandes", "Gigantes"}));
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
        }
    }
}
