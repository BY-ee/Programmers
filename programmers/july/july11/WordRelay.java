/** 2024-07-11 09:50
 *  코딩테스트 연습 > Summer/Winter Coding(~2018) > 영어 끝말잇기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12981
 */


package programmers.july.july11;
import java.util.HashSet;

public class WordRelay {
    public int[] solution(int n, String[] words) {
        HashSet<String> hs = new HashSet<> ();
        StringBuilder sb = new StringBuilder("a");  // StringBuilder의 초기 문자열을 a로 설정 (대체할 문자열 설정)
        int idx = 0;  // set의 원소 개수와 비교할 정수 변수 초기화

        for(String s : words) {       // words의 문자열을 하나씩 변수에 대입
            sb.replace(0, sb.length(), s);  // sb의 인덱스 0 문자열을 s로 대체 
            hs.add(s);  // Hashmap에 s를 추가
            idx++;      // idx를 + 1
            if(idx != hs.size() || s.startsWith(String.valueOf(sb.charAt(sb.length())))) {
                  // idx가 hs의 크기와 다르거나(중복 문자열), s의 시작 문자가 sb 문자열의 끝 문자와 다르면(끝말이 이어지지 않음)
                return new int[]{idx % n == 0 ? n : idx % n, (int) Math.ceil((double)idx / n)};
                  // 그 사람이 n명 중 몇 번째인지, 몇바퀴 째인지의 정수 배열을 반환
            }
        }

        return new int[] {0, 0}; // 정상적으로 종료되었다면 정수 배열 {0, 0} 반환
    }
}
