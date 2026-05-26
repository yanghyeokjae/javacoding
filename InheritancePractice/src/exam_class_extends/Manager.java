package exam_class_extends;

public class Manager extends Employee{
    private int bonus;
    private String job;

    public Manager(){ //디폴트 생성자
        super(); // 명시하지 않을 시 컴파일러가 자동 추가
    }

    public Manager(String name, String address, String phoneNumber, int salary,
                   String job, int bonus){
        super(name, address, phoneNumber, salary);
        this.bonus= bonus;
        this.job= job;
    }

    public int getBonus(){
        return bonus;
    }
    public void setBonus(int bonus){
        this.bonus= bonus;
    }

    public String getJob(){
        return job;
    }
    public void setJob(String job){
        this.job= job;
    }

    // 전체 필드 설정하기 위한 메서드(관리자 정보)
    public void setManagerData(String name, String address, String phoneNumber, int salary,
                               String job, int bonus){ // 직원 클래스의 setEmployeeData()를 통해 직원에 정의된 필드 설정
        setEmployeeData(name, address, phoneNumber, salary);
        // setName(name);
        //자신이 가진 필드 설정
        this.job= job;
        this.bonus= bonus;
    }

    public String toString(){
        String data= ", job = " + job + ", bonus = " + bonus;
        //super 키워드를 통해 부모 클래스의 필드와 메서드 호출
        return super.toString() + data;
    }
}
