public class LeftRight {
    public String[] solution(String[] str_list) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for(int i = 0; i < str_list.length; i++) {
            sb.append(str_list[i]);

            if(str_list[i].equals("l") && i != 0 && idx == 0) {
                sb.deleteCharAt(i);
                return sb.length() == 0 ? new String[] {} : sb.toString().split("");
            } else if (str_list[i].equals("r")) {
                idx = i;
            }
        }
        
        if(idx == 0) {
            return new String[] {};
        } else {
            return sb.length() == 0 ? new String[] {} : sb.substring(idx + 1).split("");    
        }
    }
}