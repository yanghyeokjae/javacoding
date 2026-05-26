package example;

import java.util.Scanner;

/*
    올림픽과 같은 국제 대회에서 심사위원들이 선수들에게 점수를 주고 평균을 구하는 과정을 살펴보면
    전체 심사위원들의 점수를 모두 합하는 것이 아니라 최대점수와 최소점수를 제거한 나머지 점수의
    평균으로 최종 점수를 확정하는 경우가 많다

    아래와 같이 심사위원 5명의 점수를 입력받아 최대와 최소 점수를 제거한 점수들의 평균을 구하는 프로그램 작성
 */

public class JudgeExample {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int[] score= new int[5];
        int max=0, min=100, sum=0;

        //점수 입력
        for(int i=0; i<score.length; i++){
            System.out.printf("%d번째 점수 입력: ", (i+1));
            score[i]= scan.nextInt();

            // 최대값
            if(score[i] > max){
                max= score[i];
            }
            // 최소값
            if(score[i] < min) {
                min= score[i];
            }

            // 총합
            sum += score[i];

        }
        // 최대, 최소 제외
        sum= sum- max- min;

        // 평균 계산
        double avg= (double) sum/3;

        System.out.println();
        System.out.printf("최대 점수: %d\n최소 점수: %d\n평균: %.1f\n", max, min, avg);
    }
}
