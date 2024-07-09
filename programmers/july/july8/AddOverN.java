/** 2024-07-08 17:35
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > n보다 커질 때까지 더하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181884
 */


package programmers.july.july8;

public class AddOverN {
    public int solution(int[] numbers, int n) {
        int sum = 0;  // 더할 변수 초기화
        int idx = 0;  // 인덱스 변수 초기화

        while(sum <= n) {         // sum이 n보다 커질 때까지 반복
            sum += numbers[idx++];  // numbers의 i 인덱스의 값을 sum에 더함
        }

        return sum;  // sum 반환
    }
}
