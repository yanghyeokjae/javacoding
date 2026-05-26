package exam_input;

// [요구사항] 사용자가 입력한 두 개의 숫자를 더해서 출력하는 프로그램을 작성하시오
import java.util.Scanner; //Scanner 클래스 포함

public class TwoNumberSum {
    static void main(String[] args){
        // 메인 메소드에서부터 실행이 시작된다
        // 클래스 참조변수 = 메모리 할당 연산자 생성자(초기값)
        Scanner input= new Scanner(System.in);

        int x, y, sum;

        System.out.print("첫번째 숫자를 입력하시오: ");
        x= input.nextInt();

        System.out.print("두번째 숫자를 입력하시오: ");
        y= input.nextInt();

        sum= x+y;

        System.out.printf("두 수의 합: %d\n", sum);
        System.out.println();

        int num1, num2;
        System.out.print("두 수를 공백을 기준으로 입력해 주세요: ");
        num1= input.nextInt();
        num2= input.nextInt();

        System.out.println("두 수의 합: " + num1 + num2);
        System.out.println("두 수의 합: " + (num1+num2));
    }
}
