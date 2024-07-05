/** 2024-07-04 15:00
 *  글자 지우기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181900
 */

/**
 *  특정 인덱스의 문자를 지우는 것보다
 *  문자열을 문자 배열로 만들어서 특정 인덱스의 문자를 ""로 만드는 게 더 간단
 *  혹은 인덱스 자리의 문자를 공백 (" ")으로 만들어서 나중에 ""로 지우는 방법도 가능
 *  유연한 사고
 */

package programmers.july.july4;
import java.util.Arrays;

public class EraseChar {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
            // indices를 오름차순 정렬 (앞의 문자를 지우면 뒤의 문자 인덱스에 영향이 가기 때문에 뒤의 문자부터 지우기 위함)
        StringBuilder sb = new StringBuilder(my_string);  // StringBuilder 인스턴스 sb 생성

        for(int i = 0; i < indices.length; i++) {             // indices의 길이만큼 반복
            sb.deleteCharAt(indices[indices.length - i - 1]);   // sb의 indices 인덱스에 있는 문자를 맨 뒤에서부터 하나씩 삭제
        }

        return sb.toString();   // sb를 String으로 변환 후 반환
    }
}
