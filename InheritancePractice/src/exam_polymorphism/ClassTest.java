package exam_polymorphism;

// 클래스명: ClassTest로 생성
class A{
    int a= 10;

    void b(){
        System.out.println("A");
    }
}

class AA extends A{
    int a= 20;

    @Override
    void b(){
        System.out.println("AA");
    }

    void c(){
        System.out.println("C");
    }
}

class BB extends A{
    int a= 30;

    @Override
    void b(){
        System.out.println("BB");
    }

    void d(){
        System.out.println("D");
    }
}

public class ClassTest {
    public static void main(String[] args){
        A z= new AA(); //업캐스팅
        System.out.println(z.a); //참조변수 타입인 A클래스의 필드 a에 접근.
        z.b(); //메서드는 오버라이딩 되므로 실제 객체 타입인 AA 클래스의 b()가 실행

        //z.c(); //컴파일 오류: A 타입 참조변수로는 AA 클래스에만 선언된 c() 호출 불가

        ((AA)z).c(); //다운캐스팅하여 c() 호출
        System.out.println(((AA)z).a); //다운캐스팅 후에는 AA 클래스의 필드 a에 접근

        AA a1= (AA) z; //다운캐스팅한 객체를 AA 타입 참조변수 a1에 저장
        //AA 타입 참조변수이므로 AA 클래스의 필드와 메서드에 접근
        System.out.println(a1.a);
        a1.c();
        System.out.println();

        z= new BB(); //A z라고 안 써도 됨
        System.out.println(z.a);
        z.b(); //오버라이드 된 메서드 호출
        System.out.println();
        //z.d(); //컴파일 오류

        ((BB)z).d(); //계속 쓸 게 아니고 한 번만 쓸 경우
        System.out.println(((BB)z).a);

        BB b1= (BB)z; //다운캐스팅
        b1.d();
        System.out.println(b1.a);
    }
}
