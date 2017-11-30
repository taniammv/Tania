package Control;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class CopiarPegar {

    private boolean HayQueMostrar = true;
    UndoManager manager = new UndoManager();
    UndoManager manager2 = new UndoManager();

    public void DesacerTexFiel(JTextField tx) {
        try {

            JPopupMenu menu = new JPopupMenu();
            JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon(getClass().getResource("/iconos/copiar.png")));
            JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon(getClass().getResource("/iconos/pegar.png")));
            JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon(getClass().getResource("/iconos/cortar.png")));
            tx.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void removeUpdate(DocumentEvent e) {
                    HayQueMostrar = (tx.getText().length() > 0) ? false : true;
                }

                @Override
                public void insertUpdate(DocumentEvent e) {
                    HayQueMostrar = false;
                }

                @Override
                public void changedUpdate(DocumentEvent de) {
                }
            });
            menu.add(copiar);
            menu.add(cortar);
            menu.add(pegar);
            copiar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    tx.copy();
                }
            });
            cortar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    tx.cut();
                }
            });
            pegar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    tx.paste();
                }
            });
            tx.getDocument().addUndoableEditListener(manager);
            Action deshacer = new Deshacer(manager);
            Action rehacer = new Rehacer(manager);
            tx.registerKeyboardAction(deshacer, KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
            tx.registerKeyboardAction(rehacer, KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
            tx.setComponentPopupMenu(menu);

        } catch (Exception e) {
        }
    }

    public void DesacerArea(JTextArea tx) {
        try {

            JPopupMenu menu = new JPopupMenu();
            JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon(getClass().getResource("/iconos/copiar.png")));
            JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon(getClass().getResource("/iconos/pegar.png")));
            JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon(getClass().getResource("/iconos/cortar.png")));
            tx.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void removeUpdate(DocumentEvent e) {
                    HayQueMostrar = (tx.getText().length() > 0) ? false : true;
                }

                @Override
                public void insertUpdate(DocumentEvent e) {
                    HayQueMostrar = false;
                }

                @Override
                public void changedUpdate(DocumentEvent de) {
                }
            });
            menu.add(copiar);
            menu.add(cortar);
            menu.add(pegar);
            copiar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    tx.copy();
                }

            });
            cortar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    tx.cut();
                }
            });
            pegar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    tx.paste();
                }
            });
            tx.getDocument().addUndoableEditListener(manager2);
            Action deshacer = new Deshacer(manager2);
            Action rehacer = new Rehacer(manager2);
            tx.registerKeyboardAction(deshacer, KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
            tx.registerKeyboardAction(rehacer, KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_MASK), JComponent.WHEN_FOCUSED);
            tx.setComponentPopupMenu(menu);
        } catch (Exception e) {
        }
    }

    public class Rehacer extends AbstractAction {

        private UndoManager manager;

        public Rehacer(UndoManager manager) {
            this.manager = manager;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                manager.redo();
            } catch (CannotRedoException e) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

    public class Deshacer extends AbstractAction {

        private UndoManager manager;

        public Deshacer(UndoManager manager) {
            this.manager = manager;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                manager.undo();
            } catch (CannotUndoException e) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
