package codej.programmers.demo.level1;

public class 최소직사각형 {

    public int solution(int[][] sizes){
        int answer =0;

        int garo = 0;
        int sero = 0;
        int temp = 0;
        int garo_max =0;
        int sero_max =0;

        for(int i=0; i<sizes.length; i++){
            garo = sizes[i][0];
            sero = sizes[i][1];
            if(garo < sero){
               sizes[i][0] =sero;
               sizes[i][1] =garo;
            }
        }
        for(int i=0; i< sizes.length; i++){

            if(garo_max < sizes[i][0]){
                garo_max = sizes[i][0];
            }
            if(sero_max < sizes[i][1]){
                sero_max = sizes[i][1];
            }
            answer = sero_max*garo_max;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        최소직사각형 sol = new 최소직사각형();
        sol.solution(sizes);
    }
}
