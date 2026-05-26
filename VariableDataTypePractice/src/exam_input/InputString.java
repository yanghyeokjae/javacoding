package exam_input;

import java.util.Scanner;

/*
    *[요구사항]
    * 각자의 이름, 나이, 주소를 입력받아 아래와 같이 출력되도록 작성해 주세요
    *
    * [출력문 예시]
    * 홍길동님 안녕하세요! 50살이시네요.
    * 주소는 서울특별시 중구 남대문로 120 그레이츠 청계 2F
 */

public class InputString {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        String name, address;
        int age;

        System.out.print("이름을 입력해 주세요: \n");
        name= input.next();
        System.out.print("나이를 입력해 주세요: \n");
        age= input.nextInt();
        System.out.print("주소를 입력해 주세요: ");
        address= input.next();
        System.out.println();

        System.out.printf("%s님 안녕하세요! %d살이시네요.\n주소는 %s", name, age, address);
    }
}
