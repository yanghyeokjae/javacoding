package exam_for;

import java.util.Scanner;

//10개의 데이터를 입력 받아 최소값, 최대값을 구하여 출력하는 코드를 작성하시오

public class MaxMinExample {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int num, min, max;

        min= Integer.MAX_VALUE;
        max= Integer.MIN_VALUE;

        for(int i=0; i < 10; i++) {
            System.out.printf("%d번째 수를 입력하세요", (i+1));
            num= scan.nextInt();

            if(num > max) {
                max = num;
            } else if(num < min) {
                min = num;
            }
        }
        scan.close();
        System.out.printf("최대값: %d, 최소값: %d", max, min);
    }
}
