/** 2024-06-22 23:30
 *  수 조작하기 1
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181926
 */


package programmers.june.june22;

public class ControlNum1 {
    public int solution(int n, String control) {
        // String[] aaa = control.split("");  // 문자열이 하나하나씩 분리 (원래는 split의 매개변수에 입력된 데이터를 기준으로 분리됨)

        for(int i = 0; i < control.length(); i++) {
             // 문자열 매개변수 control의 문자열 개수만큼 반복
            char con = control.charAt(i);   // control의 인덱스 i의 문자를 문자 변수 con에 대입
            switch(con) {          // con을 기준으로 switch 선언
                case 'w': n += 1;  // con의 문자가 w면 n에 +1
                break;
                
                case 's': n -= 1;  // con의 문자가 s면 n에 -1
                break;

                case 'd': n += 10; // con의 문자가 d면 n에 +10
                break;

                case 'a': n -= 10; // con의 문자가 a면 n에 -10
                break;

                default:
                break;
            }
            
        }
        return n;  // n을 반환
    }
    public static void main(String[] args) {
        ControlNum1 c1 = new ControlNum1();
        System.out.println(c1.solution(10, "awaddasdawdswsdssadaw"));
    }

}
