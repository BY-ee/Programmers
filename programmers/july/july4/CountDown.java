/** 2024-07-04 15:50
 *  카운트 다운
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181899
 */

/**
 *  return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
 *  음수를 이용
 */

package programmers.july.july4;

public class CountDown {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];   // start_num에서 end_num까지 1씩 감소하는 정수를 넣는 배열 선언
        int idx = 0;

        for(int i = start_num; i >= end_num; i--) {  // start_num - end_num의 길이만큼 반복
            answer[idx++] = i;                         // answer의 idx에 i 대입
        }

        return answer;   // answer 반환
    }
}
