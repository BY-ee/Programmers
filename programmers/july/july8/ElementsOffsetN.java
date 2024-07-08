/** 2024-07-08 15:40
 *  n개 간격의 원소들
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181888
 */


package programmers.july.july8;
import java.util.Arrays;

public class ElementsOffsetN {
    public int[] solution(int[] num_list, int n) {

        for(int i = 0; i < num_list.length; i++) {  // num_list의 길이만큼 반복
            if(i % n != 0) num_list[i] = 0;
              // i를 n으로 나눈 나머지가 0이 아니라면 num_list의 i 인덱스의 값에 0 대입 (n개 간격의 원소를 제외한 원소는 0)
        }

        return Arrays.stream(num_list).filter(i -> i != 0).toArray();
          // num_list의 원소 중 0이 아닌 값만 고른 정수 배열을 반환
    }
}