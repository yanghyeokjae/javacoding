package exam_class;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(){}

    public Dog(String name, int age){
        this(name, "", age);
    }

    public Dog(String name, String breed, int age){
        this.name= name;
        this.breed= breed;
        this.age= age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }

    public String getBreed(){
        return breed;
    }
    public void setBreed(){
        this.breed= breed;
    }

    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age= age;
    }

    public String toString(){
        return ("강아지 이름: " + name + "\n강아지 종류: " + breed + "\n강아지 나이: " + age);
    }
}
