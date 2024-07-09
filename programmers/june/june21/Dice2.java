/** 2024-06-21 21:10
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 주사위 게임 2 (주사위 결과에 따라 연산)
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181930
 */


package programmers.june.june21;

public class Dice2 {
    public int solution(int a, int b, int c) {
        int answer = 0;  // 반환할 변수 초기화

        if (a == b && b == c) {
            answer = (int)((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(a, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
             // a == b == c 라면 (a + b + c) * (a^2 + b^2 + c^2) * (a^3 + b^3 + c^3)의 결과를 answer에 대입
        } else if (a != b && b != c && c!= a) {
            answer = a + b + c;
             // a != b != c != a 라면 a + b + c의 결과를 answer에 대입
        } else {
            answer = (int)((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        }    // a == b || b == c || c == a 라면 (a + b + c) * (a^2 + b^2 + c^2)의 결과를 answer에 대입
        return answer;
    }   // answer 반환

    public static void main(String[] args) {
        Dice2 d1 = new Dice2();
        System.out.println(d1.solution(5, 3, 3));
    }
}
