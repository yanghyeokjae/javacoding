package exam_class_basic;
// 반려동물 실행 클래스 선언

public class PetTest {
    static void main(String[] args){
        Pet myDog= new Pet();
        myDog.initPet("초코", "강아지", 1);
        System.out.println(myDog.toString());

        Pet myCat= new Pet();
        myCat.initPet("나비", "고양이", 2);
        System.out.println(myCat.toString());
    }
}
