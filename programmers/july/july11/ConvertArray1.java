/** 2024-07-11 20:20
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 조건에 맞게 수열 변환하기 1
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181882
 */

/**
 *  return Arrays.stream(arr)
 *          .map(i -> i >= 50 && i % 2 == 0 ? i / 2 : i < 50 && i % 2 != 0 ? i * 2 : i).toArray();
 *  map에 삼항연산자로 조건을 넣어서 mapping하는 방식
 */


package programmers.july.july11;

public class ConvertArray1 {
    public int[] solution(int[] arr) {
        int idx = 0;

        for(int i : arr) {
            arr[idx++] = arr[idx] >= 50 && arr[idx] % 2 == 0 ? i / 2 :
                         arr[idx] < 50 && arr[idx] % 2 == 1 ? i * 2 : i;
        }

        return arr;
    }
}
