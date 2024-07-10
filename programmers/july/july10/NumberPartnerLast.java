/** 2024-07-10 14:30
 *  코딩테스트 연습 > 연습문제 > 숫자 짝꿍
 *  https://school.programmers.co.kr/learn/courses/30/lessons/131128
 */

/**
 *  각 문자가 반복되는 횟수를 for문 반복으로 계산하는 대신
 *  수를 정렬하고 각 숫자의 마지막 인덱스를 기준으로 숫자의 개수를 파악
 */

package programmers.july.july10;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
 
public class NumberPartnerLast {
    public String solution(String X, String Y) {
//        List<Integer> al1 = new ArrayList<> ();
//        List<Integer> al2 = new ArrayList<> ();
//        HashMap<Integer, Integer> hs = new HashMap<> ();
//
//        for(String s : X.split("")) {
//            al1.add(Integer.parseInt(s));
//        }
//        for(String s : Y.split("")) {
//            al2.add(Integer.parseInt(s));
//        }
//
//        al1.sort(Integer::compareTo);
//        al2.sort(Integer::compareTo);
//
//        for(int i = al1.get(0); i <= 9; i++) {
//            if(al1.isEmpty()) {
//                break;
//            } else if(al1.get(0) == i) {
//                hs.put(i, al1.lastIndexOf(i) + 1);
//                al1.subList(0, al1.lastIndexOf(i) + 1).clear();
//            }
//        }
//
//        String answer = "";
//
//        for(int i = 0; i <= 9; i++) {
//            if(al2.isEmpty()) {
//                break;
//            }
//
//            if(hs.get(i) == null) {
//                al2.subList(0, al2.lastIndexOf(i) + 1).clear();
//                continue;
//            }
//
//            answer = (i + "").repeat(Math.min(hs.get(i), al2.lastIndexOf(i) + 1)) + answer;
//            al2.subList(0, al2.lastIndexOf(i) + 1).clear();
//        }
//
//        return answer.isEmpty() ? "-1" : answer.startsWith("0") ? "0" : answer;
//    }
        List<Integer> al1 = new ArrayList<> ();
        List<Integer> al2 = new ArrayList<> ();
        HashMap<Integer, Integer> hs = new HashMap<> ();

        for(String s : X.split("")) {
            al1.add(Integer.parseInt(s));
        }
        for(String s : Y.split("")) {
            al2.add(Integer.parseInt(s));
        }

        al1.sort(Integer::compareTo);
        al2.sort(Integer::compareTo);

        for(int i = al1.get(0); i <= 9; i++) {
            if(al1.isEmpty()) {
                break;
            } else if(al1.get(0) == i) {
                System.out.println("원소: " + al1);
                System.out.println("Map key: " + i + " / 원소의 개수: " + (al1.lastIndexOf(i) + 1));
                hs.put(i, al1.lastIndexOf(i) + 1);
                al1.subList(0, al1.lastIndexOf(i) + 1).clear();
                System.out.println(hs.entrySet());
                System.out.println("남은 원소: " + al1 + "\n");

            }
        }
        System.out.println();

        String answer = "";

        for(int i = 0; i <= 9; i++) {
            if(al2.isEmpty()) {
                break;
            }
            System.out.println(i);
            System.out.println("원소: " + al2);
            System.out.println("Map key: " + i + " / 원소의 개수: " + (al2.lastIndexOf(i) + 1));
            if(hs.get(i) == null) {
                System.out.printf("Hashmap에 %d 값이 없음\n", i);
                al2.subList(0, al2.lastIndexOf(i) + 1).clear();
                System.out.println("이것은 해시맵: " + hs.entrySet());
                System.out.println("남은 원소: " + al2 + "\n");
                continue;
            }

            answer = (i + "").repeat(Math.min(hs.get(i), al2.lastIndexOf(i) + 1)) + answer;
            al2.subList(0, al2.lastIndexOf(i) + 1).clear();
            System.out.println("이것은 해시맵: " + hs.entrySet());
            System.out.println("남은 원소: " + al2 + "\n");
        }

        return answer.isEmpty() ? "-1" : answer.startsWith("0") ? "0" : answer;
    }

    public static void main(String[] args) {
        NumberPartnerLast np = new NumberPartnerLast();
        System.out.println(np.solution("5525","1255"));
    }
}
