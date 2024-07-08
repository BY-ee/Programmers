/** 2024-07-08 14:40
 *  왼쪽 오른쪽 (배열에 l, r중 l이     앞쪽에 있다면 l의 왼쪽 데이터를, r이 앞쪽에 있다면 r의 오른쪽 데이터를 반환)
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181890
 */


package programmers.july.july7;

public class LeftRight {
    public String[] solution(String[] str_list) {
        StringBuilder sb = new StringBuilder();  // StringBuilder 인스턴스 생성
        for(String s : str_list) {    // str_list의 데이터를 하나씩 추출
            sb.append(s);             // 추출된 데이터를 순서대로 sb에 대입
        }

        int firstl = sb.indexOf("l") == -1 ? 0 : sb.indexOf("l");
          // sb에 l 문자의 인덱스가 -1이면 firstl에 0 대입, 아니라면 l 문자의 인덱스 대입 (indexOf는 그 데이터가 없다면 -1 반환)
        int firstr = sb.indexOf("r") == -1 ? sb.length() : sb.indexOf("r");
          // sb에 r 문자의 인덱스가 -1이면 firstr에 sb의 길이를 대입, 아니라면 r 문자의 인덱스 대입

        if((firstl == 0 && firstr == sb.length()) || sb.length() == 0 || sb.length() == 1) {
            return new String[] {};
              // firstl이 0이고 firstr이 sb의 길이거나(l과 r 둘다 없음), sb의 길이가 0이나 1이라면 빈 배열 반환
        } else if (firstl < firstr) {
              // l의 인덱스가 r의 인덱스보다 작다면
            return firstl == 0 ? new String[] {} : sb.substring(0, firstl).split("");
              // firstl이 0이라면(l이 배열의 맨 앞이라면) 빈 배열 반환, 아니라면 l 이전의 문자열 배열을 반환
        } else {
            return sb.substring(firstr + 1, sb.length()).split("");
              // r의 오른쪽에 있는 문자 배열을 반환
        }
    }

    public static void main(String[] args) {
        LeftRight l = new LeftRight();
        l.solution(new String[]{"a", "l", "l", "a"});
    }
}