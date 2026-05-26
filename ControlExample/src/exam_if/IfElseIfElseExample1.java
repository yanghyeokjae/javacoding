package exam_if;

import java.util.Scanner;

public class IfElseIfElseExample1 {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int score;
        char grade;

        System.out.println("점수는 0~100 사이로 입력해 주세요");
        score= input.nextInt();

        //2. 작성 완료 후 위 코드에서 점수가 0~100 사이로 입력되지 않았다면
        // 점수는 0~100 사이로 입력해 주셔야 합니다 라고 출력되도록 제어하기

        if(score<0 || score>100){
            System.out.println("점수는 0~100 사이로 입력해 주셔야 합니다");
        } else {
            if(score >= 90){
                grade= 'A';
            } else if(score >= 80){
                grade= 'B';
            } else if(score >= 70){
                grade= 'C';
            } else if(score >= 60){
                grade= 'D';
            } else {
                grade= 'F';
            }
            System.out.printf("점수: %d\t학점: %c", score, grade);
            input.close();
        }
    }
}
