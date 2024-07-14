/** 2024-07-12 19:50
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 대문자로 바꾸기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181877
 */


package programmers.july.july12;

public class ChangeUpper {
    public String solution(String myString) {
        return myString.toUpperCase();
    }
}

/**
 *  아스키코드를 이용한 풀이
 *
class ChangeUpper1 {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < myString.length(); i++) {
            sb.append(myString.charAt(i) > 91 ? (char) (myString.charAt(i) - 32) : myString.charAt(i));
        }

        return sb.toString();
    }
}

 */
