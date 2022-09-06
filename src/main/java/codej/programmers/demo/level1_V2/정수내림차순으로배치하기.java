package codej.programmers.demo.level1_V2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {
    public long solution(long n){
        long answer =0;
        String str = String.valueOf(n);
        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            list.add(s);
        }
        Collections.sort(list,Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        answer = Long.parseLong(sb.toString());

        return answer;
    }
    public static void main(String[] args) {
        long n = 118372;
        정수내림차순으로배치하기 sol = new 정수내림차순으로배치하기();
        System.out.println(        sol.solution(n)
        );
    }
}
