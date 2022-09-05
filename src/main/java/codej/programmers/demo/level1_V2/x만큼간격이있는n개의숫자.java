package codej.programmers.demo.level1_V2;

import java.util.Arrays;

public class x만큼간격이있는n개의숫자 {

    public long[] solution(long x,int n){
        long[] answer =new long[n];

        for(int i=0; i<n; i++){
            answer[i] = x*(i+1);
        }
        return answer;
    }
    public static void main(String[] args) {
        int x =2 ;
        int n = 5;
        x만큼간격이있는n개의숫자 sol = new x만큼간격이있는n개의숫자();
        sol.solution(x,n);
    }
}
