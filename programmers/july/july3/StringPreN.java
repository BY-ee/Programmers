/** 2024-07-03 18:35
 *  문자열의 앞의 n글자
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181907
 */


package programmers.july.july3;

public class StringPreN {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);   // 문자열의 0 인덱스부터 n 인덱스의 글자까지를 반환
    }
}
