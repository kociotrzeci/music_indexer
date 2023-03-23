import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.UnsupportedTagException;
import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    static Window pane;
    public static void main(String[] args) {
        for(UIManager.LookAndFeelInfo i : UIManager.getInstalledLookAndFeels())
            System.out.println(i.getClassName());
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        //new TableExample();
        JFrame window = new JFrame();
        pane = new Window();
        window.setContentPane(pane.general);
        window.setVisible(true);
        window.setSize(1200, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void index(String directory) {
        ScanFolder synth = null;
        try {
            synth = new ScanFolder(directory);
        } catch (InvalidDataException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedTagException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        MusicFile[] listOfFiles = synth.getFileTable();
        String[][] table = new String[listOfFiles.length][listOfFiles[0].getString().length];
        MusicDirectory[] listOfDirectories = synth.getDirectoryTable();
        System.out.println("------FILES-------");
        for (int i = 0; i < listOfFiles.length;i++) {
            //listOfFiles[i].print();
            table[i]= listOfFiles[i].getString();
            System.out.println(Arrays.toString(table[i]));
        }
        System.out.println("------DIRECTORIES-------");
        for (MusicDirectory i : listOfDirectories) {
            System.out.println(i.getDirectory());

        }
        pane.setTable(table);

    }


}