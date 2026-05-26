package exam_for;

/*
    두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고
    눈의 합이 5가 아니면 계속 주사위를 던지고 눈의 합이 5면 실행을 멈추는 코드 작성
 */

public class DiceExample {
    static void main(String[] args){
        int num1, num2;
        while(true) {
            num1= (int)(Math.random()*6)+1;
            num2= (int)(Math.random()*6)+1;

            System.out.printf("(%d, %d)", num1, num2);
            if((num1+num2) == 5) {
                break;
            }
        }
    }
}
