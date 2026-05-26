package simplephoneinfo;

import java.util.Scanner;

public class PhoneBookVer02 {
    static Scanner scan= new Scanner(System.in);

    public static void showMenu(){
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 프로그램 종료");
        System.out.print("선택: ");
    }

    public static void readData(){
        System.out.print("이름: ");
        String name= scan.nextLine();
        System.out.print("전화번호: ");
        String phone= scan.nextLine();
        System.out.print("생년월일: ");
        String birthDay= scan.nextLine();

    if(birthDay.isEmpty()){ // 혹 사용자가 생년월일을 입력하지 않고 엔터를 입력하였다면 ""(빈문자) 대입
        birthDay= null; //showPhoneInfo() 메서드에서는 생년월일에 대한 제어를 null로 명시
    }

    PhoneInfo info= new PhoneInfo(name, phone, birthDay);
    System.out.println("\n입력된 정보 출력...");
    info.showPhoneInfo();
    System.out.println();
    }

    public static void main(String[] args){
        int choice;

        while(true){
            showMenu();
            choice= scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1 -> readData();
                case 2 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
            }
        }
    }
}
