/** 2024-07-08 14:55
 *  n 번째 원소까지
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181889
 */


package programmers.july.july8;
import java.util.Arrays;

public class ToElementN {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
          // num_list의 처음부터 n 번째 원소까지의 정수 배열을 반환
    }
}
