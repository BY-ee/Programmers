/** 2024-06-18 14:30
 *  문자열 곱하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */


package programmers.june.june18;

public class Multiply {
    public String solution(String my_string, int k) {  // 문자열과 문자열을 반복할 횟수 k를 입력
        String answer = my_string.repeat(k);           // my_string 문자열을 k번 반복한 결과를 answer 변수에 대입
        return answer;                                 // answer 변수 반환
    }
    public static void main(String[] args) {
        Multiply m1 = new Multiply();
        System.out.println(m1.solution("abkeq", 5));    
    }
    
}
