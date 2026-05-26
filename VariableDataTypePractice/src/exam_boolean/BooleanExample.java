package exam_boolean;

public class BooleanExample {
    static void main(String[] args){
        // 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는 데 사용
        boolean stop= true;
        if(stop){
            System.out.println("중지합니다");
        } else {
            System.out.println("시작합니다");
        }
        System.out.println();

        int x= 10;
        boolean result1= (x == 20); //변수 x의 값이 20인가?
        boolean result2= (x != 20); //변수 x의 값이 20이 아닌가?

        System.out.printf("result1= %b\nresult2= %b", result1, result2);

    }
}
