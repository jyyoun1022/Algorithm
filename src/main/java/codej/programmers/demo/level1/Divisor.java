package codej.programmers.demo.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Divisor {
    public static void main(String[] args) {
//        int[]arr = new int[]{5,9,7,10};
//        int[]arr = new int[]{2,36,1,3};
        int[]arr = new int[]{3,2,6};

//        int divisor =5;
//        int divisor =1;
        int divisor =10;

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);

        if(list.isEmpty()){
            System.out.println(Arrays.toString(new int[]{-1}));
        }
        int[] newArr = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            newArr[i] = list.get(i);
        }
        System.out.println("결과값 : "+Arrays.toString(newArr));

    }
}
