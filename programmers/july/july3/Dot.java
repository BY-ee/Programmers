/** 2024-07-03 18:30
 *  점 찍기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/140107
 */


package programmers.july.july3;

public class Dot {
    public long solution(int k, int d) {
        long answer = 0;    // 점 개수 초기화

        for(int i = 0; i <= d; i += k) {       // i는 d까지 k의 간격만큼 반복
            long j = (long)Math.sqrt((long)d * d - (long)i * i);
              // j는 (d ^ 2 - i ^ 2)의 제곱근 (피타고라스 법칙을 이용한 점의 좌표)
            if(j * j + (long)i * i <= (long)d * d) {  // 두 점 i, j의 길이가 d의 길이 이하라면
                answer += j / k + 1;                  // j 아래의 k 간격만큼의 점 개수를 더함
            } else {
                break;
            }
        }
        return answer;  // answer 반환
    }

    public static void main(String[] args) {
        Dot d = new Dot();
        System.out.println(d.solution(10, 800000));
    }
}
