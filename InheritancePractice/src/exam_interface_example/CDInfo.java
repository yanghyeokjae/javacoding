package exam_interface_example;

public class CDInfo {
    private String registerNo;
    private String title;

    public CDInfo(String registerNo, String title){
        this.registerNo= registerNo;
        this.title= title;
    }

    @Override
    public String toString(){
        return "관리번호 : " + registerNo + "\n타이틀" + title;
    }
}
