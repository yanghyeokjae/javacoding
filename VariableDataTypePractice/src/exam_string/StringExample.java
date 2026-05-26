package exam_string;

public class StringExample {
    static void main(String[] args){
        String name= "홍길동";
        String job= "프로그래머";
        System.out.println(name);
        System.out.println(job);
        System.out.println();

        String str= "나는 \"자바\"를 배웁니다";
        System.out.println(str);

        str= "번호\t이름\t직업";
        System.out.println(str);
        System.out.println();

        System.out.println("나는\n");
        System.out.println("자바를\n");
        System.out.println("배웁니다.");
        System.out.println();

        // 추가 예제
        System.out.println("이름에서 성만 출력하기");
        String value= "홍길동";
        char word= value.charAt(0);
        System.out.println(word);
    }
}
