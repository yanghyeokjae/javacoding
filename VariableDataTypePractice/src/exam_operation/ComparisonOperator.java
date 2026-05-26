package exam_operation;

import java.util.Scanner;

public class ComparisonOperator {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int x=3, y=4;

        System.out.println("x == y " + (x == y)); //비교연산자. 결과값으로 boolean 자료형의 true/false
        System.out.println("x != y " + (x != y));

        System.out.println("x > y " + (x > y));
        System.out.println("x < y " + (x < y));
        System.out.println("x <= y " + (x <= y));

        char char1= 'A'; //65 a:97
        char char2= 'B'; //66
        boolean result= (char1 > char2);
        System.out.println("result= " + result);

        String name1= "홍길동";
        System.out.print("이름을 입력해 주세요: ");
        String name2= input.next();

        //if(name1 == name2)
        if(name1.equals(name2)){ //문자와 문자열에는 사칙연산 사용 불가능
            System.out.println("이름이 일치합니다.");
        } else {
            System.out.println("이름이 일치하지 않습니다.");
        }
    }
}
