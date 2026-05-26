package exam_class_basic;
//영화 클래스 선언

public class Movie {
    public String title;
    public double rating;
    public String director;
    public int releaseYear;

    public void movieData(String t, double r, String d, int y){
        title= t;
        rating= r;
        director= d;
        releaseYear= y;
    }
    public String toString(){
        return String.format("%s\t%.2f\t%s\t%d", title, rating, director, releaseYear);
    }
}
