package esam_switch;

/*
    [예제7]
    미래건물의 각 층별 정보를 제공하고자 한다.
    1층은 약국, 2층은 정형외과, 3층은 피부과, 4층은 치과, 5층은 헬스클럽이 입점하고 있다
    층수를 입력받아 입점 정보를 출력해 주세요

    [출력예시]
    각 층 정보를 제공하고자 합니다. 1~5 층 수를 입력해 주세요. 5
    5층은 헬스클럽입니다
 */

import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int step;
        System.out.print("각 층 정보를 제공하고자 합니다. 1~5 층수를 입력해 주세요: ");
        step= scan.nextInt();

        if(step>=1 && step<=5) {
            String ment = switch (step) {
                case 1 -> "약국";
                case 2 -> "정형외과";
                case 3 -> "피부과";
                case 4 -> "치과";
                default -> "헬스클럽";
            };
            System.out.printf("%d층은 %s", step, ment);
        } else {
            System.out.println("존재하지 않는 층");
        }
        System.out.print("입니다.");
    }
}
