package exam_break;

import java.util.Scanner;

/*
    사용자가 입력한 점수의 총점, 평균을 내는 프로그램 작성
    단 종료는 0~100 사이가 아닌 값 입력
 */

public class BreakExample {
    static void main(String[] args){
        int total=0, count=0,score;

        Scanner scan=new Scanner(System.in);

        while(true) {
            System.out.print("점수를 입력해 주세요(종료: 0~100 사이 아닌 값 입력)");
            score= scan.nextInt();
            if(score < 0 || score > 100) {
                break;
            }
            total += score;
            count++;
        }
        if(count == 0) {
            System.out.println("평균을 구할 수 없습니다");
        } else {
            System.out.printf("총점: %d 평균: %.2f ", total, (double)total/count);
        }
        scan.close();
    }
}
