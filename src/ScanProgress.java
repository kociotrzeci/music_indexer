import javax.swing.*;

public class ScanProgress  {
    private JButton button1;
    JPanel general;
    private JLabel label1;


    public void updateLabel(int count, int current){
        this.label1.setText("Scan progress: "+count+"/"+current       );
    }
    private void createUIComponents() {
        this.label1 = new JLabel();
    }
}
