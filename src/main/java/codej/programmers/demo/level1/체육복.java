package codej.programmers.demo.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 체육복 {
    public static void main(String[] args) {
        int n = 5;// 전체 학생수
        int[] lost = new int[]{2,4};//도난 당한 학생들의 번호
        int[] reserve = new int[]{1,3,5};//여별 옷이 있는 있는 학생들의 번호

        int answer = 0;
        int[] total = new int[n+2];

        for(int i : reserve){//여벌 옷이 있는 학생들은 +1
            total[i]++;
        }
        for(int i : lost){//도난 당한 사람들은 -1
            total[i]--;
        }
        for(int i=1; i <= n; i++){
            if(total[i] == -1){
                if(total[i-1] == 1){
                    total[i]++;
                    total[i-1]--;
                }else if(total[i+1] == 1){
                    total[i]++;
                    total[i+1]--;
                }
            }
        }
        for(int i=1; i<=n; i++){
            if(total[i]>=0){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
