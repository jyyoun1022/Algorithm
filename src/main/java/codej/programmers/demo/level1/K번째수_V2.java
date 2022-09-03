package codej.programmers.demo.level1;

import java.util.Arrays;

public class K번째수_V2 {
    public static void main(String[] args) {
        int[] array ={1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = new int[commands.length];
        for(int i=0; i< commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int select = commands[i][2];

            int[] temp = Arrays.copyOfRange(array, start-1, end);
            Arrays.sort(temp);
            answer[i] = temp[select-1];
        }
    }
}
