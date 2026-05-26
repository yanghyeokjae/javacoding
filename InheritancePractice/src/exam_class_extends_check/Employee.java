package exam_class_extends_check;

public class Employee extends Person{
    private String departmentName;

    public Employee(){
        super(); //상위(부모) 클래스의 디폴트 생성자 호출
        System.out.println("Employee 생성자 호출");
    }

    public Employee(String name, int age, String departmentName){
        /* super();         // 상위 클래스의 디폴트 생성자 호출
           setName(name);   // 설정자로 name 필드값 대입
           setAge(age);     // 설정자로 age 필드값 대입(설정)
         */
        super(name, age); //슈퍼 클래스의 생성자 호출. Person(String name, int age){}
        this.departmentName= departmentName;
        System.out.println("Employee(name, age, departmentName) 생성자 호출");
    }

    public String getDept(){
        return departmentName;
    }

    public void setDept(String departmentName){
        this.departmentName= departmentName;
    }

    @Override
    public String toString(){ //메서드 오버라이딩
        return super.toString() + ":" + departmentName;
    }
}
