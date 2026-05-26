package exam_inner_interface;

// 내부클래스(중첩 클래스)
public class Button {
    private OnClickListener listener; //private 생략 가능

    void setOnClickListener(OnClickListener listener){
        this.listener= listener;
    }
    void touch(){
        listener.onClick();
    }

    interface OnClickListener{
        void onClick(); //추상 메서드 선언
    }
}
