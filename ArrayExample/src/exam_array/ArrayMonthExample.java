package exam_array;

import java.util.Scanner;

// 사용자로 하여금 1~12월을 입력 받아 마지막 일수를 출력하도록 코드 작성

public class ArrayMonthExample {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int[] month= { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int su;
        System.out.println("각 월의 마지막 일을 출력하고자 합니다(1~12)");
        do {
            System.out.print("원하는 월: ");
            su= scan.nextInt();
        } while(su<1 || su>12);
            System.out.println(su + "월은 " + month[su-1] + "일입니다.");

    }

}
