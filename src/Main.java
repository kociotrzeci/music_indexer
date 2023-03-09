import obsolete.frame;

import javax.swing.*;

public class Main {
    String column[] = {"Directory", "Bitrate"};

    public static void main(String[] args) {
        ScanFolder synth = new ScanFolder("SYNTHPOP");
        MusicFile[] listOfFiles = synth.getFileTable();
        MusicDirectory[] listOfDirectories = synth.getDirectoryTable();
        System.out.println("------FILES-------");
        for (MusicFile i : listOfFiles) {
            System.out.println(i.directory);
        }
        System.out.println("------DIRECTORIES-------");
        for (MusicDirectory i : listOfDirectories) {
            System.out.println(i.directory);
        }
        String column[] = {"Name", "Roll Number", "Department"};
        String[][] string = {
                {"Kundan Kumar Jha", "4031"},
                {"Anand Jha", "6014"}
        };
        JFrame window = new JFrame();
        window.setContentPane(new Window().general);
        window.setVisible(true);
        window.setSize(1200, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void passTable() {
        int i = 0;
    }
}