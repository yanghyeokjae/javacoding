package exam_array_in_array;

import java.util.Scanner;

/*
    * 사용자로부터 3명 학생의 국어, 영어, 수학 성적을 입력받아서
    * 학생별 합계와 평균을 구하는 프로그램을 배열을 이용하여 작성
 */

public class StudentArrayExample {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int STUDENT= 3;
        final int SUBJECT= 3;

        int[][] scores= new int[STUDENT][SUBJECT];
        String[] subjectName= {"국어", "영어", "수학"};
        int total= 0;

        System.out.println("======3명의 학생 데이터 입력======");
        for(int i=0; i<STUDENT; i++){
            for(int j=0; j<SUBJECT; j++){
                System.out.printf("%d번째 학생의 %s 성적을 입력하세요: ", (i+1), subjectName[j]);
                scores[i][j]= scan.nextInt();
            }
        }
        scan.close();

        System.out.println("\n=========3명의 학생 데이터 출력=========");
        System.out.println("국어\t\t영어\t\t수학\t\t총점\t\t평균");
        System.out.println("--------------------------------------");
        for(int i=0; i<STUDENT; i++){
            total=0;

            for(int j=0; j<SUBJECT; j++){
                total+= scores[i][j];
                System.out.printf("%3d\t\t", scores[i][j]);
            }
            System.out.printf("%3d\t\t%.1f\n",total, (double)total/SUBJECT);
        }
    }
}
