package section2.unitCodingTest;

public class BruteForceAlgorithm {
    // 순차 검색
    public boolean sequentialSearch(int[] arr, int k) {
        // 검색 키 k사용, 순차검색 구현
        // 입력: n개 요소 갖는 배열 A, 검색키 K
        // 출력: k값과 같은 요소 인덱스 또는 요소 있을 때 true, 없을때  false

        int n = arr.length;         // 현재 배열 개수
        // 결과를 저장할 booealn result 선언. 초기값 false
        boolean result = false;

        for(int i =0; i < n; i++) {
            if(arr[i] == k){
                result = true;
            }
        }
        // 배열 순회도중 값이 발견되도 배열 모두 순회후 결과 리턴
        return result;
    }

    // 문자열 매칭 알고리즘
    public boolean bruteForceStringMatch(int[] arr, int[] patternArr) {
        // Brute Force 문자열 매칭 구현
        // 입력: n개 문자 텍스트 배열 arr, m개 문자 패턴 나타내는 배열 patternArr
        // 출력: 일치하는 문자열 있으면 첫번째 인덱스 반환. 검색 실패시 -1 반환

        int n = arr.length;
        int m = patternArr.length;

        // 전체 요소 개수에서 패턴 개수 뺀만큼 반복. 그수가 마지막 비교요소
        // i 반복문: 패턴과 비교 위치 잡는반복문
        for(int i = 0; i < n -m ; i++) {
            // j - 전체와 패턴의 요소 비교하는 반복문
            int j = 0;
            // j가 패턴의 개수보다 커지면 안됨 => 개수만큼 반복
            // 패턴에서 j인덱스와 전체에서는 i + j 인덱스 값이 같은지 판단
            while ( j < m && patternArr[j] == arr[i + j]) {
                // 같을 때 j 증가
                j++;
            }
            // j와 패턴 수가 값다 => 패턴의 문자열과 완전히 같은 부분 존재
            if (j == m) {
                // 비교했던 위치 반환
                return true;
            }
        }
        return false;
    }

    // 선택 정렬 - 오름차순 정렬
    public int[] selectionSort(int[] arr) {
        // 입력: 정렬 가능한 요소 배열 arr
        // 출력: 오름차순으로 정렬된 배열

        // 배열 0번째 인덱스부터 마지막 인덱스까지 반복
        for (int i =0 ; i < arr.length -1; i++) {
            // 현재값 위치에 가장 작은 값 넣음
            // 현재 인덱스를 최소값의 인덱스를 나타내는 변수에 할당
            int min = i;

            // i+1을 j로 반복문 초기화. i이후의 배열 요소와 비교하는 반복문 구성
            for(int j = i + 1; j < arr.length; j++) {
                // j인덱스 배열 값이 현재 인덱스 배열갑보다 ㅈ가으면
                if(arr[j] < arr[min]) {
                    // j인덱스를 최소를 나타내는 인덱스로 할당
                    min = j;
                }
            }
            // 반복 종료 => 모든 비교가 끝남
            // min에는 최소값의 인덱스
            // i값과 최소값 바꿔서할당
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        // 모든 반복문이 끝나고 정렬된 배열 반환
        return arr;
    }
}
