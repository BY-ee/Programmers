/** 2024-07-03 19:10
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 세로 읽기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181904
 */


package programmers.july.july3;

public class ReadVertical {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();   // StringBuilder 인스턴스 생성

        for(int i = c; i <= my_string.length(); i += m) {   // i가 c부터 my_string의 길이까지 m 간격으로 더해짐
            sb.append(my_string.charAt(i - 1));               // my_string의 c번째 글자를 sb에 대입
        }

        return sb.toString();  // sb를 String으로 변환 후 반환
    }
}
