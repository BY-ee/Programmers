/** 2024-07-15 11:40
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열이 몇 번 등장하는지 세기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181871
 */


package programmers.july.july15;

public class CountSpecificString {
    public int solution(String myString, String pat) {
        int idx = 0;
        int answer = 0;

          // myString에 문자열 pat이 포함되어 있는지 확인
        while (idx + pat.length() <= myString.length()) {
            if (myString.substring(idx, idx + pat.length()).equals(pat)) {
                answer++;
            }
            idx++;
        }

          // answer 반환
        return answer;
    }
}
