package obsolete;

import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {
    JFrame window;
    JLabel header;
    JPanel upperPanel;
    JPanel leftPanel;
    JPanel rightPanel;
    JPanel bottomPanel;
    JPanel centerPanel;
    JTable table;
    frame() {

        window = newWindow();
        table();
        panels();
        header = new JLabel();
        header.setText("Music bitrate indexer");

    }

    JFrame newWindow() {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1200, 600);
        window.setLayout(new BorderLayout(10,10));
        window.setVisible(true);
        return window;
    }
    void panels() {
        this.upperPanel = new JPanel();
        this.leftPanel = new JPanel();
        this.centerPanel = new JPanel();


//        this.centerPanel.add(this.table);


        upperPanel.setBackground(Color.blue);
        leftPanel.setBackground(Color.red);
        centerPanel.setBackground(Color.CYAN);
        upperPanel.setPreferredSize(new Dimension(100,75));
        leftPanel.setPreferredSize(new Dimension(200,200));
        this.window.add(upperPanel,BorderLayout.NORTH);
        this.window.add(centerPanel,BorderLayout.CENTER);
        this.window.add(leftPanel,BorderLayout.WEST);
    }
    void table(){
        String column[]= { "Name", "Roll Number", "Department" };
        String[][] string = {
                {"Kundan Kumar Jha", "4031"},
                {"Anand Jha", "6014"}
        };
        this.table = new JTable(string,column);
//        this.table.setBounds(30, 40, 200, 300);

    }
}

