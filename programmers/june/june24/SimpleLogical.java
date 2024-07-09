/** 2024-06-25 02:50
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 간단한 논리 연산
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181917
 */


package programmers.june.june24;

public class SimpleLogical {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);  // x1, x2의 논리합과 x3, x4의 논리합을 논리곱 연산한 결과를 반환
    }
}
