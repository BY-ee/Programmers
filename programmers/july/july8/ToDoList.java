/** 2024-07-08 17:20
 *  할 일 목록
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181885
 */


package programmers.july.july8;
import java.util.ArrayList;

public class ToDoList {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> al = new ArrayList<> ();

        for(int i = 0; i < todo_list.length; i++) {  // todo_list의 길이만큼 반복
            if(!finished[i]) al.add(todo_list[i]);     // finished의 i 인덱스가 false라면 al에 todo_list의 i 인덱스 값 대입
        }

        String[] answer = new String[al.size()];  // al의 크기만큼의 길이를 가진 answer 문자열 배열 생성

        return al.toArray(answer);  // al을 answer 타입의 배열로 변환하여 반환
                                    // answer이 불필요? (new String[0] or String[]::new)
    }
}
