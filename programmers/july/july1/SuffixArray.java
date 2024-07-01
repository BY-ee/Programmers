/** 2024-07-02 00:20
 *  접미사 배열
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181909
 */


package programmers.july.july1;
import java.util.ArrayList;
import java.util.Collections;

public class SuffixArray {
    public String[] solution(String my_string) {
        ArrayList<String> al = new ArrayList<>();   // ArrayList 리스트 선언
        for(int i = my_string.length() - 1; i >= 0; i--) {  // my_string의 길이만큼 반복 (i는 my_string의 길이 - 1 부터 0까지)
            al.add(my_string.substring(i));                   // my_string의 문자열을 i 인덱스부터 끝까지 추출한 후 al에 대입
            
        }
        Collections.sort(al);               // al을 오름차순으로 정렬
        return al.toArray(new String[0]);   // al을 배열(문자열)로 변환한 후 반환
        
        // return al.stream().toArray(String[]::new);   // stream을 이용한 문자열 배열 변환
    }

    public static void main(String[] args) {
        SuffixArray s1 = new SuffixArray();
        s1.solution("abxaetxg");
    }
}
