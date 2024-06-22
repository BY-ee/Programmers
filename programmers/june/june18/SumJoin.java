/** 2024-06-18 15:30
 *  더 크게 합하기 (정수를 연결)
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181939
 */


package programmers.june.june18;

public class SumJoin {
    public int solution (int a, int b) {
        String ab = Integer.toString(a) + Integer.toString(b);  // 입력받은 정수 a와 b를 문자열로 변환한 후 더해서 변수 ab에 대입
        String ba = Integer.toString(b) + Integer.toString(a);  // 입력받은 정수 b와 a를 문자열로 변환한 후 더해서 변수 ba에 대입

        int ab_int = Integer.parseInt(ab, 10);            // 문자열 ab를 10진수 정수로 변환하여 변수 ab_int에 대입
        int ba_int = Integer.parseInt(ba, 10);            // 문자열 ba를 10진수 정수로 변환하여 변수 ba_int에 대입
        
        if (ab_int >= ba_int) {   // ab_int가 ba_int보다 크거나 같으면
            return ab_int;        // ab_int 값 변환
        } return ba_int;          // 아니라면 ba_int 값 변환
    }

    public static void main(String[] args) {
        SumJoin s1 = new SumJoin();
        System.out.println(s1.solution(111, 223));
    }
}
