public class MusicFile {
    String directory;
    String name;
    String artist;
    String album;
    int bitrate;
    MusicFile(String directory, String name, String artist, String album, int bitrate){
        this.directory = directory;
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.bitrate = bitrate;
    }
    MusicFile (String directory){
        this.directory= directory;
        name = "Dancing Quenn";
        artist = "ABBA";
        album = "Best of ABBA";
        bitrate = 320;
    }
    MusicFile(){
        this.directory = "blank";
    }
}
