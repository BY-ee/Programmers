/** 2024-06-21 23:00
 *  마지막 두 원소
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181927
 */


package programmers.june.june21;
import java.util.ArrayList;        // ArrayList 패키지 import

public class Last2Elements {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> al = new ArrayList<Integer>();   // 정수 데이터가 들어가는 ArrayList 인스턴스 생성
        int[] answer = new int[num_list.length + 1];        // answer 정수 배열 생성 (입력받은 정수 배열인 num_list의 길이 + 1)

        for (int i = 0; i < num_list.length; i++) {      // 입력받은 정수 배열의 길이만큼 반복
            al.add(num_list[i]);                         // ArrayList 인스턴스 al에 num_list의 i 인덱스 데이터를 추가
        }
        
        if (al.getLast() > al.get(num_list.length - 2)) {
                  // al의 마지막 원소가 그전 원소보다 크다면
            al.add(al.getLast() - al.get(num_list.length - 2));
                  // 마지막 원소에서 그전 원소를 뺀 값을 al에 추가
        } al.add(al.getLast() * 2);
                  // 크지 않다면 마지막 원소를 2배한 값을 al에 추가
        for (int i = 0; i < answer.length; i++) {     // answer 정사 배열의 길이만큼 반복
            answer[i] = al.get(i);                    // al의 i 인덱스 데이터를 answer에 대입
        }

        return answer;   // answer 반환
    }

    public static void main(String[] args) {
        Last2Elements l1 = new Last2Elements();
        int[] a = {2, 7, 6, 4};
        System.out.println(l1.solution(a));
    }
}
