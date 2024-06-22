/** 2024-06-15 03:01
 *  문자열 섞기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181942
 */


package programmers.june.june15;

class A {
    public static String resultret (String str1, String str2) {
         // 문자열 str1, str2를 받고 한글자씩 번갈아서 더해지는 문자열을 출력
        
        int len = str1.length() * 2;        // 입력받는 문자열이 2개라 반복문의 반복횟수를 2배로 만들기 위한 변수 선언
        String result = "";                 // 결과 문자열 변수 선언
        int j = 0;                          // str1과 str2의 인덱스를 맞추기 위한 변수 선언

        for (int i = 0; i < len; i++) {     // 문자열의 길이만큼 반복하는 for 반복문
            if (i % 2 == 0) {               
                result += str1.charAt(j);
                // i / 2의 나머지가 0이라면 str1의 문자열을 결과에 대입
            } else {
                result += str2.charAt(j++);
                // i / 2의 나머지가 1이라면 str2의 문자열을 결과에 대입 후 인덱스 변수를 1 상승
            }
        }
        return result;
        // 결과 문자열 반환
    }
}

public class OnebyOne {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(A.resultret("bebeb", "ababs"));
        
    }
}
