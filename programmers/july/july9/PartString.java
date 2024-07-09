/** 2024-07-09 00:50
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 부분 문자열
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181842
 */

/**
 *  1. return str2.contains(str1) ? 1 : 0;   // 포함하는 문자열을 확인
 *  2. return str2.indexOf(str1) > -1 ? 1 : 0;  // str1 문자열의 인덱스가 존재하면 인덱스 반환, 아니면 -1 반환
 */

package programmers.july.july9;

public class PartString {
    public int solution(String str1, String str2) {
        int answer = 0;  // 반환값 초기화
        
        for(int i = str1.length(); i <= str2.length(); i++) {  // 시작값: str1의 길이 / 마지막값: str2의 길이
            if(str1.equals(str2.substring(i - str1.length(), i))) answer = 1;
              // str2을 i - str1.length() 인덱스부터 i 인덱스까지 자른 문자열이 str1과 같으면 answer에 1 대입
        }
        System.out.println("aa");
            
        return answer;  // answer 반환
    }
}
