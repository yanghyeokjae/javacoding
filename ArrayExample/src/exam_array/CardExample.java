package exam_array;

/*
    * 칸드를 랜덤하게 선택하여 화면에 출력하는 코드 작성
    * { "Clubs", "Diamonds", "Hearts", "Spades" }
    * { "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace" }
    * 실행 결과: Hearts와 Jack
 */

public class CardExample {
    static void main(String[] args){
        String[] card1= {"Clubs", "Diamonds", "hearts", "Spades"};
        String[] card2= {"2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace"};

        int i= (int)(Math.random()*card1.length); //card1 배열의 인덱스
        int j= (int)(Math.random()*card2.length); //card2 배열의 인덱스

        System.out.println(card1[i] + "와 " + card2[j]);
    }
}
