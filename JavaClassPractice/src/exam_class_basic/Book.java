package exam_class_basic;
//책 클래스 선언

public class Book {
    //필드 정의
    public String bookNumber; //책 번호
    public String bookName; //책 이름
    public String bookPublisher; //출판사명
    public int bookPrice; //책 가격

    //메소드 정의- 필드값 설정해 주기 위한 메서드
    public void bookData(String number, String name, String pub, int price){
        bookNumber= number;
        bookName= name;
        bookPublisher= pub;
        bookPrice= price;
    }

    // 메서드 정의- 필드값을 출력하기 위한 메서드
    public String toString(){
        return String.format("책번호: %s\n책이름: %s\n출판사명: %s\n책가격: %d", bookNumber, bookName,
                bookPublisher, bookPrice);
    }
}
