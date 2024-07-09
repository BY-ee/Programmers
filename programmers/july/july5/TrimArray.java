/** 2024-07-05 18:45
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 배열 조각하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181893
 */


package programmers.july.july5;
import java.util.Arrays;

public class TrimArray {
    public int[] solution(int[] arr, int[] query) {

        for(int i = 0; i < query.length; i++) {    // query의 길이만큼 반복
            if(i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
                  // i가 짝수라면 arr의 query[i] 인덱스의 다음부터 끝까지 제거
            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
                  // i가 홀수라면 arr의 처음부터 query[i] 인덱스 이전까지 제거
            }
        }

        return arr;  // 정수 배열 arr 반환
    }
}
