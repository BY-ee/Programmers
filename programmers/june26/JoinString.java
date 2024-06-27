/** 2024-06-27 02:05
 *  글자 이어 붙여 문자열 만들기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181915
 */

/**
    StringBuilder sb = new StringBuilder();

    for (int idx : index_list)
        sb.append(my_string.charAt(idx));

    return sb.toString();
*/

package programmers.june26;

public class JoinString {
    public String solution(String my_string, int[] index_list) {
        
        String answer = "";    // 값을 담을 문자열 변수 초기화

        for(int i = 0; i < index_list.length; i++) {    // index_list의 길이만큼 반복
            answer += my_string.charAt(index_list[i]);  // my_string의 index_list[i]의 인덱스에 있는 문자를 answer에 대입
        }

        return answer;  // answer 반환
    }
}