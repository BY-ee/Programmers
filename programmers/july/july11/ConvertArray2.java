/** 2024-07-11 23:40
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 조건에 맞게 수열 변환하기 2
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181881
 */


package programmers.july.july11;
import java.util.Arrays;

public class ConvertArray2 {
    public int solution(int[] arr) {
        int[] arr2 = arr.clone();  // arr의 복제 배열 생성
        int idx = 0;               // for-each문에 사용할 인덱스 변수 선언
        int answer = 0;
        
        for(int i : arr2) {    // arr2의 값을 하나씩 추출
            if(i >= 50 && i % 2 == 0) {
                arr2[idx] = i / 2;
                  // i가 50보다 크거나 같은 짝수라면 i / 2를 대입
            } else if(i < 50 && i % 2 == 1) {
                arr2[idx] = (i * 2) + 1;
                  // i가 50보다 작은 홀수라면 (i * 2) + 1을 대입
            }
            
            idx++;
        }
        answer++;  // 배열의 계산이 끝난 후 answer에 + 1

        while(!Arrays.equals(arr2, arr)) {  // arr과 arr2의 값이 같을 때까지 반복
            idx = 0;
            arr = arr2.clone();

            for(int i : arr2) {
                if(i >= 50 && i % 2 == 0) {
                    arr2[idx] = i / 2;
                } else if(i < 50 && i % 2 == 1) {
                    arr2[idx] = (i * 2) + 1;
                }
                
                idx++;
            }
            answer++;
        }
        
        return answer - 1;  // answer에 - 1한 값을 대입
    }
}