package codej.programmers.demo.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k){
        //각 유저는 한번에 한명의 유저를 신고할 수 있다.
        //신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
        //한 유저를 여러 번 신고할 수 도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
        //k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
        //유저가 신고한 모든 내용을 취합하여, 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
        //각 유저별로 처리 결과 메일을 받은 횟수를 배열에 담아 return
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> reporterInfoMap = new HashMap<>();
        HashMap<String, Integer> reportedCountInfoMap = new HashMap<>();
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));

        //1. repot 배열에서 신고한 사람,당한 사람 분리
        for(String reportInfo : reportSet){
            String reporter = reportInfo.split(" ")[0];//신고한 사람
            String reported = reportInfo.split(" ")[1];//신고당한 사람
            //2신고 배열을 map으로 바꾸기
            reporterInfoMap.putIfAbsent(reporter,new HashSet<String>(){{add(reported);}});

            reporterInfoMap.get(reporter).add(reported);
            reportedCountInfoMap.put(reporter,reportedCountInfoMap.getOrDefault(reported,0)+1);

        }

        for (String reported : reportedCountInfoMap.keySet()) {
            int reportedCount = reportedCountInfoMap.get(reported);
            if(reportedCount >= k){
                //메일 발송 대상
                for(int i=0; i< id_list.length; i++){
                    if(reporterInfoMap.containsKey(id_list[i]) && reporterInfoMap.get(id_list[i]).contains(reported)){
                        answer[i]++;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] id_list ={"muzi", "frodo", "apeach", "neo"};//이용자의 ID
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};//신고한 이용자 : 신고된 이용자
        int k= 2;//정지기준
        신고결과받기 sol = new 신고결과받기();
        sol.solution(id_list,report,2);
    }
}
