import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.UnsupportedTagException;
import org.apache.commons.io.FilenameUtils;
import java.io.*;
import java.util.*;


public class ScanFolder {
    private final String directory;
    private ArrayList<MusicFile> fileTable = new ArrayList<MusicFile>();
    private ArrayList<MusicDirectory> directoryTable = new ArrayList<MusicDirectory>();

    ScanFolder(String directory) throws InvalidDataException, UnsupportedTagException, IOException {
        this.directory = directory;
        ListFiles(directory);
    }

    void ListFiles(String directory) throws InvalidDataException, UnsupportedTagException, IOException {
        File localisation = new File(directory);
        File[] listOfFiles = localisation.listFiles();
        //listOfFiles = null;

            for (File i : listOfFiles) {
                if (i.isDirectory()) {
                    directoryTable.add(new MusicDirectory(i.getPath()));
                    ListFiles(i.getPath());
                } else {
                    if( isMp3(i.getPath())) {
                        fileTable.add(new MusicFile(i.getPath()));
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
