/** 2024-06-21 17:45
 *  등차수열의 특정한 값만 더하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181931
 */


/**
 * import java.util.stream.IntStream;
 * return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();
 * IntStream을 이용해서 한줄로 표현하는 코드
 */




package programmers.june.june21;

public class SumSpecificAP {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;   // 반환할 정수 초기화
        for (int i = 0; i < included.length; i++) {   // boolean 배열 included의 원소 개수만큼 반복
            if (included[i]) {                          // included의 i 인덱스 값이 true라면
                answer += a + (d * i);                  // answer에 첫째항이 a이고 공차가 d인 등차수열의 i항 값을 answer에서 더한 값을 answer 대입
            }
        }
        return answer;   // answer 반환
    }
}
