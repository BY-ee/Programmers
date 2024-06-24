/** 2024-06-25 01:40
 *  카운트 업
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181920
 */


package programmers.june.june24;
import java.util.ArrayList;

public class CountUp {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> al = new ArrayList<>();    // ArrayList 인스턴스 생성

        for(int i = start_num; i <= end_num; i++) {   // end_num - start_num + 1 회만큼 반복
            al.add(i);                                  // al에 i값을 추가
        }

        int[] answer = new int[al.size()];            // al의 길이를 가진 정수 배열 answer 선언
        for (int j = 0; j < al.size(); j++) {           // al의 길이만큼 반복
            answer[j] += al.get(j);                     // answer의 j 인덱스에 al의 j 인덱스 데이터 대입
        }

        return answer;    // answer 반환
    }
}
