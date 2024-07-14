/** 2024-07-15 00:05
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > A 강조하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181874
 */

/**
 *  for문으로 문자를 하나하나 확인할 필요 없이
 *  먼저 전부 소문자로 만들고 a만 A로 바꾸면 간단하게 해결
 */

package programmers.july.july14;

public class MakeAtoUpper {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();

          // for문으로 myString을 문자 단위로 검사 후 변환해서 sb에 대입
        for(int i = 0; i < myString.length(); i++) {
            char temp = myString.charAt(i);

            sb.append(temp == 'a' || temp == 'A' ? 'A' : Character.toLowerCase(temp));
        }

        return sb.toString();  // sb를 String으로 변환 후 반환
    }
}
