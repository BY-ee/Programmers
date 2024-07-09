/** 2024-07-03 19:50
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > qr code (q로 나눈 나머지가 r인 인덱스의 문자 모음)
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181903
 */


package programmers.july.july3;

public class QRCode {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < code.length(); i++) {  // code의 문자 개수만큼 반복
            if (i % q == r) {                       // i를 q로 나눈 나머지가 r이라면
                sb.append(code.charAt(i));          // code의 i 인덱스의 문자를 sb에 대입
            }
        }
        return sb.toString();  //sb를 String으로 변환 후 반환
    }
}
