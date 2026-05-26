package exam_interface;

import java.sql.Struct;
import java.util.Arrays;

class Student implements Comparable{
    private String name;
    private int total;

    public Student(String name, int total){
        this.name= name;
        this.total= total;
    }

    public String name(){
        return name;
    }
    public int total(){
        return total;
    }

    @Override
    public String toString(){
        return "이름= " + name + " 총점= " + total;
    }

    public int compareTo(Object obj){
        Student student= (Student)obj;
        //총점 기준
        if(this.total<student.total)
            return -1;
        else if(this.total>student.total)
            return 1;
        else
            return 0;
        //이름 기준
        //return this.name.compareTo(student.name);
    }
}

public class StudentSort {
    public static void main(String[] ags) {
        int[] numbers = {60, 88, 10, 45, 90};
        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        //3명의 학생 평점으로 오름차순 정렬하여 출력하는 프로그램 작성
        Student[] students = {
                new Student("홍길동", 270),
                new Student("김희진", 210),
                new Student("이한솔", 290)
    };

        Arrays.sort(students);

        for(Student student : students){
            System.out.println(student);
        }
    }

}
