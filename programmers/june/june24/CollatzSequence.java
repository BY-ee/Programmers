/** 2024-06-25 02:00
 *  콜라츠 수열 만들기 (1000 이하의 자연수 x가 짝수면 x / 2, 홀수면 x * 3 + 1을 할시 결국 x = 1로 도달)
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181919
 */
 
 //  ★★ al.stream().mapToInt(i -> i).toArray();   ★ 배열 또는 List의 데이터를 int형으로 변환한 후 정수 배열로 반환

package programmers.june.june24;
import java.util.ArrayList;

public class CollatzSequence {
        public int[] solution(int n) {
            ArrayList<Integer> al = new ArrayList<>();   // ArrayList 인스턴스 생성
            
            while (n != 1) {     // n이 1이 될 때까지 반복
                al.add(n);                           // al에 n 대입
                n = n % 2 == 0 ? n / 2 : n * 3 + 1;  // n이 짝수라면 n / 2, 홀수라면 n * 3 + 1을 n에 대입
            }
            al.add(1);  // 반복이 끝난 후 마지막 1을 대입
            
            int[] answer = new int[al.size()];     // al의 길이를 가진 정수 배열 answer 선언
            for (int i = 0; i < al.size(); i++) {    // al의 길이만큼 반복
                answer[i] += al.get(i);              // answer의 i 인덱스에 al의 i 인덱스 데이터를 대입
            }
            
           //  ★★ al.stream().mapToInt(i -> i).toArray();   ★ 배열 또는 List의 데이터를 int형으로 변환한 후 정수 배열로 반환

            return answer;   // answer 반환
        }
}
