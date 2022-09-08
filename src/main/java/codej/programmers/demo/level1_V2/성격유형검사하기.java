package codej.programmers.demo.level1_V2;

import codej.programmers.demo.string.Chara;

import java.util.HashMap;
import java.util.HashSet;

public class 성격유형검사하기 {
    public String solution(String[] survey,int[] choices){
        String answer = "";
        char[] type = {'R','T','C','F','J','M','A','N'};

        HashMap<Character, Integer> map = new HashMap<>();


        return answer;
    }
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        성격유형검사하기 sol = new 성격유형검사하기();
        System.out.println(        sol.solution(survey,choices)
        );
    }
}
