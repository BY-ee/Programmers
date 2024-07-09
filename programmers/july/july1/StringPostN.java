/** 2024-07-01 23:25
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열의 뒤의 n글자
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181910
 */


package programmers.july.july1;
public class StringPostN {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
          // my_string의 문자열을 my_string의 길이 - n의 인덱스부터 끝까지 추출한 후 반환
    }
    public static void main(String[] args) {
        StringPostN s1 = new StringPostN();
        System.out.println(s1.solution("asdaavvaa", 5));
    }
}
