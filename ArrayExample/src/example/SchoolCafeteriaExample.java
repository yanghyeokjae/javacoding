package example;

/*
    * 다음은 학생 20명에게 학교 식당에 대한 만족도를 조사한 결과를 처리하는 프로그램이다
    * 학생들로 하여금 만족도를 3단계로 나누어 불만족(1), 보통(2), 만족(3) 응답하게 한 결과가
    * 다음 표와 같을 때 만족도별 응답 횟수를 출력하는 코드를 작성하시오
 */

public class SchoolCafeteriaExample {
    static void main(String[] args){
        int[] responses= {1, 2, 1, 2, 3, 1, 2, 2, 3, 1, 3, 3, 1, 1, 1, 2, 3, 1, 3, 2};
        int dissatisfied= 0; //불만족(1)
        int neutral= 0; //보통(2)
        int satisfied= 0; //만족(3)

        for(int data : responses) {
            switch (data) {
                case 1 -> dissatisfied++;
                case 2 -> neutral++;
                case 3 -> satisfied++;
            }
        }
        /*
            String printData= String.format("""
            불만족(1) 응답자 수: %d
            보통(2) 응답자 수: %d
            만족(3) 응답자 수: %d
            """, dissatisfied, neutral, satisfied);
             */

        String printData= """
                    불만족(1) 응답자 수: %d
                    보통(2) 응답자 수: %d
                    만족(3) 응답자 수: %d
                    """. formatted(dissatisfied, neutral, satisfied);

        System.out.println(printData);
    }
}
