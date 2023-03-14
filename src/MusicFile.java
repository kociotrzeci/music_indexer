
import com.mpatric.mp3agic.*;

import java.io.IOException;
import java.util.Arrays;

public class MusicFile {
    private Mp3File file;
    private String directory;
    public String[] getString() {
        ID3v2 tagV2;
        ID3v1 tagV1;
        String[] column = new String[5];
        if (this.file.hasId3v2Tag()) {
            tagV2 = file.getId3v2Tag();
            column[0] = tagV2.getArtist();
            column[1] = tagV2.getAlbum();
            column[2] = tagV2.getTitle();
            column[3] = directory;
            column[4] = Integer.toString(this.file.getBitrate());
            return column;
        }

        return (column);
    }
    MusicFile(String directory) throws InvalidDataException, UnsupportedTagException, IOException {
        if (directory == "blank")
            System.out.println("psujesz");
        else
            this.file = new Mp3File(directory);
        this.directory = directory;
    }
    public Mp3File getFile() {
        return file;
    }
    public String getDirectory() {
        return directory;
    }
    public void print(){
        System.out.println(Arrays.toString(this.getString()));
    }
}
