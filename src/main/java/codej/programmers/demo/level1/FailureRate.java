package codej.programmers.demo.level1;

import java.util.*;

public class FailureRate {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = new int[]{2, 1, 2, 6, 2, 4, 3, 3};

        int[] answer = new int[N];
        //실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수
        double failRate = 0;
        List<Integer> notClear_list = new ArrayList<>();//스테이지에 도달했으나 클리어 못한 플레이어 리스트
        List<Integer> stage_list = new ArrayList<>();//스테이지에 도달한 플레이어 플레이어 리스트
        List<Double> fail_list =new ArrayList<>();//실패율 리스트
        List<Integer> answer_list = new ArrayList<>(); // 결과 순서(실패율 순서) 리스트
        int[] arr = new int[N];
        for(int i=1; i <= N; i++){
            stage_list.clear();
            notClear_list.clear();
            for(int j=0; j < stages.length; j++){
                if(stages[j] >= i){//도달했거나 클리어한사람
                    stage_list.add(j);
                }
                if(stages[j] == i){
                    notClear_list.add(j);
                }
            }if(stage_list.size()==0){
                failRate =0;
            }else {
                failRate = (double) notClear_list.size() / stage_list.size();
            }
            fail_list.add(failRate);


        }

        for(int i=0; i<N; i++){
            double max = -1;
            int index =0;
            for(int j=0; j<N; j++){
                if(max < fail_list.get(j)){
                    max = fail_list.get(j);
                    index = j;
                }
            }
            fail_list.set(index,-1.0);
            answer[i] = index+1;

        }


        System.out.println(Arrays.toString(answer));
        }

    }


