/** 2024-06-18 17:40
 *  홀짝에 따라 다른 값 반환하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */

/**
 *   if (n % 2 == 1) {
 *       return (n + 1) * (n + 1) / 2 / 2;
 *   } else {
 *       return 4 * n/2 * (n/2 + 1) * (2 * n/2 + 1) / 6;   
 *   }
 */

package programmers.june.eighteen;

public class DivisionOddEven {
    public int solution(int n) {
        int answer = 0;

        if(n % 2 == 0) {                            // n을 2로 나눈 나머지가 0이면 (n이 짝수)
            for(int i = 1; i <= n / 2; i++) {       // (n / 2)회 반복 실행
                /**
                 * i를 i++이 아니라 i+=2로 2씩 더하거나 i-=2로 2씩 빼면 계산이 더 간단해졌을듯 (짝수 홀수 공통)
                 */
                answer += (2 * i) * (2 * i);        // (2 * i)^2 의 값을 반복해서 answer에 더함
            }
        } else {                                    // 이외에는 (n이 홀수)
            for(int i = 1; i <= (n + 1) / 2; i++) { // ((n + 1) / 2)회 반복 실행
                answer += (2 * i) - 1;              // (2 * i) - 1의 값을 반복해서 answer에 더함
            }
        }
        return answer;  // answer 반환
    }

    public static void main(String[] args) {
        DivisionOddEven d1 = new DivisionOddEven();
        System.out.println(d1.solution(90));
    }
}
