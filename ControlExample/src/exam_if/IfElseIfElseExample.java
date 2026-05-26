package exam_if;

import java.util.Scanner;

/*
1. 사용자로 하여금 점수(score)를 입력받아
   학점(grade)을 출력하는 프로그램을 작성하시오
   90~100 A
   80~89  B
   70~79  C
   60~69  D
   59이하  F
 */

public class IfElseIfElseExample {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int score;
        char grade;

        System.out.print("점수를 입력해 주세요: ");
        score= input.nextInt();

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
