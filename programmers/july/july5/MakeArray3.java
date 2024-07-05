/** 2024-07-05 12:49
 *  배열 만들기 3
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181895
 */


package programmers.july.july5;
import java.util.ArrayList;
import java.util.Arrays;

public class MakeArray3 {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> al = new ArrayList<> ();   // ArrayList 인스턴스 al 생성

        for(int i : Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1)) {
                // arr의 intervals[0][0] 인덱스부터 intervals[0][1] 인덱스까지의 데이터를 하나씩 추출  
            al.add(i);   // al에 대입
        }

        for(int i : Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1)) {
            // arr의 intervals[1][0] 인덱스부터 intervals[1][1] 인덱스까지의 데이터를 하나씩 추출
            al.add(i);   // al에 대입
        }

        return al.stream().mapToInt(i -> i).toArray();  // al을 정수 배열로 변환 후 반환
    }
}