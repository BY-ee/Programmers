/** 2024-07-12 20:15
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 소문자로 바꾸기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181876
 */


package programmers.july.july12;

class ChangeLower {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            sb.append(myString.charAt(i) < 92 ? (char) (myString.charAt(i) + 32) : myString.charAt(i));
        }

        return sb.toString();
    }
}