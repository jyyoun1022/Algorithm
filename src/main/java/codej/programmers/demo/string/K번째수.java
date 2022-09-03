package codej.programmers.demo.string;

import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{1,5,3},{4,4,1},{1,7,3}};

        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i);
        }

        int[] temp = new int[commands.length];
        int[] answer = new int[commands.length];
        //1. 2차배열 commands를 temp로 분해
        for(int i=0; i< commands.length; i++){
            int[] inArr = commands[i];
            for(int j=0; j< inArr.length; j++){//153,441,173  뽑기
                temp[j] = inArr[j];
            }
            System.out.println(Arrays.toString(temp));
            System.out.println(sb);
            sb.substring(temp[0]-1,temp[1]-1);
            System.out.println(sb);
        }

    }
}
