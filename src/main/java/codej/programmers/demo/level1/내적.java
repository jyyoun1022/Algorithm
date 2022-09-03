package codej.programmers.demo.level1;

public class 내적 {
    public long solution(int[]a , int[]b){
        long answer =0;

        for(int i=0; i<a.length; i++){
            answer +=(a[i]*b[i]);
            System.out.println(answer);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] a ={1,2,3,4};
        int[] b ={-3,-1,0,2};
        내적 sol = new 내적();
        sol.solution(a,b);

    }
}
