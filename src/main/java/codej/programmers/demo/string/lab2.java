package codej.programmers.demo.string;

import java.util.Arrays;

public class lab2 {
    public static void main(String[] args) {

    int array[] ={125,34,1,2,34,125,6,7,8,90};
        int max =array[0];
        int min =array[0];

        Arrays.sort(array);

        System.out.println("최대값 : "+array[array.length-1]);
        System.out.println("최소값 : "+array[0]);


        for(int i =0; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
            }

            if(min > array[i]){
                min = array[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}
