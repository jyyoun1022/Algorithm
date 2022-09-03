package codej.programmers.demo.level1;

import java.util.HashSet;
import java.util.Iterator;

public class Phoneketmon {

    public  int solution(int[] nums){
        //가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아서
        // 종류 번호의 개수를 return
        int answer =0;
        int size = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        if(size <set.size()){
            answer = size;
        }else{
            answer = set.size();
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums ={3,3,3,2,2,2};
        Phoneketmon sol = new Phoneketmon();
        sol.solution(nums);
    }
}
