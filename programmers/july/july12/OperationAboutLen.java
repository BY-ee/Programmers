/** 2024-07-12 19:30
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 길이에 따른 연산
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181879
 */

/**
 *  Arrays.stream(num_list).sum();
 *  Arrays.stream(num_list).reduce(1, (x,y) -> x * y);
 *  stream을 이용한 간단한 식
 */


package programmers.july.july12;

public class OperationAboutLen {
    public int solution(int[] num_list) {
            /*
             *  sum, mul 변수를 따로 지정할 필요 없이
             *  num_list의 길이가 11 이상이면 answer은 0, 아니면 1이나
             *  answer은 1, num_list의 길이가 11 이상이면 answer에 - 1 등으로
             *  하나의 변수를 이용해서 연산할 수 있음
             */
            // 더할 변수, 곱할 변수를 각각 초기화
        int sum = 0;
        int mul = 1;
             // num_list의 길이가 11 이상이면 num_list의 각 원소를 sum에 더한 후 sum 반환
        if(num_list.length >= 11) {
            for(int i : num_list) {
                sum += i;
            }
            return sum;
             // 길이가 10 이하라면 num_list의 각 원소를 mul에 곱한 후 mul 반환
        } else {
            for(int i : num_list) {
                mul *= i;
            }
            return mul;
        }
    }
}
