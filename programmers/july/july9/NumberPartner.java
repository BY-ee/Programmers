/** 2024-07-09 12:00
 *  코딩테스트 연습 > 연습문제 > 숫자 짝꿍
 *  https://school.programmers.co.kr/learn/courses/30/lessons/131128
 */

/**
 *  로직은 맞으나 타임오버 발생
 *  많은 반복문이 원인?
 */


package programmers.july.july9;
import java.util.Arrays;
import java.util.Stack;
import java.util.ArrayList;

public class NumberPartner {
    public String solution(String X, String Y) {
        Stack<String> s1 = new Stack<> ();
        ArrayList<String> al = new ArrayList<> (Arrays.asList(Y.split("")));
        ArrayList<Integer> al2 = new ArrayList<> ();
        int idx;
        String answer = "";

        for(String s : X.split("")) {
            s1.push(s);
        }
        al.sort(String::compareTo);

        while(!s1.isEmpty()) {
            for(idx = 0; idx < al.size(); idx++) {
               if(s1.peek().equals(al.get(idx))) {
                   al2.add(Integer.parseInt(al.get(idx)));
                   al2.sort(Integer::compareTo);
                   al.remove(idx);
                   break;
               }
               if(Integer.parseInt(s1.peek()) < Integer.parseInt(al.get(idx))) {
                   break;
                }
            }
            s1.pop();
        }

        for(Integer i : al2) {
            answer = i + answer;
        }

        return answer.isEmpty() ? "-1" : answer.startsWith("0") ? "0" : answer;
    }

    public static void main(String[] args) {
        NumberPartner np = new NumberPartner();
        System.out.println(np.solution("1000","10000"));
    }
}
