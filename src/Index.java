import javax.swing.*;

public class Index extends SwingWorker {
    private final JFrame window;
    private final String directory;
    static ScanProgress pane;
    public Index(String directory){
        this.directory = directory;
        window = new JFrame("Progress");
        pane = new ScanProgress();
        window.setContentPane(pane.general);
        window.setVisible(true);
        window.setSize(300, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    protected Object doInBackground() {
        Main.index(directory);
        return null;
    }

    @Override
    protected void done() {
        window.dispose();
    }
}