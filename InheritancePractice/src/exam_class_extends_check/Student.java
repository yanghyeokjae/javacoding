package exam_class_extends_check;

public class Student extends Person{
    private String major;

    public Student(){
        super();
        System.out.println("Student 생성자 호출");
    }

    public Student(String name, int age, String major){
        /* setName(name);
           setAge(age);
         */
        super(name, age);
        this.major= major;
        System.out.println("Student(name, age, major) 생성자 호출");
    }

    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major= major;
    }

    public String toString(){ //메서드 오버라이딩
        return super.toString() + ":" + major;
    }
}
