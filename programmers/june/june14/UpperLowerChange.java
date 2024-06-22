/** 2024-06-14 03:40
 *  대소문자 바꿔서 출력하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181949
 */


package programmers.june.june14;
import java.util.Scanner;

public class UpperLowerChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner 인스턴스 생성
        String a = sc.next();                 // String 변수 a에 입력값 받기
        String result = "";                   // 대소문자 변환 결과값을 받을 String 변수 result 선언

        for(int i = 0; i < a.length(); i++) {        // 입력값 받은 a의 문자열 개수만큼 반복
            char c = a.charAt(i);                       // i가 반복될 때마다 a의 인덱스 i번에 있는 문자를 하나씩 문자 변수 c에 대입
            if (Character.isUpperCase(c)) {             // 대입된 문자 c가 대문자라면
                result += Character.toLowerCase(c);     // result 변수에 담겨 있는 문자의 뒤에 c를 소문자로 변환하여 대입
            } else {                                    // 대문자가 아니라면
                result += Character.toUpperCase(c);     // result 변수에 담겨 있는 문자의 뒤에 c를 대문자로 변환하여 대입
            }
        } 
        System.out.println(result);     // 반복문이 끝난 후의 result 문자열을 프린트 (대소문자가 바뀜)
    }
}
