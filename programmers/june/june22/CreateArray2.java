/** 2024-06-23 04:30
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 배열 만들기 2
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181921
 */


package programmers.june.june22;
import java.util.ArrayList;

public class CreateArray2 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> al = new ArrayList<>();   // Integer 데이터를 넣는 ArrayList 인스턴스 생성

        for (int i = 1; i < 64; i++) {               // 64를 이진수로 변환하면 1,000,000 (조건을 맞추기 위함)
            int a = Integer.parseInt(Integer.toBinaryString(i)) * 5;
                // i를 이진수로 변환한 문자열을 다시 십진수로 변환한 후 5를 곱한 값을 변수 a에 대입
            if (l <= a && a <= r) {  // a가 l 이상 r 이하라면
                al.add(a);           // al에 a값을 넣음
            }
        }
        int[] answer = new int[al.size()];   // 정수 배열 answer 생성 (배열 길이는 al의 size)
        
        for (int i = 0; i < answer.length; i++) {   // answer의 길이만큼 반복
            answer[i] = al.get(i);                  // al의 i 인덱스 데이터를 answer의 i 인덱스에 대입
        }

        return answer.length == 0 ? new int[] {-1} : answer;
            // answer에 들어있는 데이터가 없다면 -1 반환, 있다면 answer 반환
    }
}