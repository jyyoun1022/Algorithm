package codej.programmers.demo.level1;

import java.util.HashMap;
import java.util.HashSet;

public class 성격 {
    public String solution(String[] survey,int[] choices){
        String answer ="";
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(String str : survey){
            String first = str.split("")[0];
            String second = str.split("")[1];
            set.add(first);
            set.add(second);
        }
        for (String s : set) {
            map.put(s,0);
        }



        for(int i=0; i< survey.length; i++){
            if(choices[i] == 4){
                continue;
            }
            if(choices[i] < 4){
                map.replace(survey[i].split("")[0],(map.get(survey[i].split("")[0])+(4-choices[i])));
            }else{
                map.replace(survey[i].split("")[1],(map.get(survey[i].split("")[1])+(choices[i]-4)));
            }
        }

        for (String key : map.keySet()) {
            int value = map.get(key);
        }
        answer = map.get("A") >= map.get("N") ? answer  +"A" : answer + "N";
        answer = map.get("R") >= map.get("T") ? answer + "R" : answer + "T";
        answer = map.get("F") >= map.get("C") ? answer + "F" : answer + "C";
        answer = map.get("M") >= map.get("J") ? answer + "M" : answer + "J";

        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        String[] survey ={"TR", "RT", "TR"};
        int[] choices ={7, 1, 3};
        성격 sol = new 성격();
        sol.solution(survey,choices);

    }
}
