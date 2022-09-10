package codej.programmers.demo.level1_V2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class 완주하지못한선수 {
    public String solution(String[] participant,String[] completion){
        //단 한명의 선수를 제외하고는 모든 선수가 마라톤을 완주
        //마라톤에 참여한 선수들의 이름이 담긴 배열 participant,
        //완주한 선수들의 이름이 담긴 배열 completion
        //완주하지 못한 선수의 이름을 return
        //completion 길이는 participant 길이보다 1 작다.
        //참가자 중에는 동명이인이 있다
        String answer ="";
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String part : participant) {
            map.put(part,map.getOrDefault(part,0)+1);
        }
        for (String com : completion) {
            map.put(com,map.getOrDefault(com,0)-1);
        }
        for (String key : map.keySet()) {
            if(map.getOrDefault(key,0) != 0){
                answer = key;
            }
        }
//        System.out.println(map);
        return answer;
    }
    public static void main(String[] args) {
        String[] participant ={"leo","kiki","eden"};
        String[] completion = {"eden","kiki"};
        완주하지못한선수 sol = new 완주하지못한선수();
        System.out.println(        sol.solution(participant,completion)
        );
    }
}
