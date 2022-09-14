package codej.programmers.demo.level1_V2;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget){
        // 부서별로 신청한 금액이 들어있는 배열 d ,
        //예산 budget
        //최대 몇개의 부서에 물품을 지원할수 있는지 return
        int answer =0;
        int count =0;
        int sum = 0;
        Arrays.sort(d);

        for(int i =0 ; i < d.length; i++){
            sum += d[i];
            if(budget <= sum){
                count++;
            }
        }
        answer = count;
        return answer;
    }
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;
        예산 sol = new 예산();
        System.out.println(        sol.solution(d,budget)
        );
    }
}
