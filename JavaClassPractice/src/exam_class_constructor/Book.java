package exam_class_constructor;

public class Book {
    private String title; //접근제한자: 디폴트(같은 패키지내 클래스는 직접 접근 가능
    private String author;

    public Book(){
        this("", "");
        //각 필드의 값을 null이 아닌 ""빈문자로 초기화
    }

    public Book(String title){ //생성자
        this(title, "작자 미상");
        //생성자가 다른 생성자를 호출할 때 사용
        System.out.print("매개변수가 하나인 생성자\n");
    }

    public Book(String title, String author){ //생성자
        this.title= title;
        this.author= author;
        System.out.print("매개변수가 두개인 생성자\n");
    }

    public String toString(){
        return "책 제목: " + title + " 책 저자: " + author;
    }
}
