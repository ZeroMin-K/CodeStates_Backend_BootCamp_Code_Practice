package section2.unitCodingTest;

import java.util.*;

public class Q02Greedy {
    public static void main(String[] args) {
        // 5000원 입력 =>  500원짜리 동전 10개 반환
        int output1 = partTimeJob(5000);
        System.out.println(output1); // 10

        // 6532원을 받았을 때 500원짜리 동전 13개, 100원짜리 동전 0개, 50원짜리 동전 0개, 10원짜리 동전 3개, 1원짜리 동전 2개, 총 18개 반환
        int output2 = partTimeJob(6532);
        System.out.println(output2); //  18
    }
    public static int partTimeJob(int k) {
        // 동전의 개수
        // 가장 큰거부터 거슬러 주기
        // 거슬러주고 남은돈으로 동전들 나눠주기

        // 동전 개수
        int count = 0;
        // 거슬러 주고 남은 돈
        int rest = k;
        // 현재 돈에서 지금 동전으로 거슬러준 동전 개수
        int coin = 0;

        int[] coinTypes = {500, 100, 50, 10, 5, 1};

        for(int coinType : coinTypes) {

            if (rest == 0) {
                break;
            }

            System.out.println("현재 동전: " + coinType);

            // 현재돈 임시 저장
            int current = rest;

            // 현재 남은 돈에서 동전 거슬러주기
            rest = rest % coinType;

            // 현재 동전에서 동전 몇개로 거슬러줬는지
            coin = (current - rest) / coinType;

            // 동전개수 증가
            count += coin;

            System.out.println(coin + "개로 거슬러줌");
            System.out.println("남은돈"+ rest);
            System.out.println("동전 총" + count + "사용함");
        }

        return count;
    }
}
