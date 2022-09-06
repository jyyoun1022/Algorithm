package codej.programmers.demo.level1_V2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순으로배치하기 {
    public String solution(String s){
//        String answer ="";
//        char[] arr = s.toCharArray();
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        String sb = new StringBuilder(new String(arr)).reverse().toString();
//        answer = sb.toString();
//        return answer;
        String[] arr = s.split("");
        Arrays.sort(arr,Collections.reverseOrder());
        String answer ="";
        for (String s1 : arr) {
            answer += s1;
        }
        return answer;
    }
    public static void main(String[] args) {
        String s = "Zbcdefg";
        문자열내림차순으로배치하기 sol = new 문자열내림차순으로배치하기();
        System.out.println(        sol.solution(s)
        );
    }
}
