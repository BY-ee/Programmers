/** 2024-07-04 18:30
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 첫 번째로 나오는 음수
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181896
 */


package programmers.july.july4;

public class FiguredOutNegaNum {
    public int solution(int[] num_list) {
        int idx = 0;  // 인덱스 변수 초기화

        for(idx = 0; idx < num_list.length; idx++) {  // num_list의 길이만큼 반복
            if(num_list[idx] < 0) {                    // num_list의 idx 데이터가 0보다 작으면 (음수면)
                break;                                 // 반복문 종료
            }
        }
        return idx == num_list.length ? -1 : idx;  // idx 값이 num_list의 길이와 같다면 -1 반환, 아니라면 idx 반환
        /**
         *  num_list의 모든 값이 양수면 idx는 반복문이 끝나고 마지막에 1이 더해져 num_list의 길이와 같아짐
         *  예를 들어 길이 7인 배열의 [idx]가 6까지 모두 양수라면 마지막에 idx++로 인해 7이 되어 배열의 길이와 같아짐
         *  따라서 idx == num_list.length라는 것은 배열에 음수가 없다는 의미.
         */

    }
}
