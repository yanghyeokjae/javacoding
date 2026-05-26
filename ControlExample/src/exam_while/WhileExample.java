package exam_while;

public class WhileExample {
    static void main(String[] args){
        // [예제1] 1~5까지 출력
        System.out.println("1~5까지 출력");
        int i= 1;
        System.out.print("1. 정수: ");
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        i= 1;
        System.out.print("2. 정수: ");
        while(true){ //조건식이 무조건 참이므로 무한반복(무한루프)
            System.out.print(i + " ");
            i++;
            if(i > 5) { //반복문을 벗어날 수 있는 조건식을 반드시 명시
                break;
            }
        }
        System.out.println();

        //[예제2] 5~1까지 출력하기
        System.out.println("\n5~1까지 출력");
        i= 5;
        System.out.print("1. 정수: ");
        while(i>0){
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        i= 5;
        System.out.print("2. 정수: ");
        while(true) { // 조건식이 참이므로 무한반복
            System.out.print(i + " ");
            i--;
            if (i < 1) { //반복문을 벗어날 수 있는 조건식 반드시 명시
                break; //반복문을 벗어나는 명령문
            }
        }
        System.out.println();
        System.out.println();

        //[예제3] 1~100까지 합 출력 -> 우선 1~5까지 합 출력

        int num=1, sum=0;
        System.out.println("1~5까지 합 출력");
        while(num <=5 ) {
            sum= num+sum; //sum += num
            num= num+1; //num++
            // 위 소스를 통합하여
            // sum += num++;
        }
        System.out.printf("1~5까지의 합: %d", sum);
    }
}
