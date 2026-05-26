package exam_dowhile;

// do ~while문을 이용하여 'a'~'z'까지 출력하는 프로그램 작성

public class DoWhileExample1 {
    static void main(String[] args){
        char alpha='a';

        do {
            System.out.print(alpha);
            // 마지막 문자 뒤에는 공백을 붙이지 않음
            if(alpha < 'z') {
                System.out.print(" ");
            }
            alpha++;
        } while (alpha<= 'z');
    }
}
