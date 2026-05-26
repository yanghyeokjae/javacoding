package exam_interface;

public interface RemoteControl {
    //상수
    public static final int MAX_VOLUME= 32;
    int MIN_VOLUME= 0;
    // interface에서는 상수만 사용하기 때문에 public static final은 안 써도 됨

    //추상 메서드
    public abstract void turnOn();
    void turnOff();
    void setVolume(int volume);
    // 위와 마찬가지로 추상 메서드만 사용하기 때문에 public abstract 안 써도 됨

    //디폴트 메서드
    public default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    //정적 메서드
    public static void changeBattery(){
        System.out.println("건전지를 교환합니다.");
    }
}
