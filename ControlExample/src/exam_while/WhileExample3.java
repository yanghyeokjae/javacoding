package exam_while;

import java.util.Scanner;

/*
    * 사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하시오
    * 단, 입력한 수는 1보다 크거나 같아야 한다.
    * 만약 1 미만의 숫자가 입력됐다면
    * "잘못 입력하셨습니다. 다시 입력해 주세요."가 출력되면서 다시 사용자가 값을 입력하도록 하세요
 */

public class WhileExample3 {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int su;

        while(true) {
            System.out.print("1 이상의 숫자를 입력해 주세요: ");
            su= scan.nextInt();

            if(su>=1) {
                for(int i=su; i>=1; i--) {
                    System.out.print(i + " ");
                }
                break;
            } else {
                System.out.print("잘못 입력하셨습니다. 다시 입력해 주세요.\n");
            }

        } scan.close();
    }
}
