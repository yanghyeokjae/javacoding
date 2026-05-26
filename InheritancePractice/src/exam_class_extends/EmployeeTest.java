package exam_class_extends;

public class EmployeeTest {
    public static void main(String[]args){
        /* Employee e= new Employee();
        Manager m= new Manager();

        e.setName("김철수");
        e.setAddress("서울시 영등포구 당산6가");
        e.setPhoneNumber("010-2353-3245");
        e.setSalary(1500000);

        m.setManagerData("홍길동", "서울시 성동구", "010-7869-0987", 2000000,
                "대리", 100000);

        System.out.println(e.toString());
        System.out.println(m.toString());
        System.out.println();
        */

        // 실행결과 1
        Employee emp1= new Employee();
        emp1.setEmployeeData("김철수", "서울시 영등포구 당산6가", "010-2353-3245",
                1500000);
        System.out.println(emp1.toString());

        Manager mgr1= new Manager();
        mgr1.setManagerData("홍길동", "서울시 성동구", "010-7869-0987",
                2000000, "대리", 100000);
        System.out.println(mgr1.toString());
        System.out.println();

        //실행결과 2
        Employee emp2= new Employee("김철수", "서울시 영등포구 당산6가", "010-2353-3245",
                1500000);
        System.out.println(emp2.toString());

        Manager mgr2= new Manager("홍길동", "서울시 성동구", "010-7869-0987", 2000000,
                "대리", 100000);
        System.out.println(mgr2.toString());
        System.out.println("\n");


        //실행결과 3
        Employee[] e= {
                new Employee("이진희","서울시 영등포구 당산6가","010-2353-3553",
                        1500000),
                new Manager("홍길동", "서울시 성동구", "010-7869-0987", 200000,
                        "대리", 100000)
        };

        for(int i=0; i<e.length; i++){
            // System.out.println(e[i].toString());
            System.out.println(e[i]);
        }
        System.out.println();

        for(Employee ee: e){
            // System.out.println(ee.toString());
            System.out.println(ee);
        }
    }

}
