/** 2024-07-09 00:20
 *  전국 대회 선발 고사
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181851
 */


package programmers.july.july9;
import java.util.HashMap;

public class NationwideTest {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> hm = new HashMap<> ();
        int answer = 0;  // 반환 변수 초기화
        int count = 0;   // 나눗셈 변수 초기화

          // int mul = (int) (10000 / Math.pow(100, count));
          // 제대로 작동하지 않는 코드 (Math.pow의 count 변수가 커져도 값이 계속해서 10000이 출력)

        for(int i = 0; i < rank.length; i++) {    // rank의 길이만큼 반복
            if(attendance[i]) hm.put(rank[i], i);   // attendance가 true일 때만 Hashmap에 값을 대입
        }

        

        for(int i = 1; i <= rank.length; i++) {   // rank의 길이만큼 반복 (key값(등수)을 입력하기 위해 i는 1부터 시작)
            if(hm.containsKey(i)) {   // Hashmap의 key값으로 i가 있다면
                answer += (int) (10000 / Math.pow(100, count)) * hm.get(i);
                count++;
                  // i * 10000 / (100 ^ count)를 value 값에 곱해서 answer에 더한 후 count를 1 더함
            }
            if(count == 3) break;  // count가 3이라면 break (true가 4 이상인 경우를 대비)
        }
        
        // System.out.println(answer);
        return answer;  // answer 반환

    }

    public static void main(String[] args) {
        NationwideTest test = new NationwideTest();
        test.solution(new int[] {1, 3, 2}, new boolean[] {true, true, true});
    }
}
