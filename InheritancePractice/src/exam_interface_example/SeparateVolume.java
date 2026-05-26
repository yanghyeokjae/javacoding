package exam_interface_example;

public class SeparateVolume implements Lendable{
    private String requestNo;
    private String bookTitle;
    private String writer;
    private String borrower;
    private String checkOutDate;
    private int state;

    public SeparateVolume(String requestNo, String bookTitle, String writer){
        this.requestNo= requestNo;
        this.bookTitle= bookTitle;
        this.writer= writer;
    }

    @Override
    public void checkOut(String borrower, String checkOutDate){
        if(state != 0){
            System.out.println(bookTitle + "은(는) 현재 대출 중입니다.\n");
            return;
        }
        this.borrower= borrower;
        this.checkOutDate= checkOutDate;
        this.state= 1; //대출 상태
        System.out.println(bookTitle + "(" + writer + ") 이(가) 대출되었습니다.");
        System.out.println("대출인 : " + this.borrower);
        System.out.println("대출일 : " + this.checkOutDate + "\n");
    }
    @Override
    public void checkIn(){
        if(state == 0){
            System.out.println("이미 반납 처리가 완료되었습니다.");
            return;
        }
        this.borrower= null;
        this.checkOutDate= null;
        this.state= 0; //반납 상태
        System.out.println(bookTitle + " 이(가) 반납되었습니다.\n");
    }

    @Override
    public String toString(){
        return "청구번호 = " + requestNo +
                ", 도서명 = " + bookTitle +
                ", 저자 = " + writer +
                ", 대출인 = " + borrower +
                ", 대출일 = " + checkOutDate +
                ", 상태 = " + (state == 1 ? "대출 중" : "대출 가능");
    }

    public String getRequestNo(){
        return requestNo;
    }
    public void setRequestNo(String requestNo){
        this.requestNo= requestNo;
    }
    public String getBookTitle(){
        return bookTitle;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle= bookTitle;
    }
    public String getWriter(){
        return writer;
    }
    public void setWriter(String writer){
        this.writer= writer;
    }
    // borrower와 checkOutDate는 읽어오기만 할 것(설정자 필요 없음. 오버라이딩에서 이미 끝남.)
    public String getBorrower(){
        return borrower;
    }
    public String getCheckOutDate(){
        return checkOutDate;
    }
}
