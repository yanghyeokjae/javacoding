package exam_class_basic;

import java.util.Scanner;

public class MovieTest {
    /* 1. 2개의 영화 정보를 직접 대입하여 출력
    static void main(String[] args){
       Movie movie1= new Movie();
       movie1.movieData("프로젝트 헤일메리",9.2,"필 로드, 크리스 밀러",2026);
       System.out.println(movie1.toString());

       Movie movie2= new Movie();
       movie2.movieData("줄무늬 파자마를 입은 소년", 9.3, "마크 허먼", 2026);
       System.out.println(movie2.toString());

     */

       //2. 사용자로 하여금 영화정보를 입력받기 위한 메서드를 별도로 구하여 설정
        public static Scanner input= new Scanner(System.in);
        public static void main(String[] args) {
            Movie mv2 = new Movie();
            inputData(mv2);

            //입력 후 메서드를 통해 필드에 값 대입
            Movie mv3 = new Movie();
            inputData(mv3);

            //영화 정보 출력
            System.out.println("영화 정보는 다음과 같다");
            System.out.println("===============================================");
            System.out.println("제목\t평점\t\t감독\t\t개봉일");
            System.out.println("===============================================");
            System.out.println(mv2.toString());
            System.out.println(mv3.toString());

            //데이터를 입력받기 위한 메서드
        }
        public static void inputData(Movie mv) { //Movie mv= mv2(참조값/주소값)
        //필드에 직접 대입
            System.out.print("영화 제목: ");
            mv.title= input.nextLine();

            System.out.print("영화 평점: ");
            mv.rating= input.nextDouble();
            input.nextLine();

            System.out.print("영화 감독: ");
            mv.director= input.nextLine();

            System.out.print("개봉 연도: ");
            mv.releaseYear= input.nextInt();
            input.nextLine();
        }
}
