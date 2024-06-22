/** 2024-06-21 21:45
 *  원소들의 곱과 합
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181929
 */


package programmers.june.june21;

public class MulAndSum {
    public int solution(int[] num_list) {
        int sum = 0;  // 더하기 변수 초기화
        int mul = 1;  // 곱하기 변수 초기화 (0으로 초기화하면 곱할 때 무조건 0)

        for (int a : num_list) {  // num_list의 원소를 하나씩 a에 넣음
            sum += a;             // 정수 a를 하나씩 sum과 합한 후 다시 sum에 대입
        }
        for (int i = 0; i < num_list.length; i++) {  // num_list의 길이만큼 반복
            mul *= num_list[i];                      // num_list의 i 인덱스의 값을 mul과 곱한 후 다시 mul에 대입
        }

        return mul < (int)Math.pow(sum, 2) ? 1 : 0;  // 곱셈 결과가 덧셈 결과의 제곱보다 작으면 1, 아니면 0 반환
    }

    public static void main(String[] args) {
        MulAndSum m1 = new MulAndSum();
        int[] asd = {3, 4, 5, 2, 1};
        System.out.println(m1.solution(asd));
    }
}
