package codej.programmers.demo.level1_V2;

public class 최소직사각형 {
    public int solution(int[][] sizes){
        int answer =0;
        int w =0;
        int h = 0;
        int MaxW =0;
        int MaxH =0;

        for(int i=0; i<sizes.length; i++){
            w =sizes[i][0];
            h = sizes[i][1];

            if(w < h){
                sizes[i][0] = h;
                sizes[i][1] = w;
            }
        }

        for(int i=0; i< sizes.length; i++){
            if(MaxW < sizes[i][0]){
                MaxW = sizes[i][0];
            }
            if(MaxH < sizes[i][1]){
                MaxH = sizes[i][1];
            }
            answer = MaxH * MaxW;
        }
        return  answer;
    }
    public static void main(String[] args) {
        int[][] sizes ={{60,50},{30,70},{60,30},{80,40}};
        최소직사각형 sol = new 최소직사각형();
        System.out.println(        sol.solution(sizes)
        );
    }
}
