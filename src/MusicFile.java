
import com.mpatric.mp3agic.*;
import java.io.IOException;

public class MusicFile {
    private final String[] prasedString;

    public String[] getString() {
        return (prasedString);
    }

    MusicFile(String directory) throws InvalidDataException, UnsupportedTagException, IOException {
        Mp3File file = new Mp3File(directory);
        ID3v2 tagV2;
        ID3v1 tagV1;
        this.prasedString = new String[5];
        if (file.hasId3v2Tag()) {
            tagV2 = file.getId3v2Tag();
            this.prasedString[2] = tagV2.getArtist();
            this.prasedString[3] = tagV2.getTitle();
            this.prasedString[4] = tagV2.getAlbum();
        } else {
            this.prasedString[2] = " ";
            this.prasedString[3] = " ";
            this.prasedString[4] = " ";
        }
        this.prasedString[0] = directory;
        this.prasedString[1] = Integer.toString(file.getBitrate());
    }
}

