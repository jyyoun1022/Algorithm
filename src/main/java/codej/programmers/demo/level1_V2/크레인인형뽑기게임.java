package codej.programmers.demo.level1_V2;

import java.util.Stack;

public class 크레인인형뽑기게임 {
    public int solution(int[][]board, int[] moves){
        int answer =0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int move : moves) {
            for(int i=0; i< board.length; i++){
                if(board[i][move-1] != 0){
                    if(stack.peek() == board[i][move-1]){
                        stack.pop();
                        answer += 2;
                    }else {
                        stack.push(board[i][move-1]);
                    }
                    board[i][move-1] =0;
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] board ={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves ={1,5,3,5,1,2,1,4};
        크레인인형뽑기게임 sol = new 크레인인형뽑기게임();
        System.out.println(        sol.solution(board,moves)
        );
    }
}
