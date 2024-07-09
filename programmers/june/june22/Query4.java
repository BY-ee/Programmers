/** 2024-06-23 03:50
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 수열과 구간 쿼리 4
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181922
 */


package programmers.june.june22;

public class Query4 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {  // queries의 배열을 하나씩 query에 넣음
            int s = query[0];   // 정수 변수 s, e, k는 각각 query의 0, 1, 2 인덱스의 데이터
            int e = query[1];
            int k = query[2];

            for (int i = s; i <= e; i++) {  // i가 s부터 e가 될 때까지 1씩 더하며 반복
                arr[i] = i % k == 0 ? arr[i] + 1 : arr[i];   // i가 k의 배수라면 arr의 i 인덱스에서 1을 더한 값을, 아니라면 자기자신 대입
            }
        }
        return arr; // arr 반환
    }
}
