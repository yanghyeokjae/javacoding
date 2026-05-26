package esam_switch;

public class SwitchExample1 {
    static void main(String[] args) {
        String medal = "silver";

        String message = switch (medal) {
            case "Gold" -> "금메달입니다";
            case "silver" -> "은메달입니다";
            case "bronze" -> "동메달입니다";
            default -> "메달이 없습니다";
        };
        System.out.println(message);
    }
}
