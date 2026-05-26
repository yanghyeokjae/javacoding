package exam_operation;

public class LogicalOperator {
    static void main(String[] args){
        int x=3, y=4;

        System.out.println((x == 3) && (y == 7)); //논리곱(&&): ~이고
        System.out.println((x == 3) || (y == 4)); //논리합(||): ~거나, ~또는

        boolean result = (++x == 3) && (y++ == 7); //앞의 결과가 거짓이므로 결과=거짓 즉 뒷부분은 아예 실행 안 함
        System.out.println("x= " + x + " y= " + y); //결과: x=4 y=4
        System.out.println("result= " + result); //false

        result= (x++ == 4) || (++y == 7); //앞의 결과가 참이므로 결과=참 즉 뒷부분은 아예 실행을 안 함
        System.out.println("x= " + x + " y= " + y); //결과: x=5 y=4
        System.out.println(result);

    }
}
