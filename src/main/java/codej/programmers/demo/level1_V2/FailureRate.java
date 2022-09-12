package codej.programmers.demo.level1_V2;

import java.util.Arrays;
import java.util.HashMap;

public class FailureRate {
    public int[] solution(int N, int[] stages){
        int[] answer =new int[N];
        //실패율 =도달했으나 클리어 못한 수 / 도달한 인원
        HashMap<Integer, Double> map = new HashMap<>();
        //key : 스테이지 단계 , value : 실패율
        for(int i=1; i <= N; i++){
            int notClear =0;
            int participate =0;
            double failRate =0;
            for(int j=0; j<stages.length; j++) {
                if (i == stages[j]) {
                    notClear++;
                }
                if (i <= stages[j]) {
                    participate++;
                }
                if (participate == 0) {
                    failRate = 0;
                } else {
                    failRate = (double) notClear / participate;
                }
            }
            map.put(i,failRate);
        }
//       for(Integer key : map.keySet()){
//           Double value = map.get(key);
//           System.out.println(key +" : "+value);
//       }

        for(int i=0; i< N; i++){
            double max = -1;
            int index =0;
            for (Integer key : map.keySet()) {
                if(max < map.get(key)){
                    max = map.get(key);
                    index = key;
                }
            }
            map.put(index,-1.0);
            answer[i] = index;
        }

        return answer;
    }

    public static void main(String[] args) {
        int N =5;
        int[] stages = {2,1,2,6,2,4,3,3};
        FailureRate sol = new FailureRate();
        System.out.println(Arrays.toString(sol.solution(N,stages))
        );
    }

}
