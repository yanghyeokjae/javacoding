package esam_switch;

import java.util.Scanner;

/*
    [예제3]
    사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요
    단, 관리자는 회원관리, 게시글관리, 게시글작성, 게시글조회, 댓글작성이 가능하고
    회원은 게시글작성, 게시글조회, 댓글작성이 가능하고
    비회원은 게시글조회만 가능합니다.
 */

public class SwitchCaseExample {
    static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.println("권한을 확인하고자 하는 회원 등급을 입력해 주세요(관리자, 회원, 비회원)");

        switch(scan.next()){
            case "관리자":
                System.out.println("회원관리, 게시글관리");
            case "회원":
                System.out.println("게시글작성, 댓글작성");
            case "비회원":
                System.out.println("게시글조회");
                break;
            default:
                System.out.println("잘못 입력하셨습니다");
        }
        scan.close();
    }
}
