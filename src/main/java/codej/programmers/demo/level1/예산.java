package codej.programmers.demo.level1;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        //최대한 많은 부서의 물품을 구매해 줄 수 있도록 한다.
        //물품을 구매해 줄 때는 각부서가 신청한 금액만큼을 모두 지원해 줘야 한다.
        //예를들어 1000원을 신청한 부서에는 정확히 1,000원을 지원해야한다.
        //부서별로 신청한 금액이 들어있는 배열 d,와 예산 budget 이 매개변수로 주어질 때,
        //최대 몇개의 부서에 물품을 지원 할 수 있는 지 return
        int[] d = new int[]{1,3,2,5,4};
        int budget=9;

        int sum =0;
        int count=0;
        int answer =0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            sum += d[i];
            if(budget >= sum){
                count++;
            }
        }
        answer=count;
        System.out.println(answer);
    }
}
