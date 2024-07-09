/** 2024-06-18 17:20
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 공배수
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181936
 */

/**
 *  public int solution(int number, int n, int m) {
 *      int answer = 0;
 *      if(number % n == 0) {
 *          if(number % m == 0) {
 *              answer = 1;
 *          }
 *      } return answer;  // number가 n과 m의 공배수라면 1을 대입 후 반환하고,
 *  }                     // 아니라면 원래 변수인 0을 반환 (else case에 answer = 0 필요 X)
 */


package programmers.june.june18;

class Solution {
    public int solution(int number, int n, int m) {
        return (number % n == 0 && number % m == 0) ? 1 : 0;  // number가 n의 배수이면서 m의 배수이면 1을 반환하고, 아니라면 0 반환
    }
}


public class CommonMulpitle {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.solution(10, 2, 3));
    }
}
