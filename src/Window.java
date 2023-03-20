import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    JPanel general;
    private JButton browseButton;
    private JButton STARTButton;
    private JButton SAVEButton;
    private JTable table1;



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
    public void setTable(String[][] table)
    {
        String[] heading = {"kk","ss","fa","dsd","sdfsd"};
        DefaultTableModel tempTab = new DefaultTableModel(table,heading);
        this.table1.setModel(tempTab);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
