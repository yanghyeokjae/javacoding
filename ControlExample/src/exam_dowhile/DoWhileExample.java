package exam_dowhile;

import java.util.Scanner;

public class DoWhileExample {
    static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        // [예제1] '선처리 후조건'문임을 확인
        int num=0;
        do {
            System.out.println("num의 값: " + num);
            num++;
        } while (num < 0);
        System.out.println();

        // [예제2] 1~10까지 출력
        int i= 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();

        //[예제3] 10~1까지 출력
        i= 10;
        do {
            System.out.print(i + " ");
            i--;
        } while (i > 0);
        System.out.println();

        //[예제4] 1~100까지의 합 출력(do~while문 활용)
        int number= 1, sum=0;
        do {
            sum += number++;
        } while (number <= 100);
        System.out.printf("1~100까지의 합: %d", sum);
        System.out.println();

        //[예제5] 사용자에게 문자 및 숫자를 입력 받아 출력하고자 한다.
        // 이 때 종료는 q를 입력하면 된다.
        String scanString;

        System.out.println("\n메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 \"종료\"를 입력해 주세요");

        do {
            System.out.print("> ");
            scanString= scan.next();
            System.out.println(scanString);
        } while(!scanString.equals("종료"));
        /* do = 무조건 한 번은 실행, while(조건식)이 true면 반복해서 계속 실행
           만약 while(조건식)이 false일 경우 종료
           !scanString.equals("종료") -> "종료"가 입력되지 않으면 do의 명령문 계속해서 실행하라는 뜻
         */

        System.out.println();
        System.out.print("프로그램을 종료합니다");
        scan.close();

    }
}
