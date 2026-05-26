package exam_class_basic;
//주소록 클래스 선언

/*
    *  주소록을 나타내는 Address 클래스를 만든다
    *  주소록에는 이름(name), 주소(address), 전화번호(phone)을 필드로 가진다
    *  정보를 입력받아 화면에 전체 필드의 내용이 출력되도록 작성한다
 */

public class Address {
    public String name;
    public String address;
    public String phone;

    public void addressData(String n, String addr, String p){
        name= n;
        address= addr;
        phone= p;
    }

    public void printData(){
        System.out.printf("%s %-20s %s\n", name, address, phone);
    }

    public String toString() {
        return String.format("%s %-20s %s\n", name, address, phone);
    }
}
