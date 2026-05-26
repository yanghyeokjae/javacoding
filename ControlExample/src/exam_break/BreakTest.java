package exam_break;

public class BreakTest {
    static void main(String[] args){
        int i=5;
        System.out.println("Countdown Start!");

        while(true) {
            if(i == 0) {
                break;
            }
            System.out.println(i);
            i--;
        }
    }
}
