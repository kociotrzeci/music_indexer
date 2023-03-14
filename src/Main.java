import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.UnsupportedTagException;
import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    String column[] = {"Directory", "Bitrate"};

    public static void main(String[] args) throws InvalidDataException, UnsupportedTagException, IOException {
        ScanFolder synth = new ScanFolder("SYNTHPOP");
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
        //new TableExample();

        JFrame window = new JFrame();
        Window pane = new Window();
        window.setContentPane(pane.general);
        window.setVisible(true);
        window.setSize(1200, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setTable(table);




    }
    public static void passTable() {
        int i = 0;
    }


}