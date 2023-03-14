import javax.swing.*;
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
    public void setTable(String[][] table)
    {
        String[] heading = {"kk","ss","fa","dsd","sdfsd"};
        this.table1 = new JTable(table, heading);

/*
        String data[][]={ {"101","Amit","670000"},
                {"102","Jai","780000"},
                {"101","Sachin","700000"}};
        String column[]={"ID","NAME","SALARY"};
        this.table1=new JTable(data,column);
        this.table1.setBounds(30,40,200,300);

 */




    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
