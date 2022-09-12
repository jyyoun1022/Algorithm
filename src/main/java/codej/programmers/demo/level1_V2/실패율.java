package codej.programmers.demo.level1_V2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 실패율 {
    public int[] solution(int N, int[] stages){
        //전체 스테이지의 개수 N, 게임을 이용하는 사용자가 멈춰있는 스테이지 stages, 실패율이 높은 스테이지부터 리턴
        int[] answer =new int[N];

        HashMap<Integer, Double> map = new HashMap<>();

        for(int i=1; i <= N; i++){
            int stage = i;
            int noClearPlayer =0;
            int currentStagePlayer =0;

            for(int j=0; j<stages.length; j++) {
                int player = stages[j];
                //현재 스테이지 클리어하지 못한사람
                if (stage == player) {
                    noClearPlayer++;
                }
                //현재 스테이지 도전자
                if (stage <= currentStagePlayer) {
                    currentStagePlayer++;
                }
            }
                //스테이지에 도달한 유저가 없는 경우 실패율 =0;
                //실패율 = 스테이지에 도달했으나 클리어하지못한 사람/스테이지에 도달한 플레이엉 수
                double failureRate = 0;
                if(noClearPlayer != 0 && currentStagePlayer != 0){
                    failureRate = (double)noClearPlayer / currentStagePlayer;
                }
                map.put(stage,failureRate);

        }

        for(int i=0; i<N; i++){
            double max =-1;
            int maxKey =0;
            for (Integer key : map.keySet()) {
                if(max < map.get(key)){
                    max = map.get(key);
                    maxKey = key;
                }
            }
            answer[i] = maxKey;
            map.remove(maxKey);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] stages ={2,1,2,6,2,4,3,3};
        실패율 sol = new 실패율();
        System.out.println(        sol.solution(N,stages)
        );
    }
}
