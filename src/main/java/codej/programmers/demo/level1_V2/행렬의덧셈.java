package codej.programmers.demo.level1_V2;

public class 행렬의덧셈 {
    public int[][] solution(int[][] arr1, int[][] arr2){
        int[][] answer =arr1;

        for(int i=0; i< arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        //arr1
        //1,2
        //2,3
        //arr2
        //3,4
        //5,6

        return answer;
    }
    public static void main(String[] args) {
        int[][] arr1 ={{1,2},{2,3}};
        int[][] arr2 ={{3,4},{5,6}};
        행렬의덧셈 sol = new 행렬의덧셈();
        sol.solution(arr1,arr2);
    }
}
