/** 2024-07-15 11:10
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181872
 */


package programmers.july.july15;

public class FindTheLongestString {
    public String solution(String myString, String pat) {
          // 특정 문자열 pat의 마지막 인덱스를 찾음
        int idx = myString.lastIndexOf(pat) + pat.length();
          // pat이 포함된 가장 긴 문자열을 반환
        return myString.substring(0, idx);
    }
}
