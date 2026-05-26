package exam_if;

import java.util.Scanner;

public class IfElseIfElseExample2 {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int score;
        char grade;

        System.out.println("점수는 0~100 사이로 입력해 주세요");
        score= input.nextInt();

        if(score>=0 && score<=100){
            if(score>=90)
                grade= 'A';
            if(score>=80)
                grade= 'B';
            if(score>=70)
                grade= 'C';
            if(score>=60)
                grade= 'D';
            else
                grade= 'F';

            System.out.printf("점수: %d\t학점: %c", score, grade);
        } else {
            System.out.println("점수는 0~100 사이로 입력해 주셔야 합니다");

            input.close();
        }
    }
}
