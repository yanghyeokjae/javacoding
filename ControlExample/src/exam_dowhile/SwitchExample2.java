package exam_dowhile;

import java.util.Scanner;

public class SwitchExample2 {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int score;
        char grade;

        do {
            System.out.print("점수는 0~100 사이로 입력해 주세요: ");
            score= scan.nextInt();
        } while (score < 0 || score > 100);

        System.out.printf("점수= %d\n", score);

        // if ~else if를 switch로 변경

        switch(score/10) {
            case 10: case 9:
                grade= 'A';
                break;
            case 8:
                grade= 'B';
                break;
            case 7:
                grade= 'C';
                break;
            case 6:
                grade= 'D';
                break;
            default:
                grade= 'F';
        }
        System.out.printf("학점: %c\n", grade);
        System.out.println("");

        System.out.print("점수는 0~100 사이로 입력해 주세요: ");
        score= scan.nextInt();
        System.out.printf("점수: %d\n", score);

        grade= switch(score/10){
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };

        System.out.printf("학점: %c\n", grade);

        scan.close();
    }
}
