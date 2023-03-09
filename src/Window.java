import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    JPanel general;
    private JButton browseButton;
    private JButton STARTButton;
    private JButton SAVEButton;
    JTable table1;

    public Window() {
        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("BROWSE");
            }
        });
        STARTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.passTable();
            }
        });

    }

}
