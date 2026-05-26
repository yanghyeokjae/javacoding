package example;

import java.util.Scanner;

/*
간단한 극장 예약 시스템을 작성하여 보자
아주 작은 극장이라서 좌석이 10개밖에 안된다
사용자가 예약을 하려고 하면 먼저 좌석 배치표를 보여준다
즉 예약이 끝난 좌석은 1로, 예약이 안된 좌석은 0으로 나타낸다
 */

public class TheaterReserve {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] seatNum= new int[10]; //0: 예약 X, 1: 예약 O
        int clientNum;

        while(true){
            System.out.println("-------------------");
            for(int i=1; i<=seatNum.length; i++){
                System.out.print(i + " ");
            }
            System.out.println("\n-------------------");
            for(int i=0; i<seatNum.length; i++){
                System.out.print(seatNum[i] + " ");
            }
            System.out.println("\n-------------------");
            System.out.println("원하시는 좌석 번호를 입력하세요(종료는 -1): ");
            clientNum= scan.nextInt();

            if(clientNum == -1){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if(clientNum>seatNum.length || clientNum<1){
                System.out.println("좌석 번호 선택이 잘못되었습니다.");
            } else if(seatNum[clientNum-1]==1){
                System.out.println("이미 예약된 좌석입니다.");
            } else {
                seatNum[clientNum-1] = 1;
                System.out.println("예약되었습니다.");
            }
        }
    }
}
