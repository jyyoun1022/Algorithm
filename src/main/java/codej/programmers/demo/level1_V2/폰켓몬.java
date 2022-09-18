package codej.programmers.demo.level1_V2;

import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums){
        int answer =0;
        //N마리 중에서 N/2만 가져가서 최대값
        HashSet<Integer> set = new HashSet<>();
        int size = nums.length/2;
        for(int i=0; i< nums.length; i++){
            set.add(nums[i]);
        }

        if(size > set.size()){
            answer = set.size();
        }else{
            answer = size;
        }


        return answer ;
    }
    public static void main(String[] args) {
        int[] nums ={3,3,3,2,2,4};
        폰켓몬 sol = new 폰켓몬();
        System.out.println(        sol.solution(nums)
        );
    }
}
