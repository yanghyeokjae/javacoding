package exam_while;

//1~100까지 짝수의 합과 홀수의 합을 각각 구해보자

public class WhileExample1 {
    static void main(String[] args){

        int i=1, even=0, odd=0;

        while(i<100) {
            if(i%2==0) {
                even += i;
            } else {
                odd += i;
            }
            i++;
        }
        System.out.printf("짝수의 합: %d\n", even);
        System.out.printf("홀수의 합: %d", odd);
    }
}
