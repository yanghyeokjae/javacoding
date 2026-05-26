package exam_class_array;

import java.util.Scanner;

public class BookObjectArray {
    public static void main(String[] args){
        Book[] book= new Book[2];

        //입력 처리
        Scanner scanner= new Scanner(System.in);
        for(int i=0; i<book.length; i++){ // book.length= 2
            System.out.print("제목>>");
            String title= scanner.nextLine();
            System.out.print("저자>>");
            String author= scanner.nextLine();

            book[i]= new Book(title, author); //배열 원소 객체 생성
        }

        // 출력 처리
        for(int i=0; i<book.length; i++){
            System.out.println(book[i].toString());
        }

        for(Book bookData: book){
            System.out.println(bookData.toString());
        }

        scanner.close();
    }
}
