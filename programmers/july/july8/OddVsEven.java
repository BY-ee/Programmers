/** 2024-07-08 16:00
 *  홀수 vs 짝수
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181887
 */


package programmers.july.july8;

public class OddVsEven {
    public int solution(int[] num_list) {
        int odd = 0;   // 홀수, 짝수 변수 초기화
        int even = 0;

        for(int i = 0; i < num_list.length; i++) {  // num_list의 길이만큼 반복
            if(i % 2 == 0) {         // 인덱스가 짝수면 num_list의 i 인덱스의 데이터를 even에 대입
                even += num_list[i];
            } else {                 // 인덱스가 홀수면 num_list의 i 인덱스의 데이터를 odd에 대입
                odd += num_list[i];
            }
        }

        return Math.max(odd,even);  // odd, even 중 큰 값을 반환
    }
}
