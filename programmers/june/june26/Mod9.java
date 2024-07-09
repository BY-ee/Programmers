/** 2024-06-27 02:20
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 9로 나눈 나머지
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181914
 */

/**
 * answer += number.charAt(i) - '0';
 * 
 * charAt는 문자열 변수에 담으면 문자 그대로가, 정수 변수에 담으면 문자의 아스키 코드값이 담김
 * 따라서 '0'을 빼준다는 것은 (어떤 숫자의 아스키 코드값 - 0의 아스키 코드값)을 의미하기 때문에 결과적으로는 내가 담으려는 숫자가 담기는 것.
 */

package programmers.june.june26;

public class Mod9 {
    public int solution(String number) {
        int answer = 0;   // 초기 변수 초기화
        for(int i = 0; i < number.length(); i++) {  // number의 문자 개수만큼 반복
            answer += Integer.parseInt(Character.toString(number.charAt(i)));
               // number의 i 인덱스의 문자를 문자열 타입으로 변환 후 다시 정수 타입으로 변환해서 answer에 더한 후 대입
            
            System.out.println(answer);
        }
        
        return answer % 9;  // answer을 9로 나눈 값의 나머지를 반환
    }

    public static void main(String[] args) {
        Mod9 m1 = new Mod9();
        m1.solution("1012125112551");
    }
}
