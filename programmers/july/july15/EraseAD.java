/** 2024-07-15 12:20
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > ad 제거하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181870
 */


package programmers.july.july15;

public class EraseAD {
    public String[] solution(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        
          // ad가 포함된 문자열 제거하고 나머지 문자는 ,로 구분
        for(String s : strArr) {
            if(!s.contains("ad")) sb.append(s).append(",");
        }

        return sb.toString().split(",");  // sb를 ,마다 나눠서 배열로 만든 후 반환
    }
}