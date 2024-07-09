/** 2024-07-05 18:50
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > n 번째 원소부터
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181892
 */


package programmers.july.july5;
import java.util.Arrays;

public class FromNElement {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
          // num_list의 n 번째 원소부터 (n - 1 인덱스부터) 끝까지 남긴 정수 배열을 반환
    }
}