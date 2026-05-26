package exam_interface;

class Box{
    private double volume;

    public Box(double volume){
        this.volume= volume;
    }
    public double getVolume(){
        return volume;
    }
}

public class BoxTest {
    public static void main(String[] args){
        Box b1= new Box(10.2);
        Box b2= new Box(2.3);

        if(b1.getVolume()<b2.getVolume()){
            System.out.println("첫 번째 박스가 두 번째 박스보다 작습니다.");
        } else if(b1.getVolume()==b2.getVolume()){
            System.out.println("두 박스는 같습니다.");
        } else {
            System.out.println("첫 번째 박스가 두 번째 박스보다 큽니다.");
        }
    }
}
