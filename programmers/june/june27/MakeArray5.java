/** 2024-06-28 04:20
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 배열 만들기 5
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181912
 */


package programmers.june.june27;
import java.util.ArrayList;

public class MakeArray5 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> al = new ArrayList<>();   // ArrayList 인스턴스 생성
        
        for(String e : intStrs) {                               // 문자열 배열 intStrs의 문자열을 하나씩 e에 대입
            int temp = Integer.parseInt(e.substring(s, s + l));    // e의 s 인덱스부터 s + l 인덱스 앞의 글자까지 잘라서 정수로 바꾼 후 temp에 대입
            if (temp > k) {                                        // temp가 k보다 크면
                al.add(temp);                                      // al에 temp 대입
            }
        }
        

        int[] answer = new int[al.size()];              // al의 크기를 가진 정수 배열 answer 선언
        for (int i = 0; i < answer.length; i++) {       // answer의 길이만큼 반복
            answer[i] = al.get(i);                         // al의 i 인덱스 데이터를 answer의 i 인덱스에 대입
        }

        return answer;      // answer 반환

        /**
         *  return al.stream().mapToInt(i -> i).toArray();
         *  한번에 배열로 출력하는 방법?
         */
    }

    public static void main(String[] args) {
        MakeArray5 m1 = new MakeArray5();
        m1.solution(new String[] {"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5);
    }
}
