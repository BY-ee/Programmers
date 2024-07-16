/** 2024-07-16 09:10
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > x 사이의 개수
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181867
 */

package programmers.july.july16;
import java.util.ArrayList;

public class CountBetweenX {
    public int[] solution(String myString) {
        ArrayList<Integer> al = new ArrayList<> ();

        for(String s : myString.split("x")) {
            al.add(s.length());
        }

        if(myString.lastIndexOf("x") == myString.length() - 1) {
            al.add(0);
        }

        return al.stream().mapToInt(i -> i).toArray();
    }
}
