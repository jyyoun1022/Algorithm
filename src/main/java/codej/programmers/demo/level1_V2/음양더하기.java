package codej.programmers.demo.level1_V2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        String[] chars = new String[signs.length];

        for(int i=0; i<chars.length; i++){
            if(signs[i] == true){
                chars[i] = "+";
            }else{
                chars[i] = "-";
            }
        }

        for(int i=0; i< absolutes.length; i++){
            answer += Integer.parseInt(chars[i]+absolutes[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        음양더하기 sol = new 음양더하기();
        System.out.println(sol.solution(absolutes, signs)
        );
    }
}
