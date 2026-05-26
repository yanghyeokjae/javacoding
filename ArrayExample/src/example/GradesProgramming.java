package example;

public class GradesProgramming {
    static void main(String[] args) {

        String subject= "번호 이름 국어 영어 수학 총점 평균 학점 재수강 순위";
        String[] name= {"홍길동", "김철수", "이진희"}; //학생명
        int[][] score= {                          // 점수 및 총점
                {90, 75, 61, 0},
                {55, 56, 46, 0},
                {90, 90, 90, 0}
        };

        double[] avg= new double[3];
        char[] grade= new char[3];
        String[] pass= new String[3];

        //1. 총점 구하기
        for(int i=0; i<name.length; i++){ //학생수
            for(int j=0; j<name.length; j++){
                score[i][name.length] += score[i][j];
            }

            //평균 구하기
            avg[i]= (double)score[i][3]/3; //[3]는 score[3][]에서 네번째에 있는 수

            //학점 구하기
            grade[i]= switch((int)avg[i]/10){ //스위치는 실수 못 씀. 그래서 (int)/10
                case 10, 9 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                case 6 -> 'D';
                default -> 'F';
            };

            //재수강 여부
            if(avg[i] >= 60){
                pass[i]= "pass";
            } else {
                pass[i]= "nopass";
            }
        }

        System.out.println("\t\t\t\t성적 프로그램");
        System.out.println("===============================================");
        System.out.println(subject);
        System.out.println("===============================================");

        for(int i=0; i<name.length; i++){
            System.out.printf("%-2d %-5s", i+1, name[i]);
            for(int j=0; j<score[i].length; j++){
                System.out.printf("%-3d ", score[i][j]);
            }
            System.out.printf(" %5.2f %3c %-7s\n", avg[i], grade[i], pass[i]);
        }
    }
}
