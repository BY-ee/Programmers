/** 2024-07-15 00:25
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 특정한 문자를 대문자로 바꾸기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181873
 */

package programmers.july.july14;

public class MakeSpecificWordtoUpper {
    public String solution(String my_string, String alp) {
          // my_string에서 문자열 alp의 값을 찾으면 대문자로 변환
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
}
