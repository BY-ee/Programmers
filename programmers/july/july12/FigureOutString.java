/** 2024-07-12 19:45
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 원하는 문자열 찾기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181878
 */

/**
 *  contains 대신 indexOf를 써도 괜찮을 것 같음
 *  myString.indexOf(pat) == -1 ? 0 : 1
 */
package programmers.july.july12;

public class FigureOutString {
    public int solution(String myString, String pat) {
          // 문자열 pat이 문자열 myString에 포함되어 있으면 1, 아니면 0 반환
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
