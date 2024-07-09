/** 2024-07-04 18:00
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 리스트 자르기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181897
 */


/**
 * int start = n == 1 ? 0 : slicer[0];
 * int end = n == 2 ? num_list.length - 1 : slicer[1];
 * int step = n == 4 ? slicer[2] : 1;
 * int[] answer = new int[(end - start + step) / step];
 * for (int i = start, j = 0; i <= end; i += step) {
 *     answer[j++] = num_list[i];
 * }
 * return answer;
 *
 * switch 사용 없이 수학적으로 풀이
 */

package programmers.july.july4;
import java.util.ArrayList;
import java.util.Arrays;

public class CutList {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> al = new ArrayList<> ();   // ArrayList 선언
        switch(n) {   // switch문 (n은 1 ~ 4)
           case 1:
               return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
                 // n이 1이면 num_list의 0 인덱스부터 slicer[1] 인덱스까지 슬라이싱한 후 반환
           case 2:
               return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
                 // n이 2이면 num_list의 slicer[0] 인덱스부터 끝까지 슬라이싱한 후 반환
           case 3:
               return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                 // n이 3이면 num_list의 slicer[0] 인덱스부터 slicer[1] 인덱스까지 슬라이싱한 후 반환
           case 4:
               num_list = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
                 // n이 4이면 num_list의 slicer[0] 인덱스부터 slicer[1] 인덱스까지 슬라이싱
               for(int i = 0; i < num_list.length; i += slicer[2]) {
                                          // i는 0부터 slicer[2] 간격으로 num_list의 길이만큼 반복
                    al.add(num_list[i]);  // num_list의 i 인덱스(slicer[2]의 배수)의 데이터를 al에 더함
               }
               return al.stream().mapToInt(i -> i).toArray(); // al을 정수 배열로 변환 후 반환
            default:
                return new int[0];
        }
    }
}
