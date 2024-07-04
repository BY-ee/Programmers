/** 2024-07-03 18:50
 *  문자열 뒤집기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181905
 */

/**
 *  1. StringBuilder 인스턴스 생성할 때 생성자에 문자열 입력 가능
 *  2. StringBuilder.reverse()
 */

package programmers.july.july3;

public class FlipString {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();  // StringBuilder 인스턴스 생성

        sb.append(my_string.substring(0, s));   // my_string의 0 인덱스부터 s 인덱스까지의 문자열을 sb에 대입
        for(int i = e; i >= s; i--) {           // e부터 s까지 1씩 빼면서 반복
            sb.append(my_string.charAt(i));
                // my_string의 i 인덱스의 문자를 sb에 대입 (인덱스 s부터 인덱스 e까지 뒤집는 과정)
        }
        sb.append(my_string.substring(e + 1));  // my_string의 e + 1 인덱스부터 끝까지의 문자열을 sb에 대입

        return sb.toString();  // sb를 String으로 변환한 후 반환
    }
}
