package exam_if;

import java.util.Scanner;

// 두 정수를 입력받아 작은 값, 큰 값 순으로 출력되도록 프로그램을 작성하시오

public class IfTest {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int num1, num2, temp;

        System.out.print("두 숫자를 공백을 사이에 두고 입력해 주세요: ");
        num1= input.nextInt();
        num2= input.nextInt();


        if(num1>num2){
            temp= num1;
            num1= num2;
            num2= temp;
        }
        System.out.println(num1 + " " + num2);
        input.close();
    }
}
