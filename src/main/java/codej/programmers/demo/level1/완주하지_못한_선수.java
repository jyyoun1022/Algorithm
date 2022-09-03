package codej.programmers.demo.level1;

import java.util.*;

public class 완주하지_못한_선수 {

    public String solution(String[] participant, String[] completion){

       String answer ="";

        HashMap<String, Integer> map = new HashMap<>();
        for (String name : participant) {
            map.put(name,map.getOrDefault(name,0)+1);
        }

        for (String name : completion) {
            map.put(name,map.get(name)-1);
        }

        for (String str : map.keySet()) {
            if(map.get(str) != 0){
                answer =str;
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        String[] part = {"mislav", "stanko", "mislav", "ana"};
        String[] com = {"stanko", "ana", "mislav"};
        완주하지_못한_선수 sol = new 완주하지_못한_선수();
        sol.solution(part,com);

    }
}



