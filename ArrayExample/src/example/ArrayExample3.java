package example;

/*
    배열에 대입된 점수에 해당하는 막대 그래프를 다음과 같이 출력하시오

    [실행결과]

    ===== 성적 분포 그래프 =====
    90점  |  ■■■■■■■■■
    20점  |  ■■
    50점  |  ■■■■■
    70점  |  ■■■■■■■
    65점  |  ■■■■■■
    90점  |  ■■■■■■■■■
    100점 |  ■■■■■■■■■■
    43점  |  ■■■■
    55점  |  ■■■■■
    87점  |  ■■■■■■■■
    ==========================
 */

public class ArrayExample3 {
    static void main(String[] args){

        int[] scores= {90, 20, 50, 70, 65, 90, 100, 43, 55, 87};
        System.out.println("===== 성적 분포 그래프 =====");

        for(int score : scores) {
            System.out.printf("%3d점 | ", score);

            // 10으로 나눈 몫만큼 반복하여 막대 생성
            int barCount= score/10;
            for(int i=0; i<barCount; i++){
                System.out.print("■ ");
            }
            System.out.println();
        }
        System.out.println("==========================");
    }
}
