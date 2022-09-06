package codej.programmers.demo.level1_V2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr,int divisor){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor ==0){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()){
            return new int[]{-1};
        }
        Collections.sort(list);
        int[] answer =new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] =list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,7,10};
        int divisor =5;
        나누어떨어지는숫자배열 sol = new 나누어떨어지는숫자배열();
        System.out.println(        sol.solution(arr,divisor)
        );
    }
}
