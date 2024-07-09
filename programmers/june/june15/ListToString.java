/** 2024-06-15 03:20
 *  코딩테스트 연습 > 코딩 기초 트레이닝 > 문자 리스트를 문자열로 변환하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181941
 */


package programmers.june.june15;

class ListToString1 {
    public String result(String[] arr) {
        // 문자열 배열을 매개변수로 받는 메소드
        String result = "";   // 결과 문자열 변수 선언

        for (int i = 0; i < arr.length; i++) {  // 문자열 배열의 원소 개수만큼 반복
            result += arr[i];                   // 문자열의 인덱스마다 원래 result 변수에 더해서 할당
        }
        return result;  // 결과 문자열 반환
    }
}

public class ListToString {
    public static void main(String[] args) {
        ListToString1 l1 = new ListToString1();
        String[] a = {"a", "b", "c", "z", "y", "x"};
        System.out.println(l1.result(a));
    }
}