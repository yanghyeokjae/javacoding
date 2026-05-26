package exam_interface;

public class TelevisionTest {
    public static void main(String[] args){
        // RemoteControl rc= new RemoteControl(); // 결과 X
        // 인터페이스 참조변수= new 생성자() -> X

        Television tv= new Television();
        tv.turnOn();
        tv.setVolume(30);
        System.out.println(tv.toString());
        tv.setMute(true);
        tv.setMute(false);
        tv.turnOff();
        RemoteControl.changeBattery();
        System.out.println();

        // Radio 클래스의 인스턴스 생성
        Radio radio= new Radio("표준FM (MHz)", 95.9);
        radio.turnOn();
        radio.setVolume(20);
        System.out.println(radio.toString());
        radio.printRF();
        radio.turnOff();
        System.out.println();

        //SmartTelevision 클래스의 인스턴스 생성
        SmartTelevision smart= new SmartTelevision();
        smart.turnOn();
        smart.setVolume(25);
        System.out.println(smart.toString());
        smart.search("http://www.naver.com(네이버)");
        smart.turnOff();
        System.out.println();

        System.out.println("===== 다양성에 의해 데이터 출력 =====");
        RemoteControl rc= new Television();
        rc.turnOn();
        ((Television)rc).printChannel();
        rc.turnOff();
    }
}
