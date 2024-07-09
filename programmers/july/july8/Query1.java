/** 2024-07-08 18:10
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 수열과 구간 쿼리 1
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181883
 */


package programmers.july.july8;

public class Query1 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {      // queries의 길이만큼 반복
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {  // queries의 [i][0] 인덱스부터 [i][1] 인덱스까지 반복
                arr[j]++;  // arr의 j 인덱스에 +1
            }
        }
        
        return arr;  // arr 반환
    }
}