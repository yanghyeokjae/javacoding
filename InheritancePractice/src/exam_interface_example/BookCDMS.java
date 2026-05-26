package exam_interface_example;

public class BookCDMS {
    public static void main(String args[]){
        SeparateVolume book= new SeparateVolume("863774", "엄마를 부탁해", "신경숙");

        System.out.println("=== 도서 대출 ===");
        book.checkOut("홍길동", "2026-05-19");
        System.out.println(book);
        System.out.println();

        System.out.println("=== 반납 처리 ===");
        book.checkIn();

    }
}
