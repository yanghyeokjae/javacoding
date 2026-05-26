package exam_class_basic;
//반려동물 정보 클래스 선언

public class Pet {
    public String nickname;
    public String species;
    public int age;

    public void initPet(String n, String s, int a){
        nickname= n;
        species= s;
        age= a;
    }

    public String toString(){
        return "우리집 " + species + " " + nickname + "는 " + age + "살입니다.";
    }
}
