package section2.unitCodingTest;

import java.util.*;

public class Q04DP {
    public static void main(String[] args) {

        long output = ocean(50, new int[]{10, 20, 50});
        System.out.println(output); // 4

        System.out.println("-------------------------------");
        long output2 = ocean(100, new int[]{10, 20, 50});
        System.out.println(output2); // 10

        System.out.println("-------------------------------");
        long output3 = ocean(30, new int[]{5, 6, 7});
        System.out.println(output3); // 4


    }

    public static long ocean(int target, int[] type) {
        // target: 훔치고 싶은 돈
        // type: 훔칠 수 있는 돈 타입
        // return - 훔칠 수 있는 방법 수 숫자로 반환

        // 훔칠 수 있는 경우의 수 적은 dp테이블 - target+1 길이 배열
        // 현재 돈 훔칠 수 있는 경우의 수 dp[n]
        // 현재 훔칠 수 있는 돈의 경우의수는 dp[n-coin[0]] + dp[n-coin[1]] ...+ dp[n - coin[k]]


        // 훔칠 수 있는 경우의 수 적은 dp테이블 - target+1 길이 배열
        long[] dp = new long[target + 1];

        dp[0] = 1;

        for(int coin: type) {
            for(int i = coin; i <= target; i++) {
                dp[i] += dp[i-coin];
            }
        }

        return dp[target];
    }

//    public static long ocean(int target, int[] type) {
//        // target: 훔치고 싶은 돈
//        // type: 훔칠 수 있는 돈 타입
//        // return - 훔칠 수 있는 방법 수 숫자로 반환
//
//        // 훔칠 수 있는 경우의 수 적은 dp테이블 - target+1 길이 배열
//        // 현재 돈 훔칠 수 있는 경우의 수 dp[k]
//        // 만약 훔칠 수 있는 돈의 타입 coin 더하면
//        // k+coin의 돈은 dp[k]에서 1의 경우의 수를 더한것.
//        // 현재 돈 dp[k]에서 돈 타입들을 더해서 dp[k+coin]의 경우의 수 늘리기
//
//
//        // 훔칠 수 있는 경우의 수 적은 dp테이블 - target+1 길이 배열
//        long[] dp = new long[target + 1];
//
//        // 동전 타입 정렬
//        Arrays.sort(type);
//
//        // 현재 넣을 수 있는 동전 개수 증가
//        for(int coin: type) {
//            dp[coin]++;
//        }
//
//        for (int i = 0; i <= target; i++) {
//            System.out.println("현재 돈: " + i );
//            for (int coin : type) {
//                System.out.println(">>>코인 타입: " + coin);
//                if ((i + coin) <= target) {
//                    dp[i + coin] = dp[i] + 1;
//                    System.out.println(">>>다음 돈 " + (i+coin) + "증가" + dp[i + coin]);
//                }
//            }
//        }
//
//
//        return dp[target];
//        // i = 0 부터 target까지 반복하면서
//        // 현재 돈 i
//        // 훔칠 수 있는 type을 순회하면서
//        // 현재돈 i + 와 훔칠 수 있는 coin을 합침
//        // 그돈이 taget 이하면
//        // dp[i+coin] 경우의 수 증가
//
//    }
}
