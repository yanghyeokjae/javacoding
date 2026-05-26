package exam_class_array;

class Phone{
    private String name;
    private String company;

    public Phone(){} //디폴트 생성자(매개변수를 가지고 있지 않음)

    public Phone(String name, String company){ //생성자(매개변수 가지고 있음)
        this.name= name;
        this.company= company;
    }

    public void printData(){ //필드 값 출력 메서드
        System.out.printf("핸드폰명:%-10s\t제조사명:%s\n", name, company);
    }
}

public class PhoneObjectArray {
    public static void main(String[] args){
        //객체 생성
        Phone p1, p2, p3; //객체 선언(참조변수 선언)
        p1= new Phone("아이폰17","애플"); //객체 생성(인스턴스 생성)
        p2= new Phone("갤럭시S26", "삼성");
        p3= new Phone("갤럭시Z폴드7", "삼성");

        p1.printData();
        p2.printData();
        p3.printData();
        System.out.println();

        //객체 배열로 정의
        Phone[] p= new Phone[3];

        p[0]= new Phone("아이폰17", "애플");
        p[1]= new Phone("갤럭시S26","삼성");
        p[2]= new Phone("갤럭시Z폴드7", "삼성");

        //출력 구문
        for(int i=0; i<p.length; i++){
            p[i].printData();
        }

        //for~each 출력구문. for(자료형 변수명: 배열명){}
        for(Phone ph: p){
            ph.printData();
        }
        System.out.println();

        //객체배열의 초기화로 표현
        Phone[] ph= new Phone[]{
                new Phone("아이폰17", "애플"),
                new Phone("갤럭시S26","삼성"),
                new Phone("갤럭시Z폴드7","삼성")
        };

        //출력구문
        for(int i=0; i<ph.length; i++){
            ph[i].printData();
        }
        System.out.println();

        Phone[] ph1= {
                new Phone("아이폰17", "애플"),
                new Phone("갤럭시S26","삼성"),
                new Phone("갤럭시Z폴드7","삼성")
        };
        for(Phone ph3: ph1){
            ph3.printData();
        }
    }
}
