package exam_int;

import java.util.Scanner;

/*
    [요구사항]
    두 개의 정수를 입력받아 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 결과를 출력하시오
 */

public class ArithmeticExample {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int num1, num2;
        double avg, avg2;

        System.out.print("두 개의 숫자를 공백을 기준으로 입력해 주세요: ");
        num1= input.nextInt();
        num2= input.nextInt();

        System.out.printf("덧셈: %d\n", (num1+num2));
        System.out.printf("뺄셈: %d\n", (num1-num2));
        System.out.printf("곱셈: %d\n", (num1*num2));
        System.out.printf("나눗셈: %d\n", (num1/num2));
        System.out.printf("나머지: %d", (num1%num2));
    }
}
