/** 2024-06-21 22:15
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 이어 붙인 수
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181928
 */


package programmers.june.june21;

public class JoinOddEven {
    public int solution(int[] num_list) {
        String num_oddstr = "";    // 홀수 문자열 변수 선언
        String num_evenstr = "";   // 짝수 문자열 변수 선언

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {                        // num_list의 i 인덱스의 데이터가 짝수라면
                num_evenstr += Integer.toString(num_list[i]);  // 짝수 문자열에 num_list의 i 인덱스 정수를 문자열로 바꿔서 더한 후 그 값을 변수에 대입
            } else {                                           // 홀수라면
                num_oddstr += Integer.toString(num_list[i]);   // 홀수 문자열에 num_list의 i 인덱스 정수를 문자열로 바꿔서 더한 후 그 값을 변수에 대입
            }
        }

        return Integer.parseInt(num_evenstr, 10) + Integer.parseInt(num_oddstr, 10);
        // 짝수 문자열과 홀수 문자열을 정수로 바꿔서 더한 값을 반환
    }

    public static void main(String[] args) {
        JoinOddEven j1 = new JoinOddEven();
        int[] a = {3, 4, 5, 2, 1};
        j1.solution(a);
    }
}
