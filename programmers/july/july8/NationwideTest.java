package programmers.july.july8;
import java.util.HashMap;
import java.util.HashSet;

public class NationwideTest {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> hm = new HashMap<> ();
        HashSet<Integer> hs = new HashSet<> ();
        int answer = 0;
        int count = 0;
        int mul = (int) (10000 / Math.pow(100, count));

        for(int i = 0; i < rank.length; i++) {
            rank[i] = attendance[i] ? rank[i] : 0;
            if(rank[i] != 0) {
                hm.put(i, rank[i] - 1);
                hs.add(rank[i]);
            }
        }

        System.out.println(hm.entrySet());
        System.out.println(hm.get(1));
        System.out.println(hm.get(2));
        System.out.println(hm.get(3));

        answer = hm.get(1) * 10000 + hm.get(2) * 100 + hm.get(3);
        System.out.println(answer);
        return answer;

    }

    public static void main(String[] args) {
        NationwideTest test = new NationwideTest();
        test.solution(new int[] {3, 7, 2, 5, 4, 6, 1}, new boolean[] {false, true, true, true, true, false, false});
    }
}
