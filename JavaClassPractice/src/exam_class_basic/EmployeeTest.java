package exam_class_basic;
// 직원 클래스 실행

/*
    *[실행결과]
    *직원정보 [ 사원명: 홍길동, 전화번호= 010-2345-3476, 급여= 1000000 ]
    * 직원정보 [ 사원명: 김철수, 전화번호= 010-3423-5242, 급여= 500000 ]
 */

public class EmployeeTest {
    static void main(String[] args){
        Employee emp= new Employee();
        //직접 필드에 값 대입
        //emp.name= "홍길동";
        //emp.phoneNumber= "010-2345-3476";
        //emp.salary= 1000000;

        //메서드를 통해 필드에 값 대입
        emp.employeeData("홍길동", "010-2345-3476", 1000000);
        System.out.println(emp.toString());

        Employee emp02= new Employee();

        //emp.name= "김철수";
        //emp.phonNumber= "010-3423-5242";
        //emp.salary= 500000;

        emp02.employeeData("김철수", "010-3423-5242", 500000);
        System.out.println(emp02.toString());
    }
}
