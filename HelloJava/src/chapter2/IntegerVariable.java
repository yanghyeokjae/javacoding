package chapter2;

public class IntegerVariable {
    public static void main(String[] args){
        short sVal= 10;
        byte bVal= 20;
        System.out.println(sVal+bVal);
        /*
            short와 byte는 다른 자료형이지만,
            정수 값을 연산할 때 4바이트를 기본 단위로 사용하기 때문에,
            두 정수를 더하기 전에 두 정수는 모두 int형으로 변환되고 결과 값도 int형으로 자동 저장 됨.
         */
    }
}
