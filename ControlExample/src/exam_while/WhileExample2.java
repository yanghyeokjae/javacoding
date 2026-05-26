package exam_while;

import java.util.Scanner;

//-1이 입력될 때까지 정수를 입력받아 그 수들의 합을 출력하는 프로그램을 작성하시오

public class WhileExample2 {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int count=0, sum=0, n;
        System.out.println("정수를 입력해 주세요(종료: -1)");

        // 입력과 동시에 조건을 검사하여 중복 코드 제거
        while((n=scan.nextInt()) != -1) {
            sum+=n;
            count++;
        }
        if(count == 0) {
            System.out.println("입력받은 수가 없습니다");
        } else {
            System.out.printf("입력된 %d개 정수의 합계: %d", count, sum);
        }
    }
}
