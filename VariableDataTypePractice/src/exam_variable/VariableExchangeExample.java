package exam_variable;

/* 정수형 변수 2개를 선언하여 각각 변수의 값을 초기화하여
   두 수를 교환하는 값을 출력하는 프로그램을 작성해 보자
 */
public class VariableExchangeExample {
    static void main(String[] args){

        int num1=10, num2=20, temp; //정수형 변수 선언, 값 초기화

        System.out.println("교환 전 num1과 num2의 값");
        System.out.printf("num1= %d\nnum2= %d", num1, num2);
        System.out.println();
        System.out.println();

        temp= num1; // temp에 num1 값 대입
        num1= num2; // num1에 num2 값 대입
        num2= temp; // num2에 temp 값 대입

        System.out.println("교환 후 num1과 num2의 값");
        System.out.printf("num1= %d\nnum2= %d",num1, num2);

    }
}
