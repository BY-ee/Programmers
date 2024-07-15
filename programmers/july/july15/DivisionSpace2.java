/** 2024-07-15 14:45
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 공백으로 구분하기 2
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181868
 */

/**
 *  return my_string.trim().split("[ ]+");
 *   : 정규표현식 이라 함
 *       1. [ ] == 문자 집합을 나타냄 (이 경우는 공백)
 *          []의 안에 문자를 넣으면 됨 ([~]나 ['] 등)
 *       2. + == 정규표현식의 반복 연산자 (앞의 패턴이 하나 이상 반복된다는 의미)
 *
 *       ∴ "[ ]+" 는 하나 이상의 공백 문자를 의미
 *         "\\s+" 도 비슷함
 *
 *   String str = "Hello\tWorld\n!"; 라 하면
 *   "[ ]+"  -->  ["Hello\tWorld\n!"]
 *   "\\s+"  -->  ["Hello", "World", "!"]
 */


package programmers.july.july15;

public class DivisionSpace2 {
    public String[] solution(String my_string) {
        StringBuilder sb = new StringBuilder();

          // my_string을 공백으로 구분 (공백은 하나 이상, 문자의 끝에도 존재 가능)
        for(String s : my_string.trim().split(" ")) {
            if(!s.isEmpty()) sb.append(s).append(",");
        }
          // 문자열을 ,로 구분한 후 반환
        return sb.toString().split(",");
    }
}
