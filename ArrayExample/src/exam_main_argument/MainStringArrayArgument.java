package exam_main_argument;

public class MainStringArrayArgument {
    static void main(String[] args){
        if(args.length != 2){
            System.out.println("현재 프로그램을 실행하기 위해서는 반드시 실행시");
            System.out.println("두 개의 숫자를 입력해 주셔야 합니다");
            System.exit(1); //프로그램 종료.exit(숫자)
        }
        // "2" + "5" = 25
        String strNum1= args[0]; //"2"
        String strNum2= args[1]; //"5"

        //문자 -> 숫자
        int Num1= Integer.parseInt(strNum1); //2
        int Num2= Integer.parseInt(strNum2); //5

        int result= Num1+Num2;
        System.out.println(Num1 + " + " + Num2 + "= " + result);

    }
}
