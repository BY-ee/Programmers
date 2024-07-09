/** 2024-06-21 17:15
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 코드 처리하기 (입력된 문자열을 규칙에 따라 처리)
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181932
 */


package programmers.june.june21;

public class HandleCode {
    public String solution(String code) {
        String ret = "";     // 반환할 문자열을 초기화
        int mode = 0;        // mode는 문자 '1'이 읽어질 때마다 1, 0으로 바뀜 (인덱스의 홀짝을 구분하는 역할)

        for (int i = 0; i < code.length(); i++) {   // 입력된 문자열 code의 길이만큼 반복
            if (code.charAt(i) == '1') {                // code의 i 인덱스의 문자가 '1'이라면
                mode = mode % 2 == 0 ? 1 : 0;           // mode가 0이면 1로, 1이면 0으로 바꿈
            } else {                                    // 문자가 '1'이 아니라면
                if (i % 2 == mode) {                    // 인덱스를 2로 나눈 값이 mode라면 (mode가 0일시 인덱스가 짝수라면, 1일시 인덱스가 홀수라면)
                    ret += code.charAt(i);              // code의 i 인덱스의 문자를 ret 문자열에서 더한 값을 ret에 대입
                }
            }
        }
        return ret.equals("") ? "EMPTY" : ret;  // ret 문자열이 비어있다면 EMPTY 반환, 비어있지 않다면 ret 반환
    }

    public static void main(String[] args) {
        HandleCode h1 = new HandleCode();
        System.out.println(h1.solution(""));
    }
}
