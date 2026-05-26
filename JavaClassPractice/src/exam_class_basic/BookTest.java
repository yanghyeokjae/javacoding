package exam_class_basic;
//책 클래스 실행

public class BookTest {
    static void main(String[] args){
        Book book1= new Book();
        book1.bookNumber= "S000000781116";
        book1.bookName= "작별하지 않는다";
        book1.bookPublisher= "문학동네";
        book1.bookPrice= 16800;

        //필드에 직접 접근하여 출력
        String printData= """
                책번호: %s
                책이름: %s
                출판사명: %s
                책가격: %d
                """.formatted(book1.bookNumber, book1.bookName, book1.bookPublisher, book1.bookPrice);
        System.out.println(printData);
        System.out.println();

        Book book2= new Book();
        book2.bookData("S000000610612","소년이 온다","창비",15000);
        System.out.println(book2.toString());
    }
}
