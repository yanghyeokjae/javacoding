package exam_class_array;

import java.util.Scanner;

/*
    * 사용자로부터 5명의 학생의 컴퓨터 점수를 입력 받아서(배열 이용)
    * 값의 평균을 구하여 출력하는 프로그램을 작성해 보세요
    * 단 입력을 받기 위한 메서드(getValue())와
    * 평균을 출력할 수 있는 메서드(getAverage())를 각각 정의하여 표현해 주세요
 */

public class ScoreArrayMethodExample {
    static void main(String[] args){
        final int STUDENTS= 5;
        int[] scores= new int[STUDENTS];

        //1. 입력을 위한 메서드 호출(배열을 인자로 전달)
        getValue(scores);

        //2. 평균 계산 및 출력을 위한 메서드 호출(배열을 인자로 전달)
        getAverage(scores);
    }

    //사용자로부터 점수를 입력받아 배열에 저장하는 메서드
    public static void getValue(int[] scores){
        Scanner scan= new Scanner(System.in);
        for(int i=0; i<scores.length; i++){
            System.out.print((i+1) + "번 학생의 컴퓨터 점수를 입력하세요: ");
            int temp= scan.nextInt(); //temp => 점수 입력

            if(temp<0 || temp>100){ //점수가 0보다 작거나 100보다 클 경우
                System.out.println("[오류] 0~100 사이의 점수를 입력하세요.");
                i--; // i-1
                continue; // 무시하고 다시 반복
            }
            scores[i]= temp;
        }
    }
    //평균을 출력할 수 있는 메서드
    public static void getAverage(int[] scores){
        int total= 0; //점수 0으로 초기화
        for(int score: scores){ //향상된 for문
            total += score;
        }
        double average= (double)total/scores.length;
        System.out.printf("\n전체 학생의 평균 성적은 %.2f입니다.\n", average);
    }
}
