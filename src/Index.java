import javax.swing.*;

public class Index extends SwingWorker {
    private JFrame window;
    private String directory;
    static ScanProgress pane;
    public Index(String directory){
        this.directory = directory;
        window = new JFrame();
        pane = new ScanProgress();
        window.setContentPane(pane.general);
        window.setVisible(true);
        window.setSize(300, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    protected Object doInBackground() throws Exception {
        Main.index(directory);
        return null;
    }

    @Override
    protected void done() {
        window.dispose();
    }
}