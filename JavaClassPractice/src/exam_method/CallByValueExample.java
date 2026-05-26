package exam_method;

class CallByValue{
    public void change(int x, int y) { //기초형 값 전달
        System.out.println("\nBefore Change x= " + x + "\ty= " + y);
        int temp= x;
        x= y;
        y= temp;
        System.out.println("After Change x= " + x + "\ty= " + y);
    }
}

public class CallByValueExample {
    static void main(String[] args){
        CallByValue cv= new CallByValue();

        int x= 10;
        int y= 20;
        System.out.println("\n호출 전 Main x= " + x + "\ty= " + y);

        cv.change(x, y);
        System.out.println("\n호출 후 Main x= " + x + "\ty= " + y);
    }
}
