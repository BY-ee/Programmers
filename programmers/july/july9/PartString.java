/** 2024-07-09 00:50
 *  부분 문자열
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181842
 */


package programmers.july.july9;

public class PartString {
    public int solution(String str1, String str2) {
        int answer = 0;  // 반환값 초기화
        
        for(int i = str1.length(); i <= str2.length(); i++) {  // 시작값: str1의 길이 / 마지막값: str2의 길이
            if(str1.equals(str2.substring(i - str1.length(), i))) answer = 1;
              // str2을 i - str1.length() 인덱스부터 i 인덱스까지 자른 문자열이 str1과 같으면 answer에 1 대입
        }

        return answer;  // answer 반환
    }
}
