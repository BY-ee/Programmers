/** 2024-06-27 03:50
 *  문자열 여러 번 뒤집기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181913
 */

/**
 *  my_string.substring(start_idx, end_idx);
 *  start 인덱스부터 end 인덱스까지의 문자
 */

package programmers.june.june26;

public class FlipManyTimes {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;                // 입력받은 문자열을 answer에 대입
        StringBuilder sb = new StringBuilder();   // StringBuilder 인스턴스 생성

        for(int i = 0; i < queries.length; i++) {                     // queries 길이만큼 반복
            sb.delete(0, Integer.MAX_VALUE);                        // sb 객체를 초기화 (sb에 대입된 결과값을 answer에 넣고 반복하기 위함)

            for(int j = 0; j < queries[i][0]; j++) {                      // queries[i][0]만큼 반복
                sb.append(answer.charAt(j));                              // answer의 j 인덱스의 데이터를 sb에 추가
            }
            for(int j = 0; j <= queries[i][1] - queries[i][0]; j++) {     // queries[i][1] - queries[i][0]만큼 반복
                sb.append(answer.charAt(queries[i][1] - j));              // answer의 queries[i][0] 인덱스부터 [i][1] 인덱스까지의 문자열을 뒤집어서 대입
            }
            for(int j = queries[i][1] + 1; j < answer.length(); j++) {    // answer의 길이 - queries[i][1] + 1만큼 반복
                sb.append(answer.charAt(j));                              // answer의 j 인덱스의 데이터를 sb에 추가
            }
            answer = sb.toString();                                       // 반복이 끝날 때마다 sb의 결과를 answer에 대입

        }
        return answer;   // answer 반환
    }

    public static void main(String[] args) {
        FlipManyTimes f1 = new FlipManyTimes();
        f1.solution("aBcDeFgHiJ", new int[][] {{2, 3}, {1, 6}, {4, 9}});
    }
}
