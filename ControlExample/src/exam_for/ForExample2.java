package exam_for;

import java.util.Scanner;

// 1~사용자에게 입력 받은 수까지 정수들의 합을 출력하세요.

public class ForExample2 {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int userNum, sum=0;

        System.out.print("정수를 하나 입력하세요: ");
        userNum= scan.nextInt();

        if(userNum < 1) {
            System.out.print("1이상의 정수를 입력해야 합니다");
            return;
        }
        for(int i=1; i<=userNum; i++) {
            sum += i;

            if(i < userNum) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " + ");
            }
        }
        System.out.println(sum);
        scan.close();
    }
}
