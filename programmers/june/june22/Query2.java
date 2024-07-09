/** 2024-06-23 03:20
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 수열과 구간 쿼리 2
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181923
 */


package programmers.june.june22;
import java.util.Arrays;

public class Query2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];   // queries 길이의 answer 정수 배열 선언
        Arrays.fill(answer, Integer.MAX_VALUE);   // answer에 int의 최대값을 채움
        int idx = 0;                                // answer의 인덱스 값 초기화

        for (int[] query : queries) {             // queries의 배열을 순서대로 query에 대입
            for (int i = query[0]; i <= query[1]; i++) {   // query[1] - query[0] + 1번 반복
                if (arr[i] > query[2]) {
                    // arr의 i 인덱스 데이터가 query[2]보다 크다면
                    answer[idx] = answer[idx] == Integer.MAX_VALUE ? arr[i] : Math.min(arr[i], answer[idx]);
                    // answer의 idx 인덱스 데이터가 int의 최대값이라면 arr의 i 인덱스 데이터 대입,
                    // 아니라면 arr의 i 인덱스 데이터와 answer의 idx 인덱스 데이터 중 작은 값을 answer의 idx 인덱스에 대입
                }
            }
            answer[idx] = answer[idx] == Integer.MAX_VALUE ? -1 : answer[idx];
             // answer에 값을 넣는 반복이 끝난 후 answer의 idx 인덱스 값이 int의 최대값이라면 -1, 아니라면 자기 자신을 대입
            idx++;  // answer의 인덱스 값에 +1
        }
        return answer; // answer 반환
    }
    public static void main(String[] args) {
        Query2 q1 = new Query2();
        int[] a = {0, 1, 2, 4, 3};
        int[][] aa = {{1, 4, 2}, {0, 3, 3}, {0, 2, 2}};
        q1.solution(a, aa);
    }
}
