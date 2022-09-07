package codej.programmers.demo.level1_V2;

import java.util.*;

public class 신고결과받기 {
    public int[] solution(String[] id_list,String[] report, int k){
        int[] answer =new int[id_list.length];

        HashMap<String, HashSet<String>> reportedMap = new HashMap<>();
        //신고된id,신고한id
        HashMap<String, Integer> answerMap = new HashMap<>();
        //신고된id,메일 수

        //1. Map 초기화
        for(int i=0; i< id_list.length; i++){
            reportedMap.put(id_list[i],new HashSet<>());//신고당한id,신고한id
            answerMap.put(id_list[i],0);//메일 수는 0 으로  초기화
        }
        //2.신고 기록 세팅
        for(String s : report){
            String reporter = s.split(" ")[0];
            String reported = s.split(" ")[1];

            reportedMap.get(reported).add(reporter);
        }
        //유저가 받은 이용 정지 결과
        for (String reported : reportedMap.keySet()) {
            HashSet<String> reporter = reportedMap.get(reported);
            if(reporter.size() >= k){
                for(String repot : reporter){
                    answerMap.put(repot,answerMap.get(repot)+1);
                }
            }
        }
//        for (Map.Entry<String, HashSet<String>> entry : reportedMap.entrySet()) {
//            System.out.println(entry.getKey() + " : "+entry.getValue());
//        }
        for (Map.Entry<String, Integer> entry : answerMap.entrySet()) {
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report ={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        신고결과받기 sol = new 신고결과받기();
        System.out.println(        sol.solution(id_list,report,k)
        );
    }
}
