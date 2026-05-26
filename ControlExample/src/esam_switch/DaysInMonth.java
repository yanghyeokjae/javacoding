package esam_switch;

import java.util.Scanner;

/*
    1년의 각 월 일수를 출력하는 프로그램을 작성해 보자
    즉 특정 월이 입력받아 그 월의 일수를 출력한다
 */

public class DaysInMonth {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int month, year=2012, day=0;

        System.out.print("일수를 알고 싶은 월을 입력하시오: ");
        month= input.nextInt();

         if(month >= 1 && month <= 12){
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    day= 31;
                    break;
                case 4: case 6: case 9: case 11:
                    day= 30;
                    break;
                case 2:
                    /*
                        윤년 계산은 다음과 같이 하여 판단한다.
                        4의 배수이고 100의 배수가 아니거나 400의 배수이면
                        윤년
                     */
                    if(((year%4==0) && !(year%100==0)) || (year%400==0))
                        day= 29;
                    else //평년
                        day= 28;
                    break;
                    // default: //형식을 확인하기 위해 명시.
                        // System.out.println("월이 잘못 입력되었습니다");
                        // break;
            }
            System.out.printf("해당 %d월의 일수는 %d일 입니다.", month, day);
        } else {
            System.out.println("잘못된 월이 입력되었습니다.");
        }

        input.close();
    }
}
