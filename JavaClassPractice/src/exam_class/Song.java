package exam_class;

public class Song {
    private String title; //노래 제목
    private String artist; //가수
    private String album; //앨범 제목
    private String composer; //작곡가
    private int year; //년도
    private int track; //트랙 번호

    public Song(){}

    public Song(String title, String artist, String album, String composer,
                int year, int track){
        this.title= title;
        this.artist= artist;
        this.album= album;
        this.composer= composer;
        this.year= year;
        this.track=track;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title= title;
    }

    public String getArtist(){
        return artist;
    }
    public void setArtist(String artist){
        this.artist= artist;
    }

    public String getAlbum(){
        return album;
    }
    public void setAlbum(String album){
        this.album= album;
    }

    public String getComposer(){
        return composer;
    }
    public void setComposer(String composer){
        this.composer= composer;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year= year;
    }

    public int getTrack(){
        return track;
    }
    public void setTrack(int track){
        this.track= track;
    }

    public void show(){
        System.out.printf("노래 제목: %s\n가수: %s\n앨범: %s\n작곡가: %s\n" +
                "년도: %s\n트랙 번호: %d\n", this.title, this.artist, this.album, this.composer,
                this.year, this.track);
    }
}
