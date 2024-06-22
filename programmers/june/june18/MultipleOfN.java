/** 2024-06-18 16:50
 *  n의 배수
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181937
 */

/**
 *  나머지를 쓰는 게 베스트 풀이법
 *  a % b == 0 이면 배수
 */

package programmers.june.june18;

public class MultipleOfN {

    public int solution(int num,int n) {
        int i = 1;
     /* 반복문의 반복 횟수를 결정할 변수 선언 */
     
        while (n * i != num) {         // n * i가 num과 다르다면
            i++;                       // i + 1
            if (i >= 50 || n == num) { // i가 50과 크거나 같다면, 또는 n과 num이 같다면
                break;                 // 반복 중지
            }
        }

        if (n * i == num) {            // n * i가 num과 같다면 1 반환
            return 1;
        } else {                       // 아니라면 0 반환
            return 0;
        }
    }
    public static void main(String[] args) {
        MultipleOfN m1 = new MultipleOfN();
        System.out.println(m1.solution(100, 10));
    }
}
