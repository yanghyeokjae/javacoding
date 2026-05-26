package exam_class;

public class SongMain {
    public static void main(String[] args){
        Song singer1= new Song("Dansing Queen", "ABBA", "Arrival", "Benny Andersson, Bjorn Ulvaeus",
                1977, 2);
        singer1.show();
        System.out.println();

        Song singer2= new Song();
        singer2.setTitle("Dansing Queen");
        singer2.setArtist("ABBA");
        singer2.setAlbum("Arrival");
        singer2.setComposer("Benny Andersson, Bjorn Ulvaeus");
        singer2.setYear(1977);
        singer2.setTrack(2);
        singer2.show();
    }
}
