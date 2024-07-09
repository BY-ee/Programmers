/** 2024-06-23 01:20
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 수열과 구간 쿼리 3
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181924
 */


package programmers.june.june22;

import java.util.Arrays;



public class Query3 {
    public int[] solution(int[] arr, int[][] queries) {
        //   for (int[] query : queries) {  // query를 for - each로 하나씩 대입

        for(int i = 0; i < queries.length; i++) { // queries의 길이만큼 반복
            int que0 = queries[i][0];               // queries의 [i][0]의 데이터를 que0에 대입
            int que1 = queries[i][1];               // queries의 [i][1]의 데이터를 que1에 대입

            int temp = arr[que0];                   // arr 배열의 que0 인덱스의 데이터를 temp에 임시로 저장
            arr[que0] = arr[que1];                  // arr 배열의 que1 인덱스의 데이터를 arr 배열의 que0 인덱스에 대입
            arr[que1] = temp;                       // temp를 arr 배열의 que1 인덱스에 대입
        }
        return arr;  // arr 배열을 반환
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4};
        int[][] aa = {{0, 3}, {1, 2}, {1, 4}};
        Query3 q1 = new Query3();
        Arrays.toString(q1.solution(a, aa));
    }
}
