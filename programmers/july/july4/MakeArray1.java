/** 2024-07-04 14:15
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 배열 만들기 1
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181901
 */


package programmers.july.july4;

public class MakeArray1 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];  // n 이하의 k의 배수의 개수만큼 길이를 지정한 정수 배열 선언
        int idx = 0;   

        for(int i = k; i <= n; i += k) {  // n 이하의 k의 배수 개수만큼 반복
            answer[idx++] = i;              // answer의 idx에 k의 배수 대입
        }

        return answer;   // answer 반환
    }
}
