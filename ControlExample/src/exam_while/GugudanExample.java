package exam_while;

import java.util.Scanner;

/*
    * while문을 사용한 구구단 출력 프로그램
    * [실행결과]
    * 구구단 중에서 출력하고 싶은 단을 입력하시오: 4
    * 4*1= 4
    * 4*2= 8
    * 4*9= 36
 */

public class GugudanExample {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int i=1, dan;
        System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오: ");
        dan= scan.nextInt();

        while(dan < 2 || dan > 9) {
            System.out.print("2~9단 사이로 입력해 주셔야 합니다: ");
            dan= scan.nextInt();
        }
        while(i <= 9) {
            System.out.printf("%d*%d = %d\n", dan, i, (dan*i));
            i++;
        }
        scan.close();
    }
}
