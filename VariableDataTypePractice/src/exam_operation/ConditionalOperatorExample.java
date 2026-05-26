package exam_operation;

import java.util.Scanner;

public class ConditionalOperatorExample {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int x=100, y=200;

        // (조건식) ? 조건식이 참인 경우 실행할 식 : 조건식이 거짓일 경우 실행할 식
        System.out.println("두 수(100과 200) 중에서 최대값: " + ((x>y) ? x : y));
        System.out.println("두 수(100과 200) 중에서 최대값: " + Math.max(x,y));
        System.out.println();

        /*
        public static int max(int a, int b){

            return (a>=b)?a:b;
        }
         */

        /*
        임의의 수(키보드로 입력받은 값)를 가진 변수를 선언하고 그 값이 짝수인지 홀수인지를 출력할 수 있도록
        작성해 주세요.
        예를 들어 4는 짝수입니다.
         */

        int num;
        System.out.print("숫자를 입력해 주세요: ");
        num= input.nextInt();

        System.out.print(num + "는(은) " + ((num%2==0)?"짝수":"홀수") + "입니다\n");
        System.out.println();

        // 두 수의 차를 출력해 주세요
        int num1, num2;
        System.out.print("두 수를 공백 단위로 입력해 주세요: ");
        num1= input.nextInt();
        num2= input.nextInt();

        System.out.printf("두 수의 차는 %d입니다.", (num1>num2)?num1-num2:num2-num1);
    }
}
