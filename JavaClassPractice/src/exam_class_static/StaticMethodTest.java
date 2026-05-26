package exam_class_static;

public class StaticMethodTest {
    private static int num1= 5; //정적 변수. 클래스 변수 선언
    private int num2= 3; //인스턴스 변수

    public static void print1(){ // 정적 메서드. 클래스 메서드
        int num3= num1;
        // int num4= this.num2; // ->결과: 클래스 메서드 안에는 인스턴스 변수를 쓸 수 없음
        System.out.println(num3);
        System.out.println("print() 호출");
    }

    public void print2(){ //인스턴스 메서드
        int num3= num1;
        int num4= num2;
        System.out.println(num3 + ", " + num4);
        System.out.println("print2() 호출");
    }

    public static void main(String[] args){
        StaticMethodTest.print1(); // 클래스명.정적메서드()로 호출
        print1();

        // staticMethodTest.print2(); // -> 결과 print2는 인스턴스 메서드라서 사용 불가
        // print2();

        StaticMethodTest method= new StaticMethodTest();
        method.print2();
    }
}
