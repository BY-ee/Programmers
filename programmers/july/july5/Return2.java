/** 2024-07-05 17:20
 *  2의 영역
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181894
 */


package programmers.july.july5;
import java.util.ArrayList;

public class Return2 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<> ();     // ArrayList 인스턴스 al 선언
        ArrayList<Integer> answer = new ArrayList<> (); // ArrayList 인스턴스 answer 선언

        for(int i = 0; i < arr.length; i++) {  // arr의 길이만큼 반복
            if(arr[i] == 2) {                    // arr의 i 인덱스 값이 2라면
                al.add(i);                       // al에 i 값을 대입 (arr 데이터가 2인 인덱스의 값)
            }

        }
        /**
         *  int[] idxs = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();
         *  IntStream.range(0, arr.length).filter(lambda)를 이용해서 arr에서 2 값만 걸러냄
         *  arr 범위의 스트림 생성 - filter의 조건식에 맞는 경우의 값만 걸러냄
         */

        switch(al.size()) {
            case 0:
                return new int[] {-1};  // al의 길이가 0이면 -1 배열 반환
            case 1:
                return new int[] {2};   // al의 길이가 1이면 2 배열 반환
            default:
                int[] idxarr = al.stream().mapToInt(i -> i).toArray();
                  // al의 길이가 2 이상이면 al을 정수 배열로 변환한 후 정수 배열 idxarr에 대입
                int idx = idxarr[idxarr.length - 1];
                  // idxarr의 마지막 값을 idx에 대입 (idxarr의 마지막 값: arr에서 가장 마지막의 데이터 2 인덱스 값)

                for(int i = idxarr[0]; i <= idx; i++) {  // idxarr의 처음 값부터 마지막 값까지 반복
                    answer.add(arr[i]);                    // 처음 2와 마지막 2 사이의 값 모두를 answer에 대입
                }

                return answer.stream().mapToInt(i -> i).toArray();  // answer을 정수 배열로 변환 후 반환
        }
    }

    public static void main(String[] args) {
        Return2 r = new Return2();

    }
}
