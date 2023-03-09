import java.io.*;
import java.util.*;


public class ScanFolder {
    private final String directory;
    private ArrayList<MusicFile> fileTable = new ArrayList<MusicFile>();
    private ArrayList<MusicDirectory> directoryTable = new ArrayList<MusicDirectory>();

    ScanFolder(String directory) {
        this.directory = directory;
        ListFiles(directory);
    }

    void ListFiles(String directory) {
        File localisation = new File(directory);
        File[] listOfFiles = localisation.listFiles();
        //listOfFiles = null;
        try {
            for (File i : listOfFiles) {
                if (i.isDirectory()) {
                    ListFiles(i.getPath());
                    directoryTable.add(new MusicDirectory(i.getPath()));
                } else fileTable.add(new MusicFile(i.getPath()));
            }
        }catch(Exception e){
            System.out.println("directory is empty");
        }

    }

    //MusicFile[] dupa = fileTable.toArray(new MusicFile[0]);
    MusicFile[] getFileTable() {
        return fileTable.toArray(new MusicFile[0]);
    }

    MusicDirectory[] getDirectoryTable() {
        return directoryTable.toArray(new MusicDirectory[0]);
    }
}
