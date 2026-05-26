package exam_method_overloading;

/*
    * 메소드 오버로딩(Overloading)
    * - 하나의 클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것
    * - 하나의 메소드 이름으로 다양한 매개값 받기 위해 메소드 오버로딩
    * - 오버로딩의 조건: 매개변수의 타입, 개수, 순번 달라야 함
 */

public class Calculator {
    public int plus(int x, int y){
        int result= x+y;
        return result;
    }

    public int minus(int x, int y){
        int result= x-y;
        return result;
    }

    public int multiply(int x, int y){
        int result= x*y;
        return result;
    }

    public double divide(int x, int y){
        double result= (double) x/ (double) y;
        return result;
    }

    public int plus(int x, int y, int z){
        int result= x+y+z;
        return result;
    }

    public int plus(int x, int y, int a, int b){
        int result= x+y+a+b;
        return result;
    }

    public int plus(int x, int y, int a, int b, int c){
        int result= x+y+b+a+c;
        return result;
    }

    public int plus(int[] numbers) { //int[] numbers= num1(배열의 주소값)
        int sum = 0; //지역변수
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public int sum(int... values){ //가변 길이의 메서드
        int total= 0;
        for(int i=0; i<values.length; i++){
            total += values[i];
        }
        return total;
    }

}
