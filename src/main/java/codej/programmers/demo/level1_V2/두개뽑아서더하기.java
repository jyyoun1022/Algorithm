package codej.programmers.demo.level1_V2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++){
            for(int j= numbers.length-1; j>0; j--){
                if(i != j){
                    set.add(numbers[i]+numbers[j]);
                }
            }
        }
        int[] answer =new int[set.size()];
        TreeSet<Integer> objects = new TreeSet<>();
        objects.addAll(set);
        int index  = 0;
        for (int value : objects) {
            answer[index++] = value;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        두개뽑아서더하기 sol = new 두개뽑아서더하기();
        System.out.println(        sol.solution(numbers)
        );
    }
}
