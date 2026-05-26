package exam_array;

import java.util.Scanner;

//학생 수를 입력 받고 그 수(학생수)만큼 점수를 입력 받아 평균 구하도록 프로그램 작성

public class ScoreTest {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int studentCount, total=0;

        System.out.print("학색 수를 입력해 주세요: ");
        studentCount= scan.nextInt();

        if(studentCount<=0) {
            System.out.println("학생 수는 1이상 입력해 주셔야 합니다");
            scan.close();
            return;
        }
        int score[]= new int[studentCount];

        for(int i=0; i<score.length; i++){
            System.out.printf("%d번째 학생의 점수를 입력해주세요: ", (i+1));
            score[i]= scan.nextInt();

            total += score[i];
        }
        double average= (double) total/score.length;
        System.out.printf("평균 성적은 %.2f입니다", average);
        scan.close();
    }
}
