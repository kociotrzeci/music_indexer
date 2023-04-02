import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window implements Runnable{
    JPanel general;
    private JButton browseButton;
    private JButton STARTButton;
    private JTable table1;
    private JTextField textField1;
    private ScanProgress pane;
    JFileChooser chooser;
    private Thread scanProgressThread;

    public Window() {
        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooser = new JFileChooser();
                chooser.setCurrentDirectory(new java.io.File("."));
                chooser.setDialogTitle("choosertitle");
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                chooser.setAcceptAllFileFilterUsed(false);
                if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    System.out.println("getSelectedFile() : "
                            +  chooser.getSelectedFile());
                    setTextField1(chooser.getSelectedFile().getAbsolutePath());
                }
                else {
                    System.out.println("No Selection ");
                }
            }
        });
        STARTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Index doWork = new Index(textField1.getText());
                doWork.execute();
            }
        });
    }
    public void setTable(String[][] table)
    {
        String[] heading = {"Directory","Bitrate","fa","dsd","sdfsd"};
        DefaultTableModel tempTab = new DefaultTableModel(table,heading);
        this.table1.setModel(tempTab);

    }
    public void setTextField1(String direcotry)
    {
        this.textField1.setText(direcotry);
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    @Override
    public void run() {
        JFrame window = new JFrame();
        this.pane = new ScanProgress();
        window.setContentPane(pane.general);
        window.setVisible(true);
        window.setSize(300, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
