/** 2024-07-09 17:30
 *  코딩테스트 연습 > 2017 팁스타운 > 예상 대진표
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12985
 */

/**
 *  return Integer.toBinaryString((a-1)^(b-1)).length();
 *  이진법 xor로 풀이
 *  
 *   + 정수는 나눗셈하면 소수점이 떨어지는 걸 이용하면 더 좋았을듯
 */

package programmers.july.july9;

public class AnticipateRound {
    public int solution(int n, int a, int b) {
        int answer = 1;  // 경기 라운드 수 초기화 (처음 대결하면 1라운드이므로 1)

        while (!((a - b == 1 || a - b == -1) && Math.max(a, b) % 2 == 0)) {
              // a - b가 1이거나 -1이고 (번호가 붙어있음) && 둘중 큰 번호를 2로 나눈 나머지가 0일 때까지 반복
            a = a % 2 == 0 ? a / 2 : (a + 1) / 2;
            b = b % 2 == 0 ? b / 2 : (b + 1) / 2;
              // a, b를 2로 나눈 나머지가 0이면 (a, b) / 2 값을, 아니면 (a, b) + 1의 값에 (a, b) / 2 값을 대입
            answer++;
              // answer에 + 1
        }

        return answer;  // answer 반환
    }
}
