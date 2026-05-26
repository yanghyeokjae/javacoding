package exam_array_in_array;

/*
    * 1차원 배열에 12명의 학생들을 출석부 순으로 초기화하고
    * 3행 2열로 2차원 배열 2개를 이용하여 분단을 나눠
    * 1분단부터 왼쪽부터 오른쪽으로 차례대로 자리를 배치하세요
    *
    * <출석부>
    1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
    7. 송성실 8. 윤예의 9. 진재주 10. 김철수 11. 홍길동 12. 배혜진
    *
    * [실행예시]
    * == 1분단 ==
    * 강건강 남나나
    * 도대담 류라라
    * 문미미 박보배
    * == 2분단 ==
    * 송성실 윤예의
    * 진재주 김철수
    * 홍길동 배혜진
 */

public class ArrayInArrayExample2 {
    static void main(String[] args){

        int count=0;
        String[] students= {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
        "송성실", "윤예의", "진재주", "김철수", "홍길동", "배혜진"};
        String[][] seat1= new String[3][2];
        String[][] seat2= new String[3][2];

        // 배열에 대입(저장)
        for(int i=0; i<seat1.length; i++){
            for(int j=0; j<seat1[i].length; j++){
                seat1[i][j]  = students[count++];
            }
        }
        for(int i=0; i<seat2.length; i++){
            for(int j=0; j<seat2[i].length; j++){
                seat2[i][j] = students[count++];
            }
        }

        // 데이터 출력
        System.out.println("== 1분단 ==");
        for(int i=0; i<seat1.length; i++){
            for(int j=0; j<seat1[i].length; j++){
                System.out.print(seat1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("== 2분단 ==");
        for(int i=0; i<seat2.length; i++){
            for(int j=0; j<seat2[i].length; j++){
                System.out.print(seat2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
