package codej.programmers.demo.level1_V2;

import java.util.Arrays;

public class 이상한문자만들기 {
    public String solution(String s){
        String answer= "";
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();

        int count =0;

        for (String str : arr) {
            if(str.contains(" ")){
                count = 0;
            }else{
                count = count+1;
            }
            sb.append( count %2 ==0 ? str.toLowerCase() : str.toUpperCase());

        }
        answer =sb.toString();

        return answer;
    }
    public static void main(String[] args) {
        String s = "try hello world";
        이상한문자만들기 sol = new 이상한문자만들기();
        System.out.println(        sol.solution(s)
        );
    }
}
