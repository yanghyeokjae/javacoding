package exam_if;

import java.util.Scanner;

// 3개의 정수를 입력받아 최대값을 출력하도록 프로그램 하시오

public class MaximumFinder {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int num1, num2, num3, maximumValue;
        System.out.print("숫자 세 개를 입력해 주세요: ");
        num1= input.nextInt();
        num2= input.nextInt();
        num3= input.nextInt();
        input.close();

        /* if(num1>num2){
            maximumValue=num1;
        } else {
            maximumValue=num2;
        }
        if(num3>maximumValue){
            maximumValue=num3;
        }
        System.out.printf("최대값은 %d입니다.", maximumValue); */

        maximumValue= Math.max(num1, Math.max(num2, num3));
        System.out.printf("최대값은 %d입니다.", maximumValue);
    }
}
