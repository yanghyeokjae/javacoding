package exam_array;

/*
다음의 정수 중 12,26, 68, 98, 76, 54,8, 6, 4
가장 큰 값(최대값), 가장 작은 값(최소값)을 출력해 주세요
[출력결과]
최대값: 00, 최소값: 00
 */

public class MaxMinExample {
    static void main(String[] args){

        int[] su= {12, 26, 68, 98, 76, 54, 8, 6, 4};
        int max= su[0];
        int min= su[0];

        for(int i=1; i<su.length; i++){
            if(su[i]>max)
                max= su[i];
            if(su[i]<min)
                min= su[i];
        }
        System.out.printf("최대값: %d, 최소값: %d", max, min);
    }
}
