import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.UnsupportedTagException;
import org.apache.commons.io.FilenameUtils;
import java.io.*;
import java.util.*;


public class ScanFolder {
    private final String directory;
    private ArrayList<MusicFile> fileTable = new ArrayList<MusicFile>();
    private ArrayList<MusicDirectory> directoryTable = new ArrayList<MusicDirectory>();
    private int count;
    private int current;
    ScanFolder(String directory) throws InvalidDataException, UnsupportedTagException, IOException {
        this.count = 0;
        this.current = 0;
        this.directory = directory;
        countFiles(directory);
        listFiles(directory);
    }
    void listFiles(String directory) throws InvalidDataException, UnsupportedTagException, IOException {
        File localisation = new File(directory);
        File[] listOfFiles = localisation.listFiles();
        if (listOfFiles.length == 0)
        {
        }
            for (File i : listOfFiles) {
                if (i.isDirectory()) {
                    directoryTable.add(new MusicDirectory(i.getAbsolutePath()));
                    listFiles(i.getPath());
                    Index.pane.updateLabel(this.current,this.count);
                } else {
                    if( isMp3(i.getPath())) {
                        fileTable.add(new MusicFile(i.getAbsolutePath()));
                        current++;
                    }
                }
            }
        }
    void countFiles(String directory) throws InvalidDataException, UnsupportedTagException, IOException {
        File localisation = new File(directory);
        File[] listOfFiles = localisation.listFiles();
        if (listOfFiles.length == 0)
        {
        }
        for (File i : listOfFiles) {
            if (i.isDirectory()) {
                directoryTable.add(new MusicDirectory(i.getAbsolutePath()));
                countFiles(i.getPath());
                Index.pane.updateLabel(0,this.count);
            } else {
                if( isMp3(i.getPath())) {
                    count++;
                }
            }
        }
    }
    MusicFile[] getFileTable() {
        return fileTable.toArray(new MusicFile[0]);
    }
    MusicDirectory[] getDirectoryTable() {
        return directoryTable.toArray(new MusicDirectory[0]);
    }
    private boolean isMp3(String directory)
    {
        if (Objects.equals(FilenameUtils.getExtension(directory), "mp3"))
            return true;
        else
            return false;
    }
}
