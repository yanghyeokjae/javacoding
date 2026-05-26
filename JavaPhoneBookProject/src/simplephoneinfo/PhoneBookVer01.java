package simplephoneinfo;

public class PhoneBookVer01 {
    public static void main(String[] args){
        PhoneInfo num1= new PhoneInfo("임미경", "010-2345-6573","1965.03.28");
        PhoneInfo num2= new PhoneInfo("김현수","010-6435-1249");

        num1.showPhoneInfo();
        num2.showPhoneInfo();
    }
}
