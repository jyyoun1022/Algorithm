package codej.programmers.demo.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class 크레인_인형뽑기 {
    public int solution(int[][]board, int[] moves){
        int answer =0;
        //1. 바구니 역할 stack을 만들고 0을 넣는다.
        Stack<Integer> stack = new Stack<>();
        stack.push(0);//맨 위의 값과 비교해야하는데 아무것도 없으면 오류가난다.

        for (int move : moves) {
            for(int i=0; i< board.length; i++){
                if(board[i][move-1] != 0){
                    if(stack.peek() == board[i][move-1]){
                        stack.pop();
                        answer +=2;
                    }else {
                        stack.push(board[i][move-1]);
                    }
                    board[i][move-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[][] board ={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        크레인_인형뽑기 sol = new 크레인_인형뽑기();
        sol.solution(board,moves);
    }
}
