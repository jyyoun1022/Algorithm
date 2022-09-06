package codej.programmers.demo.level1_V2;

public class 두정수사이의합 {
    public long solution(int a,int b){
        long answer =0;
        if(a == b){
            return answer=a;
        }
        int max = Integer.max(a,b);
        int min = Integer.min(a,b);
        for(int i=min; i<=max; i++){
            answer += i;
        }
        return answer;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        두정수사이의합 sol = new 두정수사이의합();
        System.out.println(        sol.solution(a,b)
        );
    }
}
