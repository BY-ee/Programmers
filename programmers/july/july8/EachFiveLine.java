/** 2024-07-08 16:25
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 5명씩
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181886
 */

/**
 *  5번째 데이터를 제외한 나머지를 공백으로 만드는 것보다
 *  5번째 데이터를 새로운 배열(이나 list)에 새로 넣는 게 더 간단
 */


package programmers.july.july8;
import java.util.Arrays;

public class EachFiveLine {
    public String[] solution(String[] names) {
        for(int i = 0; i < names.length; i++) {  // names의 길이만큼 반복
            if(i % 5 != 0) names[i] = "";          // 5의 배수 인덱스를 제외한 나머지 인덱스의 문자열을 공백으로 대입
        }

        return Arrays.stream(names).filter(s -> !s.isEmpty()).toArray(String[]::new);
          // 공백이 아닌 문자열만 남긴 문자열 배열을 반환
    }
}
