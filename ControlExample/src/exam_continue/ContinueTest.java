package exam_continue;

public class ContinueTest {
    static void main(String[] args){
        // 1~10까지의 수 중에서 홀수를 출력하도록 continue를 사용해 보자
        int a=0;
        do {
            a++;
            if(a%2==0)
                continue;
            System.out.printf("%5d", a);
        } while(a < 10);
        System.out.println();

        // 1~10까지의 수 중에서 짝수를 출력하도록 continue를 사용해 보자
        int b=0;
        do {
            b++;
            if(!(b%2==0))
                continue;
            System.out.printf("%5d", b);
        } while(b < 10);
        System.out.println();
    }
}
