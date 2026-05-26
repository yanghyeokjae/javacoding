package exam_class_basic;

public class StudentScoreTest {
    static void main(String[] args){
        StudentScore student1= new StudentScore();
        student1.studentScores("홍길동", 90, 75, 61);

        StudentScore student2= new StudentScore();
        student2.studentScores("김철수", 55, 56, 46);

        StudentScore student3= new StudentScore();
        student3.studentScores("이진희", 90, 90, 90);

        System.out.println("======================================================");
        System.out.print("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t학점\n");
        System.out.println("======================================================");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
