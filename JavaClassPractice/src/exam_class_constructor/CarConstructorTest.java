package exam_class_constructor;

public class CarConstructorTest {
    public static void main(String[] args){
        CarConstructor car1= new CarConstructor();
        System.out.printf("자동자 정보 [속도= %-2d, 기억= %d 색상= %s]\n",
                car1.getSpeed(), car1.getGear(), car1.getColor());

        CarConstructor car2= new CarConstructor(60, 1, "blue");
        System.out.println(car2.toString());
    }
}
