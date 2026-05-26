package exam_dowhile;

import java.util.Scanner;

/*
    * 이 예제는 숫자 알아맞히기 게임이다
    * 프로그램은 1~10까지의 정수를 저장하고 사용자는 질문을 통해 그 정수를 알아맞히려고 노력한다
    * 사용자가 답을 제시하면  프로그램은 자신이 저장한 정수와 비교하여 제시된 정수가
    * 더 높은지 낮은지만을 알려준다
    * 프로그램은 do ~while 루프를 사용하여 사용자가 정확하게 정수를 알아맞힐 때까지 반복한다
    * 사용자가 정답을 맞히면 몇 번만에 맞췄는지 화면에 출력한다.
 */

public class NumberGame {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int num, count=0, dice;

        dice= (int)(Math.random()*6)+1;

        do {
            System.out.print("숫자를 입력해 주세요: ");
            num= scan.nextInt();
            count++;

            if(num > dice) {
                System.out.print("제시한 정수가 더 높습니다\n");
            } else if (num < dice){
                System.out.print("제시한 정수가 더 낮습니다\n");
            }
        } while(num != dice);
        System.out.printf("축하합니다. 정답입니다.\n정답에 도달한 횟수: %d", count);
    }
}
