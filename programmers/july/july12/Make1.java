/** 2024-07-12 16:00
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 1로 만들기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181880
 */


package programmers.july.july12;
import java.util.Arrays;

public class Make1 {
    public int solution(int[] num_list) {
        int[] clone;    // num_list와 비교할 복제 배열 선언
        int answer = 0;

        do {
            clone = num_list.clone();  // num_list를 clone에 복제

            for(int i = 0; i < num_list.length; i++) {  // num_list의 길이만큼 반복
                    /*
                     *  ★★ 중요
                     *  ★★ 정수는 나눴을 때 소수점이 생기면 소수점 아래는 버림
                     *  ★★ 만약 7이면 1을 빼고 나누든 그냥 나누든 결과는 3이 되고
                     *  ★★ 8 등의 짝수면 그냥 2로 나누라 했으니 삼항연산자 쓸 필요없이 그냥 나누면 됨 ★★
                     */
                
                  // num_list의 i 인덱스 데이터가 1이 아니면 짝수일시 / 2, 홀수일시 - 1한 값에 / 2
                  // 그후 answer에 + 1
                if(num_list[i] != 1) {
                    num_list[i] = num_list[i] % 2 == 0 ? num_list[i] / 2 : (num_list[i] - 1) / 2;
                    answer++;
                }



            }

        } while(!Arrays.equals(clone, num_list)); // clone과 num_list의 원소가 다르면 반복

        return answer;  // answer 반환
    }
}
