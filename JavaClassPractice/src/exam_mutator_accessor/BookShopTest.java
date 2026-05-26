package exam_mutator_accessor;

public class BookShopTest {
    static void main(String[] args){
        BookShop newBook1= new BookShop();

        System.out.println("<값 대입>");
        newBook1.bookShopData("반짝이는 안녕", "황영미", 13500);

        System.out.println("책이름: " + newBook1.getTitle());
        System.out.println("저자: " + newBook1.getAuthor());
        System.out.println("책가격: " + newBook1.getPrice());

        System.out.println("\n<값 변경 후 출력>");
        newBook1.setTitle("버드나무에 부는 바람");
        newBook1.setAuthor("케네스 그레이엄");
        newBook1.setPrice(17820);
        System.out.println(newBook1.toString());
    }
}
