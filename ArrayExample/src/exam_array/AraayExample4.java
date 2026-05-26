package exam_array;

import java.util.Scanner;

/*
    * 3이상인 홀수 자연수를 입력받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
    * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
    * 단, 입력한 점수가 홀수가 아니거나 3미만일 경우 "다시 입력하세요"를 출력하고 다시 정수 받음
    *
    * [출력예시]
    * 정수 : 4
    * 다시 입력하세요
    * 정수 : -9
    * 다시 입력하세요
    * 정수 : 5
    * 1, 2, 3, 2, 1
 */

public class AraayExample4 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;

        while(true) {
            System.out.print("정수: ");
            number = scan.nextInt();

            /*
            if (number < 3 && number % 2 == 0) {
                System.out.println("다시 입력해 주세요.");
            } else {
                break;
            }

        }

            int[] array= new int[number];
            int middle= number/2;

            for(int i=0; i<=middle; i++) {
                array[i] = i + 1;
            }
            for(int i=middle+1; i<number; i++) {
                array[i] = array[number - i - 1];
            }
            for(int i=0; i<array.length; i++){
                System.out.print(array[i]);

                if(i<array.length-1){
                    System.out.print(" ");
                }

             */

            if(number >= 3 && number %2!=0){
                break; //3 이상이면서 홀수일 때만 반복문 탈출
            }
            System.out.println("다시 입력하세요");
        }
        int[] array= new int[number];
        int mid= number/2; //중간 인덱스(예: 5 입력시 2)
        int value= 1; //배열에 채울 값

        for(int i=0; i<number; i++){
            array[i]= value;

            if(i<mid){
                value++; //중간 전까지 1씩 증가
            } else {
                value--; //중간부터는 1씩 감소
            }
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(", "); //마지막 요소가 아닐 때만 쉼표 출력
            }
        }
        scan.close();
    }
}
