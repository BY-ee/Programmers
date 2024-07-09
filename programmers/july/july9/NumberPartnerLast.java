/** 2024-07-09 16:30
 *  코딩테스트 연습 > 연습문제 > 숫자 짝꿍
 *  https://school.programmers.co.kr/learn/courses/30/lessons/131128
 */


package programmers.july.july9;
import java.util.Arrays;
import java.util.HashSet;
 
public class NumberPartnerLast {
    public String solution(String X, String Y) {
        HashSet<String> hs1 = new HashSet<> ();
        HashSet<String> hs2 = new HashSet<> ();
        StringBuilder sb = new StringBuilder();

        for(String s : X.split("")) {
            hs1.add(s);
        }
        for(String s : Y.split("")) {
            hs2.add(s);
        }

        hs1.retainAll(hs2);

        int[] arrX = new int[X.length()];
        int[] arrY = new int[Y.length()];

        for(int i = 0; i < X.length(); i++) {
            arrX[i] = Character.getNumericValue(X.charAt(i));
        }
        for(int i = 0; i < Y.length(); i++) {
            arrY[i] = Character.getNumericValue(Y.charAt(i));
        }

        
        
        for(int i = 9; i >= 0; i--) {
            int cntx = 0;
            int cnty = 0;

            for(int j = 0; j < X.length(); j++) {
                
            }
        }

        return "1";
    }

    public static void main(String[] args) {
        NumberPartnerLast np = new NumberPartnerLast();
        System.out.println(np.solution("985410","763210"));
    }
}
