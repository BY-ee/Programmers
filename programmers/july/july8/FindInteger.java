/** 2024-07-08 18:55
 *  정수 찾기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181840
 */


package programmers.july.july8;

public class FindInteger {
    public int solution(int[] num_list, int n) {
        int answer = 0;  // answer 변수 초기화

        for(int i : num_list) {  // num_list의 데이터를 하나씩 i에 대입
            if(i == n) {          // i가 n과 같다면
                answer = 1;       // answer에 1 대입
                break;
            }
        }

        return answer;  // answer 반환
    }
}
