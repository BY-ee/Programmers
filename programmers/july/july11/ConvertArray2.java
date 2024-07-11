package programmers.july.july11;
import java.util.Arrays;

public class ConvertArray2 {
    public int solution(int[] arr) {
        int[] answer = arr.clone();

        for(int i : answer) {
            int idx = 0;
            if(i >= 50 && i % 2 == 0) {
                answer[idx] = i / 2;
            } else if(i < 50 && i % 2 == 1) {
                answer[idx] = (i * 2) + 1;
            }
        }

        while(!Arrays.equals(answer, arr)) {
            arr = answer.clone();

            for(int i : answer) {
                int idx = 0;
                if(i >= 50 && i % 2 == 0) {
                    answer[idx] = i / 2;
                } else if(i < 50 && i % 2 == 1) {
                    answer[idx] = (i * 2) + 1;
                }
            }
        }
        Arrays.sort(answer);

        return answer[0];
    }
}
