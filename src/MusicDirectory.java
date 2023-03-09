public class MusicDirectory {
    String directory;
    int minBitrate;
    void setMinBitrate(int bitrate){this.minBitrate = bitrate;}
    int getMinBitrate(){return this.minBitrate;}



    MusicDirectory(String directory)
    {
        this.directory=directory;
    }

}
