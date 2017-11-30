package Control;

import Menu_bar.AddPerrito;
import java.awt.Image;
import java.util.List;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DragListenerrx implements DropTargetListener {

    JLabel imageLabel = new JLabel();
    JLabel pathLabel = new JLabel();

    public DragListenerrx(JLabel image) {
        imageLabel = image;

    }

    @Override
    public void dragEnter(DropTargetDragEvent dtde) {
    }

    @Override
    public void dragOver(DropTargetDragEvent dtde) {
    }

    @Override
    public void dropActionChanged(DropTargetDragEvent dtde) {
    }

    @Override
    public void dragExit(DropTargetEvent dte) {
    }

    @Override
    public void drop(DropTargetDropEvent ev) {
        try {
            ev.acceptDrop(DnDConstants.ACTION_MOVE);
            Transferable t = ev.getTransferable();
            DataFlavor[] df = t.getTransferDataFlavors();
            for (DataFlavor f : df) {
                try {
                    if (f.isFlavorJavaFileListType()) {
                        List<File> files = (List<File>) t.getTransferData(f);
                        for (File file : files) {
                            displayImage(file.getPath());
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        } catch (Exception e) {
        }
    }

    private void displayImage(String path) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(path));
            ImageIcon icon = new ImageIcon(img);
            Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_DEFAULT));
            imageLabel.setIcon(icon2);
            pathLabel.setText(path);
            AddPerrito.fis = (new FileInputStream(path));
            AddPerrito.setLongitudFoto((int) path.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void abrir(String url) throws IOException {
        ProcessBuilder p = new ProcessBuilder();
        p.command("cmd.exe", "/c", url);
        p.start();
    }
}
