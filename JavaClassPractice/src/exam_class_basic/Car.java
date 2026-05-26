package exam_class_basic;
// 자동차(car) 클래스 선언

public class Car {
    //필드 정의
    public int speed; //속도
    public int gear; // 기어 단수
    public String color; //색상

    public void speedUp(){
        speed+= 10;
    }
    public void speedDown(){
        speed-= 10;
    }
    public void printData(){
        // 객체의 상태를 문자열로 표현하는 메서드
        System.out.println("속도: " + speed + "기어: " + gear + "색상: " + color);
    }
    public String toString(){
        //객체의 상태를 문자열로 반환하는 메소드
        return "속도: " + speed + "기어: " + gear + "색상: " + color;
    }
}
