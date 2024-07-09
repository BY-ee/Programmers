/** 2024-06-25 02:40
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 배열 만들기 4
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181918
 */

// ArrayList 말고도 Stack이 나쁘지 않은 거 같음. (LIFO)

package programmers.june.june24;
import java.util.ArrayList;

public class MakeArray4 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();   // ArrayList 인스턴스 al 생성

        for(int i = 0; i < arr.length; i++) {            // arr의 길이만큼 반복
            if(al.isEmpty() || al.get(al.size() - 1) < arr[i]) {
                     // al이 비어있거나 al의 마지막 값이 arr의 i 인덱스 값보다 작다면
                al.add(arr[i]);                             // arr의 i 인덱스 데이터를 al에 대입
            } else {                                        // al의 마지막 값이 arr의 i 인덱스 값보다 크다면
                al.remove(al.size() - 1);             // al의 마지막 값 제거
                i--;                                        // i-- (로직을 다시 실행)
            }
        }

        return al.stream().mapToInt(i -> i).toArray();      // ArrayList인 al을 정수 배열로 변환 후 반환
    }

    public static void main(String[] args) {
        MakeArray4 m1 = new MakeArray4();
        System.out.println(m1.solution(new int[] {1, 4, 2, 5, 3}));
        
    }
}