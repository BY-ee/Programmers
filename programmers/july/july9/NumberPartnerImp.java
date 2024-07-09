/** 2024-07-09 16:30
 *  코딩테스트 연습 > 연습문제 > 숫자 짝꿍
 *  https://school.programmers.co.kr/learn/courses/30/lessons/131128
 */

/**
 *  타임오버 발생
 *  반복문은 적어졌지만 여전히 많음
 */


package programmers.july.july9;
import java.util.ArrayList;

public class NumberPartnerImp {
    public String solution(String X, String Y) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(String s : X.split("")) {
            al1.add(Integer.parseInt(s));
            al1.sort((i1, i2) -> i2.compareTo(i1));
        }
        for(String s : Y.split("")) {
            al2.add(Integer.parseInt(s));
            al2.sort((i1, i2) -> i2.compareTo(i1));
        }
//        System.out.println("al1 ---> " + al1);
//        System.out.println("al2 ---> " + al2);

        for(int i = 9; i >= 0; i--) {
//            System.out.println(i + "al1 개수: " + (al1.lastIndexOf(i) + 1));
//            System.out.println(i + "al2 개수: " + (al2.lastIndexOf(i) + 1) + "\n");

            if(al1.lastIndexOf(i) + 1 > 0 && al2.lastIndexOf(i) + 1 > 0) {
                sb.append((i + "").repeat(Math.min(al1.lastIndexOf(i) + 1, al2.lastIndexOf(i) + 1)));
//                System.out.println("sb = " + sb);
            }

            if(al1.lastIndexOf(i) + 1 > 0) {
                al1.subList(0, al1.lastIndexOf(i) + 1).clear();
            }
            if(al2.lastIndexOf(i) + 1 > 0) {
                al2.subList(0, al2.lastIndexOf(i) + 1).clear();
            }
        }

        return sb.length() == 0 ? "-1" : sb.charAt(0) == '0' ? "0" : sb.toString();
    }


    public static void main(String[] args) {
        NumberPartnerImp np = new NumberPartnerImp();
        System.out.println(np.solution("985410","763210"));
    }
}
