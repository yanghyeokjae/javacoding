package exam_if;

import java.util.Scanner;

public class IfElseExample {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("[예제1]");
        int score= 90;
        String result;

        if(score >= 60){
            result= "합격";
        } else {
            result= "불합격";
        }
        System.out.println(result);
        System.out.println();

        //[예제2] 사용자로 하여금 하나의 숫자를 입력받아 짝수와 홀수 출력하기
        String str;
        System.out.print("숫자를 입력해 주세요: ");
        int num= input.nextInt();

        if(num%2==0){
            str= "짝수";
        } else {
            str= "홀수";
        }
        System.out.println(str);

        input.close();
    }
}
