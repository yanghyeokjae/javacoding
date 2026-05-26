package exam_super;
// 부모 계좌와 자식 계좌

class ParentAccount{
    // protected : 자식 클래스에서 접근 가능하도록 설정
    protected int money;

    //부모 생성자
    public ParentAccount(){

        // 부모 money 변수에 10000 저장
        money= 10000;
    }

    // 부모 메서드
    public void printMoney(){
        System.out.println("부모 클래스의 printMoney() 메서드");
    }
}

// 부모 클래스를 상속받는 자식 클래스
class ChildAccount extends ParentAccount{
    // 자식 클래스의 money 변수 -> 부모의 money와는 다른 변수
    protected int money;

    //자식 생성자
    public ChildAccount(){
        // 자식 money 변수에 5000 저장
        money= 5000;
    }

    // @Override -> 부모의 printMoney() 메서드를 자식 클래스에서 다시 정의(재정의) 함
    @Override
    public void printMoney(){

        // 지역 변수 money -> 메서드 안에서만 사용 가능
        int money= 1000;

        // 부모 클래스의 printMoney() 메서드 호출
        super.printMoney();

        System.out.println("자식 클래스의 printMoney() 메서드");
        System.out.println("지역 변수 money : " + money); // 지역 변수 출력

        // this.money -> 현재 객체(자식 클래스)의 money 변수
        System.out.println("자식 클래스의 money : " + this.money);

        //super.money -> 부모 클래스의 money 변수
        System.out.println("부모 클래스의 money : " + super.money);
    }
}

// 실행 클래스
public class ChildClassTest {
    public static void main(String[] args){

        //ChildAccount 객체 생성
        ChildAccount account= new ChildAccount();

        // 자식 클래스의 printMoney() 메서드 실행
        account.printMoney();
    }
}
