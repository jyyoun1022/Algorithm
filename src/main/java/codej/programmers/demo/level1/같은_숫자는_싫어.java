package codej.programmers.demo.level1;

import java.util.Arrays;
import java.util.Stack;

public class 같은_숫자는_싫어 {

    public int[] solution(int[] arr){
        //배열 arr의 원소는 0에서 9까지
        //arr에서 연속적으로 나타나는 숫자 하나만 남기고 전부 제거
        //단, 제거된 후 남은 수들은 반화할 때는 배열 arr 원소들의 순서를 유지해야합니다
        //1,1,3,3,0,1,1 -> 1,3,0,1을 return
        //배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return

        Stack<Integer> stack = new Stack<>();

        for (int n : arr) {
            if(stack.isEmpty() || stack.peek() != n){
                stack.push(n);
            }
        }
        int[] answer = new int[stack.size()];
        int index =0;
        for (Integer s : stack) {
            answer[index++] = s;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        같은_숫자는_싫어 sol = new 같은_숫자는_싫어();
        sol.solution(arr);
    }
}
