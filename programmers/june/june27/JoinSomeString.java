/** 2024-06-28 04:40
 *  부분 문자열 이어 붙여 문자열 만들기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181911
 */


package programmers.june.june27;

public class JoinSomeString {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";     // 값을 담을 문자열 변수 초기화

        for (int i = 0; i < parts.length; i++) {                    // parts의 길이만큼 반복
            String temp = my_strings[i];                               // my_strings의 i 인덱스의 값을 temp에 대입
            answer += temp.substring(parts[i][0], parts[i][1] + 1);    // temp의 문자열을 parts[i][0] 인덱스부터 [i][1] 인덱스까지 자른 후 answer에 대입
        }
        
        return answer;   // answer 반환
    }

    public static void main(String[] args) {
        JoinSomeString j1 = new JoinSomeString();
        j1.solution(new String[] {"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][] {{0, 4}, {1, 2}, {3, 5}, {7, 7}});
    }
}
