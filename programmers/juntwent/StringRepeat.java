/** 2024-06-12 02:05
 *  문자열 반복해서 출력하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181950
 */

package programmers.juntwent;
import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int n = sc.nextInt();
        
        System.out.println(A.repeat(n));
    }
}
