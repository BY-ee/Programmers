/** 2024-06-18 18:10
 *  Flag에 따라 다른 값 반환하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181933
 */


package programmers.june.june18;

public class CompareFlag {
    public int solution(int a, int b, boolean flag) {
        return flag == true ? a + b : a - b;  // flag가 true라면 a + b를 반환, 아니라면 a - b를 반환
    }
}
