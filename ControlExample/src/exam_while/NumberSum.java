package exam_while;

import java.util.Scanner;

/*
    * 사용자로부터 5개의 정수를 입력받아 합과 평균값을 계산하여 출력하는 프로그램 작성
    *
    * [출력예시]
      1번째 수 입력: 1
      2번째 수 입력: 2
      3번째 수 입력: 3
      4번째 수 입력: 4
      5번째 수 입력: 5
      입력 받은 수
      합계: 15 평균: 3.0
 */

public class NumberSum {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int num, count=1, sum=0;
        while(count<=5) {
            System.out.printf("%d번째 수 입력: ", count);
            num= scan.nextInt();
            sum+=num;
            count++;
        }
        System.out.printf("입력 받은 수\n합계: %d, 평균: %.1f\n", sum, ((double)sum/(count)-1));
        /* 평균 구할 때 count-1을 하는 이유 -> 조건식이 count<=5임
           따라서 조건이 끝났을 때는 눈에 보이지 않지만, count가 6이 되어 있는 상태
           평균을 구하려면 count-1 = 5인 상태로 만들어야 함
         */

        scan.close();
    }
}
