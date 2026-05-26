package exam_class_basic;

/*
    * 성적을 출력하는 Score 클래스를 정의
    * 이름/ 국어/ 영어/ 수학/ 총점을 저장하고자 한다(필드 구현)
    * 필드에 값을 설정할 수 있는 기능, 점수들의 합을 구하는 기능,
    * 평균을 구하는 기능, 학점을 구하는 기능,
    * 모든 필드를 출력할 수 있는 기능을 포함하도록 한다(메서드 구현)
 */

public class StudentScore {
    //필드 선언
    //접근제어자(제한자) 자료형 변수; ==> 필드 선언
    //이름
    public String studentName;
    public int koreanScore;
    public int englishScore;
    public int mathScore;
    public int total;
    public double average;
    public char grade;

    public void studentScores(String name, int kor, int eng, int math){
        studentName= name;
        koreanScore= kor;
        englishScore= eng;
        mathScore= math;

        total= kor+eng+math;
        average= (double)total/3;

        if(average>=90){
            grade= 'A';
        } else if(average>80){
            grade= 'B';
        } else if(average>70){
            grade= 'C';
        } else if(average>60){
            grade= 'D';
        } else {
            grade= 'F';
        }
    }
    public String toString(){return String.format("%s\t%d\t\t%d\t\t%d\t\t%d\t\t%.1f%6c",
            studentName, koreanScore, englishScore, mathScore, total, average, grade);}
}
