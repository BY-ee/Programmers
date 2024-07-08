/** 2024-07-08 18:20
 *  조건에 맞게 수열 반환하기 3
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181835
 */


package programmers.july.july8;

public class ChangeArray3 {
    public int[] solution(int[] arr, int k) {
        for(int i = 0; i < arr.length; i++) {   // arr의 길이만큼 반복
            arr[i] = k % 2 == 0 ? arr[i] + k : arr[i] * k;
              // k가 짝수라면 arr의 i 인덱스에 k를 더하고, k가 홀수라면 arr의 i 인덱스에 k를 곱함
        }

        return arr;   // arr 반환
    }
}
