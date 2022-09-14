package codej.programmers.demo.level1_V2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class K번째수 {
    public int[] solution(int[] array,int[][] commands){
        int[] answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < commands.length; i++){
            //1. array에서 commands[i][0] 부터 commands[i][1]까지 뽑고 그것을 바탕으로 array 에서 갖고와서 list로
            for(int j=commands[i][0]-1; j<=commands[i][1]-1; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            answer [i] = list.get(commands[i][2]-1);
            list.clear();
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] array= {1,5,2,6,3,7,4};
        int[][] commands ={{2,5,3},{4,4,1},{1,7,3}};
        K번째수 sol = new K번째수();
        System.out.println(        sol.solution(array,commands)
        );
    }
}
