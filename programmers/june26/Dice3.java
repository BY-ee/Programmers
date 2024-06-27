/** 2024-06-27 01:50
 *  주사위 게임 3
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181916
 */


package programmers.june26;

import java.util.Arrays;

public class Dice3 {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};    // 입력된 주사위 값을 정수 배열 dice로 선언
        int answer = 0;               // 반환할 변수 초기화
        Arrays.sort(dice);            // dice를 오름차순 정렬

        if(dice[0] == dice[3]) {
            answer = 1111 * dice[0];
                  // dice[0]과 dice[3]이 같으면 (모든 값이 동일하면) 1111 * dice[0]
        } else if (dice[0] == dice[2] && dice[2] != dice[3]) {
            answer = (int)Math.pow((10 * dice[0] + dice[3]), 2);
                  // dice[0]과 dice[2]가 같고 dice[3]과는 다르면 (10 * 같은 값 + 다른 값)^2
        } else if (dice[0] != dice[1] && dice[1] == dice[3]) {
            answer = (int)Math.pow((10 * dice[1] + dice[0]), 2);
                  // dice[0]과 dice[1]이 다르고 dice[1]과 dice[3]이 같으면 (10 * 같은 값 + 다른 값)^2
        } else if (dice[0] == dice[1] && dice[1] != dice[2] && dice[2] == dice[3]) {
            answer = (dice[0] + dice[3]) * (dice[3] - dice[0]);
                  // dice[0]과 [1], [2]와 [3]이 각각 같다면 dice[3]에서 dice[0]을 뺀 값과 더한 값을 곱함
        } else if (dice[0] == dice[1] && dice[1] != dice[2] && dice[2] != dice[3]) {
            answer = dice[2] * dice[3];
                  // dice[0]과 dice[1]은 같고 나머지는 제각각 다른 값이라면 다른 값끼리 곱함
        } else if (dice[0] != dice[1] && dice[1] == dice[2] && dice[2] != dice[3]) {
            answer = dice[0] * dice[3];
                  // dice[1]과 dice[2]는 같고 나머지는 제각각 다른 값이라면 다른 값끼리 곱함
        } else if (dice[0] != dice[1] && dice[1] != dice[2] && dice[2] == dice[3]) {
            answer = dice[0] * dice[1];
                  // dice[2]와 dice[3]은 같고 나머지는 제각각 다른 값이라면 다른 값끼리 곱함
        } else if (dice[0] != dice[1] && dice[1] != dice[2] && dice[2] != dice[3]) {
            answer = dice[0];
                  // 값이 모두 다르다면 가장 작은 값을 대입
        }

        return answer;  // answer 반환
        
    }

    public static void main(String[] args) {
        Dice3 d1 = new Dice3();
        System.out.println(d1.solution(2, 5, 2, 6));
    }
}
