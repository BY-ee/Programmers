/** 2024-07-12 20:40
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 배열에서 문자열 대소문자 변환하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181875
 */

/**
 *  return IntStream.range(0, strArr.length)
 *  .mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase()).toArray(String[]::new)
 *  map을 이용한 풀이
 */

package programmers.july.july12;

public class ChangeLowerAndUpper {
    public String[] solution(String[] strArr) {
        for(int i = 0; i < strArr.length; i++) {
            if(i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }

        return strArr;
    }
}
