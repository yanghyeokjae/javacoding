package exam_int;

import java.util.Scanner;

/*
    [요구사항]
    상품 가격과 구매 수량을 입력받아 총 금액을 계산하여 출력하시오
    단, 배송비 3000원을 추가한 최종 결제 금액도 출력하시오
 */

public class ProductPriceExample {
    static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int price, num, total, bae=3000;

        System.out.print("상품 가격을 입력하세요: ");
        price= input.nextInt();
        System.out.print("구매 수량을 입력하세요: ");
        num= input.nextInt();

        total= price*num;

        System.out.printf("상품 가격: %d원\n", price);
        System.out.printf("구매 수량: %d개\n", num);
        System.out.printf("상품 총 금액: %d원\n", total);
        System.out.printf("배송비: %d원\n", bae);
        System.out.printf("최종 결제 금액: %d원", (total+bae));

    }
}
