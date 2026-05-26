package exam_if;

import java.util.Scanner;

/*
    사용자로 하여금 사원번호, 근무시간, 시간당 금액을 입력받아
    사원번호와 급여를 출력하도록 프로그램을 작성해 주세요
    급여= 근무시간*시간당 금액으로 처리하면 된다
    40시간 초과한 만큼 시간당 금액의 50%를 더 받는다
 */

public class TimePayExample {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int empNo, worktime, payperHour;
        double salary;

        System.out.print("사원번호: ");
        empNo= input.nextInt();
        System.out.print("근무시간: ");
        worktime= input.nextInt();
        System.out.print("시간당 금액: ");
        payperHour= input.nextInt();

        if(worktime <= 40){
            salary= worktime * payperHour;
        } else {
            salary= (40 * payperHour) + ((worktime - 40) * payperHour * 1.5);
        }
        System.out.printf("\n사원번호: %d\n급여: %.0f", empNo, salary);
    }
}
