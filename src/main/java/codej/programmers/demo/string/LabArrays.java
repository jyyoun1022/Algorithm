package codej.programmers.demo.string;

import java.util.Arrays;

public class LabArrays {
    public static void main(String[] args) {
        double[] arr ={0.125,0.4285,0.5,0.5,0.0};
        //answer = 3,4,2,1,5
        int[] answer = new int[arr.length];


        //arr의 큰 순서대로 배열하시오.
        for(int i=0; i< answer.length; i++){
            double max =-1;
            int index =0;
            for(int j=0; j< arr.length; j++){
                if(max < arr[j]){
                    max = arr[j];
                    index = j;
                }
            }
            arr[index] = -1;
            answer[i] = index+1;
        }

        System.out.println(Arrays.toString(answer));
    }
}
