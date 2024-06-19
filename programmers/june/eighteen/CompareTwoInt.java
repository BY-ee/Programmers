/** 2024-06-18 16:00
 *  두 수의 연산값 비교하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181938
 */


package programmers.june.eighteen;

public class CompareTwoInt {
    public int solution(int a, int b) {
        String ab_str = Integer.toString(a) + Integer.toString(b);  // 입력받은 정수 a와 b를 문자열로 변환한 후 더한 값을 변수 ab에 대입
        int ab = Integer.parseInt(ab_str, 10);                // 문자열 ab를 10진수 정수로 변환하여 변수 ab_int에 대입
        int ab2 = 2 * a * b;                                        // 2 * a * b를 변수 ab2에 대입

        return ab >= ab2 ? ab : ab2;                                // ab_int가 mul_abtwo보다 크거나 같다면 ab_int를 반환하고, 아니라면 ab2 반환
    }
    public static void main(String[] args) {
        CompareTwoInt c1 = new CompareTwoInt();
        System.out.println(c1.solution(60, 60));
    }
}
