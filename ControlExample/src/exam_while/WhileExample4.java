package exam_while;

import java.util.Scanner;

/*
    * 사용자로부터 두 개의 값을 입력받아 그 사이의 숫자를 모두 출력하세요.
    * 1 미만의 숫자가 입력됐다면 "1이상의 숫자를 입력해 주세요"가 출력되면서
    * 다시 사용자가 값을 입력하도록 하세요
 */

public class WhileExample4 {
    static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        int num1, num2, min, max;

        while(true) {
            System.out.print("첫번째 숫자와 두번째 숫자를 공백을 사이에 두고 입력해 주세요.\n");
            num1= scan.nextInt();
            num2= scan.nextInt();

            if(num1>=1 && num2>=1) {
                min= Math.min(num1, num2);
                max= Math.max(num1, num2);

                for(int i=min; i<=max; i++) {
                    System.out.print(i + " ");
                }
                break;
            } else {
                System.out.print("1이상의 숫자를 입력해 주세요.\n");
            }
        }
        scan.close();
    }
}
