package exam_for;

public class ForExample {
    static void main(String[] args){
        // [예제1] 5번 문장 출력
        for (int i= 1; i <= 5; i++) {
            System.out.print(i + " ");
            System.out.print("Hello World!");
            System.out.print("I love coding\n");
        }
        System.out.println();

        // [예제2] 1~10까지의 합
        int sum=0;
        for (int i=1; i<=10; i++) {
            sum+=i; //sum= sum+i
        }
        System.out.printf("1~10까지의 합: %d\n", sum);

        /* [예제3]
            for문을 이용해서 1~10까지의 정수 중에서 3의 배수(3, 6, 9, 12)의 총합을
            구하는 코드를 작성해 보세요
            추가요구 사항은 3의 배수의 개수와 3의 배수를 출력
         */
        int count=0, sum1=0;

        for(int i=1; i<=10; i++){
            if(i%3==0) { //i를 3으로 나눈 나머지가 0과 같다면 => 3, 6,9(3의 배수)
                System.out.println(i);
                sum += i; //sum= sum+i
                count++; //count= count+1
            }
        }
        System.out.printf("1~10까지 3의 배수: %d\n", count);
        System.out.printf("1~10까지 3의 배수의 합: %d\n", sum);
    }
}
