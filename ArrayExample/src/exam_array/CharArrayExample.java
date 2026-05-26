package exam_array;

// 대문자와 소문자 전체를 출력하도록 코딩해 주세요

public class CharArrayExample {
    static void main(String[] args) {

        char[] alphabet = new char[26];

        //배열 채우기
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        //대문자 출력
        System.out.println("대문자 출력");
        for (char c : alphabet) {
            System.out.printf("%-2c", c);
        }
        System.out.println();

        //소문자 출력: 표준 API활용 또는 형변환 일관성 유지
        System.out.println("소문자 출력");
        //연산을 통한 출력
        for (char c : alphabet) {
            // System.out.printf("%-2c",(char) (c+32));

            //표준 메서드 사용(의도가 명확함)
            System.out.printf("%-2c", Character.toLowerCase(c));
        }
    }
}