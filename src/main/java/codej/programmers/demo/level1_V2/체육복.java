package codej.programmers.demo.level1_V2;

import java.util.Arrays;

public class 체육복 {
    public int solution(int n, int [] lost,int[] reserve){
        //바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있다.
        //체육복이 없다면 수업참여 불가
        //전체 학생수 n, 체육복을 도난당한 lost, 여벌의 체육복을 가져온 학생들 번호 reserve
        //체육수업을 들을 수 있는 학생의 최대값을 return
        // 2<= n <=30
        //여벌 체육복을 가져온 학생이 체육복을 도난 당했을 수도 있다.
        int answer =0;
        int[] cloth = new int[n+1];
        //여벌옷이 있는 사람은 +1 해주기
        for (int res : reserve) {
            cloth[res] += 1;
        }
        for (int los : lost) {
            cloth[los] -= 1;
        }

        for(int i=1; i<n; i++){
            if(cloth[i] == -1){//체육복을 잃어버려 없는 학생들일 때
                if(cloth[i-1] == 1){
                    cloth[i-1] -= 1;
                    cloth[i] +=1;
                    continue;
                }
                if(cloth[i+1] ==1){
                    cloth[i+1] -= 1;
                    cloth[i] +=1;
                    continue;
                }
            }else{
                continue;
            }
        }
        for(int i=1; i< cloth.length; i++){
           if(cloth[i] >= 0){
               answer++;
           }
        }
        // 0 1 -1 1 -1 1
        // 0 0  0 0  0 1
//        System.out.println(Arrays.toString(cloth));
        return answer;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};
        체육복 sol = new 체육복();
        System.out.println(        sol.solution(n,lost,reserve)
        );
    }
}
