/** 2024-07-10 14:30
 *  코딩테스트 연습 > 연습문제 > 숫자 짝꿍
 *  https://school.programmers.co.kr/learn/courses/30/lessons/131128
 */

/**
 *  각 문자가 반복되는 횟수를 for문 반복으로 계산하는 대신
 *  수를 정렬하고 각 숫자의 마지막 인덱스를 기준으로 숫자의 개수를 파악
 *
 *  길이 10의 배열을 생성하고 어떤 숫자가 나올 때 해당 인덱스에 ++ 하는 방식이 더 직관적인듯.
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
 
         for(String s : X.split("")) {  // X의 문자열을 문자 배열로 만듦
             al1.add(Integer.parseInt(s));    // 각 문자를 정수로 변환 후 al1에 대입
         }
         for(String s : Y.split("")) {  // Y의 문자열을 문자 배열로 만듦
             al2.add(Integer.parseInt(s));    // 각 문자를 정수로 변환 후 al2에 대입
         }
 
           // ar1, ar2를 오름차순 정렬
         al1.sort(Integer::compareTo);
         al2.sort(Integer::compareTo);
 
         for(int i = al1.get(0); i <= 9; i++) {  // al1의 인덱스 0의 값부터 9까지 반복
             if(al1.isEmpty()) {            // al1이 비어있다면 break
                 break;
             } else if(al1.get(0) == i) {
                   // al1의 0 인덱스 값이 i라면 (문자열이 0부터 9까지 모두 나오는 게 아니기 때문에 중간에 비어있는 숫자를 제외하기 위함)
                 System.out.println("원소: " + al1);
                 System.out.println("Map key: " + i + " / 원소의 개수: " + (al1.lastIndexOf(i) + 1));
                 hs.put(i, al1.lastIndexOf(i) + 1);
                   // Hashmap의 key:value에 i:al의 i 값의 마지막 인덱스 + 1 값 대입 (마지막 인덱스는 그 숫자의 총 개수를 의미)
                 al1.subList(0, al1.lastIndexOf(i) + 1).clear(); // 대입한 값을 al1에서 제거
                 System.out.println(hs.entrySet());
                 System.out.println("남은 원소: " + al1 + "\n");
 
             }
         }
         System.out.println();
 
         String answer = "";   // 답을 더할 문자열 변수 초기화
 
         for(int i = 0; i <= 9; i++) {   // 0부터 9까지 반복
             if(al2.isEmpty()) {   // al2가 비어있다면 break
                 break;
             }
             System.out.println(i);
             System.out.println("원소: " + al2);
             System.out.println("Map key: " + i + " / 원소의 개수: " + (al2.lastIndexOf(i) + 1));
             if(hs.get(i) == null) {   // hs의 i 값이 null이라면
                 System.out.printf("Hashmap에 %d 값이 없음\n", i);
                 al2.subList(0, al2.lastIndexOf(i) + 1).clear();  // al2의 i 값을 제거 후 continue
                 System.out.println("이것은 해시맵: " + hs.entrySet());
                 System.out.println("남은 원소: " + al2 + "\n");
                 continue;
             }
 
             answer = (i + "").repeat(Math.min(hs.get(i), al2.lastIndexOf(i) + 1)) + answer;
               // answer 문자열에 i 문자열을 al2의 i의 개수만큼 반복해서 입력 후 answer의 앞에 더함 (내림차순으로 변환)
             al2.subList(0, al2.lastIndexOf(i) + 1).clear();  // 더한 값을 al2에서 제거
             System.out.println("이것은 해시맵: " + hs.entrySet());
             System.out.println("남은 원소: " + al2 + "\n");
         }
 
         return answer.isEmpty() ? "-1" : answer.startsWith("0") ? "0" : answer;
           // answer이 빈 문자열이라면 -1을, 0으로만 이루어져 있다면 0을, 아니라면 answer을 반환 
     }
 
     public static void main(String[] args) {
         NumberPartnerLast np = new NumberPartnerLast();
         System.out.println(np.solution("5525","1255"));
     }
 }