package exam_int;

import java.util.Scanner;

public class IntExample {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        /*[예제1. 요구사항]
        두 변수를 선언하고 임의의 수를 입력받아 서로 값을 교환하여 출력하는 프로그램 작성
         */

        int num1, num2, num3;

        System.out.print("숫자 두 개를 공백을 기준으로 입력해 주세요: ");
        num1= input.nextInt();
        num2= input.nextInt();

        num3= num1;
        num1= num2;
        num2= num3;

        System.out.printf("num1= %d, num2= %d\n", num1, num2);
        System.out.println();

        /* [예제2. 요구사항]
            두 수를 입력받아 a,b 변수에 대입 후 변수 a에 입력된 값을 1 증가시키고,
            변수 b에 기억된 값은 1 감소시켜서 출력하는 프로그램 작성
         */

        int a, b;
        System.out.print("a, b에 들어갈 숫자를 공백을 기준으로 입력해 주세요: ");
        a= input.nextInt();
        b= input.nextInt();

        a= ++a;
        b= --b;

        System.out.printf("a= %d, b=%d", a, b);

        input.close();

    }
}
