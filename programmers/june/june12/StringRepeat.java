/** 2024-06-12 02:05
 *  문자열 반복해서 출력하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181950
 */

package programmers.june.june12;
import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();   // 반복할 문자열 입력
        int n = sc.nextInt();   // 반복할 횟수 입력
        
        System.out.println(A.repeat(n));  // n번만큼 A 문자열을 반복 출력

        sc.close();
    }
}
