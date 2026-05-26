package exam_class;

public class TvMain {
    public static void main(String[] args){
        Tv lg= new Tv("Lg", 2025, 65);
        lg.show();
        System.out.println();

        Tv samSung= new Tv();
        samSung.setManuFacture("삼성");
        samSung.setYear(2026);
        samSung.setSize(32);
        samSung.show();
        System.out.println();

        Tv tv= new Tv();
        tv.show();
    }
}
