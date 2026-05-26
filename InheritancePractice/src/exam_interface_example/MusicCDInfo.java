package exam_interface_example;

public class MusicCDInfo extends CDInfo{
    String artist;
    String[] songTitle;

    public MusicCDInfo(String registerNo, String title, String artist, String[] songTitle){
        super(registerNo, title);
        this.artist= artist;
        this.songTitle= songTitle;
    }

    @Override
    public String toString(){

        String cd= super.toString();

        cd += artist;
        cd += songTitle;

        for(int i= 0; i<songTitle.length; i++){
            cd += "\n" + (i+1) + ". " + songTitle[i];
        }

        return cd;
    }
}
