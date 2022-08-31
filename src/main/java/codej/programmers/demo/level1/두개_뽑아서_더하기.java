package codej.programmers.demo.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 두개_뽑아서_더하기 {
    public static void main(String[] args) {
        int[] arr =new int[]{2,1,3,4,1};
        List<Integer> list = new ArrayList<>();
        int count=0;
        int temp =0;
        for(int i=0; i<arr.length; i++){
            for(int j=arr.length-1; j>=0; j--){
                if(i!=j) {
                    temp=arr[i]+arr[j];
                    if(!list.contains(temp)){
                        list.add(temp);
                        count++;
                    }
                }
                }

            }
        Collections.sort(list);
        int[] answer = new int[count];
        for(int i=0; i<list.size(); i++){
            answer[i]= list.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }

    }

