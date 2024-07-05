package programmers.july.july5;

import java.util.Arrays;
import java.util.ArrayList;

public class ChangeSequence {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> al = new ArrayList<> ();

        int[] a = Arrays.copyOfRange(num_list, n, num_list.length);
          // 정수 배열 a에 num_list의 n 번째 원소부터 마지막 원소까지 대입
        int[] b = Arrays.copyOfRange(num_list, 0, n);
          // 정수 배열 b에 num_list의 첫 번째 원소부터 n - 1 번째 원소까지 대입 

        for(int i : a) {
            al.add(i);  // a의 데이터를 하나씩 al에 대입
        }
        for(int i : b) {
            al.add(i);  // b의 데이터를 하나씩 al에 대입
        }

        return al.stream().mapToInt(i -> i).toArray();
          // al을 정수 배열로 변환 후 반환
    }
}
