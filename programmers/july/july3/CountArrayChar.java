/** 2024-07-03 20:15
 *  문자 개수 세기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181902
 */

/**
 *  A의 아스키코드: 65
 *  Z의 아스키코드: 90
 *  a의 아스키코드: 97
 *  z의 아스키코드: 122
 */

package programmers.july.july3;

public class CountArrayChar {
    public int[] solution(String my_string) {
        int[] answer = new int[52];   // 각 문자열마다 순서대로 값을 가지는 정수 배열 선언

        for (char c : my_string.toCharArray()) {  // my_string을 문자 배열로 변환 후 각각 문자 변수 c에 대입
            if(c > 90) {    // c가 90보다 크다면 (소문자라면)
                answer[c - 71]++;
                   // answer의 c - 71 인덱스의 값을 1 상승 (Z와 a 사이의 아스키코드 간격(97 - 91)은 6)
            } else {        // 아니라면
                answer[c - 65]++;
                   // answer의 c - 65 인덱스의 값을 1 상승 (A의 아스키코드: 65)
            }
        }

        return answer;  // 정수 배열을 반환
    }
}
