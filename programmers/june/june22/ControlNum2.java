/** 2024-06-23 00:15
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 수 조작하기 2
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181925
 */


package programmers.june.june22;

public class ControlNum2 {
    public String solution(int[] numLog) {
        String answer = "";  // 문자열 변수 초기화
        for(int i = 0; i < numLog.length - 1; i++) {      // numLog의 길이 - 1만큼 반복 (길이만큼 반복하면 인덱스가 길이를 초과함)
            if (numLog[i] + 1 == numLog[i + 1]) {           // numLog의 i 인덱스 데이터에 1을 더한 값이 i + 1 인덱스 데이터라면
                answer += "w";                              // w를 answer에 합한 후 결과를 answer에 대입
            } else if (numLog[i] - 1 == numLog[i + 1]) {    // numLog의 i 인덱스 데이터에 1을 뺀 값이 i + 1 인덱스 데이터라면
                answer += "s";                              // s를 answer에 합한 후 결과를 answer에 대입
            } else if (numLog[i] + 10 == numLog[i + 1]) {   // numLog의 i 인덱스 데이터에 10을 더한 값이 i + 1 인덱스 데이터라면
                answer += "d";                              // d를 answer에 합한 후 결과를 answer에 대입
            } else if (numLog[i] - 10 == numLog[i + 1]) {   // numLog의 i 인덱스 데이터에 10을 뺀 값이 i + 1 인덱스 데이터라면
                answer += "a";                              // a를 answer에 합한 후 결과를 answer에 대입
            }   
        } return answer;   // answer 반환
    }
}
