/** 2024-07-04 16:30
 *  가까운 1 찾기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181898
 */


package programmers.july.july4;

public class FindNearby1 {
    public int solution(int[] arr, int idx) {
        while(arr[idx] == 0) {    // arr의 idx 값이 0이 아닐 때까지 반복

            if(idx == arr.length - 1 && arr[idx] == 0) {  // arr 배열의 끝까지 모든 원소가 0이라면
                return -1;                                // -1 반환
            }
            idx++;  // 인덱스 값을 + 1
        }

        return idx;  // idx 반환
    }
}
