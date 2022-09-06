package codej.programmers.demo.level1_V2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings,int n){
        String[] answer =new String[strings.length];
        ArrayList<String> list = new ArrayList<>();
        int index =0;
        for(String str : strings){
            list.add(str.charAt(n)+strings[index++]);
        }
        Collections.sort(list);
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        문자열내마음대로정렬하기 sol = new 문자열내마음대로정렬하기();
        System.out.println(        sol.solution(strings,n)
        );
    }
}
