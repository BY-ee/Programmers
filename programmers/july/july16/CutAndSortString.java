/** 2024-07-16 09:50
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열 잘라서 정렬하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181866
 */

package programmers.july.july16;
import java.util.Arrays;

public class CutAndSortString {
    public String[] solution(String myString) {
          // 문자열을 x로 구분한 후 오름차순 정렬해서 반환
        return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
    }
}
