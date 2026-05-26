package exam_class;

public class Tv {
    private String manuFacture;
    private int year;
    private int size;

    public Tv(){}

    public Tv(String manuFacture, int year, int size){
        this.manuFacture= manuFacture;
        this.year= year;
        this.size= size;
    }

    public String getManuFacture(){
        return manuFacture;
    }
    public void setManuFacture(String manuFacture){
        this.manuFacture= manuFacture;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year= year;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size= size;
    }

    public void show(){
        System.out.println("제조사: " + this.manuFacture);
        System.out.println("제조년도: " + this.year);
        System.out.println("상품사이즈: " + this.size);
    }
}
