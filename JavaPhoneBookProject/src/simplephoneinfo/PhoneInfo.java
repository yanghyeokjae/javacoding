package simplephoneinfo;

public class PhoneInfo {
    private String name;
    private String phoneNumber;
    private String birthDay;

    public PhoneInfo(){}

    public PhoneInfo(String name, String phoneNumber,String birthDay){
        this.name= name;
        this.phoneNumber= phoneNumber;
        this.birthDay= birthDay;
    }

    public PhoneInfo(String name, String phoneNumber){
        this(name, phoneNumber, null);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber= phoneNumber;
    }

    public String getBirthDay(){
        return birthDay;
    }
    public void setBirthDay(String birthDay){
        this.birthDay= birthDay;
    }

    public void showPhoneInfo() {
        System.out.printf("name: %s\n", name);
        System.out.printf("phone: %s\n", phoneNumber);

        if(birthDay != null){
            System.out.printf("birth: %s", birthDay);
        }
        System.out.println();

    }
}
