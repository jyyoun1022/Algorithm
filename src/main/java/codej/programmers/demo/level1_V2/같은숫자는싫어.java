package codej.programmers.demo.level1_V2;

import java.util.HashSet;
import java.util.Stack;

public class 같은숫자는싫어 {
    public int[] solution(int[] arr){

        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if(!stack.isEmpty() && stack.peek() == i){
                stack.pop();
            }
            stack.push(i);
        }
        int[] answer = new int[stack.size()];

        int index =0;
        for (Integer integer : stack) {
            answer[index++]=integer;
        }
        return answer;
    }
    public static void main(String[] args) {
//        int[] arr = {1,1,3,3,0,1,1};
        int[] arr = {4,4,4,3,3};
        같은숫자는싫어 sol = new 같은숫자는싫어();
        System.out.println(        sol.solution(arr)
        );
    }
}
