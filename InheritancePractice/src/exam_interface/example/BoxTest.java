package exam_interface.example;

/*
    자바에서는 객체 크기를 비교하는 데 사용되는 java.lang.Comparable이라는 인터페이스 제공해 줌
    * public interface Comparable{
    //이 객체가 다른 객체보다 크면 1, 같으면 0, 작으면 -1 반환
          int compareTo(Object other);
 */

class Box implements Comparable{
    private double volume;

    public Box(double volume){
        this.volume= volume;
    }

    public double getVolume(){
        return volume;
    }

    @Override
    public int compareTo(Object obj){ //Object obj= b2로 업캐스팅 됨
        Box other= (Box)obj; //(하위 클래스명) 상위 클래스의 참조변수. 다운캐스팅

        if(this.volume < other.volume)
            return -1;
        else if(this.volume > other.volume)
            return 1;
        else
            return 0;
    }
}

public class BoxTest {
    public static void main(String[] args){
        Box b1= new Box(78.66);
        Box b2= new Box(143.5);

        // compareTo 메서드에 비교할 대상을 명시하고 비교
        if(b1.compareTo(b2)>0){
            System.out.println("첫번째 박스의 부피가 두번째 박스보다 큽니다.");
        } else if(b1.compareTo(b2)==0){
            System.out.println("두 박스의 부피가 같습니다.");
        } else {
            System.out.println("첫번째 박스의 부피가 두번째 박스보다 작습니다.");
        }
    }
}
