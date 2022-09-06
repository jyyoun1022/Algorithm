package codej.programmers.demo.level1_V2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 제일작은수제거하기 {
    public int[] solution(int[] arr){
        int[] answer =new int[arr.length-1];
        if(arr.length == -1){
            return new int[]{-1};
        }

        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        int index =0;
        for (int i : arr) {
            if(min != i){
                answer[index++] =i;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        제일작은수제거하기 sol = new 제일작은수제거하기();
        System.out.println(        sol.solution(arr)
        );
    }
}
