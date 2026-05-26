package exam_array;

import java.util.Scanner;

/*
    * 다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라
    * 문자열(course배열)에 다음과 같이 초기값을 가진다
    * "Java", "C++", "HTML5", "컴퓨터구조", "데이터베이스"
    * 그리고 그 과목에 대한 점수(score배열)도 다음과 같이 초기값을 가진다
    * 95, 88, 76, 62, 55
    *
    * 그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라
    * "종료"를 입력받으면 종료한다
    * if(문자열배열명[인덱스]==문자열변수) X
    * if(문자열배열명[인덱스].equals(문자열변수)) O
 */

public class ScoreArray {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "데이터베이스"};
        int[] score = {95, 88, 76, 62, 55};

        /* 출력문 직접 작성
           System.out.println("[과목 정보] - 과목명은 대소문자 정확하게 입력해 주세요. [종료는 \"종료\"입력]");
           System.out.println("Java, C++, HTML5, 컴퓨터구조, 데이터베이스");
         */

        // 출력문과 과목명을 배열로 접근하여 출력
        System.out.println("[과목 정보] - 과목명은 대소문자 정확하게 입력해 주세요. [종료는 \"종료\"입력]");
        for (int i = 0; i < course.length; i++) {
            System.out.print(course[i]);
            if (i < course.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        while (true) {
            System.out.print("과목 이름>>");
            String name = scan.nextLine().trim(); //trim -> 입력한 값의 앞과 뒤에 공백 무시
            if (name.equals("종료")) {
                break;
            }
            if (name.isEmpty()) continue; // isEmpty()->빈 줄 입력, continue->무시하고 위 명령으로 돌아가기

            int i;
            boolean found = false;
            for (i = 0; i < score.length; i++) {
                if (course[i].equals(name)) {
                    System.out.printf("%s의 점수는 %d점입니다.\n", course[i], score[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("없는 과목입니다");
            }
        }
        System.out.println("프로그램을 종료합니다");
    }
}
