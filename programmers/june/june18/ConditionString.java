/** 2024-06-18 18:05
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 조건 문자열 (조건 연산자를 입력하고 그 연산자에 따라 정수를 비교)
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181934
 */


package programmers.june.june18;

public class ConditionString {
    public int solution(String ineq, String eq, int n, int m) {
        /*              "<" or ">",  "!" or "=", 비교할 정수   */
        boolean result = false;
        /* 비교 결과를 대입할 변수 선언 (비교 연산자를 대입하지 않는 경우를 대비해 기본값을 false로 설정) */

        if(ineq.equals("<") && eq.equals("=")) {        // ineq의 입력값이 <이고 eq의 입력값이 =라면
            result = n <= m;                                              // n <= m의 결과를 result 변수에 대입
        } else if(ineq.equals("<") && eq.equals("!")) { // ineq의 입력값이 <이고 eq의 입력값이 !라면
            result = n < m;                                               // n < m의 결과를 result 변수에 대입
        } else if(ineq.equals(">") && eq.equals("=")) { // (이하 동일)
            result = n >= m;
        } else if(ineq.equals(">") && eq.equals("!")) {
            result = n > m;
        }
        return result == true ? 1 : 0;   // result가 true라면 (비교 결과가 true라면) 1 반환, 아니라면 0 반환
    }

    public static void main(String[] args) {
        ConditionString c1 = new ConditionString();
        System.out.println(c1.solution("<", "", 10, 5));
    }
}
