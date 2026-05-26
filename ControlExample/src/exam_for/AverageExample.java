package exam_for;

import java.util.Scanner;

// 10개의 수를 입력 받아 0보다 큰 숫자에 대한 평균과 개수를 출력하는 코드를 완성하시오

public class AverageExample {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int count= 0, total= 0, num, i;
        double avg;

        for(i=0; i<10; i++){
            System.out.println("숫자를 입력해 주세요");
            num= scan.nextInt();

            if(num > 0) {
                total += num;
                count++;
            }
        }

        if(count != 0) {
            avg= (double) total/count;
            System.out.printf("평균: %.2f 개수: %d\n", avg, count);
        } else {
            System.out.println("평균을 구할 수 없습니다.");
        }
        scan.close();
    }
}
